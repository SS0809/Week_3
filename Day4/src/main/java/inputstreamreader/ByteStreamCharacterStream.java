package main.java.inputstreamreader;
//InputStreamReader Problem 1: Convert Byte Stream to Character Stream Using InputStreamReader
//Problem:
//Write a program that uses InputStreamReader to read binary data from a file and print it as characters.
// The file contains data encoded in a specific charset (e.g., UTF-8).
//Approach:
//Create a FileInputStream object to read the binary data from the file.
//Wrap the FileInputStream in an InputStreamReader to convert the byte stream into a character stream.
//Use a BufferedReader to read characters efficiently from the InputStreamReader.
//Read the file line by line and print the characters to the console.
//Handle any encoding exceptions as needed.

import java.io.*;

public class ByteStreamCharacterStream {
    public boolean runner(){
        try{
            FileInputStream flr = new FileInputStream(new File("test.txt"));
            InputStreamReader isr = new InputStreamReader(flr);
            BufferedReader br = new BufferedReader(isr);
            String line ;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println(e);
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        ByteStreamCharacterStream bs = new ByteStreamCharacterStream();
        bs.runner();
    }
}
