package com.linkedlist.singly.socialmedia;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
    private UserNode head;

    public void insertBeginning(int userId, String name, int age) {
        UserNode newUser = new UserNode(userId, name, age);
        newUser.next = head;
        head = newUser;
    }

    public void insertSpecific(int userId, String name, int age, int position) {
        if (position == 0) {
            insertBeginning(userId, name, age);
            return;
        }

        UserNode newNode = new UserNode(userId, name, age);
        UserNode temp = head;
        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of bounds.");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void searchElement(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                System.out.println("UserNode Found: " + temp.name + ", Age: " + temp.age);
                return;
            }
            temp = temp.next;
        }
        System.out.println("UserNode not found.");
    }

    public void updateElement(int userId, String newName, int newAge, int newId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) {
                temp.name = newName;
                temp.age = newAge;
                temp.userId = newId;
                return;
            }
            temp = temp.next;
        }
        System.out.println("UserNode not found.");
    }

    public void printDetails() {
        UserNode temp = head;
        while (temp != null) {
            System.out.println("UserNode ID: " + temp.userId + ", Name: " + temp.name + ", Age: " + temp.age + ", Friends: " + temp.friendIds);
            temp = temp.next;
        }
    }

    public void addFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            user1.addFriend(userId2);
            user2.addFriend(userId1);
            System.out.println("Friend connection added.");
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void removeFriendConnection(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            user1.removeFriend(userId2);
            user2.removeFriend(userId1);
            System.out.println("Friend connection removed.");
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void findMutualFriends(int userId1, int userId2) {
        UserNode user1 = findUser(userId1);
        UserNode user2 = findUser(userId2);
        if (user1 != null && user2 != null) {
            List<Integer> mutualFriends = new ArrayList<>(user1.friendIds);
            mutualFriends.retainAll(user2.friendIds);
            System.out.println("Mutual Friends: " + mutualFriends);
        } else {
            System.out.println("One or both users not found.");
        }
    }

    public void displayFriends(int userId) {
        UserNode user = findUser(userId);
        if (user != null) {
            System.out.println("Friends of " + user.name + ": " + user.friendIds);
        } else {
            System.out.println("UserNode not found.");
        }
    }

    private UserNode findUser(int userId) {
        UserNode temp = head;
        while (temp != null) {
            if (temp.userId == userId) return temp;
            temp = temp.next;
        }
        return null;
    }
}
