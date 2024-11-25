package com.leolarangeira.createUrlShortner;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.databind.ObjectMapper;
import software.amazon.awssdk.core.sync.RequestBody;
import software.amazon.awssdk.services.s3.model.PutObjectRequest;
import software.amazon.awssdk.services.s3.S3Client;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main implements RequestHandler <Map <String, Object>, Map <String, String>>{
    private final ObjectMapper objectMapper = new ObjectMapper();
    final String bucketName = "url-shortener-storage";


    private final S3Client s3Client = S3Client.create();



    @Override
    public Map<String, String> handleRequest(Map<String, Object> input, Context context){
        String body = input.get("body").toString();
        Map<String, String> bodyMap;
        try{
            bodyMap = objectMapper.readValue(body, Map.class);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String originalUrl = bodyMap.get("originalUrl");
        String expirationTime = bodyMap.get("expirationTime");
        long expirationTimeInSeconds = Long.parseLong(expirationTime);

        String shortUrlCode = UUID.randomUUID().toString().substring(0,8);

        UrlData urlData =  new UrlData(originalUrl, expirationTimeInSeconds);

        try{
            String urlDataJson = objectMapper.writeValueAsString(urlData);

            PutObjectRequest request = PutObjectRequest.builder().bucket(bucketName).key(shortUrlCode + ".json").build();

            s3Client.putObject(request, RequestBody.fromString(urlDataJson));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Map<String, String> response = new HashMap<>();

        response.put("code", shortUrlCode);

        return response;
    }
}