package ChecklistTarefas;
import java.util.Stack;

public class PilhaDeTarefas {
    private Stack<String> pilhaPassos;

    public void criarPilha() {
        pilhaPassos = new Stack<>();
    }

    public void adicionarPasso(String passo) {
        pilhaPassos.push(passo);
        System.out.println("Passo adicionado: " + passo);
    }

    public void removerPasso() {
        if (pilhaPassos.isEmpty()) {
            System.out.println("Todos as tarefas foram concluídas!");
        } else {
            String passoRemovido = pilhaPassos.pop();
            System.out.println("Executando e removendo passo: " + passoRemovido);
        }

        if (pilhaPassos.isEmpty()) {
            System.out.println("Tarefa concluída!");
        }
    }

    public void listarPassos() {
        if (pilhaPassos.isEmpty()) {
            System.out.println("Nenhuma tarefa registrada.");
        } else {
            System.out.println("Tarefas restantes (do mais recente ao primeiro):");
            for (int i = pilhaPassos.size() - 1; i >= 0; i--) {
                System.out.println("- " + pilhaPassos.get(i));
            }
        }
    }
}
