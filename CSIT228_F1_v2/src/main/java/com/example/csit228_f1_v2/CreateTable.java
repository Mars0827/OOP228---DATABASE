package com.example.csit228_f1_v2;

import com.example.csit228_f1_v2.MySQLConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {
        Connection c = MySQLConnection.getConnection();
        String query = "CREATE TABLE user_activity(" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "email VARCHAR(100) NOT NULL," +
                "password VARCHAR(100) NOT NULL)";

        try {
            Statement statement = c.createStatement();
            statement.execute(query);
            System.out.println("Table Has been Created Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                c.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
