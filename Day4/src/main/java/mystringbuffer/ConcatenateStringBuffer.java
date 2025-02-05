package main.java.mystringbuffer;
//StringBuffer Problem 1: Concatenate Strings Efficiently Using StringBuffer
//Problem:
//You are given an array of strings.
// Write a program that uses StringBuffer to concatenate all the strings in the array efficiently.
//        Approach:



//Using StringBuffer ensures efficient string concatenation due to its mutable nature.

public class ConcatenateStringBuffer {
    public StringBuffer sb = new StringBuffer();
    public StringBuffer sbArr[] ;
    public ConcatenateStringBuffer(StringBuffer sbArr[]){
        this.sbArr = sbArr;
    }
    public StringBuffer concatenateString(){
        //Iterate through each string in the array and append it to the StringBuffer.
        for (int i=0;i<sbArr.length;i++){
         this.sb.append(sbArr[i]);
        }
        //Return the concatenated string after the loop finishes.
        return this.sb;
    }

    public static void main(String[] args) {
        //Create a new StringBuffer object.
        StringBuffer sb[] = {new StringBuffer("sa"),new StringBuffer("ura"),new StringBuffer("bh")};
        ConcatenateStringBuffer csb = new ConcatenateStringBuffer(sb);
        System.out.println(csb.concatenateString());
    }
}
