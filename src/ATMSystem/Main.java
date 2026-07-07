package ATMSystem;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, User> users = UserData.getUsers();
        ATM atm = new ATM(users);

        System.out.println("--- ATM SYSTEM ---");

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
                if (choice == 1) {
                    System.out.print("Enter Amount: ");
                    atm.deposit(accountNo, sc.nextDouble());
                } else if (choice == 2) {
                    System.out.print("Enter Amount: ");
                    atm.withdraw(accountNo, sc.nextDouble());
                } else if (choice == 3) {
                    atm.checkBalance(accountNo);
                } else if (choice == 4) {
                    System.out.println("Thank You.");
                    break;
                } else {
                    System.out.println("Invalid Choice.");
                }
            } catch (InvalidAmountException | InsufficientBalanceException e) {
                System.out.println(e.getMessage());
            }
        }

        sc.close();
    }
}
