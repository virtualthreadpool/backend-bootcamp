package com.areopelican;

public class Atm{
    private double Balance=5000;
    public void deposit(double amount)throws InvalidAmountException
    {
        if(amount<=0)
        {
            throw new InvalidAmountException("Invalid deposit amount");
        }
        Balance+=amount;
        System.out.println("Amount deposit successfully");
        System.out.println("current Balance:"+Balance);
    }
    public void withdraw(double amount) throws InvalidAmountException, InsufficinetBalanceException
    {
        if(amount <= 0)
        {
            throw new InvalidAmountException("Invalid Withdraw Amount");
        }

        if(amount > Balance)
        {
            throw new InsufficinetBalanceException("Insufficient Balance");
        }

        Balance -= amount;

        System.out.println("Please collect your cash");
        System.out.println("Remaining Balance: " + Balance);
    }
    public void checkBalance(){
        System.out.println("avaliable Balance:"+Balance);

    }

}