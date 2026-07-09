package com.aeropelican;

import java.util.HashMap;

import com.aeropelican.exception.InsufficientBalanceException;
import com.aeropelican.exception.InvalidAmountException;

public class ATM {

    private final HashMap<Integer, User> users;

    public ATM(HashMap<Integer, User> users) {
        this.users = users;
    }

    public void deposit(int accountNo, double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount should be greater than zero.");
        }

        User user = users.get(accountNo);

        user.setBalance(user.getBalance() + amount);

        System.out.println("Deposit Successful.");
        System.out.println("Current Balance: " + user.getBalance());
    }

    public void withdraw(int accountNo, double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Amount should be greater than zero.");
        }

        User user = users.get(accountNo);

        if (amount > user.getBalance()) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }

        user.setBalance(user.getBalance() - amount);

        System.out.println("Withdraw Successful.");
        System.out.println("Current Balance: " + user.getBalance());
    }

    public void checkBalance(int accountNo) {

        User user = users.get(accountNo);

        System.out.println("\n========== ACCOUNT DETAILS ==========");
        System.out.println("Account Number : " + user.getAccountNo());
        System.out.println("User Name      : " + user.getUserName());
        System.out.println("Balance        : " + user.getBalance());
    }
}