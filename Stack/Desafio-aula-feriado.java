import java.util.Iterator;
import java.util.Stack;

public class Main
{
	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		Main main = new Main();
		
		main.listaVazia(pilha);
		main.addAluno(pilha);
		main.listaVazia(pilha);
		
		main.listarAlunos(pilha);
		main.removerUltimo(pilha);
		main.listarAlunosIterator(pilha);
	}

	
	public void listaVazia(Stack pilha) {
	   if (pilha.isEmpty()) {
		    System.out.println("Lista vazia! Dormiram demais no feriado :(\n");
		} else {
		    System.out.println("\nAcordaram a tempo! Houveram alunos que foram ao café com estrutura!\n");
		} 
	}
	
	public void addAluno(Stack pilha) {
	    System.out.println("Adicionando participantes...");
	    pilha.add("Pedro Belém");
	    pilha.add("Pedro Leal");
	    pilha.add("Amanda");
	    pilha.add("Vitor Santos");
	    pilha.add("Lucas Alex");
	    pilha.add("Isabel");
	    pilha.add("Angelinha");
	}
	
	public void listarAlunos(Stack pilha) {
	    System.out.println("Listando alunos...");
	    
	    for (int i = pilha.size() -1; i >= 0; i--) {
	        System.out.println(pilha.get(i));
	    }
	}
	
	public void listarAlunosIterator(Stack pilha) {
	    Iterator<String> it = pilha.iterator();
	    
	    while(it.hasNext()) {
	        System.out.println(it.next());
	    }
	}
	
	public void removerUltimo(Stack pilha) {
	    System.out.println("\n\nOh não, a última participante é a professora, e essa lista é somente de alunos!!!!\n\nRemovendo...\n");
	    pilha.pop();
	} 
}
