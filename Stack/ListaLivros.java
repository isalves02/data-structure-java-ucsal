import java.util.Scanner;
import java.util.Stack;

public class ListaLivros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> pilhaLivros = new Stack<>();
        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Inserir livro na pilha");
            System.out.println("2. Consultar livros na pilha");
            System.out.println("3. Remover o último livro");
            System.out.println("4. Esvaziar pilha");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();
            sc.nextLine(); // limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do livro: ");
                    String livro = sc.nextLine();
                    pilhaLivros.push(livro);
                    System.out.println("Livro adicionado à pilha!");
                    break;

                case 2:
                    listarLivros(pilhaLivros);
                    break;

                case 3:
                    removerUltimo(pilhaLivros);
                    break;

                case 4:
                    pilhaLivros.clear();
                    System.out.println("Pilha esvaziada.");
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 5);

        sc.close();
    }

    public static void listarLivros(Stack<String> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia.");
        } else {
            System.out.println("Livros na pilha (do topo para a base):");
            for (int i = pilha.size() - 1; i >= 0; i--) {
                System.out.println("- " + pilha.get(i));
            }
        }
    }

    public static void removerUltimo(Stack<String> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia. Nenhum livro para remover.");
        } else {
            String removido = pilha.pop();
            System.out.println("Livro removido do topo da pilha: " + removido);
        }
    }
}
