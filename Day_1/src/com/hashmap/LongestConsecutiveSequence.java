package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestConsecutiveSequence {
    public int longestConsecutive(ArrayList<Integer> nums) {
        HashMap<Integer, Boolean> umap = new HashMap<>();
        for (int num : nums) {
            umap.put(num, true);
        }
        //inserting to umap

        for (int num : nums) {
            if (umap.containsKey(num - 1)) {
                umap.put(num, false);
            }
        }//sets all elements to false those are not leading to a consecutive number

        int maxlen = 0;
        for (int num : nums) {
            if (Boolean.TRUE.equals(umap.get(num))) {
                int count = 0, j = 0;
                while (umap.containsKey(num + j)) {
                    {
                        j++;
                        count++;// counts consecutive number
                    }
                    maxlen = Math.max(maxlen, count);
                }
            }
        }
        return maxlen;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(4);
        nums.add(200);
        nums.add(1);
        nums.add(3);
        nums.add(2);

        LongestConsecutiveSequence obj = new LongestConsecutiveSequence();
        System.out.println("Longest Consecutive Sequence Length: " + obj.longestConsecutive(nums));
    }
}