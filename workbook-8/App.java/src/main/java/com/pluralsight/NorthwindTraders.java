package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTraders {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup24");
        displayAllProducts(connection);
        displayProductById(connection);
        connection.close();
    }

    public static void displayAllProducts(Connection connection) throws SQLException {
        System.out.println("Pelase Enter the product ID number Please?");
        String query = "SELECT ProductName, productId FROM Products";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("ProductName") + " - " + rs.getString("ProductId"));
        }
    }

    public static void displayProductById(Connection connection) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();
        scanner.close();

        String query = "SELECT ProductName, productId FROM Products WHERE ProductId  = ?";
        PreparedStatement statement = connection.prepareStatement(query);

        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("ProductName") + " - " + rs.getString("ProductId"));
        }
    }
}
