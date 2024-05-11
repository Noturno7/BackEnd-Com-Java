import apps.LogicaDeMensagem;
import apps.MSNmessenger;
import apps.Mensseger;
import apps.Telegram;

public class MSNAplication {
    public static void main(String[] args) {
    // Iniciando a aplicação.
        LogicaDeMensagem smi = null;
        String appEscolhido="msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNmessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new Mensseger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();
    }
}