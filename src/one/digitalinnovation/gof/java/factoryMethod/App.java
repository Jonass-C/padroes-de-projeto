package one.digitalinnovation.gof.java.factoryMethod;

public class App {

    public static void main(String[] args) {
        Transporte t1 = TransporteFactory.criarTransporte("terrestre");
        Transporte t2 = TransporteFactory.criarTransporte("maritimo");

        t1.entregar();
        t2.entregar();
    }

}
