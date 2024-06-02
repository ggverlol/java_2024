/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.*;
import Database.*;
import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.logging.Logger;
import java.sql.*;

public class DatabaseToList {
    static Connection connection = DatabaseManager.getConnection();
    public static ArrayList<TacGia> Doc_TacGia_Tu_CSDL() throws SQLException {
        ArrayList<TacGia> tacGiaList = new ArrayList<>();
        try{
            String query ="select * from tacgia";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                TacGia tacGia = new TacGia();
                tacGia.setMaTG(resultSet.getString("MaTG"));
                tacGia.setTenTG(resultSet.getNString("TenTG"));
                tacGiaList.add(tacGia);
            }
            return tacGiaList;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<TacGia>();
        } 
    }
  
    public static ArrayList<HoaDon> Doc_HoaDon_Tu_CSDL() throws SQLException{
        ArrayList<HoaDon> hoaDonList = new ArrayList<>();
        String query = "select * from HoaDon";
        try{
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                HoaDon hoaDon = new HoaDon();
                hoaDon.setMaHD(resultSet.getString("MaHD"));
                hoaDon.setTenKH(resultSet.getNString("MaTaiKhoan"));
                hoaDon.setNgayGiaoDich(resultSet.getDate("NgayGiaoDich").toString());
                
                ArrayList<SachTrongGioHang> sdc = new ArrayList<>();
                String query2 = "select * from SachTrongGioHang inner join Sach on Sach.MaSach = SachTrongGioHang.MaSach inner join HoaDon on Sach.MaSach = HoaDon.MaSach";
                Statement statement2 = connection.createStatement();
                ResultSet resultSet2 = statement2.executeQuery(query2);
                while(resultSet2.next()){
                    SachTrongGioHang sachDaChon = new SachTrongGioHang();
                    sachDaChon.setMaTaiKhoan(resultSet2.getString("MaTaiKhoan"));
                    Sach s = new Sach();
                    s.setMaSach(resultSet2.getString("MaSach"));
                    s.setTenSach(resultSet2.getString("TenSach"));
                    s.setNamXuatBan(resultSet2.getInt("NamXuatBan"));
                    s.setSoTrang(resultSet2.getInt("SoTrang"));                       
                    s.setMaNXB(resultSet2.getString("MaNXB"));
                    s.setDonGia(resultSet2.getLong("DonGia"));
                    s.setSoLuongCon(resultSet2.getInt("SoLuongCon"));
                    s.setMaTG(resultSet2.getNString("MaTG"));
                    
                    sachDaChon.setSachDaChon(s);
                    sachDaChon.setSoLuong(resultSet2.getInt("SoLuong"));
                    
                    sdc.add(sachDaChon);
                }    
                hoaDon.setSachMua(sdc);
                hoaDon.setSoLuong(resultSet.getInt("SoLuong"));
                hoaDon.setThanhTien(resultSet.getLong("ThanhTien"));
                hoaDonList.add(hoaDon);
            }
            return hoaDonList;
        }
        catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<HoaDon>();
        }
    }
    
    public static ArrayList<SachTrongGioHang> Doc_SachTrongGioHang_Tu_CSDL(String username) throws SQLException{
        ArrayList<SachTrongGioHang> sachTrongGioHangList  = new ArrayList<>();
        try{
            String query = "select * from SachTrongGioHang join sach on sach.Masach = sachtronggiohang.masach where MaTaiKhoan = ? ";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1,username);
            ResultSet resultSet = ps.executeQuery();
            while(resultSet.next()){
                SachTrongGioHang sachDaChon = new SachTrongGioHang();
                sachDaChon.setMaTaiKhoan(resultSet.getString("MaTaiKhoan"));
                Sach s = new Sach();
                s.setMaSach(resultSet.getString("MaSach"));
                s.setTenSach(resultSet.getString("TenSach"));
                s.setNamXuatBan(resultSet.getInt("NamXuatBan"));
                s.setSoTrang(resultSet.getInt("SoTrang"));                       
                s.setMaNXB(resultSet.getString("MaNXB"));
                s.setDonGia(resultSet.getLong("DonGia"));
                s.setSoLuongCon(resultSet.getInt("SoLuongCon"));
                s.setMaTG(resultSet.getNString("MaTG"));
                    
                sachDaChon.setSachDaChon(s);
                sachDaChon.setSoLuong(resultSet.getInt("SoLuong"));
                    
                sachTrongGioHangList.add(sachDaChon);
            }
            return sachTrongGioHangList;
        }catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<SachTrongGioHang>();
        }
    }
    
    public static ArrayList<NhaXuatBan> Doc_NhaXuatBan_Tu_CSDL() throws SQLException{
        ArrayList<NhaXuatBan> nhaXuatBanList = new ArrayList<>();
        try{
            String query = "select * from NhaXuatBan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                NhaXuatBan nhaXuatBan = new NhaXuatBan();
                nhaXuatBan.setMaNXB(resultSet.getString("MaNXB"));
                nhaXuatBan.setTenNXB(resultSet.getString("tenNXB"));
                nhaXuatBan.setDiaChi(resultSet.getString("DiaChi"));
                nhaXuatBan.setSDT(resultSet.getString("SDT"));
                nhaXuatBanList.add(nhaXuatBan);
            }
            return nhaXuatBanList;
        }
        catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<NhaXuatBan>();
        }
    }
    
    public static ArrayList<Sach> Doc_Sach_Tu_CSDL() throws SQLException{
        ArrayList<Sach> sachList = new ArrayList<>();
        try{
            String query = "select * from Sach";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                Sach sach = new Sach();
                sach.setMaSach(resultSet.getString("MaSach"));
                sach.setTenSach(resultSet.getNString("TenSach"));
                sach.setNamXuatBan(resultSet.getInt("NamXuatBan"));
                sach.setSoTrang(resultSet.getInt("SoTrang"));
                sach.setMaNXB(resultSet.getNString("MaNXB"));
                sach.setDonGia((float)resultSet.getLong("DonGia"));
                sach.setSoLuongCon(resultSet.getInt("SoLuongCon"));
                sach.setMaTG(resultSet.getString("MaTG"));
                sachList.add(sach);
            }
            return sachList;
        }
        catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<Sach>();
        }
    }
    
    public static ArrayList<TaiKhoan> Doc_TaiKhoan_Tu_CSDL() throws SQLException{
        ArrayList<TaiKhoan> taiKhoanList = new ArrayList<>();
        try{
            String query = "select * from TaiKhoan";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while(resultSet.next()){
                TaiKhoan taiKhoan = new TaiKhoan();
                taiKhoan.setMaTaiKhoan(resultSet.getString("MaTaiKhoan"));
                taiKhoan.setMatKhau(resultSet.getString("MatKhau"));
                taiKhoan.setVaiTro(resultSet.getString("VaiTro"));
                taiKhoanList.add(taiKhoan);
            }
            return taiKhoanList;
        }
        catch(SQLException e){
            e.printStackTrace();
            return new ArrayList<TaiKhoan>();
        }
    }
}

