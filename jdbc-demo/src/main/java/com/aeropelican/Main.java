package com.aeropelican;

import com.aeropelican.database.MySQLConnection;
import com.aeropelican.model.Product;
import com.aeropelican.repository.ProductRepository;

import java.sql.Connection;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Creating a connection to the database");

        MySQLConnection mySQLConnection = new MySQLConnection();
        Connection connection = mySQLConnection.establishConnection();

        ProductRepository repository = new ProductRepository(connection);
        repository.createProduct("JBL GO3", "Speaker", 3500, 12);
    }
}