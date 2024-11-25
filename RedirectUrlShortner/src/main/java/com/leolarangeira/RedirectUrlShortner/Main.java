package com.leolarangeira.RedirectUrlShortner;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import software.amazon.awssdk.services.s3.S3Client;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.services.s3.model.GetObjectRequest;

import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;




public class Main implements RequestHandler <Map <String,Object>, Map <String, Object>>{

    private final S3Client s3Client = S3Client.builder().build();
    private final ObjectMapper objectMapper = new ObjectMapper();
    final String bucketName = "";

    @Override
    public Map<String, Object> handleRequest(Map<String, Object> input, Context context){
        String pathParameters = input.get("rawPath").toString(); // (String) input.get("rawPath") -> this will also work
        String shortUrlCode = pathParameters.replace("/", "");

        if(shortUrlCode.isEmpty()){
           throw new IllegalArgumentException("Invalid input: 'shortUrlCode' is required!");
        }

        GetObjectRequest getObjectRequest = GetObjectRequest.builder().bucket(bucketName).key(shortUrlCode + ".json").build();

        InputStream s3ObjectStream;

        try{
            s3ObjectStream = s3Client.getObject(getObjectRequest);
        } catch (Exception e) {
            throw new RuntimeException("Error fetching URL data from S3" + e.getMessage(), e);
        }

        UrlData urlData;
        try{
            urlData = objectMapper.readValue(s3ObjectStream, UrlData.class);
        } catch (Exception e) {
            throw new RuntimeException("Error deserializing URL data: " + e.getMessage(), e);
        }
        Map<String, Object> response = new HashMap<>();

        long currentTimeInSeconds = System.currentTimeMillis() / 1000;

        if( urlData.getExpirationTime() < currentTimeInSeconds){
            response.put("statusCode", 410);
            response.put("body","This url has expired");

            return response;
        }
        response.put("statusCode", 302);
        Map<String, Object> headers = new HashMap<>();
        headers.put("Location", urlData.getOriginalUrl());
        response.put("headers", headers);

        return response;


    }

}