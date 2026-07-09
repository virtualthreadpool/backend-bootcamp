package com.aeropelican;

import java.util.HashMap;

public class UserData {

    public static HashMap<Integer, User> getUsers() {

        HashMap<Integer, User> users = new HashMap<>();

        users.put(1001, new User(1001, "Shiva", 5000));
        users.put(1002, new User(1002, "Rahul", 7000));
        users.put(1003, new User(1003, "Ravi", 6000));
        users.put(1004, new User(1004, "Akhil", 8000));
        users.put(1005, new User(1005, "Kiran", 9000));
        users.put(1006, new User(1006, "Priya", 6500));
        users.put(1007, new User(1007, "Sneha", 5500));
        users.put(1008, new User(1008, "Ram", 10000));
        users.put(1009, new User(1009, "Anjali", 12000));
        users.put(1010, new User(1010, "Suresh", 4000));

        return users;
    }
}
