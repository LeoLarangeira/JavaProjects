package Conceitos;

public class MSNMessager {
    public void initApp(){
        isConnectedToInternet();
        saveMessageHistory();
    }

    public void sendMessage(){
        System.out.println("Enviando mensagem");
    }

    public void receiveMessage(){
        System.out.println("Recebendo mensagem");
    }

    //metodos privados, somente visiveis para a classe

    private void isConnectedToInternet(){
        System.out.println("Validando se esta conectado a internet");
    }

    private void saveMessageHistory(){
        System.out.println("Salvando o historico de mensagem");
    }
}
