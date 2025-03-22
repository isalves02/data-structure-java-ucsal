public class MaximoDivisorComum {
    public static int CalculaMDC(int m, int n) {
        if (n == 0) return m;
        return CalculaMDC(n, m % n);
    }

    public static void main(String[] args) {
        System.out.println("MDC de 56 e 14: " + CalculaMDC(56, 14)); // Saída: 14
        System.out.println("MDC de 48 e 18: " + CalculaMDC(48, 18)); // Saída: 6
    }
}