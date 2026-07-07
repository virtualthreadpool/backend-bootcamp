package OnlineShopping;
public class Product {
    private Integer productId;
    private String productName;
    private String category;
    private double price;
    public Product(Integer productId, String productName,
                   String category, double price) {

        this.productId = productId;
        this.productName = productName;
        this.category = category;
        this.price = price;
    }

    public Integer getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }
}
