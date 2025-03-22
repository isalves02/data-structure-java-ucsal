interface IProduto {
   void verificarEstoque();
   void adicionar(String nome, String codigoProduto, int quantidadeEstoque, double precoUnitario);
   void remover(String codigoProduto0);
}

class Produto implements IProduto {
    private double precoUnitario;
    private int quantidadeEstoque;
    private String nome, codigoProduto;
    private String[][] estoque;

    @Override
    public void adicionar(String nome, String codigoProduto, int quantidadeEstoque, double precoUnitario) {}

    @Override
    public void remover(String codigoProduto) {}

    @Override
    public void verificarEstoque() {}
}

public class ProductStock {
    public static void main(String[] args) {
        Produto produto = new Produto();
    }
}
