package com.problems.fibonacci;

public class Main {
    public static void main(String[] args) {
        // calling method for each fibonacci
        int arr[] = {10, 30, 50};
        FibonacciComputation fc = new FibonacciComputation();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("calculating fibonacci for " + arr[i]);
            fc.performanceMeasure(arr[i]);
            System.out.println();
        }
    }
}
