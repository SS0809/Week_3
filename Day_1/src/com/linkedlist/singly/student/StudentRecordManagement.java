
package com.linkedlist.singly.student;

public class StudentRecordManagement {
    public StudentRecordManagement() {
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertBeginning(1234568, "Saurabh", 21, "A");
        l1.insertBeginning(1234567, "Uday", 21, "A");
        l1.insertEnd(1234566, "Pankaj", 21, "A");
        l1.insertSpecific(1234565, "Shreya", 21, "A", 2);
        l1.searchElement(1234565);
        l1.deleteElement(1234565);
        l1.updateElement(1234566, "Pankaj", 221, "B", 1234566);
        l1.printDetails();
    }
}