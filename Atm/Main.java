package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean running = true;

        Deposit deposit = new Deposit();
        Withdraw withdraw = new Withdraw();
        CheckBalance checkBalance = new CheckBalance();

        int accNo;

        while (running) {

            System.out.print("Enter Account Number: ");
            accNo = sc.nextInt();

            if (!Account.accounts.containsKey(accNo)) {
                System.out.println("Invalid Account Number");
                continue;
            }

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1 -> {
                        System.out.print("Enter Deposit Amount: ");
                        double amount = sc.nextDouble();
                        deposit.deposit(accNo, amount);
                        checkBalance.showBalance(accNo);
                    }

                    case 2 -> {
                        System.out.print("Enter Withdrawal Amount: ");
                        double amount = sc.nextDouble();
                        withdraw.withdraw(accNo, amount);
                        checkBalance.showBalance(accNo);
                    }

                    case 3 -> {
                        checkBalance.showBalance(accNo);
                    }

                    case 4 -> {
                        System.out.println("Thank You");
                        running = false;
                    }

                    default -> {
                        System.out.println("Invalid Choice");
                    }
                }

            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}