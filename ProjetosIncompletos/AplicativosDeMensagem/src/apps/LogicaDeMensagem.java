package apps;

public abstract class LogicaDeMensagem {
    public void enviarMensagem(){
        // Verificando se o usuário está conectado a internet
        validarConectadoInternet();

        System.out.println("Enviando mensagem...");

        salvarHistoricoMensagem();

    }
    public void receberMensagem(){
        System.out.println("Mensagem recebida.");
    }
    protected void validarConectadoInternet(){
        System.out.println("Validando conexão com a internet...");
    }
    private void salvarHistoricoMensagem(){
        System.out.println("Salvando Histórico da mensagem...");
    }
}

