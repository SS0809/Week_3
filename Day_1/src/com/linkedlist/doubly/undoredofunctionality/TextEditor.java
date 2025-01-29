package com.linkedlist.doubly.undoredofunctionality;

class TextEditor {
    private Node head;          // Pointer to the first state
    private Node tail;          // Pointer to the last state
    private Node currentState;  // Pointer to the current state
    private int historySize;    // Tracks the number of states in the history
    private final int historyLimit; // Maximum number of states to store

    // Constructor
    public TextEditor(int historyLimit) {
        this.historyLimit = historyLimit;
        this.head = null;
        this.tail = null;
        this.currentState = null;
        this.historySize = 0;
    }

    // Adds a new text state to the history.
    public void addState(String textState) {
        Node newNode = new Node(textState);

        if (head == null) { // If history is empty
            head = newNode;
            tail = newNode;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }

        currentState = newNode;
        historySize++;

        // Remove the oldest state if history exceeds the limit
        if (historySize > historyLimit) {
            head = head.next;
            head.prev = null;
            historySize--;
        }
    }

    // Reverts to the previous state.
    public void undo() {
        if (currentState != null && currentState.prev != null) {
            currentState = currentState.prev;
            System.out.println("Undo successful. Current state: " + currentState.textState);
        } else {
            System.out.println("Cannot undo. No previous state available.");
        }
    }

    // Reverts to the next state after undo.
    public void redo() {
        if (currentState != null && currentState.next != null) {
            currentState = currentState.next;
            System.out.println("Redo successful. Current state: " + currentState.textState);
        } else {
            System.out.println("Cannot redo. No next state available.");
        }
    }

    // Displays the current text state.
    public void displayCurrentState() {
        if (currentState != null) {
            System.out.println("Current state: " + currentState.textState);
        } else {
            System.out.println("No state available.");
        }
    }
}