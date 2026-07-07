package Shopping;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingService shop = new ShoppingService();
        double walletAmount = 10000;
        String choice = "yes";

        System.out.println("Wallet Amount: ₹" + walletAmount);

        while (choice.equalsIgnoreCase("yes")) {
            shop.displayProducts();

            System.out.print("\nEnter Product ID to buy: ");
            int id = sc.nextInt();

            try {
                Product p = shop.getProductById(id);

                System.out.println("\nSelected Product");
                System.out.println("Name  : " + p.getName());
                System.out.println("Price : ₹" + p.getPrice());
                System.out.println("Stock : " + p.getStock());

                shop.buyProduct(id, walletAmount);
                walletAmount -= p.getPrice();

                System.out.println("Remaining Wallet Balance : ₹" + walletAmount);

            } catch (ProductNotFoundException | OutOfStockException | PaymentFailedException e) {
                System.out.println(e.getMessage());
            }

            if (walletAmount <= 0) {
                System.out.println("\nWallet balance finished.");
                break;
            }

            System.out.print("\nDo you want to buy again? (yes/no): ");
            choice = sc.next();
        }

        System.out.println("\nThanks visit again.");
        sc.close();
    }
}