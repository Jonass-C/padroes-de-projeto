package one.digitalinnovation.gof.java.observer;

public class RegistrarLog implements Observador {

    @Override
    public void notificar(String evento) {
        System.out.println("Log registrado: " + evento);
    }

}
