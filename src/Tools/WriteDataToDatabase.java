/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tools;

import Entities.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Logger;

/**
 *
 * @author PC
 */
public class WriteDataToDatabase {
    public static void ghi_TacGia_Vao_File(ArrayList<TacGia> list) throws IOException{
        try{
            FileOutputStream fout=new FileOutputStream("TacGia.DAT");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(list);
            out.flush();
            //closing the stream
            out.close();
        }
        catch(FileNotFoundException e){
            Logger.getLogger("TacGia.DAT", e.getMessage());
        }
    }
    
    public static void ghi_Sach_Vao_File(ArrayList<Sach> list) throws IOException{
        try{
            FileOutputStream fout=new FileOutputStream("Sach.DAT");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(list);
            out.flush();
            //closing the stream
            out.close();
        }
        catch(FileNotFoundException e){
            Logger.getLogger("Sach.DAT", e.getMessage());
        }
    }
    
    public static void ghi_SachTrongGioHang_Vao_File(ArrayList<SachTrongGioHang> list) throws IOException{
        try{
            FileOutputStream fout=new FileOutputStream("SachTrongGioHang.DAT");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(list);
            out.flush();
            //closing the stream
            out.close();
        }
        catch(FileNotFoundException e){
            Logger.getLogger("SachTrongGioHang.DAT", e.getMessage());
        }
    }
    
    public static void ghi_HoaDon_Vao_File(ArrayList<HoaDon> list) throws IOException{
        try{
            FileOutputStream fout=new FileOutputStream("HoaDon.DAT");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(list);
            out.flush();
            //closing the stream
            out.close();
        }
        catch(FileNotFoundException e){
            Logger.getLogger("HoaDon.DAT", e.getMessage());
        }
    }
    
    public static void ghi_NhaXuatBan_Vao_File(ArrayList<NhaXuatBan> list) throws IOException{
        try{
            FileOutputStream fout=new FileOutputStream("NhaXuatBan.DAT");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(list);
            out.flush();
            //closing the stream
            out.close();
        }
        catch(FileNotFoundException e){
            Logger.getLogger("NhaxuatBan.DAT", e.getMessage());
        }
    }
    
    public static void ghi_TaiKhoan_Vao_File(ArrayList<TaiKhoan> list) throws IOException{
        try{
            FileOutputStream fout=new FileOutputStream("TaiKhoan.DAT");
            ObjectOutputStream out=new ObjectOutputStream(fout);
            out.writeObject(list);
            out.flush();
            //closing the stream
            out.close();
        }
        catch(FileNotFoundException e){
            Logger.getLogger("TaiKhoan.DAT", e.getMessage());
        }
    }
    
    
}
