package Conceitos;

public class Autodromo {
    public static void main(String[] args){
        Carro jeep = new Carro();
        jeep.setChassi("1238917");
        //jeep.ligar();


        Moto z400 = new Moto();
        z400.setChassi("1238174");

        //z400.ligar();

        Veiculo coringa = z400;

        coringa.ligar();
    }
}
