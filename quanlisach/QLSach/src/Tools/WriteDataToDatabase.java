/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Database.DatabaseManager;
import Entities.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class WriteDataToDatabase {
    static Connection connection = DatabaseManager.getConnection();
    public static void ghi_TacGia_Vao_File(TacGia tacGia) throws IOException{
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO tacgia values (?,?)");
            ps.setString(1,tacGia.getMaTG());
            ps.setString(2,tacGia.getTenTG());
            ps.executeUpdate();

        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void xoaTacgia(String i){
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE from tacgia where MaTG = ?");
            ps.setString(1,i);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void xoaSach(String i){
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE from sach where MaSach = ?");
            ps.setString(1,i);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void ghi_Sach_Vao_File(Sach sach) throws IOException{
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO sach values (?,?,?,?,?,?,?,?)");
                ps.setString(1,sach.getMaSach());
                ps.setString(2,sach.getTenSach());
                ps.setString(3, String.valueOf(sach.getNamXuatBan()));
                ps.setString(4, String.valueOf(sach.getSoTrang()));
                ps.setString(5,sach.getMaNXB());
                ps.setString(6, String.valueOf(sach.getDonGia()));
                ps.setString(7, String.valueOf(sach.getSoLuongCon()));
                ps.setString(8,sach.getMaTG());
                ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void ghi_SachTrongGioHang_Vao_File(SachTrongGioHang sachTrongGioHang) throws IOException{
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO sachtronggiohang values (?,?,?,?)");
            ps.setString(1,sachTrongGioHang.getMaTaiKhoan());
            ps.setString(2,sachTrongGioHang.getSachDaChon().getMaSach());
            ps.setString(3, String.valueOf(sachTrongGioHang.getSoLuong()));
            ps.setString(4, String.valueOf(sachTrongGioHang.getThanhTien()));
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void xoaSachTrongGio(String i){
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE from sachtronggiohang where MaTAIKHOAN = ?");
            ps.setString(1,i);
            ps.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static void ghi_HoaDon_Vao_File(HoaDon hoaDon) throws IOException{
        try{
            PreparedStatement ps = connection.prepareStatement("insert into hoadon values (?,?,?,?,?,?)");
            ps.setString(1,hoaDon.getMaHD());
            ps.setString(2,hoaDon.getNgayGiaoDich());
            ps.setString(3,hoaDon.getTenKH());
            ps.setString(4,hoaDon.getSachMua().get(0).getSachDaChon().getMaSach());
            ps.setString(5, String.valueOf(hoaDon.getSoLuong()));
            ps.setString(6, String.valueOf(hoaDon.getThanhTien()));
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
    
    public static void ghi_NhaXuatBan_Vao_File(NhaXuatBan nhaXuatBan) throws IOException{
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO nhaxuatban values (?,?,?,?)");
            ps.setString(1,nhaXuatBan.getMaNXB());
            ps.setString(2,nhaXuatBan.getTenNXB());
            ps.setString(3,nhaXuatBan.getDiaChi());
            ps.setString(4,nhaXuatBan.getSDT());
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();

        }
    }
    public static void xoaNXB(String id){
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE from nhaxuatban where Manxb = ?");
            ps.setString(1,id);
            ps.executeUpdate();
        }catch (SQLException e){

        }
    }
    public static void ghi_TaiKhoan_Vao_File(TaiKhoan taiKhoan) throws IOException{
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO taikhoan values (?,?,?)");
            ps.setString(1,taiKhoan.getMaTaiKhoan());
            ps.setString(2,taiKhoan.getMatKhau());
            ps.setString(3,taiKhoan.getVaiTro());
            ps.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void xoaTaikhoan(String id){
        try {
            PreparedStatement ps = connection.prepareStatement("DELETE from taikhoan where mataikhoan = ?");
            ps.setString(1,id);
            ps.executeUpdate();
        }catch (SQLException e){

        }
    }
    
}
