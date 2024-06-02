/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.HoaDonDAL;
import DAL.SachTrongGioHangDAL;
import Entities.HoaDon;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class HoaDonBLL {
    public static TableModel show(){

        ArrayList<HoaDon> list= null;
        try {
            list = HoaDonDAL.show();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        String[] columnNames = {"STT","Mã hóa đơn","Tên khách hàng","Ngày giao dịch","Số lượng","Thành tiền"};
        Object[][] data = new Object[list.size()][columnNames.length];
        int row = 0;
        for(HoaDon c : list){
            data[row][0] = (row + 1);
            data[row][1] = c.getMaHD();
            data[row][2] = c.getTenKH();
            data[row][3] = c.getNgayGiaoDich();
            data[row][4] = c.getSoLuong();
            data[row][5] = c.getThanhTien();
            row++;
            System.out.println(Arrays.toString(list.toArray()));
        }
        
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 1:return int.class;
                    case 2:return String.class;
                    case 3: return String.class;
                    case 4: return String.class;
                    case 5: return int.class;
                    default: return double.class;
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
    
    
    public static int TongSoLuong(){
        ArrayList<HoaDon> list= null;
        try {
            list = HoaDonDAL.show();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        int t = 0;
        for(HoaDon item:list){
            t += item.getSoLuong();
        }
        return t;
    }
    public static float TongDoanhThu(){
        ArrayList<HoaDon> list= null;
        try {
            list = HoaDonDAL.show();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        float t = 0;
        for(HoaDon item:list){
            t += item.getThanhTien();
        }
        return t;
    }
}
