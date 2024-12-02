import classes.Iphone;


public class Main  {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando Reprodutor Musical
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();

        // Testando Aparelho Telefônico
        meuIphone.ligar("123-456-789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        // Testando Navegador na Internet
        meuIphone.exibirPagina("https://www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}