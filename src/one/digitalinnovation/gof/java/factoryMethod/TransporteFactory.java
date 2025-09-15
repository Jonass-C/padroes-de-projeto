package one.digitalinnovation.gof.java.factoryMethod;

public class TransporteFactory {

    public static Transporte criarTransporte(String tipo) {
        if(tipo.equals("terrestre")) {
            return new Caminhao();
        } else if(tipo.equals("maritimo")) {
            return new Navio();
        }
        throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
    }

}
