interface IPedido {
    void novoPedido(String nomeCliente, String[] itensPedido, int[] quantidadesPedido);
    double valorTotalPedido(double valorItemPedido, int quantidadeItemPedido);
    void notaFiscal(String nomeCliente, String[] itemPedido, int[] quantidadesPedido, double valorTotal);
}

class Pedido implements IPedido {
    private String nomeCliente;
    private String[] itensPedido;
    private int[] quantidadesPedido;
    private double valorTotal;

    @Override
    public void novoPedido(String nomeCliente, String[] itensPedido, int[] quantidadesPedido) { }

    @Override
    public double valorTotalPedido(double valorItemPedido, int quantidadeItemPedido) {
        return valorItemPedido * quantidadeItemPedido;
    }

    @Override
    public void notaFiscal(String nomeCliente, String[] itemPedido, int[] quantidadesPedido, double valorTotal) {}
}
public class Restaurant {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
    }
}
