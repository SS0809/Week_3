package com.problems.stringconcatenation;

public class StringPerformance {
    // method for perfomance test in String
    void string(String str, int size){
        long start = System.nanoTime();
        String string = "";
        for (int i = 0; i < size; i++) {
            string += str;
        }
        long end = System.nanoTime();

        System.out.println("Time taken by string: " + (end - start) / 1e6 + "ms");
    }

    // method for performance test in String buffer
    void stringBuffer(String str, int size) {
        long start = System.nanoTime();
        StringBuffer sb = new StringBuffer("");
        for (int i = 0; i < size; i++) {
            sb.append(str);
        }
        long end = System.nanoTime();

        System.out.println("Time taken by string buffer: " + (end - start) / 1e6 + "ms");
    }

    // method for performance test in String builder
    void stringBuilder(String str, int size) {
        long start = System.nanoTime();
        StringBuilder sbr = new StringBuilder("");
        for (int i = 0; i < size; i++) {
            sbr.append(str);
        }
        long end = System.nanoTime();

        System.out.println("Time taken by string builder: " + (end - start) / 1e6 + "ms");
    }
}
