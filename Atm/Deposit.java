package org.example;

public class Deposit extends Account {

    public void deposit(int accNo, double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        }

        accounts.put(accNo, accounts.get(accNo) + amount);

        System.out.println("Deposit Successful");
    }
}
