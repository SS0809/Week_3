package com.linkedlist.doubly.undoredofunctionality;

class Node {
    String textState; // Stores the text content at this state
    Node prev;        // Pointer to the previous state
    Node next;        // Pointer to the next state

    // Constructor
    public Node(String textState) {
        this.textState = textState;
        this.prev = null;
        this.next = null;
    }
}