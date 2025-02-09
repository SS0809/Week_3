package com.problems.searching;

import java.util.Random;

public class Main {
    // method for creating datasets for given size
    private void dataSets(int[] arr, int size) {
        Random r = new Random();
        for(int i = 0; i<size; i++) {
            arr[i] = r.nextInt(size - 10);
        }
    }

    // measures performance for each datasets for given size.
    void measurePerformance(int size){
        int[] arr = new int[size];
        dataSets(arr, size);

        long start = 0, end = 0;

        // performing linear search
        LinearSearch ls = new LinearSearch();
        start = System.nanoTime();
        ls.search(arr, arr[size - 23]); // searching for last 23rd element
        end = System.nanoTime();
        System.out.println("Total time by linear search: " + (end - start));

        // performing binary search
        BinarySearch bs = new BinarySearch();
        bs.mergeSort(arr); // doing merger sort into arr and sorting it.

        start = System.nanoTime();
        bs.search(arr, arr[size - 23]); // searching for last 23rd element
        end = System.nanoTime();
        System.out.println("Total time by binary search: " + (end - start) + "\n");
    }

    public static void main(String[] args) {
        Main m = new Main();
        // measuring size for one by one datasets
        int[] arr = {1000, 10000, 1000000};
        for (int i = 0; i < 3; i++) {
            System.out.println("Checking for " + arr[i] + " dataset.");
            m.measurePerformance(arr[i]);
        }
    }
}
