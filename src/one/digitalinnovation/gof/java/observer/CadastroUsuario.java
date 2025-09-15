package one.digitalinnovation.gof.java.observer;

import java.util.*;

public class CadastroUsuario {

    private final List<Observador> observadores = new ArrayList<>();

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void cadastrar(String nome) {
        System.out.println("Usuário cadastrado: " + nome);
        notificarObservadores(nome);
    }

    public void notificarObservadores(String evento) {
        for(Observador observador : observadores) {
            observador.notificar("Usuário " + evento + " foi cadastrado.");
        }
    }

}
