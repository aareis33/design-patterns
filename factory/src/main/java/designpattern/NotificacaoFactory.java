package designpattern;

public class NotificacaoFactory {

    public static INotificacao criarNotificacao(String tipo) {
        switch (tipo) {
            case "EMAIL":
                return new NotificacaoEmail();
            case "SMS":
                return new NotificacaoSMS();
            case "PUSH":
                return new NotificacaoPush();
            default:
                throw new IllegalArgumentException("Tipo de notificação inválido: " + tipo);
        }
    }
}
