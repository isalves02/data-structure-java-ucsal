package PaginaWeb;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        HistoricoWeb historico = new HistoricoWeb();
        historico.inicializarPilha();

        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Visitar nova página");
            System.out.println("2. Voltar página");
            System.out.println("3. Listar histórico");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(sc.nextLine());

            switch (opcao) {
                case 1:
                    System.out.print("URL: ");
                    String url = sc.nextLine();
                    System.out.print("Título: ");
                    String titulo = sc.nextLine();
                    String dataHora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                    historico.push(new PaginaWeb(url, titulo, dataHora));
                    break;
                case 2:
                    historico.pop();
                    break;
                case 3:
                    historico.listarPilha();
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
