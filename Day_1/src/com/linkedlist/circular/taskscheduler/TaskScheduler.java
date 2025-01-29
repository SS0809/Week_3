
package com.linkedlist.circular.taskscheduler;


//3. Circular Linked List: Task Scheduler
//Problem Statement: Create a task scheduler using a circular linked list.
// Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date. Implement the following functionalities:
//Add a task at the beginning, end, or at a specific position in the circular list.
//Remove a task by Task ID.
//View the current task and move to the next task in the circular list.
//Display all tasks in the list starting from the head node.
//        Search for a task by Priority.
//Hint:
//Use a circular linked list where the last node’s next pointer points back to the first node, creating a circular structure.
//Ensure that the list loops when traversed from the head node, so tasks can be revisited in a circular manner.
//When deleting or adding tasks, maintain the circular nature by updating the appropriate next pointers.
public class TaskScheduler {
    public TaskScheduler() {
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertBeginning("tsxabci1","task2","2024",4);
        l1.insertBeginning("tsxabti2","task1","2025",5);
        l1.insertEnd("tsxabti3","task3","2025",2);
        l1.insertSpecific("tsxabti4","task","2025",2,3);
        l1.searchElement(4);
        l1.deleteElement("tsxabti4");
        l1.printDetails();
    }
}