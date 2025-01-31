package com.mergesort;

import java.util.Arrays;

public class SortArrayOfBookPrices {
    // method to divide and merge the elements
    public double[] mergeSort(double[] bookPrice) {
        if (bookPrice.length == 1) {
            return bookPrice;
        }
        int n = bookPrice.length;
        int mid = n/2;

        // dividing the elements
        double[] left = mergeSort(Arrays.copyOfRange(bookPrice, 0, mid));
        double[] right = mergeSort(Arrays.copyOfRange(bookPrice, mid, bookPrice.length));
        // merging the element
        return merge(left, right);
    }

    // method to compare and merge te elements
    public double[] merge(double[] left, double[] right){
        double[] merged = new double[left.length + right.length];

        int i =0, j=0, k=0;
        // comparing elements
        while(i< left.length && j < right.length) {
            if(left[i] < right[j]) {
                merged[k] = left[i];
                i++;
            } else {
                merged[k] = right[j];
                j++;
            }
            k++;
        }

        while(i< left.length) {
            merged[k] = left[i];
            i++; k++;
        }
        while(j<right.length) {
            merged[k] = right[j];
            j++;
            k++;
        }

        return merged;
    }
    public static void main(String[] args) {
        // method calling
        double bookPrice[] = {220, 130, 160, 400, 936};
        SortArrayOfBookPrices ms = new SortArrayOfBookPrices();
        System.out.println(Arrays.toString(ms.mergeSort(bookPrice)));
    }
}
