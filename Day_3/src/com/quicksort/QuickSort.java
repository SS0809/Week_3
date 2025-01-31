package com.quicksort;

public class QuickSort {
    static int partition(int arr[], int low , int high){
        int pivot = arr[low];
        int i = low, j = high;

        while(i < j) {
            while(i <= high && arr[i] <= pivot) i++;
            while(j > low && arr[j] > pivot) j--;
            if(i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    static void quickSort(int arr[], int low , int high ){
        if(low < high){
            int j = partition(arr, low, high);
            quickSort(arr, low, j - 1);
            quickSort(arr, j + 1, high);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 9, 7};
        int n = arr.length;
        quickSort(arr,0,n-1);
        for (int a :
                arr) {
            System.out.print(a+" ");
        }
    }
}
