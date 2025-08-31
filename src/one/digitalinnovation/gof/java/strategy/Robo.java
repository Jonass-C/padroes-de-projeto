package one.digitalinnovation.gof.java.strategy;

public class Robo {

    private Comportamento strategy;

    public void setComportamento(Comportamento strategy) {
        this.strategy = strategy;
    }

    public void mover() {
        strategy.mover();
    }

}
