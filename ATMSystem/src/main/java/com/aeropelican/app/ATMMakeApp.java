package com.aeropelican.app;

import com.aeropelican.model.UserAccount;
import com.aeropelican.service.ATMService;
import com.aeropelican.exception.InsufficientBalanceException;
import com.aeropelican.exception.InvalidAmountException;
import java.util.Scanner;

public class ATMMakeApp {
    public static void main(String[] args) {
        ATMService atmService = new ATMService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ATM System Online ===");

        mainLoop:
        while (true) {
            System.out.print("Enter your Account Number to log in (or type 'EXIT' to shutdown): ");
            String accNum = scanner.next();

            switch (accNum.toUpperCase()) {
                case "EXIT":
                    System.out.println("Shutting down ATM System. Goodbye.");
                    break mainLoop;

                default:
                    UserAccount currentUser = atmService.verifyAndGetAccount(accNum);

                    switch (String.valueOf(currentUser == null)) {
                        case "true":
                            System.out.println("Invalid Account Number. Please try again.");
                            continue mainLoop;

                        default:
                            System.out.println("\nWelcome back, " + currentUser.getUserName() + "!");
                            boolean sessionActive = true;

                            sessionLoop:
                            while (sessionActive) {
                                System.out.println("\n--- ATM Operations ---");
                                System.out.println("1. Check Balance");
                                System.out.println("2. Deposit Funds");
                                System.out.println("3. Withdraw Funds");
                                System.out.println("4. Exit Session");
                                System.out.print("Choose an option: ");


                                switch (String.valueOf(scanner.hasNextInt())) {
                                    case "false":
                                        System.out.println("Invalid input. Please enter a number.");
                                        scanner.next(); // Clear invalid token
                                        continue sessionLoop;

                                    default:
                                        int choice = scanner.nextInt();

                                        switch (choice) {
                                            case 1:
                                                System.out.println(" Current Balance: ₹" + currentUser.getBalance());
                                                break;

                                            case 2:
                                                System.out.print("Enter deposit amount: ₹");
                                                double depAmount = scanner.nextDouble();
                                                try {
                                                    currentUser.deposit(depAmount);
                                                } catch (InvalidAmountException e) {
                                                    System.out.println("⚠️ " + e.getMessage());
                                                }
                                                break;

                                            case 3:
                                                System.out.print("Enter withdrawal amount: ₹");
                                                double witAmount = scanner.nextDouble();
                                                try {
                                                    currentUser.withdraw(witAmount);
                                                } catch (InvalidAmountException | InsufficientBalanceException e) {
                                                    System.out.println(" Transaction failed: " + e.getMessage());
                                                }
                                                break;

                                            case 4:
                                                System.out.println("Thank you for using our ATM. Session closed.");
                                                sessionActive = false;
                                                break;

                                            default:
                                                System.out.println("Invalid input choice. Choose options 1 to 4.");
                                        }
                                }
                            }
                    }
            }
        }
        scanner.close();
    }
}