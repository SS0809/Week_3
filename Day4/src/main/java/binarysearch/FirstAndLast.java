package main.java.binarysearch;

import java.util.Arrays;

public class FirstAndLast {
    public static int occuranceFind(int[] nums, int target, boolean isFirst) {
        int idx = -1;
        int i = 0, j = nums.length - 1;
        while (i <= j) {
            int k = i + (j - i) / 2;
            if (target < nums[k]) {
                j = k - 1;
            } else if (nums[k] < target) {
                i = k + 1;
            } else {
                idx = k;
                if (isFirst) {
                    j = k - 1; // Search left side for first occurrence
                } else {
                    i = k + 1; // Search right side for last occurrence
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = {1, 22, 22, 5, 6, 8, 9};
        int tar = 22;

        Arrays.sort(arr);  // Sorting is required for binary search
        System.out.println("Sorted Array: " + Arrays.toString(arr));

        int ans[] = new int[2];
        ans[0] = occuranceFind(arr, tar, true);
        ans[1] = occuranceFind(arr, tar, false);

        System.out.println("First Occurrence: " + ans[0] + ", Last Occurrence: " + ans[1]);
    }
}
