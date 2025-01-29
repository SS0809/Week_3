package com.linkedlist.doubly.library;

public class BookNode {
    String bookTitle;
    String author;
    String genre;
    int bookID;
    boolean availabilityStatus;
    BookNode previous;
    BookNode next;

    public BookNode(String bookTitle, String author, String genre, int bookID, boolean availabilityStatus) {
        this.bookTitle = bookTitle;
        this.author = author;
        this.genre = genre;
        this.bookID = bookID;
        this.availabilityStatus = availabilityStatus;
        this.previous = null;
        this.next = null;
    }
}