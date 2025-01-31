package com.quicksort;

import java.util.Arrays;

public class SortProductPrices {
    // method for sorting the elements
    public void quickSort(double[] prices){
        sort(prices, 0, prices.length-1);
    }

    // helper method for recursion
    public void sort(double[] prices, int low, int high) {
        // base condition
        if (low >= high) return;

        int start = low, end = high, mid = start + ( end - start ) / 2;
        double pivot = prices[mid];

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
    public void swap(double[] prices, int start, int end) {
        double temp = prices[start];
        prices[start] = prices[end];
        prices[end] = temp;
    }

    public static void main(String[] args) {
        // calling methods
        double[] prices = {220, 130, 160, 400, 936};
        SortProductPrices qs = new SortProductPrices();
        qs.quickSort(prices);
        System.out.println(Arrays.toString(prices));
    }
}
