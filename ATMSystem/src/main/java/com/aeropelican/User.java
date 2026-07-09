package com.aeropelican;

public class User {

    private int accountNo;
    private String userName;
    private double balance;

    public User(int accountNo, String userName, double balance) {
        this.accountNo = accountNo;
        this.userName = userName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public String getUserName() {
        return userName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
