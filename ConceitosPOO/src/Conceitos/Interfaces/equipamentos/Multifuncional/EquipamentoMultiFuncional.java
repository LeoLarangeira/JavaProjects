package Conceitos.Interfaces.equipamentos.Multifuncional;

import Conceitos.Interfaces.equipamentos.Copiadora.Copiadora;
import Conceitos.Interfaces.equipamentos.Digitalizadora.Digitalizadora;
import Conceitos.Interfaces.equipamentos.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void imprimindo() {
        System.out.println("====EQUIPAMENTO-MULTIFUNCIONAL====");
        System.out.println("Imprimindo...");

    }

    @Override
    public void digitalizar() {
        System.out.println("====EQUIPAMENTO-MULTIFUNCIONAL====");
        System.out.println("Digitalizando...");
    }

    @Override
    public void copiar() {
        System.out.println("====EQUIPAMENTO-MULTIFUNCIONAL====");
        System.out.println("Copiando...");
    }
}
