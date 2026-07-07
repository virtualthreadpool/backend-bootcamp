package org.example;

import java.util.Scanner;

public class calculator {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            boolean valid = false;

            while (!valid){
                System.out.println("Enter first number: ");
                double num1 = scanner.nextDouble();
                System.out.println("Enteer operator (+, -, *, /: ");
                char operator = scanner.next().charAt(0);
                System.out.println("Enter second number: ");
                double num2 = scanner.nextDouble();

                switch (operator){
                    case '+'-> System.out.println(num1 + num2);
                    case '-'-> System.out.println(num1 - num2);
                    case '*'-> System.out.println(num1 * num2);
                    case '/'-> System.out.println(num1 / num2);
                    default->  System.out.println("Invalid operator! Enter Again");

                }
            }


        }
    }



