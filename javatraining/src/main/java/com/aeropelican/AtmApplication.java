package com.aeropelican;

import java.util.HashMap;
import java.util.Scanner;

public class AtmApplication {
    public static void main(String[] args) {

        HashMap<Integer, CustomerDetails> customers = new HashMap<>();

        customers.put(101, new CustomerDetails(101, "Raghu", 5000));
        customers.put(101, new CustomerDetails(101, "Raghu", 5000));
        customers.put(102, new CustomerDetails(102, "Sairam", 7000));
        customers.put(103, new CustomerDetails(103, "Krishna", 9000));
        customers.put(104, new CustomerDetails(104, "Architha", 12000));
        customers.put(105, new CustomerDetails(105, "Shruthi", 15000));

        Scanner Scanner = new Scanner(System.in);
        Operations operations = new Operations();

        System.out.print("Enter Account Number: ");
        int accNo = Scanner.nextInt();

        CustomerDetails customer = customers.get(accNo);

        System.out.println("Welcome " + customer.getName());;


        while (true) {

            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");

            System.out.print("Enter Choice: ");
            int choice = Scanner.nextInt();

            try {

                switch (choice) {

                    case 1:
                        System.out.print("Enter Deposit Amount: ");
                        double deposit = Scanner.nextDouble();
                        operations.deposit(customer, deposit);
                        break;


                    case 2:
                        System.out.print("Enter Withdrawal Amount: ");
                        double withdraw = Scanner.nextDouble();
                        operations.withdraw(customer, withdraw);
                        break;

                    case 3:
                        operations.checkBalance(customer);



                    default:

                            System.out.println("Invalid Choice.");
                }

            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    }
