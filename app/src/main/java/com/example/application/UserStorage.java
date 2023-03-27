package com.example.application;

import java.util.ArrayList;

public class UserStorage {

    private ArrayList<User> users = new ArrayList<>();
    private static UserStorage userStorage = null;

    // Singleton
    public static UserStorage getInstance() {
        if (userStorage == null) {
            userStorage = new UserStorage();
        }
        return userStorage;
    }

    // For adding users
    public void addUser(User user) {
        users.add(user);
    }

    // For listing users
    public ArrayList<User> getUsers() {
        return users;
    }
}

