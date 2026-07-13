package com.aeropelican.repository;

import com.aeropelican.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//CRUD
public class ProductRepository {

    private Connection databaseConnection;

    public ProductRepository(Connection connection) {
        databaseConnection = connection;
    }

    public Product getProduct(int productId, int quantity) {
        String sqlStatement = "SELECT * FROM products where product_id = ? and quantity = ?";
        try {
            java.sql.PreparedStatement prepareStatement = databaseConnection.prepareStatement(sqlStatement);
            prepareStatement.setInt(1, productId);
            prepareStatement.setInt(2, quantity);

            ResultSet resultSet = prepareStatement.executeQuery();
            Product product = null;
            while (resultSet.next()) {

                product = new Product(
                        resultSet.getInt("product_id"),
                        resultSet.getString("product_name"),
                        resultSet.getString("category"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("quantity")
                );
            }
            return product;
        } catch (SQLException e) {
            System.out.println("Encountered an error when executing the statement");
            e.printStackTrace();
        }
        return null;
    }

    public List<Product> getProduct() {
        String sqlStatement = "SELECT * FROM products";
        try {
            Statement statement = databaseConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(sqlStatement);

            List<Product> productsList = new ArrayList<>();

            while (resultSet.next()) {

                Product product = new Product(
                        resultSet.getInt("product_id"),
                        resultSet.getString("product_name"),
                        resultSet.getString("category"),
                        resultSet.getDouble("price"),
                        resultSet.getInt("quantity")
                );
                productsList.add(product);

            }
            return productsList;
        } catch (SQLException e) {
            System.out.println("Encountered an error when executing the statement");
        }
        return null;
    }

    public void createProduct(String productName, String cat, double price, int quantity) throws Exception {
        String insertStatement = "INSERT INTO products (product_name, category, price, quantity) VALUES (?, ?, ?, ?)";

        PreparedStatement preparedStatement = databaseConnection.prepareStatement(insertStatement);
        preparedStatement.setString(1, productName);
        preparedStatement.setString(2, cat);
        preparedStatement.setDouble(3, price);
        preparedStatement.setInt(4, quantity);

        int rowsEffected = preparedStatement.executeUpdate();
        System.out.println("Total records created: " + rowsEffected);
    }
}
