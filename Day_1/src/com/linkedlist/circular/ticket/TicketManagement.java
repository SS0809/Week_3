package com.linkedlist.circular.ticket;
//9. Circular Linked List: Online Ticket Reservation System
//Problem Statement: Design an online ticket reservation system using a circular linked list, where each node represents a booked ticket. Each node will store the following information: Ticket ID, Customer Name, Movie Name, Seat Number, and Booking Time. Implement the following functionalities:
//Add a new ticket reservation at the end of the circular list.
//Remove a ticket by Ticket ID.
//Display the current tickets in the list.
//        Search for a ticket by Customer Name or Movie Name.
//Calculate the total number of booked tickets.
//
//        Hint:
//Use a circular linked list to represent the ticket reservations, with the last node’s next pointer pointing to the first node.
//When removing a ticket, update the circular pointers accordingly.
//For displaying all tickets, traverse the list starting from the first node, looping back after reaching the last node.


public class TicketManagement {
    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
//        ticketId,customerName,movieName,seatNumber,bookingTime
        l1.insertBeginning("tsxabci1","Saurabh","Muana",4532,"12:54");
        l1.insertBeginning("tsxabci2","Uday","Bahubali",4536,"09:54");
        l1.insertEnd("tsxabci3","Pankaj","Cars",4530,"06:54");
        l1.insertSpecific("tsxabci4","Nishant","ok JAnnu!",3532,"03:54",2);
        l1.searchElement("Nishant");
        l1.deleteElement("tsxabci4");
        l1.printDetails();
        System.out.println("The number of booked tickets are "+l1.size);
    }
}
