package org.example;

public class CheckBalance extends Account {

    public void showBalance(int accNo) {

        System.out.println("Current Balance : " + accounts.get(accNo));
    }
}