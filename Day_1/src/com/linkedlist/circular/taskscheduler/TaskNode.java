package com.linkedlist.circular.taskscheduler;
// Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date.
public class TaskNode {
    String taskId;
    String taskName;
    String dueDate;
    int priority;
    TaskNode next;

    public TaskNode(String taskId, String taskName, String dueDate, int priority) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.dueDate = dueDate;
        this.priority = priority;
        this.next = null;
    }
}