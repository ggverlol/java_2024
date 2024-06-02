/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.SachDAL;
import Entities.Sach;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class SachBLL {
    public static TableModel show(){
        
        ArrayList<Sach> list= SachDAL.show();
        String[] columnNames = {"STT","Mã sách","Tên sách","Năm xuất bản","Số trang","Mã tác giả","Mã NXB","Đơn giá","Số lượng còn"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(Sach c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaSach();
            data[row][2] = c.getTenSach();
            data[row][3] = c.getNamXuatBan();
            data[row][4] = c.getSoTrang();
            data[row][5] = c.getMaTG();
            data[row][6] = c.getMaNXB();
            data[row][7] = c.getDonGia();
            data[row][8] = c.getSoLuongCon();
            row++;
        }
        
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0:return int.class;
                    case 1:return String.class;
                    case 2: return String.class;
                    case 3: return int.class;
                    case 4: return int.class;
                    case 5: return String.class;
                    case 6: return String.class;
                    case 7: return float.class;
                    default: return int.class;
                }
            };
            
            @Override
            public boolean isCellEditable(int row, int column) {
               //all cells false
               return false;
            }
        };
        
       return table;
        
    }
    
    
}
