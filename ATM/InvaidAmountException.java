package ATM;

public class InvaidAmountException extends Exception{
    public InvaidAmountException(String msg){
        super(msg);
    }
}
