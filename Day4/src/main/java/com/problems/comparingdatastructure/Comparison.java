package com.problems.comparingdatastructure;

import java.util.HashSet;
import java.util.TreeSet;

public class Comparison {
    // method for checking performance of array
    public void arrayPerformance(int[] arr, int target) {
        boolean flag=false;

        long start = System.nanoTime();
        for(int a : arr){
            if(target == a){
                flag = true;
                break;
            }
        }
        long end = System.nanoTime();

        System.out.println("Time taken by array: " + (end - start) / 1e6 + " ms");
    }

    // method for checking performance of hash set
    public void hashSetPerformance(HashSet<Integer> set, int target){
        boolean flag = false;

        long start = System.nanoTime();
        flag=set.contains(target);
        long end = System.nanoTime();

        System.out.println("Time taken by Hash set: " + (end - start) / 1e6 + " ms");
    }

    // method for checking performance of treeset
    public void treeSetPerformance(TreeSet<Integer> set, int target){
        boolean flag = false;

        long start = System.nanoTime();
        flag = set.contains(target);
        long end = System.nanoTime();

        System.out.println("Time taken by Tree set: " + (end - start) / 1e6 + " ms");
    }
}
