package com.problems.sorting;

public class QuickSort {
    // method for sorting the elements
    public void quickSort(int[] prices){
        sort(prices, 0, prices.length-1);
    }

    // helper method for recursion
    public void sort(int[] prices, int low, int high) {
        // base condition
        if (low >= high) return;

        int start = low, end = high, mid = start + ( end - start ) / 2;
        int pivot = prices[mid];

        // condition
        while(start <= end) {
            while(pivot > prices[start]) start++;
            while (pivot < prices[end]) end--;

            if (start <= end) {
                swap(prices, start, end);
                start++;
                end--;
            }
        }

        // recursion call
        sort(prices, low, end);
        sort(prices, start, high);
    }

    // method for swapping
    public void swap(int[] prices, int start, int end) {
        int temp = prices[start];
        prices[start] = prices[end];
        prices[end] = temp;
    }
}
