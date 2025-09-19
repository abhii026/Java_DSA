// package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=50;
        for (int i = 0; i < 11; i++) {
            System.out.println(fiboformula(i));
        }
        System.out.println(fiboformula(n));
        // System.out.println(fib(n));
    }

    static int fiboformula(int n) {
        double f1 = ((1 + Math.sqrt(5))/2);
        return (int) (Math.pow(f1, n)/Math.sqrt(5));
    }

    static int fib(int n) {
        if (n < 2) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
