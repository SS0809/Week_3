package main.java.mystringbuilder;
//StringBuilder Problem 1: Reverse a String Using StringBuilder
//Problem:
//Write a program that uses StringBuilder to reverse a given string. For example, if the input is "hello", the output should be "olleh".
//Approach:
//Create a new StringBuilder object.
//Append the string to the StringBuilder.
//Use the reverse() method of StringBuilder to reverse the string.
//Convert the StringBuilder back to a string and return it.
public class Reversestringbuilder {
    public static StringBuilder sb = new StringBuilder("reverse me like i do :)");
    public StringBuilder runString(){
//        sb.append("reverse me");
        sb.reverse();
        return sb;
    }
    public static void main(String[] args) {
        Reversestringbuilder rsb = new Reversestringbuilder();
        System.out.println(rsb.runString());
    }
}
