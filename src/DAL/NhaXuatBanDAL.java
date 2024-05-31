/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import Entities.NhaXuatBan;
import Tools.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class NhaXuatBanDAL {
    public static ArrayList<NhaXuatBan> show(){
        try{
            ArrayList<NhaXuatBan> a = new ArrayList<NhaXuatBan>();
            a = DatabaseToList.Doc_NhaXuatBan_Tu_CSDL();
            return a;
        }
        catch(SQLException e){
            return null;
        }
        
    }
    
    public static String GetTenNXB(String maNXB){
        ArrayList<NhaXuatBan> a = NhaXuatBanDAL.show();
        for(NhaXuatBan item:a){
            if(item.getMaNXB().equals(maNXB))
                return item.getTenNXB();
        }
        return "";
    }
    
    public static boolean insert(ArrayList<NhaXuatBan> list, NhaXuatBan a) throws IOException{
        if(a.getMaNXB().equals("")){
            JOptionPane.showMessageDialog(null,"Mã nhã xuất bản không được để trống");
            return false;
        }
        for(NhaXuatBan item : list)
            if(a.getMaNXB().equals(item.getMaNXB())){
                JOptionPane.showMessageDialog(null,"Mã nhã xuất bản đã tồn tại");
                return false;
            }
        int index = list.size();
        for(int i=0;i<list.size();i++){
            if(a.getMaNXB().compareTo(list.get(i).getMaNXB())>0)
                index = i+1;
        }
        list.add(index,a);
        WriteDataToDatabase.ghi_NhaXuatBan_Vao_File(list);
        return true;
    }
    
    public static boolean update(ArrayList<NhaXuatBan> list, NhaXuatBan a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaNXB().equals(list.get(i).getMaNXB())){
                index = i;
            }
        if(index != -1){
            list.set(index,a);
            WriteDataToDatabase.ghi_NhaXuatBan_Vao_File(list);
            return true;
        }
        return false;
        
    }
    
    public static boolean delete(ArrayList<NhaXuatBan> list, NhaXuatBan a) throws IOException{
        int index = -1;
        for(int i=0;i<list.size();i++)
            if(a.getMaNXB().equals(list.get(i).getMaNXB())){
                index = i;
            }
        if(index!=-1){
            list.remove(index);
            WriteDataToDatabase.ghi_NhaXuatBan_Vao_File(list);
            return true;
        }
        else
        return false;
    }
}
