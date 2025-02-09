package com.problems.searching;

import java.util.Arrays;

public class BinarySearch {
    // method for searching the element via binary search
    int search(int[] arr, int target) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target ) {
                return mid;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // method for sorting the array with merge sort
    int[] mergeSort(int[] arr) {
        int n = arr.length;
        if (n == 1) {
            return arr;
        }

        int mid = n / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, n));

        return merge(left, right);
    }

    // helper method for performing merge sort
    int[] merge(int[] left, int[] right) {
        int[] mergedArray = new int[left.length + right.length];

        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] < right[i]) {
                mergedArray[k++] = left[i++];
            } else {
                mergedArray[k++] = right[j++];
            }
        }

        while (i < left.length) {
            mergedArray[k++] = left[i++];
        }

        while (j < right.length) {
            mergedArray[k++] = right[j++];
        }

        return mergedArray;
    }
}
