package Pessoa.Juridica;

import Pessoa.Pessoa;

public class PessoaJuridica extends Pessoa {

    public PessoaJuridica(String nome, String cpf, String dataNascimento, String endereco, String cnpj) {
        super(nome, cpf, dataNascimento, endereco);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    private String cnpj;

    public void imprimirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("CPF: " + getCpf());
        System.out.println("CNPJ: " + getCnpj());
        System.out.println("Data de Nascimento: " + getDataNascimento());
        System.out.println("Endereco: " + getEndereco());
    }
}
