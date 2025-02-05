package main.java.myfilereader;
//FileReader Problem 2: Count the Occurrence of a Word in a File Using FileReader
//Problem:
//Write a program that uses FileReader and BufferedReader to read a file and count how many times a specific word appears in the file.
//Approach:
//Create a FileReader to read from the file and wrap it in a BufferedReader.
//Initialize a counter variable to keep track of word occurrences.
//For each line in the file, split it into words and check if the target word exists.
//Increment the counter each time the word is found.
//Print the final count.

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindOccurance {
    public boolean readFileLines(){
        try{
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int count = 0;
            while ((line = br.readLine()) != null) {
                String[] temp = line.split(" ");
                for (int i = 0; i < temp.length; i++) {
                    if ("repeat".equals(temp[i]))
                        ++count;
                }
            }
            System.out.println(count + " occurances for "+"repeat");

        }catch (IOException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        FindOccurance fo = new FindOccurance();
        fo.readFileLines();
    }
}
