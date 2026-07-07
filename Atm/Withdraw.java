package org.example;

public class Withdraw extends Account {

    public void withdraw(int accNo, double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Amount");
        }

        if (amount > accounts.get(accNo)) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        accounts.put(accNo, accounts.get(accNo) - amount);

        System.out.println("Withdrawal Successful");
    }
}
