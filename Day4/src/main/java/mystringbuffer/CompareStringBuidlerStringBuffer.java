package main.java.mystringbuffer;
//StringBuffer Problem 2: Compare StringBuffer with StringBuilder for String Concatenation
//Problem:
//Write a program that compares the performance of StringBuffer and StringBuilder for concatenating strings. For large datasets (e.g., concatenating 1 million strings), compare the execution time of both classes.
//Approach:
//Initialize two StringBuffer and StringBuilder objects.
//Perform string concatenation in both objects, appending 1 million strings (e.g., "hello").
//Measure the time taken to complete the concatenation using System.nanoTime()
// for both StringBuffer and StringBuilder.
//Output the time taken by both classes for comparison.

public class CompareStringBuidlerStringBuffer {
    StringBuilder sb = new StringBuilder();
    StringBuffer sbu = new StringBuffer();
    StringBuilder concatenateStringBuilder(){
        //Iterate through each string in the array and append it to the StringBuffer.
        for (int i=0;i<1000000;i++){
            this.sb.append("testy");
        }
        //Return the concatenated string after the loop finishes.
        return this.sb;
    }
    StringBuffer concatenateStringBuffer(){
        //Iterate through each string in the array and append it to the StringBuffer.
        for (int i=0;i<1000000;i++){
            this.sbu.append("testy");
        }
        //Return the concatenated string after the loop finishes.
        return this.sbu;
    }
    public void compareStringStreams(){
        long startSB = System.nanoTime();
        this.concatenateStringBuffer();
        long endSB = System. nanoTime() - startSB;
        System.out.print("\nTime taken by String Buffer :"+ endSB+" ns");
        long startSBB = System.nanoTime();
        this.concatenateStringBuilder();
        long endSBB = System. nanoTime() - startSBB;
        System.out.print("\nTime taken by String Builder :"+ endSBB+" ns");
        System.out.println((endSBB<endSB)?"\nString Buidler is fast":"String Buffer is fast");
    }

    public static void main(String[] args) {
        CompareStringBuidlerStringBuffer csb = new CompareStringBuidlerStringBuffer();
        csb.compareStringStreams();
    }
}
