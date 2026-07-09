package com.aeropelican;

import java.util.Scanner;

public class simplecalculator {
    public static void main(String[]args){
        Scanner Scanner = new Scanner(System.in);
        int choice;



        while (true) {
            System.out.print("Enter first number: ");
            double num1 = Scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = Scanner.nextDouble();

            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print(" Enter your choice: ");

            choice = Scanner.nextInt();

            switch (choice) {
                case 1 ->
                        System.out.println("Result =" + (num1 + num2));

                case 2 ->
                        System.out.println("Result =" + (num1 - num2));

                case 3 ->
                        System.out.println("Result =" + (num1 * num2));

                case 4 ->
                        System.out.println("Result =" + (num1 / num2));

                default ->
                        System.out.println("Invalid choice! please try again.");



            }


        }



    }
}

