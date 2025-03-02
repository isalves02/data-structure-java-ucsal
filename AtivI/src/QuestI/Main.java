package QuestI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite dois números para comparar o maior entre eles: ");
        a = sc.nextInt();
        b = sc.nextInt();

        if (a == b) {
            System.out.println("Ambos são iguais.");
        } else {
            System.out.println("O maior entre " + a + " e " +b+" é "+compareNumbers(a,b));
        }
    }

    public static int compareNumbers(int a, int b) {
        return a > b ? a : b;
    }
}