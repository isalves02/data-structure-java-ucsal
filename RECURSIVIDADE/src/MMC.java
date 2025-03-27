public class MMC {
    public static int MDC(int a, int b) {
        if (b == 0) return a;
        return MDC(b, a % b);
    }

    public static int MMC(int a, int b) {
        return (a * b) / MDC(a, b);
    }

    public static void main(String[] args) {
        int num1 = 12, num2 = 18;
        System.out.println("MMC de " + num1 + " e " + num2 + " é: " + MMC(num1, num2));
    }
}