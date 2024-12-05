package Contas.Corrente;

import Banco.Cliente;
import Contas.Conta.Conta;
import Pessoa.Pessoa;

public class ContaCorrente extends Conta {
    public ContaCorrente(Pessoa pessoa) {
        super(pessoa);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" == Extrato conta corrente == ");
        super.informacoesComuns();
    }



}
