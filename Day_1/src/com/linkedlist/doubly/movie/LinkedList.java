package com.linkedlist.doubly.movie;

public class LinkedList {
    private MovieNode head = null, tail = null;
    int size = 0;

    public void insertBeginning(String title, String director, int yearOfRelease, double rating) {
        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.previous = newMovie;
            head = newMovie;
        }
        size++;
    }

    public void insertEnd(String title, String director, int yearOfRelease, double rating) {
        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.previous = tail;
            tail = newMovie;
        }
        size++;
    }

    public void insertSpecific(String title, String director, int yearOfRelease, double rating, int position) {
        if (position > size) {
            System.out.println("Index out of bound");
            return;
        }
        MovieNode newMovie = new MovieNode(title, director, yearOfRelease, rating);
        if (position == 0) {
            insertBeginning(title, director, yearOfRelease, rating);
        } else {
            MovieNode temp = head;
            for (int i = 0; i < position - 1; i++) {
                temp = temp.next;
            }
            newMovie.next = temp.next;
            if (temp.next != null) {
                temp.next.previous = newMovie;
            }
            temp.next = newMovie;
            newMovie.previous = temp;
            size++;
        }
    }

    public void deleteElement(String title) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(title)) {
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
                System.out.println("Movie removed successfully");
                size--;
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    public void searchElement(double rating) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.rating == rating) {
                System.out.println("Movie Found: " + temp.title + " directed by " + temp.director);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    public void updateElement(String title, String director, int yearOfRelease, double rating, String titleToUpdate) {
        MovieNode temp = head;
        while (temp != null) {
            if (temp.title.equals(titleToUpdate)) {
                temp.title = title;
                temp.director = director;
                temp.yearOfRelease = yearOfRelease;
                temp.rating = rating;
                System.out.println("Movie updated successfully");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Movie not found");
    }

    public void printDetails() {
        MovieNode temp = head;
        while (temp != null) {
            System.out.println("Title: " + temp.title + ", Director: " + temp.director + ", Year: " + temp.yearOfRelease + ", Rating: " + temp.rating);
            temp = temp.next;
        }
    }
}
