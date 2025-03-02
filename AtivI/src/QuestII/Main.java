package QuestII;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números: ");
        a = sc.nextInt();
        b = sc.nextInt();

        System.out.println(compareAndReturn(a, b));
    }

    public static String compareAndReturn(int a, int b) {
        if (a == b) {
            return "São iguais. Não existe um maior que o outro.";
        } else {
            return a > b ? String.format("São diferentes. %d é maior que %d", a,b) : String.format("São diferentes. %d é maior que %d", b,a);
        }
    }
}
