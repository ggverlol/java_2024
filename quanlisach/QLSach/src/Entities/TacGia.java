/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entities;
import Tools.*;
import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;

public class TacGia implements Serializable{
    private String MaTG;
    private String TenTG;

    public TacGia() {
    }

    public TacGia(String MaTG, String TenTG) {
        this.MaTG = MaTG;
        this.TenTG = TenTG;
    }

    public String getMaTG() {
        return MaTG;
    }

    public void setMaTG(String MaTG) {
        this.MaTG = MaTG;
    }

    public String getTenTG() {
        return TenTG;
    }

    public void setTenTG(String TenTG) {
        this.TenTG = TenTG;
    }

    @Override
    public String toString() {
        return "TacGia{" + "MaTG=" + MaTG + ", TenTG=" + TenTG + '}';
    }
    
    
    
    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        
        ArrayList<TacGia> a = DatabaseToList.Doc_TacGia_Tu_CSDL();
    }
}
