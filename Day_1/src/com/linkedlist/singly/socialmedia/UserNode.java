package com.linkedlist.singly.socialmedia;

import java.util.ArrayList;
import java.util.List;

//each node stores information about an item such as Item Name, Item ID, Quantity, and Price
public class UserNode {
    int userId;
    String name;
    int age;
    List<Integer> friendIds;
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next = null;
    }

    public void addFriend(int friendId) {
        if (!friendIds.contains(friendId)) {
            friendIds.add(friendId);
        }
    }

    public void removeFriend(int friendId) {
        friendIds.remove(Integer.valueOf(friendId));
    }
}
