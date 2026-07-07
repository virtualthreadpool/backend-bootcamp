package Shopping;
import java.util.HashMap;

public class ShoppingService {
    private HashMap<Integer, Product> products = new HashMap<>();

    public ShoppingService() {
        products.put(1, new Product(1, "Laptop", 5, 60000));
        products.put(2, new Product(2, "Derma.Facewash", 8, 800));
        products.put(3, new Product(3, "Souled.shirt", 0, 1500));
        products.put(4, new Product(4, "Headphones", 3, 2500));
        products.put(5, new Product(5, "Smart Watch", 2, 5000));
        products.put(6, new Product(6, "Speaker", 6, 3200));
    }

    public void displayProducts() {
        System.out.println("\nAvailable Products");
        System.out.println("------------------");
        for (Product p : products.values()) {
            System.out.println(p.getId() + " - " + p.getName() + " - ₹" + p.getPrice() + " - Stock: " + p.getStock());
        }
    }

    public Product getProductById(int id) throws ProductNotFoundException {
        if (!products.containsKey(id)) {
            throw new ProductNotFoundException("Product ID Not Found");
        }
        return products.get(id);
    }

    public void buyProduct(int id, double walletAmount)
            throws ProductNotFoundException, OutOfStockException, PaymentFailedException {

        Product p = getProductById(id);

        if (p.getStock() == 0) {
            throw new OutOfStockException(p.getName() + " is Out Of Stock");
        }

        if (walletAmount < p.getPrice()) {
            throw new PaymentFailedException("Insufficient Wallet Balance");
        }

        p.reduceStock();

        System.out.println("\nPurchase Successful");
        System.out.println("Product : " + p.getName());
        System.out.println("Price   : ₹" + p.getPrice());
        System.out.println("Updated Stock : " + p.getStock());
    }
}