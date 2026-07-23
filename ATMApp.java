import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class ATM {

    private double balance;

    public ATM(double openingBalance) {
        balance = openingBalance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance = balance + amount;
        System.out.println("Deposited Rs. " + amount + " successfully.");
    }

    public void withdraw(double amount) throws InvalidAmountException, InsufficientBalanceException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Available balance is Rs. " + balance);
        }
        balance = balance - amount;
        System.out.println("Withdrawal of Rs. " + amount + " successful.");
    }

    public void checkBalance() {
        System.out.println("Current balance: Rs. " + balance);
    }
}

public class ATMApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ATM myAtm = new ATM(5000);

        int choice = 0;

        while (choice != 4) {

            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmt = sc.nextDouble();
                    try {
                        myAtm.withdraw(withdrawAmt);
                    } catch (InvalidAmountException | InsufficientBalanceException e) {
                        System.out.println("Transaction failed: " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmt = sc.nextDouble();
                    try {
                        myAtm.deposit(depositAmt);
                    } catch (InvalidAmountException e) {
                        System.out.println("Transaction failed: " + e.getMessage());
                    }
                    break;

                case 3:
                    myAtm.checkBalance();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }
}
