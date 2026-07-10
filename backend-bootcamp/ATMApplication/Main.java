package ATMApplication;

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

            System.out.print("Enter Choice : ");
            int choice = sc.nextInt();

            try {

                switch (choice) {

                case 1:
                    System.out.print("Enter Deposit Amount : ");
                    double deposit = sc.nextDouble();
                    atm.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount : ");
                    double withdraw = sc.nextDouble();
                    atm.withdraw(withdraw);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice");

                }

            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }

        }

    }

}
