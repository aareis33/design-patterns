package designpattern;

public class MetricasObserver implements ObserverUsuario {

    @Override
    public void notificar(EventoUsuario evento) {
        System.out.println("METRICAS: Incrementando contador de novos usuários.");
    }
}
