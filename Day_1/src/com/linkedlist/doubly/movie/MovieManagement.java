package com.linkedlist.doubly.movie;

public class MovieManagement {
    public static void main(String[] args) {
        LinkedList movies = new LinkedList();
        movies.insertBeginning("Inception", "Christopher Nolan", 2010, 8.8);
        movies.insertEnd("Interstellar", "Christopher Nolan", 2014, 8.6);
        movies.insertSpecific("The Dark Knight", "Christopher Nolan", 2008, 9.0, 1);

        movies.printDetails();

        movies.searchElement(8.8);
        movies.updateElement("The Prestige", "Christopher Nolan", 2006, 8.5, "The Dark Knight");

        movies.deleteElement("Interstellar");

        System.out.println("\nAfter Update and Deletion:");
        movies.printDetails();
    }
}
