package PaginaWeb;

import java.util.Stack;

public class HistoricoWeb {
    private Stack<PaginaWeb> pilha;

    public void inicializarPilha() {
        pilha = new Stack<>();
    }

    public void push(PaginaWeb pagina) {
        pilha.push(pagina);
        System.out.println("Página adicionada: " + pagina);
    }

    public PaginaWeb pop() {
        if (pilha.isEmpty()) {
            System.out.println("A pilha está vazia!");
            return null;
        }
        PaginaWeb removida = pilha.pop();
        System.out.println("Página removida: " + removida);
        return removida;
    }

    public void listarPilha() {
        if (pilha.isEmpty()) {
            System.out.println("Nenhuma página na pilha.");
        } else {
            System.out.println("Histórico de páginas:");
            for (int i = pilha.size() - 1; i >= 0; i--) {
                System.out.println(pilha.get(i));
            }
        }
    }
}

