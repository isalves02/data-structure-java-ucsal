interface IMathOperations {
    void registerRationalNumbers(int a, int b);
    int sumNumbers(int a, int b);
    int multiplyNumbers(int a, int b);
    Boolean isEqual(int a, int b);
}

class MathOperations implements IMathOperations {
    private int a, b;

    @Override
    public void registerRationalNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int sumNumbers(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplyNumbers(int a, int b) {
        return a*b;
    }

    @Override
    public Boolean isEqual(int a, int b) {
        return a == b;
    }
}

public class MathRationalOperations {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();
        System.out.println(math.isEqual(2, 2));
    }
}
