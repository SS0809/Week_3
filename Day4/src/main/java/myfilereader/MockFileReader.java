package main.java.myfilereader;
//FileReader Problem 1: Read a File Line by Line Using FileReader
//Problem:
//Write a program that uses FileReader to read a text file line by line and print each line to the console.
//        Approach:
//Create a FileReader object to read from the file.
//Wrap the FileReader in a BufferedReader to read lines efficiently.
//Use a loop to read each line using the readLine() method and print it to the console.
//Close the file after reading all the lines.

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MockFileReader {
    public boolean readFileLines(){
        try{
            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);
            String line;
            int count = 1;
            while ((line = br.readLine()) != null){
                System.out.println((count++)+" "+line);
            }
        }catch (IOException e){
            System.out.println(e);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        MockFileReader mr = new MockFileReader();
        mr.readFileLines();
    }
}
