package Conceitos.Interfaces.equipamentos.Estabelecimento;

import Conceitos.Interfaces.equipamentos.Copiadora.Copiadora;
import Conceitos.Interfaces.equipamentos.Digitalizadora.Digitalizadora;
import Conceitos.Interfaces.equipamentos.Impressora.Impressora;
import Conceitos.Interfaces.equipamentos.Multifuncional.EquipamentoMultiFuncional;

public class Loja {
    public static void main(String[] args){
        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();



        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;



        impressora.imprimindo();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
