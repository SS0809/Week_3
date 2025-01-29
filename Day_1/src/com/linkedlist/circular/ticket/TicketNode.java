package com.linkedlist.circular.ticket;
// Each node in the list represents a task with Task ID, Task Name, Priority, and Due Date.
public class TicketNode {
//    Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time.
    String ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    TicketNode next;

    public TicketNode(String ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}