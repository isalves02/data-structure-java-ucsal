interface IRegistroCompra {
    void registrarCompra(int idRegistro, String data, String[] itensComprados, double valorTotal);
    void deletarRegistro(int idRegistro);
    void listarRegistros();
}

class RegistroCompra implements IRegistroCompra {
    private String data;
    private int idRegistro;
    private double valorTotal
    private String[] itensComprados;

    @Override
    public void registrarCompra(int idRegistro, String data, String[] itensComprados, double valorTotal) {}

    @Override
    public void deletarRegistro(int idRegistro) {}

    @Override
    public void listarRegistros() {}
}

public class ShoppingHistory {
    public static void main(String[] args) {
        RegistroCompra registro = new RegistroCompra();
    }
}
