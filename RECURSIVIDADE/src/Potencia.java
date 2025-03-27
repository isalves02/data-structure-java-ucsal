public class Potencia {
    public static int potencia(int base, int expoente) {
        if (expoente == 0) return 1;
        if (expoente == 1) return base;
        return soma(base, potencia(base, expoente - 1));
    }

    private static int soma(int a, int b) {
        if (b == 0) return 0;
        return a + soma(a, b - 1);
    }

    public static void main(String[] args) {
        System.out.println("2^3 = " + potencia(2, 3));
    }
}
