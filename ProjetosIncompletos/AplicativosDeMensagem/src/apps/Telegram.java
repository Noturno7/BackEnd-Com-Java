package apps;

public class Telegram extends LogicaDeMensagem {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo apps.Telegram");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo apps.Telegram");
    }
}

