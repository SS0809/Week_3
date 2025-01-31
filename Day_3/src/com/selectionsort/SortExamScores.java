package com.selectionsort;

import java.util.Arrays;

public class SortExamScores {
    // method to sort the array
    public void sort(double[] score) {
        int n = score.length;
        for (int i = 0; i < n; i++) {
            int min = findMinimum(score, i);
            swap(score, i, min);
        }
    }

    // method to swap two elements in the array
    public void swap(double[] score, int i, int j) {
        double temp = score[i];
        score[i] = score[j];
        score[j] = temp;
    }

    // method to find the minimum number's index
    private int findMinimum(double[] score, int j) {
        int min = j;
        for (int i = j; i < score.length; i++) {
            if(score[min] > score[i]) {
                min = i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        // method calling
        double[] score = {93.2, 93.6, 79.7, 81.2, 64.8};
        SortExamScores ss = new SortExamScores();
        ss.sort(score);
        System.out.println(Arrays.toString(score));
    }
}
