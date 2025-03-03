package QuestIII;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite os números que serão multiplicados: ");
        a = sc.nextDouble();
        b = sc.nextDouble();

        System.out.println(multiplyNumbers(a,b));
    }

    public static double multiplyNumbers(double a, double b) {
        return a *b;
    }
}
