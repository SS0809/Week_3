package com.queue;

import java.util.Deque;
import java.util.LinkedList;

//Sliding Window Maximum
//Problem: Given an array and a window size k, find the maximum element in each sliding window of size k.
//Hint: Use a deque (double-ended queue) to maintain indices of useful elements in each window.
public class SlidingWindowMaximum {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        int arr[] = {1, 3, 5, 3, 6, 7};
        int k = 3;
        int n = arr.length ;
        for (int start =0 ; start + k-1 < n;start++){
            int temp_max = Integer.MIN_VALUE;
            for (int j =start ;j <k + start;j++){
                if (temp_max < arr[j])  temp_max = arr[j];
            }
            dq.push(temp_max);
        }
        while (!dq.isEmpty()){
            System.out.print(dq.pollLast()+" ");
        }
    }
}
