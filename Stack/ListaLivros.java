import java.util.Iterator;
import java.util.Stack;

public class ListaLivros {
    public static void main(String[] args) {
        Stack<String> lista = new Stack<String>();
        ListaLivros listaLivrosMain = new ListaLivros();
	    
        listaLivrosMain.listarLivros(lista);
		listaLivrosMain.addLivro(lista);
		listaLivrosMain.listarLivros(lista);
		
		listaLivrosMain.listarLivros(lista);
		listaLivrosMain.removerUltimo(lista);
		listaLivrosMain.listarAlunos(lista);
    }

    public void listarLivros(Stack lista) {
        System.out.println("Listando alunos...");
        for (int i = lista.size() -1; i >= 0; i--) {
	        System.out.println(lista.get(i));
	    }
    }

    public void addLivro(Stack lista) {
        lista.add("O Colecionador");
        lista.add("Capitães de areia");
        lista.add("Tudo sobre o amor");
        lista.add("A hora da estrela");
    }

    public void removerUltimo(Stack lista) {
	    System.out.println("\n\nO livro já foi lido! Removendo... \n");
	    lista.pop();
	}

    public void listarAlunos(Stack lista) {
	    Iterator<String> it = lista.iterator();
	    
	    while(it.hasNext()) {
	        System.out.println(it.next());
	    }
	}
}
