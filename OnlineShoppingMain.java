package OnlineShopping;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class OnlineShoppingMain {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Map<Integer, Product> products = new HashMap<>();
        products.put(1, new Product(101, "Laptop", "Electronics", 55000));
        products.put(2, new Product(102, "Mobile", "Electronics", 25000));
        products.put(3, new Product(103, "Shoes", "Fashion", 3000));
        products.put(4, new Product(104, "Watch", "Accessories", 5000));
        products.put(5, new Product(105, "Bag", "Travel", 2000));
        System.out.println("Please enter product name:");
        String prodName = scn.nextLine();
        boolean found = false;
        for (Map.Entry<Integer, Product> entry : products.entrySet()) {
            Product product = entry.getValue();
            try {
                ProductNotFound.searchProduct(product, prodName);
                found = true;
                break;
            } catch (ProductNotFound e) {
                System.out.println(e.getMessage());
            }
        }

        if (!found) {
            System.out.println("Product is currently out of stock.. please try later..");
        }
        System.out.println("Thank You for Shopping..");
        scn.close();
    }
}