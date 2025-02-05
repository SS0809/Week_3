package main.java.linearsearch;
//Linear Search Problem 1: Search for the First Negative Number
//Problem:
//You are given an integer array. Write a program that performs Linear Search to find the first negative number in the array.
// If a negative number is found, return its index. If no negative number is found, return -1.
//Approach:
//Iterate through the array from the start.
//        Check if the current element is negative.
//If a negative number is found, return its index.
//If the loop completes without finding a negative number, return -1.

public class FirstNegativeNumber {
    static int[] arr;
    public FirstNegativeNumber(){
        this.arr = new int[]{1, 8, -9, 6, 8, 3, 2, 4, 5, 71};
    }
    public int findNegative(){
        for (int i=0;i<this.arr.length;i++){
            if(this.arr[i]<0){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstNegativeNumber fn = new FirstNegativeNumber();
        int neg = 0;
        if((neg = fn.findNegative())==-1){
            System.out.println("NO Negative found");
        }else {
            System.out.println("Negative number's index is : "+ neg);
        }
    }
}
