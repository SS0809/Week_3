package com.insertionsort;

import java.util.Arrays;

public class SortEmployeeIDs {
    // method to sort the array elements
    public void sort(int[] empID) {
        int n = empID.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j >0 ; j--) {
                if(empID[j] < empID[j-1]) {
                    swap(empID, j, j-1);
                } else {
                    break;
                }
            }
        }
    }

    // method to swap the elements in the array
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        // method calling
        int[] employee = {6, 5, 4, 3, 2, 1};
        SortEmployeeIDs is = new SortEmployeeIDs();
        is.sort(employee);
        System.out.println(Arrays.toString(employee));
    }
}
