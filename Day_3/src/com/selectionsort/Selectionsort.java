package com.selectionsort;


public class Selectionsort {
    public static void main(String[] args) {
        int[] arr = {8, 6, 3};
        int n = arr.length;
        for(int i =0 ;i<=n-2;i++){//BECAUSE WE SWAP TILL SECOND LAST ELE.
            //FIND MINIMUM
            int min = i;
            for (int j=i;j<=n-1;j++){
                if (arr[j]<arr[min]) {
                    min=j;
                }
            }
            int temp = arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }
        for (int a:
                arr) {
            System.out.print(a+" ");
        }
    }
}
