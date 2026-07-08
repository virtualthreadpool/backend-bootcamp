public class Cart {

    private Product product;
    private int quantity;

    public Cart(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Product ID   : " + product.getProductId() +
                "\nProduct Name : " + product.getProductName() +
                "\nPrice        : ₹" + product.getPrice() +
                "\nQuantity     : " + quantity +
                "\nTotal Price  : ₹" + getTotalPrice();
    }
}