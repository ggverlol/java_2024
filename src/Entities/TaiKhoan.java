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

public class TaiKhoan implements Serializable{
    private String MaTaiKhoan;
    private String MatKhau;
    private String VaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(String MaTaiKhoan, String MatKhau, String VaiTro) {
        this.MaTaiKhoan = MaTaiKhoan;
        this.MatKhau = MatKhau;
        this.VaiTro = VaiTro;
    }

    public String getMaTaiKhoan() {
        return MaTaiKhoan;
    }

    public void setMaTaiKhoan(String MaTaiKhoan) {
        this.MaTaiKhoan = MaTaiKhoan;
    }

    public String getMatKhau() {
        return MatKhau;
    }

    public void setMatKhau(String MatKhau) {
        this.MatKhau = MatKhau;
    }

    public String getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(String VaiTro) {
        this.VaiTro = VaiTro;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "MaTaiKhoan=" + MaTaiKhoan + ", MatKhau=" + MatKhau + ", VaiTro=" + VaiTro + '}';
    }
    public static void main(String[] args) throws SQLException {
        
        ArrayList<TaiKhoan> listTK = DatabaseToList.Doc_TaiKhoan_Tu_CSDL();
        
    }
}
