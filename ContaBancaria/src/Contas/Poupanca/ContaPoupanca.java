package Contas.Poupanca;

import Pessoa.Pessoa;
import Contas.Conta.Conta;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Pessoa pessoa) {
        super(pessoa);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println(" == Extrato conta poupanca == ");
        super.informacoesComuns();
    }

    public void imprimirDados(Pessoa pessoa){
        System.out.println("Imprimindo dados do cliente");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("CPF: " + pessoa.getCpf());
        System.out.println("Data de Nascimento: " + pessoa.getDataNascimento());
        System.out.println("Endereco: " + pessoa.getEndereco());
        System.out.println(String.format("Agencia: %d", super.agencia));
        System.out.println(String.format("Numero: %d", super.numero));
        System.out.println(String.format("Saldo: %.2f", super.saldo));
    }



}
