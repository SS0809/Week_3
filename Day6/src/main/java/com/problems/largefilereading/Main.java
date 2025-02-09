package com.problems.largefilereading;

public class Main {
    public static void main(String[] args) {
        // method to path and files
        String filePath="Image.png";
        ReadingFile readingFile=new ReadingFile();

        readingFile.readingByFilReader(filePath);
        readingFile.readingByInputStreamReader(filePath);
    }
}
