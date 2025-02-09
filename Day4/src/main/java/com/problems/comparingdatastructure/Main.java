package com.problems.comparingdatastructure;

import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class Main {
    // method for creating datasets for given size
    private void storingInArray(int[] arr, int size) {
        // adding random variables
        Random r = new Random();
        for(int i = 0; i<size; i++) {
            arr[i] = r.nextInt(size - 10);
        }
    }
    // method for storing data in hashset for given size
    private void storingInHashset(HashSet<Integer> hs, int size) {
        // adding random variables
        Random r = new Random();
        for(int i = 0; i<size; i++) {
            hs.add(r.nextInt(size - 10));
        }
    }
    // method for storing data in treesets for given size
    private void storingInTreeset(TreeSet<Integer> ts, int size) {
        // adding random variables
        Random r = new Random();
        for(int i = 0; i<size; i++) {
            ts.add(r.nextInt(size - 10));
        }
    }

    public static void main(String[] args) {
        // object creation
        Main m = new Main();
        Comparison c = new Comparison();

        int arr[] = {1000, 10000, 1000000};

        // performing operation for each test case.
        for (int i = 0; i < arr.length; i++) {
            int[] array = new int[arr[i]];
            HashSet<Integer> hs = new HashSet<>();
            TreeSet<Integer> ts = new TreeSet<>();

            m.storingInArray(array, arr[i]);
            m.storingInHashset(hs, arr[i]);
            m.storingInTreeset(ts, arr[i]);

            System.out.println("Checking performance for size: " + arr[i]);
            c.arrayPerformance(array, array[arr[i] - 67]); // searching for last 67th element for better result
            c.hashSetPerformance(hs, array[arr[i] - 67]); // searching for last 67th element for better result
            c.treeSetPerformance(ts, array[arr[i] - 67]); // searching for last 67th element for better result
            System.out.println();
        }
    }
}
