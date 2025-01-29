
package com.linkedlist.singly.student;

public class LinkedList {
    private StudentNode head;
    int size = 0;

    public LinkedList() {
    }

    void insertBeginning(int rollNumber, String name, int age, String grade) {
        StudentNode s = new StudentNode(rollNumber, name, age, grade);
        s.next = null;
        if (this.head == null) {
            this.head = s;
        } else {
            s.next = this.head;
            this.head = s;
        }

        ++this.size;
    }

    void insertEnd(int rollNumber, String name, int age, String grade) {
        StudentNode s = new StudentNode(rollNumber, name, age, grade);

        StudentNode temp;
        for(temp = this.head; temp.next != null; temp = temp.next) {
        }

        temp.next = s;
        ++this.size;
    }

    void insertSpecific(int rollNumber, String name, int age, String grade, int position) {
        if (position > this.size) {
            System.out.println("INdex Out Of Bound");
            System.exit(0);
        }

        int temp_index = 0;
        StudentNode s = new StudentNode(rollNumber, name, age, grade);

        StudentNode temp;
        for(temp = this.head; temp_index != position - 1; ++temp_index) {
            temp = temp.next;
        }

        s.next = temp.next;
        temp.next = s;
        ++this.size;
    }

    void deleteElement(int rollNUmber) {
        for(StudentNode temp = this.head; temp.next != null; temp = temp.next) {
            if (temp.next.rollNumber == rollNUmber) {
                temp.next = temp.next.next;
                break;
            }
        }

    }

    void searchElement(int rollNUmber) {
        for(StudentNode temp = this.head; temp.next != null; temp = temp.next) {
            if (temp.rollNumber == rollNUmber) {
                System.out.println("\nSearched ITem \nStudent RollNumber " + temp.rollNumber);
                System.out.println("Student NAme " + temp.name);
                System.out.println("Student Age " + temp.age);
                System.out.println("Student Grade " + temp.grade + "\n");
                break;
            }
        }

    }

    void updateElement(int rollNumber, String name, int age, String grade, int update_rollNumber) {
        for(StudentNode temp = this.head; temp.next != null; temp = temp.next) {
            if (temp.next.rollNumber == update_rollNumber) {
                temp.next.rollNumber = update_rollNumber;
                temp.next.name = name;
                temp.next.age = age;
                temp.next.grade = grade;
            }
        }

    }

    void printDetails() {
        for(StudentNode temp = this.head; temp != null; temp = temp.next) {
            System.out.println("Student RollNumber " + temp.rollNumber);
            System.out.println("Student Name " + temp.name);
            System.out.println("Student Age " + temp.age);
            System.out.println("Student Grade " + temp.grade + "\n");
        }

    }
}
