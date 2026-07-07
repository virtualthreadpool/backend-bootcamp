package BA;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankApplicationMain {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("Please enter amount: ");
        int amount = scn.nextInt();
        Map<Integer, UserDetails> users = new HashMap<>();
        users.put(1, new UserDetails("Radha", 643768274, 964584357, 5000));
        users.put(2, new UserDetails("Keerthi", 768274467, 346878293, 6000));
        users.put(3, new UserDetails("John", 43767653, 365287578, 7000));
        users.put(4, new UserDetails("Deepak", 465836795, 653476584, 8000));
        users.put(5, new UserDetails("Sudha", 32657463, 968454673, 9000));
        users.put(6, new UserDetails("Rakesh", 64387654, 964578357, 6000));
        users.put(7, new UserDetails("Vivek", 46358675, 966789537, 4000));
        users.put(8, new UserDetails("Sriyan", 786734594, 966478561, 4000));
        users.put(9, new UserDetails("Ravi", 468375465, 965745678, 3000));
        users.put(10, new UserDetails("Rekha", 673454679, 934115678, 5000));
        System.out.println("Please enter number 1 for withdrawl: ");
        System.out.println("Please enter number 2 for deposite: ");
        System.out.println("Please enter number 3 for checking balance: ");
        int num = scn.nextInt();
        UserDetails user = users.get(num);
        switch (num) {
            case 1 -> {
                Withdraw wth = new Withdraw(user.getUserName(), user.getAccNo(), user.getMobileNum(), user.getBalance());
                wth.withdraw();
                System.out.println(amount);
            }
            case 2 -> {
                Deposite dep = new Deposite(user.getUserName(), user.getAccNo(), user.getMobileNum(), user.getBalance());
                dep.deposite();
                System.out.println(amount);
            }
            case 3 -> {
                CheckBalance chkbal = new CheckBalance(user.getUserName(), user.getAccNo(), user.getMobileNum(), user.getBalance());
                chkbal.checkBalance();
            }

            default -> System.out.println("Invalid selection");
        }
        System.out.println(".............END............");

//To print all account details
        /*for (Map.Entry<Integer, UserDetails> entry : users.entrySet()) {
            UserDetails usr = entry.getValue();
            System.out.println("User Name: " + usr.getUserName());
            System.out.println("Account Number: " + usr.getAccNo());
            System.out.println("Mobile Number: " + usr.getMobileNum());

        }*/
    }
}
