package main.java.mystringbuilder;

import java.util.HashSet;

//StringBuilder Problem 2: Remove Duplicates from a String Using StringBuilder
//Problem:
//Write a program that uses StringBuilder to remove all duplicate characters from a given string while maintaining the original order.
//Approach:
//Initialize an empty StringBuilder and a HashSet to keep track of characters.
//Iterate over each character in the string:
//If the character is not in the HashSet, append it to the StringBuilder and add it to the HashSet.
//Return the StringBuilder as a string without duplicates.
public class RemoveDuplicates {
    public StringBuilder sb ;
    public RemoveDuplicates(StringBuilder sb){
        StringBuilder nsb = new StringBuilder();
        HashSet<Character> hs = new HashSet<>();
        for (int i =0;i<sb.length();i++){
            if (!hs.contains(sb.charAt(i))) {
                hs.add(sb.charAt(i));
                nsb.append(sb.charAt(i));
            }
        }
        this.sb = new StringBuilder(nsb);
    }
    public static void main(String[] args) {
        RemoveDuplicates rd = new RemoveDuplicates( new StringBuilder("sauraabh"));
        System.out.println(rd.sb);
    }
}
