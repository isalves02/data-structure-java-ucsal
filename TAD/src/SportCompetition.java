interface ICampeonato {
    void listarCampeonatos();
    void remover(String nome);
    void adicionar(String nome, String[] times, String nomeSistemaPontuacao);
}

class Campeonato implements ICampeonato {
    private String nome, nomeSistemaPontuacao;
    private String[] times;

    @Override
    public void adicionar(String nome, String[] times, String nomeSistemaPontuacao) {}

    @Override
    public void remover(String nome) {}

    @Override
    public void listarCampeonatos() {}
}

public class SportCompetition {
    public static void main(String[] args) {
        Campeonato campeonato = new Campeonato();
    }
}
