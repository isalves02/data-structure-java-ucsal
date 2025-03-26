public class InverterString {
//    public static void InverterPalavra(String palavra) {
//        for(int i = palavra.length() - 1; i >= 0; i--) {
//            System.out.print(palavra.charAt(i));
//        }
//    }

    public static String InverterPalavra(String palavra, int in) {
        if (in < 0) return "";
        return palavra.charAt(in) + InverterPalavra(palavra, in - 1);
    }

    public static void main(String[] args) {
        String palavra = "Isabel";
        System.out.println("Palavra normal: "+palavra+ "\nPalavra Invertida: "+InverterPalavra(palavra, palavra.length()-1));
    }
}
