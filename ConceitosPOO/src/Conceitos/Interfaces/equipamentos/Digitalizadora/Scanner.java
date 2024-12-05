package Conceitos.Interfaces.equipamentos.Digitalizadora;



public class Scanner implements Digitalizadora {

    @Override
    public void digitalizar() {
        System.out.println("====SCANNER====");
        System.out.println("Digitalizando...");
    }
}
