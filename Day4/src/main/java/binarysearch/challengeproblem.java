package main.java.binarysearch;
//Challenge Problem (for both Linear and Binary Search)
//Problem:
//You are given a list of integers.
// Write a program that uses Linear Search to find the first missing positive integer in the list
// and Binary Search to find the index of a given target number.
//        Approach:
//Linear Search for the first missing positive integer:
//Iterate through the list and mark each number in the list as visited (you can use negative marking or a separate array).
//Traverse the array again to find the first positive integer that is not marked.
//Binary Search for the target index:
//After sorting the array, perform binary search to find the index of the given target number.
//Return the index if found, otherwise return -1.
public class challengeproblem {
        public static int findFirstMissingPositive(int[] arr) {
            int n = arr.length;

            for (int i = 0; i < n; i++) {
                while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                    int temp = arr[arr[i] - 1];
                    arr[arr[i] - 1] = arr[i];
                    arr[i] = temp;
                }
            }

            for (int i = 0; i < n; i++) {
                if (arr[i] != i + 1) {
                    return i + 1;
                }
            }
            return n + 1;
        }

        public static int binarySearch(int[] arr, int target) {
            int[] sorted = arr.clone();
            java.util.Arrays.sort(sorted);

            int left = 0;
            int right = sorted.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (sorted[mid] == target) {
                    // Find original index
                    for (int i = 0; i < arr.length; i++) {
                        if (arr[i] == target) return i;
                    }
                }
                if (sorted[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr = {3, 4, -1, 1};
            int target = 4;

            int missing = findFirstMissingPositive(arr.clone());
            int index = binarySearch(arr, target);

            System.out.println("First missing positive: " + missing);
            System.out.println("Target index: " + index);
        }
    }
