/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Run;

import Entities.TaiKhoan;
import GUI.DangNhapUI;
import Tools.WriteDataToDatabase;

import java.io.IOException;
import java.util.ArrayList;


public class Run {

    public static void main(String[] args) {
        DangNhapUI dn = new DangNhapUI("Quản lý sách");
        dn.showWindow();

//        ArrayList<TaiKhoan> listTaiKhoan = new ArrayList<>();
//        TaiKhoan tk = new TaiKhoan("123", "123", "Admin");
//        listTaiKhoan.add(tk);
//        try {
//            WriteDataToDatabase.ghi_TaiKhoan_Vao_File(listTaiKhoan);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
    }
}
