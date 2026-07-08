import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        List<Cart> cart = new ArrayList<>();

        // Sample Products
        products.add(new Product(101, "Mobile", 25000, 5));
        products.add(new Product(102, "Laptop", 60000, 2));
        products.add(new Product(103, "Headphones", 2000, 10));
        products.add(new Product(104, "Smart Watch", 5000, 0));

        ShoppingService service = new ShoppingService(products, cart);

        while (true) {

            System.out.println("\n====================================");
            System.out.println("      ONLINE SHOPPING SYSTEM");
            System.out.println("====================================");
            System.out.println("1. View Products");
            System.out.println("2. Buy Product");
            System.out.println("3. View Cart");
            System.out.println("4. Apply Coupon");
            System.out.println("5. Make Payment");
            System.out.println("6. Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            try {

                switch (choice) {

                    case 1:
                        service.viewProducts();
                        break;

                    case 2:
                        System.out.print("Enter Product ID: ");
                        int id = sc.nextInt();

                        System.out.print("Enter Quantity: ");
                        int quantity = sc.nextInt();

                        service.buyProduct(id, quantity);
                        break;

                    case 3:
                        service.viewCart();
                        break;

                    case 4:
                        sc.nextLine(); // Consume newline

                        System.out.print("Enter Coupon Code: ");
                        String coupon = sc.nextLine();

                        service.applyCoupon(coupon);
                        break;

                    case 5:
                        System.out.print("Payment Successful? (true/false): ");
                        boolean payment = sc.nextBoolean();

                        service.makePayment(payment);
                        break;

                    case 6:
                        System.out.println("Thank You For Shopping With Us!");
                        sc.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid Choice! Please try again.");
                }

            } catch (ProductNotFoundException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (OutOfStockException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (InvalidCouponException e) {
                System.out.println("Error: " + e.getMessage());

            } catch (PaymentFailedException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}