package one.digitalinnovation.gof.java.singleton;

/**
 * Singleton "apressado"
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {}

    public static SingletonEager getInstancia() {
        return instancia;
    }

}
