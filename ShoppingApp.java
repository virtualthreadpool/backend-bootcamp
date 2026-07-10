import java.util.Scanner;

class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }
}

class OutOfStockException extends Exception {
    public OutOfStockException(String message) {
        super(message);
    }
}

class InvalidCouponException extends Exception {
    public InvalidCouponException(String message) {
        super(message);
    }
}

class PaymentFailedException extends Exception {
    public PaymentFailedException(String message) {
        super(message);
    }
}

class Product {
    String name;
    double price;
    int stock;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}

class Store {

    Product[] products = {
        new Product("Shoes", 1499.0, 5),
        new Product("Watch", 2499.0, 0),
        new Product("Backpack", 999.0, 8),
        new Product("Headphones", 1999.0, 3)
    };

    double cartTotal = 0;

    public Product findProduct(String name) throws ProductNotFoundException {
        for (Product p : products) {
            if (p.name.equalsIgnoreCase(name)) {
                return p;
            }
        }
        throw new ProductNotFoundException("Product \"" + name + "\" not found.");
    }

    public void addToCart(String name, int qty) throws ProductNotFoundException, OutOfStockException {
        Product p = findProduct(name);
        if (p.stock < qty) {
            throw new OutOfStockException(p.name + " is out of stock. Available: " + p.stock);
        }
        p.stock = p.stock - qty;
        cartTotal = cartTotal + (p.price * qty);
        System.out.println(qty + " x " + p.name + " added to cart. Cart total: Rs. " + cartTotal);
    }

    public void applyCoupon(String code) throws InvalidCouponException {
        if (code.equals("SAVE10")) {
            cartTotal = cartTotal - (cartTotal * 0.10);
            System.out.println("Coupon applied. New total: Rs. " + cartTotal);
        } else if (code.equals("SAVE20")) {
            cartTotal = cartTotal - (cartTotal * 0.20);
            System.out.println("Coupon applied. New total: Rs. " + cartTotal);
        } else {
            throw new InvalidCouponException("Coupon \"" + code + "\" is not valid.");
        }
    }

    public void pay(String cardNumber) throws PaymentFailedException {
        if (cardNumber.length() != 16) {
            throw new PaymentFailedException("Payment failed. Invalid card number.");
        }
        System.out.println("Payment of Rs. " + cartTotal + " successful.");
        cartTotal = 0;
    }
}

public class ShoppingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Store store = new Store();
        int choice = 0;

        while (choice != 5) {

            System.out.println("\n1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. Apply Coupon");
            System.out.println("4. Checkout");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Product p : store.products) {
                        System.out.println(p.name + " - Rs. " + p.price + " - Stock: " + p.stock);
                    }
                    break;

                case 2:
                    sc.nextLine();
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    try {
                        store.addToCart(name, qty);
                    } catch (ProductNotFoundException | OutOfStockException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    sc.nextLine();
                    System.out.print("Enter coupon code: ");
                    String code = sc.nextLine();
                    try {
                        store.applyCoupon(code);
                    } catch (InvalidCouponException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    sc.nextLine();
                    System.out.print("Enter 16 digit card number: ");
                    String card = sc.nextLine();
                    try {
                        store.pay(card);
                    } catch (PaymentFailedException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        sc.close();
    }
}
