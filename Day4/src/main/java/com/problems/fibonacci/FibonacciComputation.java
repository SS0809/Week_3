package com.problems.fibonacci;

public class FibonacciComputation {
    // method for calculating fibonacci recursively
    public static int fibonacciRecursive(int n) {
        if (n <= 1) return n;
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    // calculating fibonacci iteratively
    public static int fibonacciIterative(int n) {
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    // measuring performance for each fibonacci number
    void performanceMeasure(int n) {
        long start, end;
        start = System.nanoTime();
        fibonacciRecursive(n);
        end = System.nanoTime();
        System.out.println("Time taken for " + n + " size recursively: " + (end - start) / 1e6 + " ms");

        start = System.nanoTime();
        fibonacciIterative(n);
        end = System.nanoTime();
        System.out.println("Time taken for " + n + " size iteratively: " + (end - start) / 1e6 + " ms");
    }
}
