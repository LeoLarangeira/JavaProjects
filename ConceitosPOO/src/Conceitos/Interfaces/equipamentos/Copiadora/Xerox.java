package Conceitos.Interfaces.equipamentos.Copiadora;

public class Xerox implements Copiadora {
    @Override
    public void copiar() {
        System.out.println("====XEROX====");
        System.out.println("Copiando...");
    }
}
