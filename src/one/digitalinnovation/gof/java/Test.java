package one.digitalinnovation.gof.java;

import one.digitalinnovation.gof.java.adapter.AdapterTomada;
import one.digitalinnovation.gof.java.adapter.GeladeiraAntiga;
import one.digitalinnovation.gof.java.adapter.TomadaDoisPinos;
import one.digitalinnovation.gof.java.adapter.TomadaTresPinos;
import one.digitalinnovation.gof.java.facade.Facade;
import one.digitalinnovation.gof.java.singleton.SingletonEager;
import one.digitalinnovation.gof.java.singleton.SingletonLazy;
import one.digitalinnovation.gof.java.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.java.strategy.*;

/**
 * Testes dos Design Patterns
 */

public class Test {

    public static void main(String[] args) {

        // Singleton

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Jonas", "11111-111");

        // Adapter

        TomadaDoisPinos geladeira = new GeladeiraAntiga();
        geladeira.ligarNaTomadaDeDoisPinos(); // conectado na antiga

        TomadaTresPinos novoDispositivo = new TomadaTresPinos(); // tomada de três pinos

        TomadaDoisPinos adaptador = new AdapterTomada(novoDispositivo); // adaptando dois pinos para três
        adaptador.ligarNaTomadaDeDoisPinos();

    }
}
