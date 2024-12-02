package classes;
import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void ligar(String number) {
        System.out.println("Ligando para o numero " + number);
    }

    @Override
    public void atender() {
        System.out.println("atender ...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("iniciarCorreioVoz ...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo nova pagina ...");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("adicionandoNovaAba ...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a pagina ...");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando ...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando ...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica);
    }
}
