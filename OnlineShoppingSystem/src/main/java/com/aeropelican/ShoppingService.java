package com.aeropelican;

import java.util.List;

public class ShoppingService {

    private List<Product> products;
    private List<Cart> cart;
    private double discount = 0;

    public ShoppingService(List<Product> products, List<Cart> cart) {
        this.products = products;
        this.cart = cart;
    }

    // View all available products
    public void viewProducts() {
        System.out.println("\n------ Available Products ------");

        for (Product p : products) {
            System.out.println(p);
            System.out.println("------------------------------");
        }
    }

    // Buy a product
    public void buyProduct(int productId, int quantity)
            throws ProductNotFoundException, OutOfStockException {

        Product product = null;

        for (Product p : products) {
            if (p.getProductId() == productId) {
                product = p;
                break;
            }
        }

        if (product == null) {
            throw new ProductNotFoundException("Product Not Found!");
        }

        if (product.getStock() < quantity) {
            throw new OutOfStockException("Insufficient Stock!");
        }

        product.setStock(product.getStock() - quantity);

        cart.add(new Cart(product, quantity));

        System.out.println("Product added to cart successfully.");
    }

    // View cart
    public void viewCart() {

        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        }

        double total = 0;

        System.out.println("\n--------- CART ---------");

        for (Cart c : cart) {
            System.out.println(c);
            System.out.println("------------------------");
            total += c.getTotalPrice();
        }

        System.out.println("Total Amount : ₹" + total);

        if (discount > 0) {
            System.out.println("Discount : ₹" + discount);
            System.out.println("Final Amount : ₹" + (total - discount));
        }
    }

    // Apply coupon
    public void applyCoupon(String coupon)
            throws InvalidCouponException {

        if (coupon.equalsIgnoreCase("SAVE10")) {
            discount = 500;
            System.out.println("Coupon Applied Successfully!");
        } else {
            throw new InvalidCouponException("Invalid Coupon Code!");
        }
    }

    // Payment
    public void makePayment(boolean payment)
            throws PaymentFailedException {

        if (!payment) {
            throw new PaymentFailedException("Payment Failed!");
        }

        double total = 0;

        for (Cart c : cart) {
            total += c.getTotalPrice();
        }

        total -= discount;

        System.out.println("\nPayment Successful!");
        System.out.println("Amount Paid : ₹" + total);
        System.out.println("Thank you for shopping with us!");

        cart.clear();
        discount = 0;
    }
}