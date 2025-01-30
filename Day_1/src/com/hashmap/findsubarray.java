package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

//Find All Subarrays with Zero Sum
//Problem: Given an array, find all subarrays whose elements sum up to zero.
//        Hint: Use a hash map to store the cumulative sum and its frequency. If a sum repeats, a zero-sum subarray exists.
public class findsubarray {
    class Pair {
        int first, second;
        Pair(int a, int b)
        {
            first = a;
            second = b;
        }
    }
    ArrayList<Pair> findSubArrays(int[] arr, int n){
        ArrayList<Pair> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer> > hm = new HashMap<>();
        int sum =0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                ans.add(new Pair(0,i));
            }
            ArrayList<Integer> al = new ArrayList<>();
            if(hm.containsKey(sum)){
                al = hm.get(sum);
                for (int it = 0; it < al.size(); it++) {
                    ans.add(new Pair(al.get(it) + 1, i));
                }
            }
            al.add(i);
            hm.put(sum, al);
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr
                = { 6, 3, -1, -3, 4, -2, 2, 4, 6, -12, -7 };
        int n = arr.length;
        ArrayList<Pair> out = new findsubarray().findSubArrays(arr, n);
        if (out.size() == 0) {
            System.out.println("No subarray exists");
        }
        else{
            for (int i = 0; i < out.size(); i++) {
                Pair p = out.get(i);
                System.out.println("subarray index "
                        + p.first + " : "
                        + p.second);
            }
        }
    }
}
