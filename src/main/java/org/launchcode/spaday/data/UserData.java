package org.launchcode.spaday.data;

import org.launchcode.spaday.models.User;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {

//    private static final Map<Integer, User> users = new HashMap<>();
//
//    //add
//    public static void add(User user) {
//        users.put(user.getId(), user);  //Parameters are the id of the User, and the user object
//    }
//
//    // getAll
//    public static Collection<User> getAll() {
//        return users.values();
//    }
//
//    // getById
//    public static User getById(Integer id) {
//        return users.get(id);
//    }

    private static ArrayList<User> myUsers = new ArrayList<>();

    //Add user
    public static void addUser(User user) {
        myUsers.add(user);
    }

    //Get all
    public static ArrayList<User> getAllUsers() {
        return myUsers;
    }

    //Get user by ID
    public static User getUserById(int id) {
        for (User user : myUsers) {
            if (user.getId() == id) return user;
        }
        return null;
    }
}
