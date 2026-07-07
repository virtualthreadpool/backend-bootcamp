package BA;

public class Withdraw extends UserDetails {


    public Withdraw(String userName, Integer accNo, Integer mobileNum, double balance) {
        super(userName, accNo, mobileNum, balance);
    }

    public void withdraw() {

        try {
            if (getBalance()>0) {
                System.out.println("Debited amount from your account");
            }
        }
            catch(Exception e){
                System.out.println("Insufficient Amount:"+e.getMessage());
            }
        System.out.println("Amount withdrawn successfully...");
        }
    }
