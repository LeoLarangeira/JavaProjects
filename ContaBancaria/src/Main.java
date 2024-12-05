import Banco.Cliente;
import Contas.Conta.Conta;
import Contas.Corrente.ContaCorrente;
import Contas.Poupanca.ContaPoupanca;
import Pessoa.Fisica.PessoaFisica;
import Pessoa.Juridica.PessoaJuridica;
import Pessoa.Pessoa;

public class Main {
    public static void main(String[] args) {
        Pessoa cliente1 = new PessoaFisica("Leo","123141","30/01/2002","Teste");
        Pessoa cliente2 = new PessoaJuridica("Leo","123141","30/01/2002","Teste","1231412341");







        ContaCorrente cc = new ContaCorrente(cliente1);
        cc.depositar(100);
        cc.imprimirExtrato();


        ContaPoupanca cp = new ContaPoupanca(cliente2);
        cp.depositar(200);
        cp.imprimirDados(cliente2);

    }
}