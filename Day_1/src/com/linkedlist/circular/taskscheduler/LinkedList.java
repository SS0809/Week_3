
package com.linkedlist.circular.taskscheduler;

public class LinkedList {
    private TaskNode head = null ,tail = null;
    int size = 0;

    public LinkedList() {
    }

    void insertBeginning(String taskId, String taskName, String dueDate, int priority) {
        // Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating.
        TaskNode s = new TaskNode( taskId, taskName, dueDate, priority);
        if (this.head == null) {
            s.next = s;
            this.head = s;
            this.tail = s;
        } else {
            s.next = this.head;
            this.head = s;
            tail.next = s;
        }
        ++this.size;
    }

    void insertEnd(String taskId, String taskName, String dueDate, int priority) {
        TaskNode s = new TaskNode(taskId, taskName, dueDate, priority);

        if (tail == null) {
            insertBeginning( taskId,  taskName,  dueDate, priority);
        } else {
           tail.next = s;
           s.next = head;
           tail = s;
        }
        ++this.size;
    }


    void insertSpecific(String taskId, String taskName, String dueDate, int priority , int position) {
        if (position > this.size) {
            System.out.println("INdex Out Of Bound");
            System.exit(0);
        }

        int temp_index = 0;
        // Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating.
        TaskNode s = new TaskNode(taskId, taskName, dueDate, priority);

        TaskNode temp;
        if (position == 0) {
            insertBeginning( taskId,  taskName,  dueDate, priority);
        }else {
            for (temp = this.head; temp_index != position - 1; ++temp_index) {
                temp = temp.next;
            }

            s.next = temp.next;
            temp.next = s;
            if(temp_index-1 == size){
                this.tail =s;
            }
        }
        ++this.size;
    }

    void deleteElement(String taskId) {
        TaskNode temp = this.head, prev = null;
        if (this.head.taskId.equals(taskId)) {
            TaskNode last = this.head;
            while (last.next != this.head) {
                last = last.next;
            }
            this.head = this.head.next;
            last.next = this.head;
            System.out.println("Deleted Successfully");
            return;
        }
        do {
            prev = temp;
            temp = temp.next;

            if (temp.taskId.equals(taskId)) {
                prev.next = temp.next;
                System.out.println("Deleted Successfully");
                return;
            }
        } while (temp != this.head);

        System.out.println("Element not found");
    }


        void searchElement(int priority) {
        for(TaskNode temp = this.head; temp.next != tail.next; temp = temp.next) {
            if (temp.priority == priority) {
                System.out.println("\nSearched ITem \nTaskk id  " + temp.taskId);
                System.out.println("TASk NAme " + temp.taskName);
                System.out.println("Due date " + temp.dueDate);
                System.out.println("PRiority " + temp.priority + "\n");
                break;
            }
        }
    }
    void printDetails() {
        if (head == null) {
            return; // Nothing to print if the list is empty
        }

        TaskNode temp = head;
        do {
            System.out.println("Movie Title " + temp.taskId);
            System.out.println("Movie Director " + temp.taskName);
            System.out.println("Movie release date " + temp.dueDate);
            System.out.println("Movie Grade " + temp.priority + "\n");
            temp = temp.next;
        } while (temp != head);
    }
}
