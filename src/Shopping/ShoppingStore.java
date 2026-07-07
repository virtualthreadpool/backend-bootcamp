package Shopping;

// ShoppingStore.java
import java.util.HashMap;
import java.util.Map;

public class ShoppingStore {
    private Map<Integer, String> idMap = new HashMap<>();
    private Map<String, Integer> stockMap = new HashMap<>();
    private Map<String, Double> priceMap = new HashMap<>();

    private int nextId = 1;

    public ShoppingStore() {
        addProduct("Sipder suit ", 5, 1500.00);
        addProduct("Thor hammer", 10, 500.00);
        addProduct("Iron man face mask", 0, 150.00);
        addProduct("Gun", 3, 75.00);
        addProduct("Sheild ", 2, 125.00);
        addProduct("Pen", 15, 25.00);
    }

    private void addProduct(String name, int stock, double price) {
        idMap.put(nextId, name);
        stockMap.put(name, stock);
        priceMap.put(name, price);
        nextId++;
    }

    public Map<Integer, String> getIdMap() { return idMap; }
    public Map<String, Integer> getStockMap() { return stockMap; }
    public Map<String, Double> getPriceMap() { return priceMap; }

    public void purchaseProductByNumber(int productNumber, double userBalance)
            throws ProductNotFoundException, OutOfStockException, PaymentFailedException {

        if (!idMap.containsKey(productNumber)) {
            throw new ProductNotFoundException("Error: Product selection #" + productNumber + " does not exist.");
        }

        String productName = idMap.get(productNumber);

        int availableStock = stockMap.get(productName);
        if (availableStock <= 0) {
            throw new OutOfStockException("Error: '" + productName + "' is currently out of stock.");
        }

        double price = priceMap.get(productName);
        if (userBalance < price) {
            throw new PaymentFailedException("Error: Payment failed. Insufficient funds for " + productName + " (Costs $" + price + ").");
        }

        stockMap.put(productName, availableStock - 1);
        System.out.println("\n--- Success! ---");
        System.out.println("You successfully purchased a " + productName + " for $" + price);
        System.out.println("Remaining stock: " + (availableStock - 1));
    }
}