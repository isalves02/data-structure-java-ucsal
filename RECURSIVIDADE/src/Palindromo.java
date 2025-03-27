public class Palindromo {
    public static boolean ehPalindromo(String s) {
        s = s.replaceAll("\\s", "").toLowerCase();
        return verificaPalindromo(s, 0, s.length() - 1);
    }

    private static boolean verificaPalindromo(String s, int esquerda, int direita) {
        if (esquerda >= direita) return true;
        if (s.charAt(esquerda) != s.charAt(direita)) return false;
        return verificaPalindromo(s, esquerda + 1, direita - 1);
    }

    public static void main(String[] args) {
        String str1 = "Ana";
        System.out.println("\"" + str1 + "\" é um palíndromo? " + ehPalindromo(str1));
    }
}
