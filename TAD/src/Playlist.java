interface IMusica {
    void adicionar(String titulo, String artista, String duracao);
    void remover(String titulo, String artista, String duracao);
    void listarMusicas();
}

class Musica implements IMusica {
    private String titulo, artista, duracao;
    private String[][] lista = new String[1000][3];

    @Override
    public void adicionar(String titulo, String artista, String duracao) { }

    @Override
    public void remover(String titulo, String artista, String duracao) {}

    @Override
    public void listarMusicas() {
        for (var i = 0; i <= lista.length; i++) {
            for (var j = 0; j <= lista[i].length; j++) {
                System.out.println(lista[i][j]);
            }
        }
    }
}

public class Playlist {
    Musica musica = new Musica();g
}
