package week9;
import java.sql.*;
import java.util.Scanner;

public class NorthwindMinExercise {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", args[0], args[1]);
        //displayAllProducts(connection);
        displayAllCategories(connection);
        String chosenCategory = promptCategoryName();
        String chosenProductName = promptProductName();
        displayProductsByCategory(connection, chosenCategory, chosenProductName);
        connection.close();
        scanner.close();
    }
    public static String promptCategoryName() {
        System.out.println("What is the name of the product you want to see?");
        String chosenCategoryName = scanner.nextLine();
        return chosenCategoryName;
    }

    public static String promptProductName() {
        System.out.println("What word should the product name contain?");
        String chosenProductName = scanner.nextLine();
        return chosenProductName;
    }

    public static void displayProductsByCategory(Connection connection, String chosenCategory, String chosenProductName) throws SQLException {
        // create statement
        String query = "SELECT productName, productId, unitPrice, QuantityPerUnit, categoryName FROM categories c " +
                "JOIN Products p on p.categoryId = c.categoryId " +
                "WHERE c.categoryName = ? AND productName LIKE ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, chosenCategory);
        statement.setString(2, "%" + chosenProductName + "%");

        // execute query

        ResultSet rs = statement.executeQuery();

        // process results
        while(rs.next()) {
            System.out.println("Category id: " + rs.getString("productname"));
            System.out.println("Name:        " + rs.getString("categoryName"));
            System.out.println("--------------------");
        }
    }

    public static void displayAllCategories(Connection connection) throws SQLException {
        // create statement
        String query = "SELECT * FROM categories";
        PreparedStatement statement = connection.prepareStatement(query);

        // execute query

        ResultSet rs = statement.executeQuery();

        // process results
        while(rs.next()) {
            System.out.println("Category id: " + rs.getString("categoryId"));
            System.out.println("Name:        " + rs.getString("categoryName"));
            System.out.println("Description: " + rs.getString("description"));
            System.out.println("--------------------");
        }
    }

    public static void displayAllProducts(Connection connection) throws SQLException {
        // create statement
        String query = "SELECT productName, productId, unitPrice, QuantityPerUnit FROM products";
        PreparedStatement statement = connection.prepareStatement(query);

        // execute query

        ResultSet rs = statement.executeQuery();

        // process results
        while (rs.next()) {
            System.out.println("Product id: " + rs.getString("productId"));
            System.out.println("Name:       " + rs.getString("productName"));
            System.out.println("Price:      " + rs.getString("unitPrice"));
            System.out.println("Quantity:   " + rs.getString("QuantityPerUnit"));
            System.out.println("--------------------");
        }
    }
}
