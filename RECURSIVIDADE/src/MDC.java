public class MDC {
    public static int MDC(int a, int b) {
        if (b == 0) return a;
        return MDC(b, a % b);
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        System.out.println("MDC de " + num1 + " e " + num2 + " é: " + MDC(num1, num2));
    }
}
