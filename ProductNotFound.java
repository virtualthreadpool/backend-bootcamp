package OnlineShopping;
public class ProductNotFound extends Exception {
    public ProductNotFound(String message) {
        super(message);
    }
    public static void searchProduct(Product product, String prodName)
            throws ProductNotFound {

        if (product.getProductName().equalsIgnoreCase(prodName)) {
            System.out.println("\nProduct added to cart..");
            System.out.println("Product ID: " + product.getProductId());
            System.out.println("Product Name: " + product.getProductName());
            System.out.println("Category: " + product.getCategory());
            System.out.println("Price: " + product.getPrice());

        } else {
            throw new ProductNotFound("Product is currently out of stock.. please try later..");
        }
    }
}
