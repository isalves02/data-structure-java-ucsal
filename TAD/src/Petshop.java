interface IPetDados {
    void adicionar(String nome, String nomeTutor, String telefoneTutor, String dataNasc, String raca);
    void remover(String nome, String nomeTutor);
}

class PetDados implements IPetDados {
    private String nome, nomeTutor, dataNasc, telefoneTutor, raca;
    private String[][] animaisCadastrados = new String[1000][1000];

    @Override
    public void adicionar(String nome, String nomeTutor, String telefoneTutor, String dataNasc, String raca) { }

    @Override
    public void remover(String nome, String nomeTutor) { }
}

public class Petshop {
    public static void main(String[] args) {
        PetDados PetDados = new PetDados();
        /*
         * Petdados.adicionar();
         * Petdados.adicionar();
         */
    }
}
