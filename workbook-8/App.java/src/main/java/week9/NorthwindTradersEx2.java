package week9;

import java.sql.*;
import java.util.Scanner;

public class NorthwindTradersEx2 {
    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
        displayAllProducts(connection);
        connection.close();
    }

    public static void displayAllProducts(Connection connection) throws SQLException {

        String query = "SELECT ProductName, productId, unitPrice, unitsInStock FROM Products";
        PreparedStatement statement = connection.prepareStatement(query);

        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println("Product id: " + rs.getString("productId"));
            System.out.println("Name:       " + rs.getString("productName"));
            System.out.println("Price:      " + rs.getString("unitPrice"));
            System.out.println("Stock:      " + rs.getString("unitsInStock"));
            System.out.println("--------------------");
        }
    }

}