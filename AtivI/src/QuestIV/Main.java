package QuestIV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        double a,b;
        Boolean endSystem = false;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Selecione uma opção: \n1 - Adição \t\t2 - Subtração \n3 - Multiplicação \t\t4 - Divisão\n5 - Finalizar sistema");
            op = sc.nextInt();
            System.out.println("Entre dois números: ");
            a = sc.nextDouble();
            b = sc.nextDouble();

            switch (op) {
                case 1:
                    System.out.println(opAddition(a,b));
                    break;
                case 2:
                    System.out.println(opSubtration(a,b));
                    break;
                case 3:
                    System.out.println(opMultiplication(a,b));
                    break;
                case 4:
                    System.out.println(opDivision(a,b));
                    break;
                default:
                    endSystem = true;
            }
        } while (!endSystem);
    }

    public static double opAddition(double a, double b) {
        return a + b;
    }

    public static double opSubtration(double a, double b) {
        return a - b;
    }

    public static double opMultiplication(double a, double b) {
        return a * b;
    }

    public static String opDivision(double a, double b) {
        if (b == 0) return "Não é possível realizar a divisão, pois o divisor deverá ser diferente de zero.";
        double res = a / b;
        return String.format("%f", res);
    }
}
