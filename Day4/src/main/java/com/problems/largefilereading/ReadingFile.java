package com.problems.largefilereading;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFile {
    // method to read file by file reader
    public void readingByFilReader(String filePath){
        long startTime,endTime;
        startTime=System.nanoTime();
        try(FileReader fileReader=new FileReader(filePath);){
            int ch;
            while((ch= fileReader.read())!=-1);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        endTime=System.nanoTime();
        System.out.println("Time taken by InputStreamRreader : " + (endTime-startTime) / 1e6 + " ms");
    }

    // method to read file by input stream reader
    public void readingByInputStreamReader(String filePath){
        long startTime,endTime;
        startTime=System.nanoTime();
        try(FileInputStream fileInputStream=new FileInputStream(filePath);
            InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream)){
            int ch;
            while ((ch=inputStreamReader.read())!=-1);
        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        endTime=System.nanoTime();
        System.out.println("Time taken by FileReader : " + (endTime-startTime) / 1e6  + " ms");
    }
}
