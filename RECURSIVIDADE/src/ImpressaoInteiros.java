/*
* Escreva uma função recursiva que imprima todos os números inteiros de 1
até n, onde n é um número inteiro positivo fornecido como entrada.
* */

public class ImpressaoInteiros {
   /* public static void Imprimir(int limite) {
        // in == limite = return 0
        for (int i = 0; i <= limite; i++) {
            System.out.println(i);
        }

    } */

    public static int Impressao(int limite, int in) {
        if (in >= limite) return limite;
        System.out.println(in);
        return Impressao(limite, in+1);
    }

    public static void main(String[] args) {
        Impressao(10, 0);
    }
}
