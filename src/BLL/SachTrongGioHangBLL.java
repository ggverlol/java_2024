/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.SachTrongGioHangDAL;
import Entities.SachTrongGioHang;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class SachTrongGioHangBLL {
    public static TableModel show(String maTaiKhoan){
        
        ArrayList<SachTrongGioHang> list= SachTrongGioHangDAL.show(maTaiKhoan);
        Object[][] data;
        String[] columnNames = {"STT","Tên sách","Đơn giá","Số lượng","Thành tiền"};
        data = new Object[(list.size()==0)?1:list.size()][columnNames.length];
        int row = 0;
        for(SachTrongGioHang c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getSachDaChon().getTenSach();
            data[row][2] = c.getSachDaChon().getDonGia();
            data[row][3] = c.getSoLuong();
            data[row][4] = c.getThanhTien();
            row++;
            
        }
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0:return int.class;
                    case 1:return String.class;
                    case 2: return float.class;
                    case 3: return int.class;
                    default: return float.class;
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
