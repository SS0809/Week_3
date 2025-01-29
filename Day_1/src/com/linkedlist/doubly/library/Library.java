package com.linkedlist.doubly.library;

public class Library {
    private BookNode head = null, tail = null;
    private int size = 0;

    public void insertBeginning(String bookTitle, String author, String genre, int bookID, boolean availabilityStatus) {
        BookNode newBook = new BookNode(bookTitle, author, genre, bookID, availabilityStatus);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.previous = newBook;
            head = newBook;
        }
        size++;
    }

    public void insertEnd(String bookTitle, String author, String genre, int bookID, boolean availabilityStatus) {
        BookNode newBook = new BookNode(bookTitle, author, genre, bookID, availabilityStatus);
        if (head == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.previous = tail;
            tail = newBook;
        }
        size++;
    }

    public void insertSpecific(String bookTitle, String author, String genre, int bookID, boolean availabilityStatus, int position) {
        if (position > size) {
            System.out.println("Index out of bound");
            return;
        }
        BookNode newBook = new BookNode(bookTitle, author, genre, bookID, availabilityStatus);
        if (position == 0) {
            insertBeginning(bookTitle, author, genre, bookID, availabilityStatus);
        } else {
            BookNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.previous = newBook;
            }
            temp.next = newBook;
            newBook.previous = temp;
            size++;
        }
    }

    public void removeBook(int bookID) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.previous = null;
                } else if (temp == tail) {
                    tail = tail.previous;
                    tail.next = null;
                } else {
                    temp.previous.next = temp.next;
                    temp.next.previous = temp.previous;
                }
                System.out.println("Book removed successfully");
                size--;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void searchBook(String keyword) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookTitle.equalsIgnoreCase(keyword) || temp.author.equalsIgnoreCase(keyword)) {
                System.out.println("Book Found: " + temp.bookTitle + " by " + temp.author);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void updateAvailability(int bookID, boolean status) {
        BookNode temp = head;
        while (temp != null) {
            if (temp.bookID == bookID) {
                temp.availabilityStatus = status;
                System.out.println("Availability updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book not found");
    }

    public void displayForward() {
        BookNode temp = head;
        while (temp != null) {
            System.out.println(temp.bookTitle + " by " + temp.author + " | Genre: " + temp.genre + " | ID: " + temp.bookID + " | Available: " + temp.availabilityStatus);
            temp = temp.next;
        }
    }

    public void displayReverse() {
        BookNode temp = tail;
        while (temp != null) {
            System.out.println(temp.bookTitle + " by " + temp.author + " | Genre: " + temp.genre + " | ID: " + temp.bookID + " | Available: " + temp.availabilityStatus);
            temp = temp.previous;
        }
    }

    public int countBooks() {
        return size;
    }
}