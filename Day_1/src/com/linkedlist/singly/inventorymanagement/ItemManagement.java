//4. Singly Linked List: Inventory Management System
//Problem Statement: Design an inventory management system using a singly linked list where each node stores information about an item such as Item Name, Item ID, Quantity, and Price. Implement the following functionalities:
//Add an item at the beginning, end, or at a specific position.
//Remove an item based on Item ID.
//Update the quantity of an item by Item ID.
//        Search for an item based on Item ID or Item Name.
//Calculate and display the total value of inventory (Sum of Price * Quantity for each item).
//Sort the inventory based on Item Name or Price in ascending or descending order.
//Hint:
//Use a singly linked list where each node represents an item in the inventory.
//Implement sorting using an appropriate algorithm (e.g., merge sort) on the linked list.
//For total value calculation, traverse through the list and sum up Quantity * Price for each item.

package com.linkedlist.singly.inventorymanagement;

public class ItemManagement {

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        l1.insertBeginning(101, "Gun", 25, 75.5);
        l1.insertBeginning(102, "BOmb", 22, 65.3);
        l1.insertEnd(103, "Car", 28, 80.0);
        l1.insertSpecific(104, "Shreya", 21, 55.4, 2);
        l1.searchElement(104);
        l1.deleteElement(104);
        l1.updateElement(103, "Bob", 30, 82.5, 103);
        l1.printDetails();

    }
}