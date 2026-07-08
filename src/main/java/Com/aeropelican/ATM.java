package Com.aeropelican;

import java.util.HashMap;

public class ATM {

    HashMap<Integer, Account> accountDetails = new HashMap<>();

    ATM() {

        accountDetails.put(1001, new Account("Mastan Shareef", 10000.0));
        accountDetails.put(1002, new Account("Jaheda", 8000.0));
        accountDetails.put(1003, new Account("Teju", 15000.0));
        accountDetails.put(1004, new Account("Kamal", 30000.0));
        accountDetails.put(1005, new Account("Sai Jagadesh", 25000.0));
        accountDetails.put(1006, new Account("Rafi", 12000.0));
        accountDetails.put(1007, new Account("yogita", 5000.0));
        accountDetails.put(1008, new Account("Aman", 300.0));
        accountDetails.put(1009, new Account("Ruturaj", 4500.0));
        accountDetails.put(1010, new Account("Hemanth", 18000.0));

    }

    // Deposit
    void deposit(int accountNumber, double depositAmount)
            throws InvalidAmountException {

        if (depositAmount <= 0) {
            throw new InvalidAmountException("Invalid Amount.");
        }

        if (accountDetails.containsKey(accountNumber)) {

            Account account = accountDetails.get(accountNumber);

            account.balance += depositAmount;

            System.out.println("Account Holder : " + account.name);
            System.out.println("Amount Deposited Successfully.");
            System.out.println("Updated Balance : " + account.balance);

        } else {

            System.out.println("Account Number Not Found.");

        }

    }

    // Withdraw
    void withdraw(int accountNumber, double withdrawAmount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (withdrawAmount <= 0) {
            throw new InvalidAmountException("Invalid Amount.");
        }

        if (accountDetails.containsKey(accountNumber)) {

            Account account = accountDetails.get(accountNumber);

            if (withdrawAmount > account.balance) {
                throw new InsufficientBalanceException("Insufficient Balance.");
            }

            account.balance -= withdrawAmount;

            System.out.println("Account Holder : " + account.name);
            System.out.println("Amount Withdrawn Successfully.");
            System.out.println("Remaining Balance : " + account.balance);

        } else {

            System.out.println("Account Number Not Found.");

        }

    }

    // Check Balance
    void checkBalance(int accountNumber) {

        if (accountDetails.containsKey(accountNumber)) {

            Account account = accountDetails.get(accountNumber);

            System.out.println("Account Holder : " + account.name);
            System.out.println("Current Balance : " + account.balance);

        } else {

            System.out.println("Account Number Not Found.");

        }

    }

}