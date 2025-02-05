package main.java.binarysearch;
import java.util.*;
public class PeakElement{
    // function to find min using binary search
    public static int findPeakElement(int[] nums) {
        // if only one element
        if(nums.length == 1){
            return 0;
        }
        // if first is peak
        if(nums[0]>nums[1]){
            return 0;
        }
        //compare second last and last
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }

        int i=1;
        int j=nums.length-2;
        // apply binary search to find peak
        while(i<=j){
            int mid = (i+j)/2;
            // check if peak exist if it is return otherwise jump else if
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            // search in other window
            if(nums[mid]>nums[mid+1])
            {
                j = mid-1;
            }

            else
            {
                i = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int n=4;
        int arr[] = {1,2,3,1};
        System.out.println(findPeakElement(arr));
    }
}