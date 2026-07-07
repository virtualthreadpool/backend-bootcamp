package BA;

public class UserDetails {
    private String userName;
    private Integer accNo;
    private Integer mobileNum;
    private double balance;
    public UserDetails(String userName, Integer accNo, Integer mobileNum, double balance) {
        this.userName = userName;
        this.accNo = accNo;
        this.mobileNum = mobileNum;
        this.balance = balance;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAccNo() {
        return accNo;
    }

    public void setAccNo(Integer accNo) {
        this.accNo = accNo;
    }

    public Integer getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(Integer mobileNum) {
        this.mobileNum = mobileNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
