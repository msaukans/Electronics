package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateDB {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost";
        
        String username = "root";
        String password = "root";

        String sql = "CREATE DATABASE IF NOT EXISTS electronics";
        
        try (Connection conn = DriverManager.getConnection(url, username, password);
             PreparedStatement stmt = conn.prepareStatement(sql)) {
        
            stmt.execute();
            System.out.println("Database exists!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Database not created!");
        }
    }
}