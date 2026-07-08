package com.areopelican;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Atm atm = new Atm();
        while (true) {
            System.out.println("\n========ATM MENU======");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");
            System.out.println("Enter your Choice");
            int choice = sc.nextInt();
            try {
                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter Deposit Amount:");
                        double amount = sc.nextDouble();
                        atm.deposit(amount);
                    }
                    case 2 -> {
                        System.out.println("Enter Withdraw Amount:");
                        double amount = sc.nextDouble();
                        atm.withdraw(amount);
                    }
                    case 3 -> {
                        atm.checkBalance();
                    }
                    case 4 -> {
                        System.out.println("Thank you visit again");
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Invalid Choice");
                    }
                }
            } catch (InvalidAmountException e) {
                System.out.println(e.getMessage());
            }
            catch (InsufficinetBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
