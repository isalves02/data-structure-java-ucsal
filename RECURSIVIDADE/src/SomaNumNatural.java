/*
* Crie uma função recursiva que calcule a soma dos primeiros N números
naturais.
* */

public class SomaNumNatural {
    public static int SomaPrimeiros(int num) {
        if (num == 0) return 0;

        return num + SomaPrimeiros(num-1);
    }

    public static void main(String[] args) {
        System.out.println("Soma dos primeiros números naturais: " + SomaPrimeiros(6));
    }
}
