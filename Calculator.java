package org.example;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;
        int choice =0;

        while (choice !=4) {

            // Input
            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            // Menu
            System.out.println("\nChoose an operation:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");

            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            // Perform calculation
            if (choice == 1) {
                System.out.println("Addition = " + (num1 + num2));
            }
            else if (choice == 2) {
                System.out.println("Subtraction = " + (num1 - num2));
            }
            else if (choice == 3) {
                System.out.println("Multiplication = " + (num1 * num2));
            }
            else if (choice == 4) {
                System.out.println("Division = " + (num1 / num2));
            } else {
                System.out.println("Choose valid option.");
            }



            System.out.println();
        }

        System.out.println("Thank you for using Calculator!");
    }
}
