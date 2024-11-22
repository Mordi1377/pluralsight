package com.pluralsight;

import javax.sql.DataSource;
import java.sql.*;

public class DatabaseConnecting {

    public static void main(String[] args) throws SQLException {

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", "root", "yearup24");

        Statement statement = connection.createStatement();

        String query = "SELECT * FROM products";
        ResultSet rs = statement.executeQuery(query);

        while(rs.next()) {
            System.out.println(rs.getString("productname"));
        }
        connection.close();

    }

}
