/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.TaiKhoanDAL;
import Entities.TaiKhoan;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class TaiKhoanBLL {
        public static TableModel show1(){
        
        ArrayList<TaiKhoan> list= TaiKhoanDAL.showAdmin();
        int row = 0;
        
        String[] columnNames = {"Tên đăng nhập","Mật khẩu"};
        Object[][] data = new Object[list.size()][columnNames.length];
        for(TaiKhoan c : list){
            data[row][0] = c.getMaTaiKhoan();
            data[row][1] = c.getMatKhau();
            row++;
        }
        
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0: return String.class;
                    default:return String.class;
                    
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
        
    public static TableModel show2(){
        
        ArrayList<TaiKhoan> list= TaiKhoanDAL.showUser();
        int row = 0;
        
        String[] columnNames = {"Tên đăng nhập","Mật khẩu"};
        Object[][] data = new Object[list.size()][columnNames.length];
        for(TaiKhoan c : list){
            data[row][0] = c.getMaTaiKhoan();
            data[row][1] = c.getMatKhau();
            row++;
        }
        DefaultTableModel table = new DefaultTableModel(data,columnNames){
            @Override
            public Class<?> getColumnClass(int column){
                switch(column){
                    case 0: return String.class;
                    default:return String.class;
                    
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
