package Com.aeropelican;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ATM atm = new ATM();

        while (true) {

            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            System.out.print("Enter Your Choice : ");
            int choice = sc.nextInt();

            if (choice == 4) {
                System.out.println("Thank You...");
                break;
            }

            System.out.print("Enter Account Number : ");
            int accountNumber = sc.nextInt();

            try {

                switch (choice) {

                    case 1:

                        System.out.print("Enter Deposit Amount : ");
                        double depositAmount = sc.nextDouble();

                        atm.deposit(accountNumber, depositAmount);
                        break;

                    case 2:

                        System.out.print("Enter Withdraw Amount : ");
                        double withdrawAmount = sc.nextDouble();

                        atm.withdraw(accountNumber, withdrawAmount);
                        break;

                    case 3:

                        atm.checkBalance(accountNumber);
                        break;

                    default:

                        System.out.println("Invalid Choice.");

                }

            } catch (InvalidAmountException e) {

                System.out.println(e.getMessage());

            } catch (InsufficientBalanceException e) {

                System.out.println(e.getMessage());

            }

        }

        sc.close();

    }

}