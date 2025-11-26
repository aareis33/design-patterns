package designpattern;

public class ServicoNotificacao {

    public void enviarNotificacao(String tipo, String destinatario, String mensagem) {
        INotificacao notificacao = NotificacaoFactory.criarNotificacao(tipo);
        notificacao.configurar(destinatario);
        notificacao.enviar(mensagem);
    }
}
