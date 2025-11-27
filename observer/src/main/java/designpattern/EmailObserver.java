package designpattern;

public class EmailObserver implements ObserverUsuario {

    @Override
    public void notificar(EventoUsuario evento) {
        System.out.println("EMAIL: Enviando e-mail de boas-vindas para " + evento.getEmail());
    }
}
