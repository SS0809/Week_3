package com.bubblesort;

public class Bubblesort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 3};
        int n = arr.length;
        for (int i=0;i<n;i++){
            for (int j=i;j<n;j++){
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
        for (int a:
             arr) {
            System.out.print(a+" ");
        }
    }
}
