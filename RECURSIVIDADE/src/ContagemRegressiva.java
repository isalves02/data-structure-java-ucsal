/*
* Escreva uma função recursiva que imprima uma contagem regressiva a
partir de um número inteiro positivo fornecido como entrada.
* */

public class ContagemRegressiva {
//    public static void Countdown(int numero) {
//        int i = numero;
//
//        while(i >= 0) {
//            System.out.println(i);
//            i--;
//        }
//    }

    public static int Countdown(int numero) {
        if (numero <= 0) return 0;
        System.out.println(numero);
        return Countdown(numero-1);
    }

    public static void main(String[] args) {
        System.out.println(Countdown(10));
    }
}
