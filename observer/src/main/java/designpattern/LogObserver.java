package designpattern;

public class LogObserver implements ObserverUsuario {

    @Override
    public void notificar(EventoUsuario evento) {
        System.out.println("LOG: Registrando auditoria. Ação: " 
                + evento.getAcao() + ", Usuário: " + evento.getEmail());
    }
}
