/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Database;

import Entities.TaiKhoan;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
/**
 *
 * @author ADMIN
 */

public class DatabaseManager {
    private static final String url = "jdbc:sqlserver://LAPTOP-995LFRRS\\THANHLAM:1433;databaseName=QLSach;trustServerCertificate=true";
    private static final String user = "sa";
    private static final String password = "123456";
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(url, user, password);    
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
