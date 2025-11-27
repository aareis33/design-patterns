package designpattern;

public class EventoUsuario {

    private final String email;
    private final String acao;

    public EventoUsuario(String email, String acao) {
        this.email = email;
        this.acao = acao;
    }

    public String getEmail() {
        return email;
    }

    public String getAcao() {
        return acao;
    }
}
