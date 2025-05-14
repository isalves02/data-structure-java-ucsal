import java.util.Scanner;
import java.util.Stack;

public class PalindromoPilha {
    public static void main(String[] args) {
        Stack<String> pilha = new Stack<>();
        Scanner sc = new Scanner(System.in);
        PalindromoPilha app = new PalindromoPilha();

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Verificar se é palíndromo");
            System.out.println("2. Listar palíndromos cadastrados");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    app.cadastrarPalindromos(sc, pilha);
                    break;
                case 2:
                    app.listarPalindromos(pilha);
                    break;
                case 3:
                    System.out.println("Encerrando programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 3);

        sc.close();
    }

    public void cadastrarPalindromos(Scanner sc, Stack<String> pilha) {
        System.out.print("Digite uma palavra ou frase: ");
        String entrada = sc.nextLine();

        if (isPalindromo(entrada)) {
            System.out.println("'" + entrada + "' é um palíndromo!");
            pilha.push(entrada);
        } else {
            System.out.println("'" + entrada + "' não é um palíndromo.");
        }
    }

    public void listarPalindromos(Stack<String> pilha) {
        if (pilha.isEmpty()) {
            System.out.println("Nenhum palíndromo cadastrado.");
        } else {
            System.out.println("Palíndromos cadastrados:");
            for (int i = pilha.size() - 1; i >= 0; i--) {
                System.out.println("- " + pilha.get(i));
            }
        }
    }

    public boolean isPalindromo(String texto) {
        String txtLimpo = texto.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        return verificaPalindromo(txtLimpo, 0, txtLimpo.length() - 1);
    }

    private boolean verificaPalindromo(String s, int esquerda, int direita) {
        if (esquerda >= direita) return true;
        if (s.charAt(esquerda) != s.charAt(direita)) return false;
        return verificaPalindromo(s, esquerda + 1, direita - 1);
    }
}