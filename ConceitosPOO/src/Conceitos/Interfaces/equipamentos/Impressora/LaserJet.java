package Conceitos.Interfaces.equipamentos.Impressora;

public class LaserJet implements Impressora {
    @Override
    public void imprimindo() {
        System.out.println("====LASERJET====");
        System.out.println("Imprimindo...");
    }
}
