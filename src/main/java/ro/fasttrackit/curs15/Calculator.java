package ro.fasttrackit.curs15;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public double impartit(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return (double) a / b;
    }

    public int inm(int a, int b) {
        return a * b;
    }
}
