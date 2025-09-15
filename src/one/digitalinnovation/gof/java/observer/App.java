package one.digitalinnovation.gof.java.observer;

public class App {

    public static void main(String[] args) {

        CadastroUsuario cadastro = new CadastroUsuario();

        cadastro.adicionarObservador(new EnviarEmail());
        cadastro.adicionarObservador(new RegistrarLog());

        cadastro.cadastrar("João");

    }

}
