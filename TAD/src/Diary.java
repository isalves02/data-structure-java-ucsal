interface IAnotacao {
    void listarAnotacoes();
    void apagarAnotacao(int idAnotacao);
    void adicionarAnotacao(int idAnotacao, String data, String titulo, String conteudoAnotacao);
}

class Anotacao implements IAnotacao {
    private int idAnotacao;
    private String data, titulo, conteudoAnotacao;

    @Override
    public void adicionarAnotacao(int idAnotacao, String data, String titulo, String conteudoAnotacao) {}

    @Override
    public void apagarAnotacao(int idAnotacao) {}

    @Override
    public void listarAnotacoes() {}
}

public class Diary {
    public static void main(String[] args) {
        Anotacao anotacao = new Anotacao();
    }
}
