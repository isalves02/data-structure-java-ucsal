package ChecklistTarefas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PilhaDeTarefas tarefa = new PilhaDeTarefas();
        tarefa.criarPilha();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU TAREFA ===");
            System.out.println("1. Adicionar passo");
            System.out.println("2. Executar próximo passo");
            System.out.println("3. Listar passos restantes");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("Descreva o passo da tarefa: ");
                    String passo = sc.nextLine();
                    tarefa.adicionarPasso(passo);
                    break;
                case 2:
                    tarefa.removerPasso();
                    break;
                case 3:
                    tarefa.listarPassos();
                    break;
                case 4:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        sc.close();
    }
}
