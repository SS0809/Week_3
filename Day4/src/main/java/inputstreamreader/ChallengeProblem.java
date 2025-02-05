package main.java.inputstreamreader;
//Challenge Problem: Compare StringBuilder, StringBuffer, FileReader, and InputStreamReader
//Problem:
//Write a program that:
//Uses StringBuilder and StringBuffer to concatenate a list of strings 1,000,000 times.
//Uses FileReader and InputStreamReader to read a large file (e.g., 100MB) and print the number of words in the file.
//Approach:
//StringBuilder and StringBuffer:
//Create a list of strings (e.g., "hello").
//Concatenate the strings 1,000,000 times using both StringBuilder and StringBuffer.
//Measure and compare the time taken for each.
//FileReader and InputStreamReader:
//Read a large text file (100MB) using FileReader and InputStreamReader.
//Count the number of words by splitting the text on whitespace characters.
//Print the word count and compare the time taken for reading the file.

import main.java.mystringbuffer.CompareStringBuidlerStringBuffer;

import java.io.*;

public class ChallengeProblem {
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
        try{

//            WRITE TO  FILE
            File fl = new File("large.txt");
            FileWriter my = new FileWriter(fl);
            for (int i=0;i<2400000;i++){
                my.write("this is a large file don't try to open this ok:)");
            }
            System.out.println("done");

            FileInputStream flr = new FileInputStream(fl);
            InputStreamReader isr = new InputStreamReader(flr);
            BufferedReader br = new BufferedReader(isr);
            String line ;
            int cnt = 0;
            long start = System.nanoTime();

//           READ THE FILE
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                cnt = cnt + words.length;
            }
            System.out.println(System.nanoTime() - start+" ns for word count of : "+cnt);
            fl.deleteOnExit();
            if (fl.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        }catch (IOException e) {
            System.out.println(e);
        }
    }
}
