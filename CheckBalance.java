package BA;

import java.util.Scanner;

public class CheckBalance extends UserDetails{

    public CheckBalance(String userName, Integer accNo, Integer mobileNum, double balance) {
        super(userName, accNo, mobileNum, balance);
    }
    Scanner scn = new Scanner(System.in);
    public void checkBalance() throws Exception {
        try {
            System.out.println("please enter your account number: ");
            int anum = scn.nextInt();
            if (getBalance()>0) {
                System.out.println("Available balance in your account:" +getBalance());
            }
        }
        catch(Exception e){
            System.out.println("Zero balance:"+e.getMessage());
        }

    }
}
