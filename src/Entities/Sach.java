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

public class Sach implements Serializable{
    private String MaSach;
    private String TenSach;
    private int NamXuatBan;
    private int SoTrang;
    private String MaTG;
    private String MaNXB;
    private float DonGia;
    private int SoLuongCon;

    public Sach() {
    }

    public Sach(String MaSach, String TenSach, int NamXuatBan, int SoTrang, String MaTG, String MaNXB, float DonGia, int SoLuongCon) {
        this.MaSach = MaSach;
        this.TenSach = TenSach;
        this.NamXuatBan = NamXuatBan;
        this.SoTrang = SoTrang;
        this.MaTG = MaTG;
        this.MaNXB = MaNXB;
        this.DonGia = DonGia;
        this.SoLuongCon = SoLuongCon;
    }

    public String getMaSach() {
        return MaSach;
    }

    public void setMaSach(String MaSach) {
        this.MaSach = MaSach;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String TenSach) {
        this.TenSach = TenSach;
    }

    public int getNamXuatBan() {
        return NamXuatBan;
    }

    public void setNamXuatBan(int NamXuatBan) {
        this.NamXuatBan = NamXuatBan;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int SoTrang) {
        this.SoTrang = SoTrang;
    }

    public String getMaTG() {
        return MaTG;
    }

    public void setMaTG(String MaTG) {
        this.MaTG = MaTG;
    }

    public String getMaNXB() {
        return MaNXB;
    }

    public void setMaNXB(String MaNXB) {
        this.MaNXB = MaNXB;
    }

    public float getDonGia() {
        return DonGia;
    }

    public void setDonGia(float DonGia) {
        this.DonGia = DonGia;
    }

    public int getSoLuongCon() {
        return SoLuongCon;
    }

    public void setSoLuongCon(int SoLuongCon) {
        this.SoLuongCon = SoLuongCon;
    }

    @Override
    public String toString() {
        return "Sach{" + "MaSach=" + MaSach + ", TenSach=" + TenSach + ", NamXuatBan=" + NamXuatBan + ", SoTrang=" + SoTrang + ", MaTG=" + MaTG + ", MaNXB=" + MaNXB + ", DonGia=" + DonGia + ", SoLuongCon=" + SoLuongCon + '}';
    }
    public static void main(String[] args) throws SQLException{
        ArrayList<Sach> a = DatabaseToList.Doc_Sach_Tu_CSDL();
        
    }
    
}
