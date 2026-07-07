package Shopping;

import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ShoppingStore store = new ShoppingStore();
        Scanner scanner = new Scanner(System.in);


        double userWallet = 1800.00;

        while (true) {

            System.out.println("         WELCOME TO THE ONLINE STORE         ");
            System.out.printf("Your current wallet balance: $%.2f\n", userWallet);
            System.out.println("\nAvailable Products:");
            System.out.printf("%-5s | %-15s | %-10s | %-6s\n", "No.", "Product Name", "Price", "Stock");


            Map<Integer, String> idMap = store.getIdMap();
            Map<String, Integer> stock = store.getStockMap();
            Map<String, Double> prices = store.getPriceMap();

            for (Integer id : idMap.keySet()) {
                String productName = idMap.get(id);
                System.out.printf("%-5d | %-15s | $%-9.2f | %-6d\n",
                        id,
                        productName,
                        prices.get(productName),
                        stock.get(productName));
            }
            System.out.println("0     | Exit Store");


            System.out.print("\nEnter product number to buy (or 0 to exit): ");
            String input = scanner.nextLine().trim();

            if (input.equals("0")) {
                System.out.println("\nThank you for shopping with us! Goodbye.");
                break;
            }

            try {
                int choiceNumber = Integer.parseInt(input);

                if (idMap.containsKey(choiceNumber)) {
                    String name = idMap.get(choiceNumber);
                    double itemPrice = prices.get(name);
                    store.purchaseProductByNumber(choiceNumber, userWallet);

                    userWallet -= itemPrice;
                } else {
                    store.purchaseProductByNumber(choiceNumber, userWallet);
                }

            } catch (NumberFormatException e) {
                System.out.println("\n[EXCEPTION] Error: Please enter a valid item number digits only.");
            } catch (ProductNotFoundException | OutOfStockException | PaymentFailedException e) {
                System.out.println("\n[EXCEPTION] " + e.getMessage());
            }

            System.out.println("\nPress Enter to return to main menu...");
            scanner.nextLine();
        }

        scanner.close();
    }
}