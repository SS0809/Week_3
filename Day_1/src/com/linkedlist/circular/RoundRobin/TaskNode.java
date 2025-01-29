package com.linkedlist.circular.RoundRobin;
// Each node will represent a process and contain Process ID, Burst Time, and Priority.
public class TaskNode {
    int processId;
    int burstTime;
    int priority;
    TaskNode next;

    public TaskNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}