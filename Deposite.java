package BA;

public class Deposite extends UserDetails{
    public Deposite(String userName, Integer accNo, Integer mobileNum, double balance) {
        super(userName, accNo, mobileNum, balance);
    }
    public void deposite() throws Exception {
        try {
            if (getBalance()<0) {
                System.out.println(" Credited amount to your account");
            }
        }
        catch(Exception e){
            System.out.println("Enter correct Amount :"+e.getMessage());
        }
        System.out.println("Deposited successfully..");

    }
}


