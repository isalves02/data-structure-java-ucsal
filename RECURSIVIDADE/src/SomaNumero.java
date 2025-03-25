/*
    Faça um programa em java fazendo uso da recursividade que solicite para o
    usuário digitar um número, em seguida, faça a soma de todos os algarismos do
    número. Exemplos:
        1981 = 1 + 9 + 8 + 1
        2020 = 2 + 0 + 2 + 0
*/

public class SomaNumero {
    /*public static int Soma(String numero) {
        int res = 0;
        for (int i = 0; i < numero.length(); i++) {
            int num = numero.charAt(i) - '0';
            res += num;
        }
            System.out.println(res);

        return res;
    }*/

    public static int SomaHelper(String numero, int in) {
        if (in == numero.length()) return 0;

        int num = numero.charAt(in) - '0';
        return num + SomaHelper(numero, in +1);
    }

    public static void main(String[] args) {
        System.out.println(SomaHelper("2202", 0));
    }
}
