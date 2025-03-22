interface IFilaAtendimento {
    void agendarPaciente(int idPaciente, String nomePaciente, int prioridade, String horarioChegada);
    void desistenciaPaciente(int idPaciente);
    void listaPacientesEmEspera();
}

class FilaAtendimento implements IFilaAtendimento {
    private int idPaciente, prioridade;
    private String nomePaciente, horarioChegada;

    @Override
    public void agendarPaciente(int idPaciente, String nomePaciente, int prioridade, String horarioChegada) {}

    @Override
    public void desistenciaPaciente(int idPaciente) {}

    @Override
    public void listaPacientesEmEspera() {}
}

public class Hospital {
    public static void main(String[] args) {
        FilaAtendimento fila = new FilaAtendimento();
    }
}
