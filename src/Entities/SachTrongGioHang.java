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

public class SachTrongGioHang implements Serializable{
    private String MaTaiKhoan;
    private Sach SachDaChon;
    private int SoLuong;
    private float ThanhTien;

    public SachTrongGioHang() {
        MaTaiKhoan = "";
        SachDaChon = new Sach();
        SoLuong = 0;
        ThanhTien = 0;
    }

    public SachTrongGioHang(String MaTaiKhoan, Sach SachDaChon, int SoLuong) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.SachDaChon = SachDaChon;
        this.SoLuong = SoLuong;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public Sach getSachDaChon() {
        return SachDaChon;
    }

    public void setSachDaChon(Sach SachDaChon) {
        this.SachDaChon = SachDaChon;
    }

    public int getSoLuong() {
        return SoLuong;
    }

    public void setSoLuong(int SoLuong) {
        this.SoLuong = SoLuong;
    }

    public float getThanhTien() {
        return SoLuong * SachDaChon.getDonGia();
    }

    @Override
    public String toString() {
        return "SachTrongGioHang{" + "MaTaiKhoan=" + MaTaiKhoan + ", SachDaChon=" + SachDaChon + ", SoLuong=" + SoLuong + ", ThanhTien=" + getThanhTien() + '}';
    }
    
    public static void main(String[] args) throws SQLException {
        ArrayList<SachTrongGioHang> a = DatabaseToList.Doc_SachTrongGioHang_Tu_CSDL();
    }
}
