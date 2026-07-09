package com.aeropelican.model;

import com.aeropelican.exception.InsufficientBalanceException;
import com.aeropelican.exception.InvalidAmountException;

public class UserAccount {
    private final String accountNumber;
    private final String userName;
    private double balance;

    public UserAccount(String accountNumber, String userName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.userName = userName;
        this.balance = initialBalance;
    }

    public String getAccountNumber() { return accountNumber; }
    public String getUserName() { return userName; }
    public double getBalance() { return balance; }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Transaction failed: Amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Successfully deposited: ₹" + amount);
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Transaction failed: Amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Transaction failed: Insufficient balance. Current balance: ₹" + balance);
        }
        balance -= amount;
        System.out.println("Successfully withdrew: ₹" + amount);
    }
}