package ATMApplication;

public class ATM {

    double balance = 5000;

    // Deposit
    public void deposit(double amount) throws InvalidAmountException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Deposit Amount");
        }

        balance = balance + amount;

        System.out.println("Amount Deposited Successfully");
        System.out.println("Current Balance = " + balance);
    }

    // Withdraw
    public void withdraw(double amount)
            throws InvalidAmountException, InsufficientBalanceException {

        if (amount <= 0) {
            throw new InvalidAmountException("Invalid Withdraw Amount");
        }

        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }

        balance = balance - amount;

        System.out.println("Please Collect Cash");
        System.out.println("Current Balance = " + balance);
    }

    // Check Balance
    public void checkBalance() {
        System.out.println("Available Balance = " + balance);
    }

}