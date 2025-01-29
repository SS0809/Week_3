package com.linkedlist.singly.socialmedia;
//7. Singly Linked List: Social Media Friend Connections
//Problem Statement: Create a system to manage social media friend connections using a singly linked list.
// Each node represents a user with User ID, Name, Age, and List of Friend IDs. Implement the following operations:
//Add a friend connection between two users.
//Remove a friend connection.
//Find mutual friends between two users.
//Display all friends of a specific user.
//        Search for a user by Name or User ID.
//Count the number of friends for each user.
//Hint:
//Use a singly linked list where each node contains a list of friends (which can be another linked list or array of Friend IDs).
//For mutual friends, traverse both lists and compare the Friend IDs.
//The List of Friend IDs for each user can be implemented as a nested linked list or array.


public class SocialMediaExec {
    public static void main(String[] args) {
        LinkedList socialMedia = new LinkedList();

        // Add Users
        socialMedia.insertBeginning(101, "Saurabh", 25);
        socialMedia.insertBeginning(102, "Nishant", 22);
        socialMedia.insertSpecific(104, "Shreya", 21, 0);
        socialMedia.insertSpecific(105, "Uday", 23, 1);

        // Search for a user
        socialMedia.searchElement(104);

        // Update user details
        socialMedia.updateElement(103, "Shreya", 30, 103);

        // Friend connections
        socialMedia.addFriendConnection(101, 102);
        socialMedia.addFriendConnection(101, 104);
        socialMedia.addFriendConnection(102, 104);
        socialMedia.addFriendConnection(102, 105);

        // Display friends of a specific user
        socialMedia.displayFriends(101);
        socialMedia.displayFriends(102);

        // Find mutual friends
        socialMedia.findMutualFriends(101, 102);

        // Remove a friend connection
        socialMedia.removeFriendConnection(101, 104);
        socialMedia.displayFriends(101);

        // Print all user details
        socialMedia.printDetails();
    }
}
