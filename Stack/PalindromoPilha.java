
/* 
2. Escreva um programa que utiliza um objeto Pilha para determinar se uma
string é um Palíndromo (isto é, a string é escrita identicamente de trás para
frente). O programa deve ignorar espaços e pontuação.
*/

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class PalindromoPilha {

    public static void main(String[] args) {
        Palindromo isPalindromo = new Palindromo();
        Stack<String> pilha = new Stack<String>();
        PalindromoPilha main = new PalindromoPilha();
        Scanner sc = new Scanner(System.in);

        while (true) {
            main.cadastrarPalindromos(isPalindromo, sc, pilha);
        }
            
        sc.close();

        // main.listarPalindromos(pilha);
    }

    public void cadastrarPalindromos(Palindromo isPalindromo, Scanner sc, Stack pilha) {
        String palavra;
        System.out.println("Escreva uma palavra: ");
            palavra = sc.nextLine();
            if (isPalindromo.ehPalindromo(palavra)) {
                pilha.add(palavra);
            } else {

                System.out.println(palavra + " ----  Não é palindromo.");
            }

    }

    public void listarPalindromos(Stack pilha) {
	    Iterator<String> it = pilha.iterator();
	    
	    while(it.hasNext()) {
	        System.out.println(it.next());
	    }
	}
	
}
