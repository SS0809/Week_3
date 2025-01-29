package com.linkedlist.doubly.movie;

public class MovieNode {
    String title;
    String director;
    int yearOfRelease;
    double rating;
    MovieNode previous;
    MovieNode next;

    public MovieNode(String title, String director, int yearOfRelease, double rating) {
        this.title = title;
        this.director = director;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.previous = null;
        this.next = null;
    }
}