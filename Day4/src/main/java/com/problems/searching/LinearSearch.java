package com.problems.searching;

public class LinearSearch {
    // searching in array via linear search
    int search(int[] arr, int target) {
        for (int i = 0; i<arr.length; i++) { // using for loop instead foreach for getting index
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
