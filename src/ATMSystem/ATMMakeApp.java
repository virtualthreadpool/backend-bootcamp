package ATMSystem;
import java.util.Scanner;

public class ATMMakeApp {
    public static void main(String[] args) {
        ATMService atmService = new ATMService();
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== ATM System Online ===");


        while (true) {
            System.out.println("\n----------------------------------");
            System.out.print("Enter your Account Number to log in (or type 'EXIT' to shutdown): ");
            String accNum = scanner.next();

            if (accNum.equalsIgnoreCase("EXIT")) {
                System.out.println("Shutting down ATM System. Goodbye.");
                break;
            }

            UserAccount currentUser = atmService.verifyAndGetAccount(accNum);

            if (currentUser == null) {
                System.out.println("Invalid Account Number. Please try again.");
                continue;
            }

            System.out.println("\nWelcome back, " + currentUser.getUserName() + "!");
            boolean sessionActive = true;


            while (sessionActive) {
                System.out.println("\n--- ATM Operations ---");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Funds");
                System.out.println("3. Withdraw Funds");
                System.out.println("4. Exit Session");
                System.out.print("Choose an option: ");

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
                            System.out.println("invalid" + e.getMessage());
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
        scanner.close();
    }
}