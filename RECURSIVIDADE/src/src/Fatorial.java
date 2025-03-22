public class Fatorial {
    public static int CalculoFatorial(int n) {
        if (n == 0) return 1;
        return n * CalculoFatorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Fatorial de 8: " + CalculoFatorial(8));
    }
}
