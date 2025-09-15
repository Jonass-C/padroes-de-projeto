package one.digitalinnovation.gof.java.builder;

public class RegistroProduto {

    public static void main(String[] args) {

        // Produto produto = new Produto("Mouse", 50d, "USB", true, 200);

        Produto produto = new ProdutoBuilder().builder()
                .nome("Mouse")
                .preco(50d)
                .conexao("USB")
                .disponivel(true)
                .estoque(200)
                .build();

        System.out.println(produto.toString());
    }

}
