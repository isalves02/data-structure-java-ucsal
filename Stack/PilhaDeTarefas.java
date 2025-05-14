import java.util.Scanner;
import java.util.Stack;

public class PilhaDeTarefas {

    public static void main(String[] args) {
        Stack<String> pilhaTarefas = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU DE TAREFAS ===");
            System.out.println("1. Inserir tarefa");
            System.out.println("2. Obter próxima tarefa");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String tarefa = scanner.nextLine();
                    pilhaTarefas.push(tarefa);
                    System.out.println("Tarefa adicionada!");
                    break;

                case 2:
                    if (pilhaTarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa na pilha.");
                    } else {
                        String proxima = pilhaTarefas.pop();
                        System.out.println("Próxima tarefa: " + proxima);
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}
