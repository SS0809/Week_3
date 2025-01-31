package com.bubblesort;

import java.util.Arrays;

public class SortStudentMarks {
    // method to sort the array
    public void sort(double[] marks) {
        int n = marks.length;
        boolean swapped;
        // loop throughout the array
        for(int i = 0; i<n; i++) {
            swapped = false;
            for (int j = 1; j < n-i; j++) {
                if(marks[j] < marks[j-1]) {
                    swap(marks, j, j-1);
                    swapped = true;
                }
            }
            // optimized if array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    // method to swap the array elements
    public void swap(double[] marks, int i, int j) {
        double temp = marks[i];
        marks[i] = marks[j];
        marks[j] = temp;
    }

    public static void main(String[] args) {
        double[] marks = {93.2, 93.6, 79.7, 81.2, 64.8};
        SortStudentMarks bs = new SortStudentMarks();
        // method calling
        bs.sort(marks);
        // printing sorted array
        System.out.println(Arrays.toString(marks));
    }
}
