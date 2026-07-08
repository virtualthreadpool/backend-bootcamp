package OnlineShopping;
import java.util.Scanner;
public class OnlineShopping {
    static void buyProduct(String product,int stock,String coupon,boolean payment) throws ProductNotFoundException,OutOfStockException,InvalidCouponException,PaymentFailedException{
        if(!product.equalsIgnoreCase("Laptop")){
            throw new ProductNotFoundException("Product Not Found");
        }
        if(stock<=0){
            throw new OutOfStockException("Product Out Of Stock");
        }
        if(!coupon.equals("SAVE10")){
            throw new InvalidCouponException("Invalid Coupon");
        }
        if(!payment){
            throw new PaymentFailedException("Payment Failed");
        }
        System.out.println("Order Placed Successfully!");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Product Name: ");
        String product=sc.nextLine();

        System.out.println("Enter Stock: ");
        int stock=sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Coupon Code: ");
        String coupon=sc.nextLine();

        System.out.println("Payment Successful? (true/false): ");
        boolean payment=sc.nextBoolean();

        try{
            buyProduct(product,stock,coupon,payment);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}
