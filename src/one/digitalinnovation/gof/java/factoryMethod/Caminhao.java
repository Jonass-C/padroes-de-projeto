package one.digitalinnovation.gof.java.factoryMethod;

public class Caminhao implements Transporte {

    @Override
    public void entregar() {
        System.out.println("Entregando por caminhão");
    }

}
