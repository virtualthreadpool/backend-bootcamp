package ATM;

public class ATM {
    double balance = 0;

    public void deposit(double amount) throws InvaidAmountException{
        if(amount<=0){
            throw new InvaidAmountException("Invalid Deposit Amount!");
        }
        balance += amount;
        System.out.println("Amount Deposited: "+amount);
    }
    public void withdraw(double amount) throws InvaidAmountException, InsufficientBalanceException{
        if(amount<=0){
            throw new InvaidAmountException("Invalid Withdraw Amount");
        }
        if(amount>balance){
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Amount Withdrawn: "+amount);
    }
    public void checkBalance(){
        System.out.println("Available Balance: "+balance);
    }
}
