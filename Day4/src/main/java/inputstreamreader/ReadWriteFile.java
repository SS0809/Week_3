package main.java.inputstreamreader;

import java.io.*;

//InputStreamReader Problem 2: Read User Input and Write to File Using InputStreamReader
//Problem:
//Write a program that uses InputStreamReader to read user input from the console and write the input to a file. Each input should be written as a new line in the file.
//Approach:
//Create an InputStreamReader to read from System.in (the console).
//Wrap the InputStreamReader in a BufferedReader for efficient reading.
//Create a FileWriter to write to the file.
//Read user input using readLine() and write the input to the file.
//Repeat the process until the user enters "exit" to stop inputting.
//Close the file after the input is finished.
public class ReadWriteFile {
    public boolean runner(){
        try {
            InputStreamReader ir = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ir);
            FileWriter fw = new FileWriter("testWrite.txt");
            while (true){
                String line = br.readLine();
                if(line.equals("exit"))
                    return true;
                fw.write(line+"\n");
                fw.flush();
            }
        } catch (IOException e) {
            System.out.println(e);
            return false;
        }
    }

    public static void main(String[] args) {
        ReadWriteFile rwf = new ReadWriteFile();
        rwf.runner();
    }
}
