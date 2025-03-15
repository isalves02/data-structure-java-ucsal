interface IMathRationalOperations {
    void registerRationalNumbers(int a, int b);
    int sumNumbers(int a, int b);
    int multiplyNumbers(int a, int b);
    Boolean isEqual(int a, int b);
}

public class MathRationalOperations implements IMathRationalOperations {
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

    
    public static void main(String[] args) {
        int a, b;
    }
}
