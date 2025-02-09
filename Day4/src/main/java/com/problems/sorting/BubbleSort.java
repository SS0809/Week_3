package com.problems.sorting;

public class BubbleSort {
    //method to sort the array
    void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if(arr[j] < arr[j-1]) {
                    swap(arr, j, j-1);
                    swapped = true;
                }
            }
            // optimized if array is already sorted.
            if (!swapped) {
                break;
            }
        }
    }

    // method to swap the elements
    void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
