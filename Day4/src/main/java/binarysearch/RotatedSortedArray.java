package main.java.binarysearch;

import java.util.function.BinaryOperator;

//Binary Search Problem 1: Find the Rotation Point in a Rotated Sorted Array
//Problem:
//You are given a rotated sorted array. Write a program that performs
// Binary Search to find the index of the smallest element in the array (the rotation point).
//Approach:
//Initialize left as 0 and right as n - 1.
//Perform a binary search:
//Find the middle element mid = (left + right) / 2.
//If arr[mid] > arr[right], then the smallest element is in the right half, so update left = mid + 1.
//If arr[mid] < arr[right], the smallest element is in the left half, so update right = mid.
//        Continue until left equals right, and then return arr[left] (the rotation point).
public class RotatedSortedArray {
    public int binarySearch(int[] nums){
        int low =0,high = nums.length-1;
        while(low<high){
            int mid = (low + high) /2 ;
            if(nums[mid] > nums[high]){
                low = mid +1 ;
            }else {
                high = mid;
            }
        }
        return low;
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        RotatedSortedArray rsa = new RotatedSortedArray();
        System.out.println(rsa.binarySearch(arr));
    }
}
