package designpattern;

public class Cliente {

    public static void main(String[] args) {
        ServicoUsuarioObserver servico = new ServicoUsuarioObserver();

        servico.adicionarObserver(new EmailObserver());
        servico.adicionarObserver(new LogObserver());
        servico.adicionarObserver(new MetricasObserver());

        servico.cadastrarUsuario("aluno@faculdade.com", "senha123");
    }
}
