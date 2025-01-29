package com.linkedlist.doubly.library;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();
        library.insertBeginning("The Great Gatsby", "F. Scott Fitzgerald", "Fiction", 101, true);
        library.insertEnd("1984", "George Orwell", "Dystopian", 102, true);
        library.insertSpecific("To Kill a Mockingbird", "Harper Lee", "Classic", 103, true, 1);
        
        library.displayForward();
        System.out.println("\nReverse Order:");
        library.displayReverse();
        
        library.searchBook("1984");
        library.updateAvailability(102, false);
        
        System.out.println("\nTotal Books: " + library.countBooks());
        library.removeBook(103);
        
        System.out.println("\nAfter Deletion:");
        library.displayForward();
    }
}
