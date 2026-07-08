package com.aeropelican;

public class Operations {
    public void deposit(CustomerDetails customer, double amount)
            throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }

        customer.setBalance(customer.getBalance() + amount);

        System.out.println("Deposit Successful.");
        System.out.println("Updated Balance: " + customer.getBalance());
    }

    public void withdraw(CustomerDetails customer, double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Withdrawal Amount.");
        }

        if (amount > customer.getBalance()) {
            throw new InsufficientBalanceException("Insufficient Balance.");
        }

        customer.setBalance(customer.getBalance() - amount);

        System.out.println("Withdrawal Successful.");
        System.out.println("Remaining Balance: " + customer.getBalance());
    }

    public void checkBalance(CustomerDetails customer) {
        System.out.println("Current Balance: " + customer.getBalance());
    }

}
