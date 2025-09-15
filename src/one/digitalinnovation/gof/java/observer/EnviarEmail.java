package one.digitalinnovation.gof.java.observer;

public class EnviarEmail implements Observador {

    @Override
    public void notificar(String evento) {
        System.out.println("Email enviado: " + evento);
    }

}
