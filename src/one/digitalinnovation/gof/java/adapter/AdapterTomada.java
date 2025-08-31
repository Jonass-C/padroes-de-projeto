package one.digitalinnovation.gof.java.adapter;

public class AdapterTomada implements TomadaDoisPinos {

    private TomadaTresPinos tomadaTresPinos;

    public AdapterTomada(TomadaTresPinos tomadaTresPinos) {
        this.tomadaTresPinos = tomadaTresPinos;
    }

    @Override
    public void ligarNaTomadaDeDoisPinos() {
        tomadaTresPinos.ligarNaTomadaDeTresPinos();
    }
}
