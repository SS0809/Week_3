
package com.linkedlist.circular.RoundRobin;


//6. Circular Linked List: Round Robin Scheduling Algorithm
//Problem Statement: Implement a round-robin CPU scheduling algorithm using a circular linked list.
// Each node will represent a process and contain Process ID, Burst Time, and Priority. Implement the following functionalities:
//Add a new process at the end of the circular list.
//Remove a process by Process ID after its execution.
//Simulate the scheduling of processes in a round-robin manner with a fixed time quantum.
//Display the list of processes in the circular queue after each round.
//Calculate and display the average waiting time and turn-around time for all processes.
//Hint:
//Use a circular linked list to represent a queue of processes.
//Each process executes for a fixed time quantum, and then control moves to the next process in the circular list.
//Maintain the current node as the process being executed, and after each round, update the list to simulate execution.

public class RoundRobinScheduling {
    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();

        // Add processes
        cll.addProcess(1, 10, 2);
        cll.addProcess(2, 5, 1);
        cll.addProcess(3, 8, 3);

        // Display processes
        cll.displayProcesses();

        // Simulate Round Robin Scheduling with time quantum = 3
        cll.simulateRoundRobin(3);

        // Remove a process
        cll.removeProcess(2);

        // Display processes after removal
        cll.displayProcesses();
    }
}