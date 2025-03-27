public class ConversaoBinaria {
    public static String decimalParaBinario(int n) {
        if (n == 0) return "";
        return decimalParaBinario(n / 2) + (n % 2);
    }

    public static void main(String[] args) {
        int numero = 25;
        String binario = decimalParaBinario(numero);
        System.out.println("O número " + numero + " em binário é: " + (binario.isEmpty() ? "0" : binario));
    }
}
