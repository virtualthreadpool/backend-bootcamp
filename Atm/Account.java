package org.example;

import java.util.HashMap;

public class Account {

    protected static HashMap<Integer, Double> accounts = new HashMap<>();

    static {
        accounts.put(101, 10000.0);
        accounts.put(102, 5000.0);
        accounts.put(103, 8000.0);
    }
}
