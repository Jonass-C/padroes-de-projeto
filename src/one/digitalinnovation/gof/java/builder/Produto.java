package one.digitalinnovation.gof.java.builder;

public class Produto {

    private String nome;
    private double preco;
    private String conexao;
    private boolean disponivel;
    private int estoque;

    public Produto(String nome, double preco, String conexao, boolean disponivel, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.conexao = conexao;
        this.disponivel = disponivel;
        this.estoque = estoque;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", conexao='" + conexao + '\'' +
                ", disponivel=" + disponivel +
                ", estoque=" + estoque +
                '}';
    }
}
