package designpattern;

public class Cliente {

    public static void main(String[] args) {
        ServicoNotificacao servico = new ServicoNotificacao();

        servico.enviarNotificacao("EMAIL", "aluno@dominio.com", "Olá!");
        servico.enviarNotificacao("SMS", "+5599999999", "Oi!");
        servico.enviarNotificacao("PUSH", "device-123", "Notificação push!");
    }
}
