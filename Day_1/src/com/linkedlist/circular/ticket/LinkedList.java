
package com.linkedlist.circular.ticket;

public class LinkedList {
    private TicketNode head = null ,tail = null;
    int size = 0;

    public LinkedList() {
    }

    void insertBeginning(String ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        // Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating.
        TicketNode s = new TicketNode( ticketId,customerName,movieName,seatNumber,bookingTime);
        if (this.head == null) {
            s.next = s;
            this.head = s;
            this.tail = s;
        } else {
            s.next = this.head;
            this.head = s;
            tail.next = s;
        }
        ++this.size;
    }

    void insertEnd(String ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        TicketNode s = new TicketNode(ticketId,customerName,movieName,seatNumber,bookingTime);

        if (tail == null) {
            insertBeginning( ticketId,customerName,movieName,seatNumber,bookingTime);
        } else {
           tail.next = s;
           s.next = head;
           tail = s;
        }
        ++this.size;
    }


    void insertSpecific(String ticketId, String customerName, String movieName, int seatNumber, String bookingTime , int position) {
        if (position > this.size) {
            System.out.println("INdex Out Of Bound");
            System.exit(0);
        }

        int temp_index = 0;
        // Each node will represent a movie and contain Movie Title, Director, Year of Release, and Rating.
        TicketNode s = new TicketNode(ticketId,customerName,movieName,seatNumber,bookingTime);

        TicketNode temp;
        if (position == 0) {
            insertBeginning( ticketId,customerName,movieName,seatNumber,bookingTime);
        }else {
            for (temp = this.head; temp_index != position - 1; ++temp_index) {
                temp = temp.next;
            }

            s.next = temp.next;
            temp.next = s;
            if(temp_index-1 == size){
                this.tail =s;
            }
        }
        ++this.size;
    }

    void deleteElement(String ticketId) {
        TicketNode temp = this.head, prev = null;
        if (this.head.ticketId.equals(ticketId)) {
            TicketNode last = this.head;
            while (last.next != this.head) {
                last = last.next;
            }
            this.head = this.head.next;
            last.next = this.head;
            System.out.println("Deleted Successfully");
            return;
        }
        do {
            prev = temp;
            temp = temp.next;

            if (temp.ticketId.equals(ticketId)) {
                prev.next = temp.next;
                System.out.println("Deleted Successfully");
                return;
            }
        } while (temp != this.head);

        System.out.println("Element not found");
    }


        void searchElement(String customerName) {
        for(TicketNode temp = this.head; temp.next != tail.next; temp = temp.next) {
            if (temp.customerName == customerName) {
                System.out.println("\nSearched ITem \nCustomer Name  " + temp.customerName);
                System.out.println("Booking TIme " + temp.bookingTime);
                System.out.println("MOvie Name " + temp.movieName);
                System.out.println("Seat NUmber" + temp.seatNumber);
                System.out.println("TIcket Id " + temp.ticketId + "\n");
                break;
            }
        }
    }
    void printDetails() {
        if (head == null) {
            return; // Nothing to print if the list is empty
        }

        TicketNode temp = head;
        do {
            System.out.println("\nCustomer Name  " + temp.customerName);
            System.out.println("Booking TIme " + temp.bookingTime);
            System.out.println("MOvie Name " + temp.movieName);
            System.out.println("Seat NUmber" + temp.seatNumber);
            System.out.println("TIcket Id " + temp.ticketId + "\n");
            temp = temp.next;
        } while (temp != head);
    }
}
