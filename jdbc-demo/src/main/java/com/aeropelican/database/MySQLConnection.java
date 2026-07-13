package com.aeropelican.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Oracle
//Mongo
public class MySQLConnection {

    public Connection establishConnection() {

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/ecommerce_product",
                    "root",
                    "root"
            );
        } catch (SQLException e) {
            System.out.println("Encountered an error while establishing database connection");
            e.printStackTrace();
        }

        return connection;
    }
}
