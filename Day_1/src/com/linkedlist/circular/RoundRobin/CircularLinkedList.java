package com.linkedlist.circular.RoundRobin;
public class CircularLinkedList {
    private Process head;
    private Process tail;
    private int size;

    public CircularLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Add a new process at the end of the circular list
    public void addProcess(int processId, int burstTime, int priority) {
        Process newProcess = new Process(processId, burstTime, priority);
        if (head == null) {
            head = newProcess;
            tail = newProcess;
            tail.next = head; // Circular link
        } else {
            tail.next = newProcess;
            tail = newProcess;
            tail.next = head; // Circular link
        }
        size++;
    }

    // Remove a process by Process ID
    public void removeProcess(int processId) {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Process current = head;
        Process previous = null;

        do {
            if (current.processId == processId) {
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = previous;
                    tail.next = head;
                } else {
                    previous.next = current.next;
                }
                size--;
                System.out.println("Process " + processId + " removed.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Process " + processId + " not found.");
    }

    // Simulate Round Robin Scheduling
    public void simulateRoundRobin(int timeQuantum) {
        if (head == null) {
            System.out.println("No processes to schedule.");
            return;
        }

        int[] waitingTime = new int[size];
        int[] turnAroundTime = new int[size];
        int[] remainingTime = new int[size];
        Process current = head;
        int index = 0;

        // Initialize remaining time for all processes
        do {
            remainingTime[index] = current.burstTime;
            current = current.next;
            index++;
        } while (current != head);

        int time = 0;
        boolean allProcessesCompleted = false;

        while (!allProcessesCompleted) {
            allProcessesCompleted = true;
            current = head;
            index = 0;

            do {
                if (remainingTime[index] > 0) {
                    allProcessesCompleted = false;

                    if (remainingTime[index] > timeQuantum) {
                        time += timeQuantum;
                        remainingTime[index] -= timeQuantum;
                    } else {
                        time += remainingTime[index];
                        waitingTime[index] = time - current.burstTime;
                        remainingTime[index] = 0;
                        turnAroundTime[index] = time;
                    }
                }
                current = current.next;
                index++;
            } while (current != head);

            displayProcesses();
        }

        calculateAndDisplayAvgTimes(waitingTime, turnAroundTime);
    }

    // Display the list of processes in the circular queue
    public void displayProcesses() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Process current = head;
        System.out.println("Processes in the circular queue:");
        do {
            System.out.println("Process ID: " + current.processId + ", Burst Time: " + current.burstTime + ", Priority: " + current.priority);
            current = current.next;
        } while (current != head);
    }

    // Calculate and display average waiting time and turn-around time
    private void calculateAndDisplayAvgTimes(int[] waitingTime, int[] turnAroundTime) {
        int totalWaitingTime = 0;
        int totalTurnAroundTime = 0;

        for (int i = 0; i < size; i++) {
            totalWaitingTime += waitingTime[i];
            totalTurnAroundTime += turnAroundTime[i];
        }

        double avgWaitingTime = (double) totalWaitingTime / size;
        double avgTurnAroundTime = (double) totalTurnAroundTime / size;

        System.out.println("Average Waiting Time: " + avgWaitingTime);
        System.out.println("Average Turn-Around Time: " + avgTurnAroundTime);
    }
}
