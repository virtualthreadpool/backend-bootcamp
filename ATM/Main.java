package ATM;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ATM atm=new ATM();

        while(true){
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.println("Enter Your Choice: ");

            int choice=sc.nextInt();
            try{
                switch (choice){
                    case 1: System.out.println("Enter Your Deposit: ");
                            atm.deposit(sc.nextDouble());
                            break;
                    case 2: System.out.println("Enter Withdraw Amount: ");
                            atm.withdraw(sc.nextDouble());
                            break;
                    case 3: atm.checkBalance();
                            break;
                    case 4: System.out.println("Thank You!");
                            System.exit(0);
                    default: System.out.println("Invalid Choice!");
                }
            }catch (InvaidAmountException | InsufficientBalanceException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
