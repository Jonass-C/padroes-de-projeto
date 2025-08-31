package one.digitalinnovation.gof.java.subsistema2.cep;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi() {}

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "Belo Horizonte";
    }

    public String recuperarEstado(String cep) {
        return "MG";
    }

}
