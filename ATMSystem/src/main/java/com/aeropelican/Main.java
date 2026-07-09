package com.aeropelican;

import java.util.HashMap;
import java.util.Scanner;

import com.aeropelican.exception.InsufficientBalanceException;
import com.aeropelican.exception.InvalidAmountException;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<Integer, User> users = UserData.getUsers();
        ATM atm = new ATM(users);

        System.out.println("===== ATM SYSTEM =====");

        System.out.print("Enter Account Number: ");
        int accountNo = sc.nextInt();

        if (!users.containsKey(accountNo)) {
            System.out.println("Account Not Found.");
            sc.close();
            return;
        }

        while (true) {

            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter Amount: ");
                        double depositAmount = sc.nextDouble();
                        atm.deposit(accountNo, depositAmount);
                        break;

                    case 2:
                        System.out.print("Enter Amount: ");
                        double withdrawAmount = sc.nextDouble();
                        atm.withdraw(accountNo, withdrawAmount);
                        break;

                    case 3:
                        atm.checkBalance(accountNo);
                        break;

                    case 4:
                        System.out.println("Thank You for using ATM System.");
                        sc.close();
                        return;

                    default:
                        System.out.println("Invalid Choice. Please try again.");
                }

            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}