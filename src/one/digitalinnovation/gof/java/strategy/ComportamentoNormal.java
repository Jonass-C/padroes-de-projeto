package one.digitalinnovation.gof.java.strategy;

public class ComportamentoNormal implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se normalmente... ");
    }

}
