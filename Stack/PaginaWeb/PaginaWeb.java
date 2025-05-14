package PaginaWeb;

public class PaginaWeb {
    String url;
    String titulo;
    String dataHora;

    public PaginaWeb(String url, String titulo, String dataHora) {
        this.url = url;
        this.titulo = titulo;
        this.dataHora = dataHora;
    }

    @Override
    public String toString() {
        return "[" + dataHora + "] " + titulo + " - " + url;
    }
}
