public class Fibonacci {
    public static int Fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;

        return Fibonacci(num-1) + Fibonacci(num-2);
    }
    public static void main(String[] args) {
        int num = 12;
        for (int i = 0; i <= num; i++) {
            System.out.print(Fibonacci(i) + " ");
        }
    }
}
