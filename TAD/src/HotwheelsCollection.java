import java.util.ArrayList;

interface IHotwheel {
    void adicionarCarro (String nomeCarro, String modelo, String edicao, int anoEdicao);
    void removerCarro (String nomeCarro, String modelo, String edicao, int anoEdicao);
}

class Hotwheel implements IHotwheel {
    private String nomeCarro, modelo, edicao;
    private int anoEdicao;

    @Override
    public void adicionarCarro(String nomeCarro, String modelo, String edicao, int anoEdicao) {}

    @Override
    public void removerCarro(String nomeCarro, String modelo, String edicao, int anoEdicao) {}
}

public class HotwheelsCollection {
    public static void main(String[] args) {
        Hotwheel hotwheel = new Hotwheel();
    }
}
