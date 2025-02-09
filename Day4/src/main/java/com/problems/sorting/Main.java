package com.problems.sorting;

import com.problems.searching.BinarySearch;
import com.problems.searching.LinearSearch;

import java.util.Arrays;
import java.util.Random;

public class Main {
    // method for creating datasets for given size
    private void dataSets(int[] arr, int size) {
        Random r = new Random();
        for(int i = 0; i<size; i++) {
            arr[i] = r.nextInt(size - 10);
        }
    }

    // measures performance for each dataset for given size.
    void measurePerformance(int size){
        int[] arr = new int[size];
        dataSets(arr, size);

        long start = 0, end = 0;

        // performing Bubble sort
        BubbleSort ls = new BubbleSort();
        int[] temp = Arrays.copyOf(arr, size); // copying the elements into temporary array
        start = System.nanoTime();
        ls.bubbleSort(temp);
        end = System.nanoTime();
        System.out.println("Total time by Bubble sort algorithm: " + (end - start) / 1e6 + "ms");

        // performing merge sort
        MergeSort ms = new MergeSort();

        start = System.nanoTime();
        ms.mergeSort(arr);
        end = System.nanoTime();
        System.out.println("Total time by Merge sort algorithm: " + (end - start) / 1e6 + "ms");

        // performing Quick sort
        QuickSort qs = new QuickSort();

        start = System.nanoTime();
        qs.quickSort(arr);
        end = System.nanoTime();
        System.out.println("Total time by Quick sort algorithm: " + (end - start) / 1e6 + "ms");
    }

    public static void main(String[] args) {
        Main m = new Main();
        // measuring size for one by one dataset
        int[] arr = {1000, 10000, 1000000};
        for (int i = 0; i < 3; i++) {
            System.out.println("Checking for " + arr[i] + " dataset.");
            m.measurePerformance(arr[i]);
        }
    }
}
