package Contas.Conta;

import Banco.Cliente;
import Banco.IConta;
import Pessoa.Pessoa;

public abstract class Conta implements IConta {
    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Pessoa pessoa;




    public Conta(Pessoa pessoa){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.pessoa = pessoa;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor){
        saldo -= valor;
    }

    @Override
    public void transferir(Conta contaDestino, double valor) {
            this.sacar(valor);
            contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void informacoesComuns() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

}
