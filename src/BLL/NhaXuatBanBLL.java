/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.NhaXuatBanDAL;
import Entities.NhaXuatBan;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class NhaXuatBanBLL {
    public static TableModel show(){
        
        ArrayList<NhaXuatBan> list= NhaXuatBanDAL.show();
        String[] columnNames = {"Mã nhà xuất bản","Tên nhà xuất bản","Địa chỉ","Số điện thoại"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(NhaXuatBan c : list){
            data[row][0] = c.getMaNXB();
            data[row][1] = c.getTenNXB();
            data[row][2] = c.getDiaChi();
            data[row][3] = c.getSDT();
            row++;
        }
        
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 1:return String.class;
                    case 2:return String.class;
                    case 3:return String.class;
                    default:return String.class;
                }
            };
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            };
        };
        
       return table;
        
    }
    
    public static Object[] showControlWithCombobox(String cbbValue){
        ArrayList<NhaXuatBan> list = NhaXuatBanDAL.show();
        Object[] obj = new Object[4];
        for(NhaXuatBan k :list){
            if(cbbValue.equals(k.getMaNXB())){
                  obj[0]  = k.getMaNXB();
                  obj[1]  = k.getTenNXB();
                  obj[2]  = k.getDiaChi();
                  obj[3]  = k.getSDT();
            }
        }
        return obj;
    }
    
    public static ComboBoxModel cbb_show(){
        
        StringBuilder items = new StringBuilder();
        
        for(int i = 0;i<NhaXuatBanDAL.show().size();i++){
            items.append(NhaXuatBanDAL.show().get(i).getMaNXB());
            items.append("#");
        }
        
        return new DefaultComboBoxModel(items.toString().split("#"));
    }
}
