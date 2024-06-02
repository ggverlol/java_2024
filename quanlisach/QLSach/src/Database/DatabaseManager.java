/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Entities.TaiKhoan;


import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */

public class DatabaseManager {
    private static String url = "jdbc:mysql://localhost:3306/quanlysach?useSSL=false";
    private static String user = "root";
    private static String password = "admin";
    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
    /*
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(url, user, password);
        try{
            String query = "select * from TaiKhoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                String id = resultSet.getNString("MaTaiKhoan");
                String name = resultSet.getNString("MatKhau");
                System.out.println("ID: " + id + ", Name: " + name);
            }
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    */
}
