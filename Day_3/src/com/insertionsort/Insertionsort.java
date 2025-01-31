package com.insertionsort;

public class Insertionsort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 3};
        int n = arr.length;
        for (int i =0 ;i<=n-1;i++){
            int j=i;
            while(j>0&&arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        for (int a:
                arr) {
            System.out.print(a+" ");
        }
    }
}
