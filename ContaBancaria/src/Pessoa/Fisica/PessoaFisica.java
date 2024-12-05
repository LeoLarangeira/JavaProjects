package Pessoa.Fisica;

import Pessoa.Pessoa;

public class PessoaFisica extends Pessoa {

    public PessoaFisica(String nome, String cpf, String dataNascimento, String endereco) {
        super(nome, cpf, dataNascimento, endereco);
    }

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Endereco: " + getEndereco());
    }
}
