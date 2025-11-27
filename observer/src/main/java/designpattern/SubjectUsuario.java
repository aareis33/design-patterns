package designpattern;

import java.util.ArrayList;
import java.util.List;

public class SubjectUsuario {

    private final List<ObserverUsuario> observers = new ArrayList<>();

    public void adicionarObserver(ObserverUsuario observer) {
        observers.add(observer);
    }

    public void removerObserver(ObserverUsuario observer) {
        observers.remove(observer);
    }

    protected void notificarObservers(EventoUsuario evento) {
        for (ObserverUsuario observer : observers) {
            try {
                observer.notificar(evento);
            } catch (Exception e) {
                System.out.println("Falha ao notificar observer: " + e.getMessage());
            }
        }
    }
}
