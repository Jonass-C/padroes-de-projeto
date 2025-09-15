package one.digitalinnovation.gof.java.factoryMethod;

public class Navio implements Transporte {

    @Override
    public void entregar(){
        System.out.println("Entregando por navio");
    }

}
