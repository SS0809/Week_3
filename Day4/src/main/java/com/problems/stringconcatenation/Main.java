package com.problems.stringconcatenation;

public class Main {
    public static void main(String[] args) {
        // calling the methods
        StringPerformance sp = new StringPerformance();
        int[] arr = {1000, 10000, 1000000};

        // loop for testing for each case
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Performance for " + arr[i] + " datasets");
            sp.string("Hello", arr[i]);
            sp.stringBuffer("Hello", arr[i]);
            sp.stringBuilder("Hello", arr[i]);
            System.out.println();
        }
    }
}
