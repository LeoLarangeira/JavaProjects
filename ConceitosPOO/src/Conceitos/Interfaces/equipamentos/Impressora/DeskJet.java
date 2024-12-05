package Conceitos.Interfaces.equipamentos.Impressora;

public class DeskJet implements Impressora {
    @Override
    public void imprimindo() {
        System.out.println("====DESKJET====");
        System.out.println("Imprimindo...");
    }
}
