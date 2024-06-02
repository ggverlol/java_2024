/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.TaiKhoan;
import Tools.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;


public class TaiKhoanDAL {
    public static ArrayList<TaiKhoan> show(){
        try{
            ArrayList<TaiKhoan> a = new ArrayList<TaiKhoan>();
            a = DatabaseToList.Doc_TaiKhoan_Tu_CSDL();
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
    public static ArrayList<TaiKhoan> showAdmin(){
        try{
            ArrayList<TaiKhoan> a = new ArrayList<TaiKhoan>(),b;
            b = DatabaseToList.Doc_TaiKhoan_Tu_CSDL();
            for(TaiKhoan item:b){
                if(item.getVaiTro().equals("Admin"))
                    a.add(item);
            }
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
    public static ArrayList<TaiKhoan> showUser(){
        try{
            ArrayList<TaiKhoan> a = new ArrayList<TaiKhoan>(),b;
            b = DatabaseToList.Doc_TaiKhoan_Tu_CSDL();
            for(TaiKhoan item:b){
                if(item.getVaiTro().equals("User"))
                    a.add(item);
            }
            return a;
        }
        catch(SQLException e){
            return null;
        }
    }
    public static boolean insert(ArrayList<TaiKhoan> list, TaiKhoan a) throws IOException{
        WriteDataToDatabase.ghi_TaiKhoan_Vao_File(a);
        return true;
    }
    
    public static boolean update(ArrayList<TaiKhoan> list, TaiKhoan a) throws IOException{
           WriteDataToDatabase.xoaNXB(a.getMaTaiKhoan());
            WriteDataToDatabase.ghi_TaiKhoan_Vao_File(a);
        return true;
        
    }
    
    public static boolean delete(ArrayList<TaiKhoan> list, TaiKhoan a) throws IOException{
            WriteDataToDatabase.xoaTaikhoan(a.getMaTaiKhoan());
        return true;
    }
}
