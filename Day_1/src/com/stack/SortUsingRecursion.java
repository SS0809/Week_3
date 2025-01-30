package com.stack;

import java.util.Stack;

//Sort a Stack Using Recursion
//Problem: Given a stack, sort its elements in ascending order using recursion.
//Hint: Pop elements recursively, sort the remaining stack, and insert the popped element back at the correct position.
public class SortUsingRecursion {
    void recursive(Stack<Integer> s,int elem){
        if (s.isEmpty() || s.peek() <= elem){
            s.push(elem);
            return ;
        }
        int temp = s.pop();
        recursive(s ,elem);
        s.push(temp);
    }
    void helper(Stack<Integer>s){
        if (s.isEmpty()){
            return ;
        }
        int elem = s.pop();
        helper(s);
        recursive(s,elem);
    }
    public static void main(String[] args) {
        SortUsingRecursion sr = new SortUsingRecursion();
        Stack<Integer> s = new Stack<>();
        s.push(7);
        s.push(5);
        s.push(4);
        s.push(6);
        sr.helper(s);
        while (!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
