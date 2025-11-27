package designpattern;

public class ServicoUsuarioObserver extends SubjectUsuario {

    public void cadastrarUsuario(String email, String senha) {
        System.out.println("Salvando usuário " + email + " no banco de dados...");

        EventoUsuario evento = new EventoUsuario(email, "CADASTRO");
        notificarObservers(evento);

        System.out.println("Usuário " + email + " cadastrado com sucesso.");
    }
}
