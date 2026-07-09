package com.aeropelican.service;

import com.aeropelican.model.UserAccount;
import java.util.HashMap;
import java.util.Map;

public class ATMService {
    private final Map<String, UserAccount> accountDatabase = new HashMap<>();

    public ATMService() {
        initializeMockUsers();
    }

    private void initializeMockUsers() {
        accountDatabase.put("21671221", new UserAccount("21671221", "Varun Reddy", 5000.0));
        accountDatabase.put("21671222", new UserAccount("21671222", "Shiva ", 12000.50));
        accountDatabase.put("21671223", new UserAccount("21671223", "Tharun", 2500.0));
        accountDatabase.put("21671224", new UserAccount("21671224", "Snehith Reddy", 45000.0));
        accountDatabase.put("21671225", new UserAccount("21671225", "Vishal", 800.0));
        accountDatabase.put("21671226", new UserAccount("21671226", "Naren Rao", 15000.0));
        accountDatabase.put("21671227", new UserAccount("21671227", "Sathwik", 6200.0));
        accountDatabase.put("21671228", new UserAccount("21671228", "Akshay", 9500.75));
        accountDatabase.put("21671229", new UserAccount("21671229", "Sagar", 3100.0));
        accountDatabase.put("21671230", new UserAccount("21671230", "Ganesh", 7800.0));
    }

    public UserAccount verifyAndGetAccount(String accountNumber) {
        return accountDatabase.get(accountNumber);
    }
}