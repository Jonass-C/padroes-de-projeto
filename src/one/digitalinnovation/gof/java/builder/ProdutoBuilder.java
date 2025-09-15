package one.digitalinnovation.gof.java.builder;

public class ProdutoBuilder {

    private String nome;
    private double preco;
    private String conexao;
    private boolean disponivel;
    private int estoque;

    public static ProdutoBuilder builder() {
        return new ProdutoBuilder();
    }

    public ProdutoBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public ProdutoBuilder preco(double preco) {
        this.preco = preco;
        return this;
    }

    public ProdutoBuilder conexao(String conexao) {
        this.conexao = conexao;
        return this;
    }

    public ProdutoBuilder disponivel(boolean disponivel) {
        this.disponivel = disponivel;
        return this;
    }

    public ProdutoBuilder estoque(int estoque) {
        this.estoque = estoque;
        return this;
    }

    public Produto build() {
        return new Produto(nome, preco, conexao, disponivel, estoque);
    }

}
