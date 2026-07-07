import java.util.*;
public class BankMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Account Holder Name: ");
        String name=sc.nextLine();

        System.out.println("Enter Account Number: ");
        int ano=sc.nextInt();

        System.out.println("Enter Initial Balance: ");
        double balance=sc.nextDouble();

        Account acc=new Account(name,ano,balance);

        while(true){
            System.out.println(" Bank Menu ");
            System.out.println("1. Bank Info");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Display Accounts");
            System.out.println("6. Exit");
            System.out.println(" Enter your Choice: ");

            int choice=sc.nextInt();
            switch (choice){
                case 1: acc.bankInfo();
                        break;
                case 2: System.out.println("Enter your Deposit Amount: ");
                        acc.deposit(sc.nextDouble());
                        break;
                case 3: System.out.println("Enter your Withdraw Amount: ");
                        acc.withdraw(sc.nextDouble());
                        break;
                case 4: System.out.println("Current Balance: " + acc.getBalance());
                        break;
                case 5: acc.display("Account Details");
                        break;
                case 6: System.out.println("Thank You!");
                        sc.close();
                        return;
                default: System.out.println(" Invalid Choice!");
            }
        }
    }
}

//Abstract class
abstract class Bank{
    abstract void bankInfo();
}

//Interface
interface Transaction{
    void deposit(double amount);
    void withdraw(double amount);
}

//Inheritance + Interface
class Account extends Bank implements Transaction{
    private String name;
    private int ano;
    private double balance;

    final String Bank_NAME="SBI Bank";

    // Constructor
    Account(String name, int ano, double balance){
        this.name = name;
        this.ano = ano;
        this.balance=balance;
    }

    //Method Overloading
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Account No: " + ano);
        System.out.println("Balance: " + balance);
    }
    void display(String msg){
        System.out.println(msg);
        display();
    }

    //Method Overriding
    @Override void bankInfo(){
        System.out.println("Welcome to "+Bank_NAME);
    }
    @Override public void deposit(double amount){
        balance +=amount;
        System.out.println("Amount Deposited Successfully");
    }
    @Override public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Amount Withdraw Successfully.");
        }else{
            System.out.println("Insufficient Balance");
        }
    }
    double getBalance(){
        return balance;
    }
}