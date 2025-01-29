
package com.linkedlist.singly.inventorymanagement;

public class LinkedList {
    private ItemNode head;
    int size = 0;

    public LinkedList() {
    }

    void insertBeginning(int itemId, String itemName, int quantity, double price) {
        ItemNode s = new ItemNode(itemId, itemName, quantity, price);
        s.next = null;
        if (this.head == null) {
            this.head = s;
        } else {
            s.next = this.head;
            this.head = s;
        }

        ++this.size;
    }

    void insertEnd(int itemId, String itemName, int quantity, double price) {
        ItemNode newNode = new ItemNode(itemId, itemName, quantity, price);
        if (this.head == null) {
            this.head = newNode;
        } else {
            ItemNode temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        this.size++;
    }

    void insertSpecific(int itemId, String itemName, int quantity, double price , int position) {
        if (position > this.size) {
            System.out.println("INdex Out Of Bound");
            System.exit(0);
        }

        int temp_index = 0;
        ItemNode s = new ItemNode( itemId,  itemName,  quantity,  price);

        ItemNode temp;
        for(temp = this.head; temp_index != position - 1; ++temp_index) {
            temp = temp.next;
        }

        s.next = temp.next;
        temp.next = s;
        ++this.size;
    }

    void deleteElement(int itemId) {
        for(ItemNode temp = this.head; temp.next != null; temp = temp.next) {
            if (temp.next.itemId == itemId) {
                temp.next = temp.next.next;
                break;
            }
        }

    }

    void searchElement(int itemId) {
        for(ItemNode temp = this.head; temp.next != null; temp = temp.next) {
            if (temp.itemId == itemId) {
                System.out.println("\nSearched ITem \nItem id " + temp.itemId);
                System.out.println("Item NAme " + temp.itemName);
                System.out.println("Quantity " + temp.quantity);
                System.out.println("Item price " + temp.price + "\n");
                break;
            }
        }

    }

    void updateElement(int itemId, String itemName, int quantity, double price , int update_itemId) {
        for(ItemNode temp = this.head; temp.next != null; temp = temp.next) {
            if (temp.next.itemId == update_itemId) {
                temp.next.itemId = itemId;
                temp.next.itemName = itemName;
                temp.next.quantity = quantity;
                temp.next.price = price;
            }
        }

    }

    void printDetails() {
        for(ItemNode temp = this.head; temp != null; temp = temp.next) {
            System.out.println("\nSearched ITem \nItem id " + temp.itemId);
            System.out.println("Item NAme " + temp.itemName);
            System.out.println("Quantity " + temp.quantity);
            System.out.println("Item price" + temp.price + "\n");
        }

    }
}
