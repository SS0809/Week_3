package com.linkedlist.doubly.undoredofunctionality;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor(5); // History limit set to 5

        // Simulate user actions
        editor.addState("Hello");
        editor.addState("Hello, world!");
        editor.addState("Hello, world! How are you?");
        editor.addState("Hello, world! How are you doing today?");
        editor.addState("Hello, world! How are you doing today? I'm fine.");

        // Display current state
        editor.displayCurrentState();

        // Undo
        editor.undo();
        editor.undo();

        // Redo
        editor.redo();

        // Add a new state
        editor.addState("Hello, world! How are you doing today? Let's code!");

        // Display current state
        editor.displayCurrentState();

        // Attempt to redo (no next state available)
        editor.redo();
    }
}