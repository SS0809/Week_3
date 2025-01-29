package com.linkedlist.singly.inventorymanagement;
//each node stores information about an item such as Item Name, Item ID, Quantity, and Price
public class ItemNode {
    int itemId;
    String itemName;
    int quantity;
    double price;
    ItemNode next;

    public ItemNode(int itemId, String itemName, int quantity, double price) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
