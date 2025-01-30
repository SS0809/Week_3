package com.stack;
//Implement a Queue Using Stacks
//        Problem: Design a queue using two stacks such that enqueue and dequeue operations are performed efficiently.6
//        Hint: Use one stack for enqueue and another stack for dequeue. Transfer elements between stacks as needed.
import java.util.Stack;
//TWO STACKS BEHAVES LIKE QUEUE WHEN USED TOGETHER (LINKED UPSIDE DOWN)
public class QueuewithStack {
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    int size = 0 ;
    void enqueue(int added){
        while (!s1.isEmpty()){// s1 should be full
            s2.push(s1.pop());
        }
        s1.push(added);
        ++size;
        while (!s2.isEmpty()){// s2 should be full
            s1.push(s2.pop());
        }
    }
    int dequeue(){
        if (size==0 && s1.isEmpty()) {
            System.out.println("Empty");
        }
        --size;
        return s1.pop();
    }
    public static void main(String[] args) {
        QueuewithStack q = new QueuewithStack();
        q.enqueue(12);
        q.enqueue(2);
        q.enqueue(52);
        q.dequeue();
        while (!q.s1.isEmpty()){
            System.out.println(q.dequeue());
        }
    }
}
