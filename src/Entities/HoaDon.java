/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;

import Tools.DatabaseToList;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;


public class HoaDon implements Serializable{
    private String MaHD;
    private String NgayGiaoDich;
    private String TenKH;
    private ArrayList<SachTrongGioHang> SachMua;
    private int SoLuong;
    private double ThanhTien;
    public HoaDon() {
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public double getThanhTien() {
        return ThanhTien;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public void setThanhTien(double ThanhTien) {
        this.ThanhTien = ThanhTien;
    }
    
    public String getMaHD() {
        return MaHD;
    }

    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public String getNgayGiaoDich() {
        return NgayGiaoDich;
    }

    public void setNgayGiaoDich(String NgayGiaoDich) {
        this.NgayGiaoDich = NgayGiaoDich;
    }

    public String getTenKH() {
        return TenKH;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    public ArrayList<SachTrongGioHang> getSachMua() {
        return SachMua;
    }

    public void setSachMua(ArrayList<SachTrongGioHang> SachMua) {
        this.SachMua = SachMua;
    }

    public HoaDon(String MaHD, String NgayGiaoDich, String TenKH, ArrayList<SachTrongGioHang> SachMua, int SoLuong, double ThanhTien) {
        this.MaHD = MaHD;
        this.NgayGiaoDich = NgayGiaoDich;
        this.TenKH = TenKH;
        this.SachMua = SachMua;
        this.SoLuong = SoLuong;
        this.ThanhTien = ThanhTien;
    }
    
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        ArrayList<HoaDon> a = DatabaseToList.Doc_HoaDon_Tu_CSDL();
    }
}
