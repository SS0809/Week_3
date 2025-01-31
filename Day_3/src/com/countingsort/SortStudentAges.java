package com.countingsort;

import java.util.Arrays;

public class SortStudentAges {
    // method to implement
    public void countSort(int[] ages) {
        int[] freq = new int[19]; // frequency array

        for(int age: ages) {
            freq[age]++;
        }

        int index = 0;
        for(int i = 10; i< freq.length; i++) {
            while(freq[i] > 0) {
                ages[index++] = i;
                freq[i]--;
            }
        }
    }

    public static void main(String[] args) {
        // method calling
        int ages[] = {12, 11, 10, 16, 18, 15, 14};
        SortStudentAges cs = new SortStudentAges();
        cs.countSort(ages);
        System.out.println(Arrays.toString(ages));
    }
}
