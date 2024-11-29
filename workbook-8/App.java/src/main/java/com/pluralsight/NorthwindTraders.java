package com.pluralsight;

import java.sql.*;

public class NorthwindTraders {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup24");

        Statement statement = connection.createStatement();

        String query = "SELECT productid, productname, unitprice, unitsinstock FROM products";

        ResultSet rs = statement.executeQuery(query);

        // Print header for rows of information
        System.out.printf("%-5s %-20s %-10s %-10s%n", "Id", "Name", "Price", "Stock");
        System.out.println("----- -------------------- ---------- ----------");


        while(rs.next()) {
            int productId = rs.getInt("productid");
            String productName = rs.getString("productname");
            double unitPrice = rs.getDouble("unitprice");
            int unitsInStock = rs.getInt("unitsinstock");

            System.out.printf("%-5d %-20s %-10.2f %-10d%n", productId, productName, unitPrice, unitsInStock);

        }
        connection.close();

    }

}
