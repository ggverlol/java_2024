/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import BLL.*;
import Entities.*;
import DAL.*;

import java.awt.HeadlessException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class AdminUI extends javax.swing.JFrame {

    List<Sach> list;
    DefaultTableModel model;
    
    /**
     * Creates new form AdminUI
     */
    public AdminUI() throws SQLException {
        initComponents();
        
        
        show_Sach();
        show_TacGia();
        show_NhaXuatBan();
        show_TaiKhoanAdmin();
        show_TaiKhoanUser();
        if(HoaDonDAL.show() != null) {
            show_HoaDon();
            show_DoanhThu();
        }  
    }

    //show table
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    
    public void show_Sach() throws SQLException{
        model = (DefaultTableModel) tbSach.getModel();
        tbSach.setModel(SachBLL.show()); 
        
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbSach.setDefaultRenderer(Object.class, renderer);
     
        cboMaTG1.setModel(TacGiaBLL.cbb_show());
        cboMaNXB1.setModel(NhaXuatBanBLL.cbb_show());
        
    }
    
    public void show_TacGia() throws SQLException{
        model = (DefaultTableModel) tbTacGia.getModel();
        tbTacGia.setModel(TacGiaBLL.show());
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbTacGia.setDefaultRenderer(Object.class, renderer);
     
    }
    
    public void show_NhaXuatBan(){
        model = (DefaultTableModel) tbNXB.getModel();
        tbNXB.setModel(NhaXuatBanBLL.show());
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbNXB.setDefaultRenderer(Object.class, renderer);
    }
    
    public void show_TaiKhoanAdmin(){
        tbTaiKhoan1.setModel(TaiKhoanBLL.show1());
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbTaiKhoan1.setDefaultRenderer(Object.class, renderer);
    }
    
    public void show_TaiKhoanUser(){
        tbTaiKhoan2.setModel(TaiKhoanBLL.show2());
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbTaiKhoan2.setDefaultRenderer(Object.class, renderer);
    }
    
    public void show_HoaDon(){
        tbHoaDon.setModel(HoaDonBLL.show()); 
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbHoaDon.setDefaultRenderer(Object.class, renderer);
    }
    
    public void show_DoanhThu(){
        tbDSDaBan.setModel(HoaDonBLL.show()); 
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbDSDaBan.setDefaultRenderer(Object.class, renderer);
        
        sum.setText(String.valueOf(HoaDonBLL.TongSoLuong()));
        totalRevenue.setText(String.valueOf(HoaDonBLL.TongDoanhThu()));
    }
    
    //Select row
    public void show_Row_tbSach(){
        int i = tbSach.getSelectedRow();
        Sach s = SachDAL.show().get(i);
        txtTenSach1.setText((String)(tbSach.getValueAt(i,2)));
        
        txtMaSach1.setText((String)(tbSach.getValueAt(i,1)));
        txtNamXB1.setText(String.valueOf(tbSach.getValueAt(i, 3)));
        txtSoTrang1.setText(String.valueOf(tbSach.getValueAt(i, 4)));
        cboMaTG1.setSelectedItem((String)(tbSach.getValueAt(i,5)));
        cboMaNXB1.setSelectedItem((String)(tbSach.getValueAt(i,6)));
        txtDonGia1.setText(String.valueOf(tbSach.getValueAt(i, 7)));
        txtSoLuongCon1.setText(String.valueOf(tbSach.getValueAt(i, 8)));
    }
    public void show_Row_tbTacGia() throws SQLException{
        int i = tbTacGia.getSelectedRow();
        TacGia s = TacGiaDAL.show().get(i);
        
        txtMaTG1.setText(s.getMaTG());
        txtTenTG.setText(s.getTenTG());
    }
    public void show_Row_tbNXB(){
        int i = tbNXB.getSelectedRow();
        NhaXuatBan s = NhaXuatBanDAL.show().get(i);
        
        txtMaNXB1.setText(s.getMaNXB());
        txtTenNXB1.setText(s.getTenNXB());
        txtDiaChi.setText(s.getDiaChi());
        txtSDT.setText(s.getSDT());
    }
    
    public void show_Row_tbTaiKhoanAdmin(){
        int i = tbTaiKhoan1.getSelectedRow();
        TaiKhoan s = TaiKhoanDAL.showAdmin().get(i);
        
        usernameAdmin.setText(s.getMaTaiKhoan());
        passwordAdmin.setText(s.getMatKhau());
    }
    
    public void show_Row_tbTaiKhoanUser(){
        int i = tbTaiKhoan2.getSelectedRow();
        TaiKhoan s = TaiKhoanDAL.showUser().get(i);
        
        usernameKH.setText(s.getMaTaiKhoan());
        passwordKH.setText(s.getMatKhau());
    }
    
    public void show_Row_tbHoaDon() throws SQLException{
        int i = tbHoaDon.getSelectedRow();
        HoaDon s = HoaDonDAL.show().get(i);
        
        txtMaHoaDon.setText(s.getMaHD());
        txtTenKH.setText(s.getTenKH());
        txtNgayGiaoDich.setText(s.getNgayGiaoDich());
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        AdminTabPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaSach1 = new javax.swing.JTextField();
        txtTenSach1 = new javax.swing.JTextField();
        txtNamXB1 = new javax.swing.JTextField();
        txtSoTrang1 = new javax.swing.JTextField();
        txtDonGia1 = new javax.swing.JTextField();
        cboMaTG1 = new javax.swing.JComboBox<>();
        cboMaNXB1 = new javax.swing.JComboBox<>();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSach = new javax.swing.JTable();
        jLabel30 = new javax.swing.JLabel();
        txtSoLuongCon1 = new javax.swing.JTextField();
        btnReset1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbTacGia = new javax.swing.JTable();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtMaTG1 = new javax.swing.JTextField();
        txtTenTG = new javax.swing.JTextField();
        btnSua2 = new javax.swing.JButton();
        btnThem2 = new javax.swing.JButton();
        btnXoa2 = new javax.swing.JButton();
        btnReset2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbNXB = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtMaNXB1 = new javax.swing.JTextField();
        txtTenNXB1 = new javax.swing.JTextField();
        btnSua3 = new javax.swing.JButton();
        btnThem3 = new javax.swing.JButton();
        btnXoa3 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtSDT = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        btnReset3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tbTaiKhoan2 = new javax.swing.JTable();
        jPanel16 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        usernameKH = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        reset = new javax.swing.JButton();
        delTkUser = new javax.swing.JButton();
        btnThemtkUser = new javax.swing.JButton();
        cboxShowPass = new javax.swing.JCheckBox();
        passwordKH = new javax.swing.JPasswordField();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbTaiKhoan1 = new javax.swing.JTable();
        btnThemTK = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        usernameAdmin = new javax.swing.JTextPane();
        jLabel21 = new javax.swing.JLabel();
        btnHuyTK = new javax.swing.JButton();
        btnSuaTK = new javax.swing.JButton();
        passwordAdmin = new javax.swing.JPasswordField();
        confirmPass = new javax.swing.JPasswordField();
        jLabel33 = new javax.swing.JLabel();
        cboxShowPass1 = new javax.swing.JCheckBox();
        cboxShowPass2 = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbDSDaBan = new javax.swing.JTable();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        sum = new javax.swing.JTextField();
        totalRevenue = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtNgayGiaoDich = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbHoaDon = new javax.swing.JTable();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 204));
        setMinimumSize(new java.awt.Dimension(1024, 700));
        setPreferredSize(new java.awt.Dimension(1100, 700));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ SÁCH");

        AdminTabPane.setBackground(new java.awt.Color(255, 255, 153));
        AdminTabPane.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);
        AdminTabPane.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AdminTabPane.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                AdminTabPaneStateChanged(evt);
            }
        });

        jPanel2.setOpaque(false);

        jPanel8.setBackground(new java.awt.Color(204, 255, 255));
        jPanel8.setForeground(new java.awt.Color(0, 0, 204));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 162));
        jLabel2.setText("Tìm kiếm theo tên:");

        txtSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnSearch.setText("Tìm kiếm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 162));
        jLabel3.setText("Mã sách");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 162));
        jLabel4.setText("Tên sách");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 162));
        jLabel5.setText("Năm xuất bản");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 162));
        jLabel6.setText("Đơn giá");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 162));
        jLabel7.setText("Mã tác giả");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 162));
        jLabel8.setText("Số trang");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 162));
        jLabel9.setText("Mã nhà xuất bản");

        txtMaSach1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTenSach1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNamXB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtSoTrang1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDonGia1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        cboMaTG1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboMaTG1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cboMaNXB1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboMaNXB1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        tbSach.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));
        tbSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã sách", "Tên sách", "Năm xuất bản", "Số trang", "Mã tác giả", "Tên tác giả", "Đơn giá", "Số lượng"
            }
        ));
        tbSach.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        tbSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSach);

        jLabel30.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(0, 0, 162));
        jLabel30.setText("Số lượng còn");

        txtSoLuongCon1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btnReset1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnReset1.setText("Tải lại");
        btnReset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cboMaTG1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMaNXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49))))
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReset1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(147, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSoTrang1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtNamXB1))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtMaSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel8Layout.createSequentialGroup()
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtTenSach1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDonGia1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuongCon1, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addComponent(jScrollPane1)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch)
                    .addComponent(btnReset1))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMaSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cboMaTG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenSach1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(cboMaNXB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNamXB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtDonGia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoTrang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel30)
                    .addComponent(txtSoLuongCon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnSua)
                        .addComponent(btnXoa))
                    .addComponent(btnThem))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        AdminTabPane.addTab("Quản lý sách", jPanel2);

        tbTacGia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã tác giả", "Tên tác giả"
            }
        ));
        tbTacGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTacGiaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbTacGia);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Mã tác giả: ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Tên tác giả: ");

        txtMaTG1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTenTG.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtTenTG.setFocusable(true);
        txtTenTG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenTGActionPerformed(evt);
            }
        });

        btnSua2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSua2.setText("Sửa");
        btnSua2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        btnSua2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua2ActionPerformed(evt);
            }
        });

        btnThem2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThem2.setText("Thêm");
        btnThem2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        btnThem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem2ActionPerformed(evt);
            }
        });

        btnXoa2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoa2.setText("Xóa");
        btnXoa2.setActionCommand("");
        btnXoa2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.darkGray));
        btnXoa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa2ActionPerformed(evt);
            }
        });

        btnReset2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset2.setText("Reset");
        btnReset2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        btnReset2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaTG1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnSua2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnReset2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnXoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtMaTG1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(129, 129, 129)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReset2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        AdminTabPane.addTab("Quản lý tác giả", jPanel3);

        tbNXB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbNXB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã nhà xuất bản", "Tên nhà xuất bản", "Địa chỉ", "SĐT"
            }
        ));
        tbNXB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbNXBMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbNXB);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 30, Short.MAX_VALUE))
        );

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Mã NXB: ");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Tên NXB: ");

        txtMaNXB1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtTenNXB1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnSua3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnSua3.setText("Sửa");
        btnSua3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        btnSua3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSua3ActionPerformed(evt);
            }
        });

        btnThem3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThem3.setText("Thêm");
        btnThem3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        btnThem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThem3ActionPerformed(evt);
            }
        });

        btnXoa3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnXoa3.setText("Xóa");
        btnXoa3.setActionCommand("");
        btnXoa3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.red, java.awt.Color.darkGray));
        btnXoa3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoa3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Địa chỉ:");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("SĐT:");

        txtSDT.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        txtDiaChi.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnReset3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnReset3.setText("Reset");
        btnReset3.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.darkGray, java.awt.Color.lightGray));
        btnReset3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReset3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtMaNXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNXB1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSDT, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnXoa3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSua3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnThem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                        .addComponent(btnReset3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtMaNXB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtTenNXB1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                .addComponent(btnThem3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnSua3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(btnXoa3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnReset3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        AdminTabPane.addTab("Quản lý nhà xuất bản", jPanel4);

        tbTaiKhoan2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đăng nhập", "Mật khẩu"
            }
        ));
        tbTaiKhoan2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTaiKhoan2MouseClicked(evt);
            }
        });
        jScrollPane7.setViewportView(tbTaiKhoan2);

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 0, 204));
        jLabel22.setText("Tài khoản khách hàng");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Tên đăng nhập:");

        usernameKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Mật khẩu:");

        reset.setBackground(new java.awt.Color(153, 153, 255));
        reset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 0, 0));
        reset.setText("Hủy bỏ");
        reset.setBorder(new javax.swing.border.MatteBorder(null));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        delTkUser.setBackground(new java.awt.Color(153, 153, 255));
        delTkUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delTkUser.setForeground(new java.awt.Color(255, 0, 0));
        delTkUser.setText("Xóa");
        delTkUser.setBorder(new javax.swing.border.MatteBorder(null));
        delTkUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delTkUserActionPerformed(evt);
            }
        });

        btnThemtkUser.setBackground(new java.awt.Color(153, 153, 255));
        btnThemtkUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemtkUser.setForeground(new java.awt.Color(255, 0, 0));
        btnThemtkUser.setText("Thêm");
        btnThemtkUser.setBorder(new javax.swing.border.MatteBorder(null));
        btnThemtkUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemtkUserActionPerformed(evt);
            }
        });

        cboxShowPass.setText("Hiện mật khẩu");
        cboxShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxShowPassActionPerformed(evt);
            }
        });

        passwordKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(delTkUser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboxShowPass)
                            .addComponent(usernameKH, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(passwordKH))
                        .addContainerGap(105, Short.MAX_VALUE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnThemtkUser, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(usernameKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(passwordKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxShowPass)
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delTkUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThemtkUser, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(196, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Khách hàng", jPanel14);

        tbTaiKhoan1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên đăng nhập", "Mật khẩu"
            }
        ));
        tbTaiKhoan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbTaiKhoan1MouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tbTaiKhoan1);

        jLabel19.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 0, 162));
        jLabel19.setText("Tên tài khoản mới: ");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 0, 162));
        jLabel20.setText("Mật khẩu mới:");

        jScrollPane6.setViewportView(usernameAdmin);

        jLabel21.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 162));
        jLabel21.setText("Xác nhận mật khẩu mới:");

        btnHuyTK.setBackground(new java.awt.Color(153, 153, 255));
        btnHuyTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnHuyTK.setForeground(new java.awt.Color(255, 0, 0));
        btnHuyTK.setText("Hủy");
        btnHuyTK.setBorder(new javax.swing.border.MatteBorder(null));
        btnHuyTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyTKActionPerformed(evt);
            }
        });

        btnSuaTK.setBackground(new java.awt.Color(153, 153, 255));
        btnSuaTK.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnSuaTK.setForeground(new java.awt.Color(255, 0, 0));
        btnSuaTK.setText("Lưu");
        btnSuaTK.setBorder(new javax.swing.border.MatteBorder(null));
        btnSuaTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaTKActionPerformed(evt);
            }
        });

        jLabel33.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 51, 51));
        jLabel33.setText("Thay đổi thông tin tài khoản");

        cboxShowPass1.setText("Hiện mật khẩu");
        cboxShowPass1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxShowPass1ActionPerformed(evt);
            }
        });

        cboxShowPass2.setText("Hiện xác nhận mật khẩu");
        cboxShowPass2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxShowPass2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout btnThemTKLayout = new javax.swing.GroupLayout(btnThemTK);
        btnThemTK.setLayout(btnThemTKLayout);
        btnThemTKLayout.setHorizontalGroup(
            btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemTKLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(137, 137, 137))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemTKLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cboxShowPass1)
                    .addGroup(btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane6)
                        .addComponent(passwordAdmin)
                        .addComponent(confirmPass, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                    .addComponent(cboxShowPass2))
                .addGap(52, 52, 52))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnThemTKLayout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(btnSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuyTK, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(112, 112, 112))
        );
        btnThemTKLayout.setVerticalGroup(
            btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnThemTKLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(63, 63, 63)
                .addGroup(btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(passwordAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cboxShowPass1)
                .addGap(29, 29, 29)
                .addGroup(btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(confirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cboxShowPass2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(btnThemTKLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnHuyTK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSuaTK, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThemTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5)
                    .addComponent(btnThemTK, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Quản lý", jPanel15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        AdminTabPane.addTab("Quản lý tài khoản", jPanel1);

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel16.setText("Danh sách sách đã bán");

        tbDSDaBan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã hóa đơn", "Mã sách", "Số lượng", "Đơn giá", "Thành tiền"
            }
        ));
        jScrollPane4.setViewportView(tbDSDaBan);

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setText("Tổng số sách đã bán:");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Tổng doanh thu:");

        sum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sum.setFocusable(false);

        totalRevenue.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        totalRevenue.setFocusable(false);

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 871, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(27, 27, 27)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(totalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(193, 193, 193))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(totalRevenue, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        AdminTabPane.addTab("Xem thông tin doanh thu", jPanel6);

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Mã hóa đơn");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Tên khách hàng");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Ngày giao dịch");

        txtMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtNgayGiaoDich.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNgayGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        tbHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã hóa đơn", "Tên khách hàng", "Ngày giao dịch", "Mã sách", "Số lượng", "Thành tiền"
            }
        ));
        tbHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHoaDonMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbHoaDon);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 1041, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        AdminTabPane.addTab("Xem thông tin hóa đơn", jPanel5);

        btnLogOut.setText("Đăng xuất");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogOut)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AdminTabPane)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnLogOut))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AdminTabPane, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel1.getAccessibleContext().setAccessibleName("QUẢN LÝ ");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminTabPaneStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_AdminTabPaneStateChanged
        // TODO add your handling code here:
        int index = AdminTabPane.getSelectedIndex();
    }//GEN-LAST:event_AdminTabPaneStateChanged

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        AutomaticallyClosedMsgBox(2000, "Đang đăng xuất.\nXin hãy đợi...");
        this.dispose();
        DangNhapUI dn = new DangNhapUI("Quản lý chung cư");
        dn.showWindow();
    }//GEN-LAST:event_btnLogOutActionPerformed

    // Quản lý sách
    private void tbSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachMouseClicked
        // TODO add your handling code here:
        show_Row_tbSach();
    }//GEN-LAST:event_tbSachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        
        try{
            Sach newBook = new Sach();
            newBook.setMaSach(txtMaSach1.getText());
            newBook.setTenSach(txtTenSach1.getText());
            newBook.setNamXuatBan(Integer.parseInt(txtNamXB1.getText()));
            newBook.setSoTrang(Integer.parseInt(txtSoTrang1.getText()));
            newBook.setMaTG(cboMaTG1.getSelectedItem().toString());
            newBook.setMaNXB(cboMaNXB1.getSelectedItem().toString());
            newBook.setDonGia(Float.parseFloat(txtDonGia1.getText()));
            newBook.setSoLuongCon(Integer.parseInt(txtSoLuongCon1.getText()));
            if(SachDAL.insert(SachDAL.show(),newBook)){
                JOptionPane.showMessageDialog(null,"Thêm sách thành công!");
                try {
                    show_Sach();
                } catch (SQLException ex) {
                    Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            delJtextFieldTbSach();
        }
        catch(HeadlessException | IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        try{
            Sach setBook = new Sach();
            setBook.setMaSach(txtMaSach1.getText());
            setBook.setTenSach(txtTenSach1.getText());
            setBook.setNamXuatBan(Integer.parseInt(txtNamXB1.getText()));
            setBook.setSoTrang(Integer.parseInt(txtSoTrang1.getText()));
            setBook.setMaTG(cboMaTG1.getSelectedItem().toString());
            setBook.setMaNXB(cboMaNXB1.getSelectedItem().toString());
            setBook.setDonGia(Float.parseFloat(txtDonGia1.getText()));
            setBook.setSoLuongCon(Integer.parseInt(txtSoLuongCon1.getText()));
            int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn sửa?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if(SachDAL.update(SachDAL.show(),setBook)){
                    JOptionPane.showMessageDialog(null,"Sửa sách thành công!");
                    try {
                        show_Sach();
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else {
                    JOptionPane.showMessageDialog(null,"Mã sách không tồn tại!");
                }
                delJtextFieldTbSach();
            } 
            
        }
        catch(HeadlessException | IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        try{
            if(tbSach.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(rootPane,"Hãy chọn một dòng để xóa");
            } else if(SachDAL.show().size() == 0){
                JOptionPane.showMessageDialog(rootPane,"Không có thông tin để xóa");
            }
            else{
                Sach delBook = new Sach();
                delBook.setMaSach(txtMaSach1.getText());
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    SachDAL.delete(SachDAL.show(), delBook);
                    model = (DefaultTableModel) tbSach.getModel();
                    model.setRowCount(0);
                    try {
                        show_Sach();
                    } catch (SQLException ex) {
                        Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    delJtextFieldTbSach();
                } 
                
            }
            
        }
        catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tbSach.getModel();
        model.setRowCount(0);
        int i=1;
        for(Sach item:SachDAL.show()){
            if(item.getTenSach().equalsIgnoreCase(txtSearch.getText())){
                model.addRow(new Object[]{
                    i++,
                    item.getMaSach(),
                    item.getTenSach(),
                    item.getNamXuatBan(),
                    item.getSoTrang(),
                    item.getMaTG(),
                    item.getMaNXB(),
                    item.getDonGia(),
                    item.getSoLuongCon()
                });
            }
        }
        
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbNXB.setDefaultRenderer(Object.class, renderer);
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnReset1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset1ActionPerformed
        try {
            // TODO add your handling code here:
            show_Sach();
        } catch (SQLException ex) {
            Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReset1ActionPerformed

    //cài đặt bảng
    private void tbTacGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTacGiaMouseClicked
        try {
            // TODO add your handling code here:
            show_Row_tbTacGia();
        } catch (SQLException ex) {
            Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbTacGiaMouseClicked

    private void tbNXBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbNXBMouseClicked
        // TODO add your handling code here:
        show_Row_tbNXB();
    }//GEN-LAST:event_tbNXBMouseClicked

    private void cboxShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxShowPassActionPerformed
        // TODO add your handling code here:
        if(cboxShowPass.isSelected()){
            passwordKH.setEchoChar((char)0);
        }
        else{
            passwordKH.setEchoChar('*');
        }
    }//GEN-LAST:event_cboxShowPassActionPerformed

    private void tbTaiKhoan2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTaiKhoan2MouseClicked
        // TODO add your handling code here:
        show_Row_tbTaiKhoanUser();
    }//GEN-LAST:event_tbTaiKhoan2MouseClicked

    private void tbTaiKhoan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbTaiKhoan1MouseClicked
        // TODO add your handling code here:
        show_Row_tbTaiKhoanAdmin();
    }//GEN-LAST:event_tbTaiKhoan1MouseClicked

    private void cboxShowPass1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxShowPass1ActionPerformed
        // TODO add your handling code here:
        if(cboxShowPass1.isSelected()){
            passwordAdmin.setEchoChar((char)0);
        }
        else{
            passwordAdmin.setEchoChar('*');
        }
    }//GEN-LAST:event_cboxShowPass1ActionPerformed

    private void cboxShowPass2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxShowPass2ActionPerformed
        // TODO add your handling code here:
        if(cboxShowPass2.isSelected()){
            confirmPass.setEchoChar((char)0);
        }
        else{
            confirmPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cboxShowPass2ActionPerformed

    //Quản lý TacGia
    private void btnThem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem2ActionPerformed
        // TODO add your handling code here:
        try{
            TacGia newTG = new TacGia();
            newTG.setMaTG(txtMaTG1.getText());
            newTG.setTenTG(txtTenTG.getText());
            
            try {
                if(TacGiaDAL.insert(TacGiaDAL.show(),newTG)){
                    JOptionPane.showMessageDialog(null,"Thêm tác giả thành công!");
                    show_TacGia();
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            delJtextFieldTbTacGia();
            
        }
        catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnThem2ActionPerformed

    private void btnSua2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua2ActionPerformed
        // TODO add your handling code here:
        try{
            TacGia setTacGia = new TacGia();
            setTacGia.setMaTG(txtMaTG1.getText());
            setTacGia.setTenTG(txtTenTG.getText());
            int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn sửa?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                try {
                    if(TacGiaDAL.update(TacGiaDAL.show(),setTacGia)){
                        JOptionPane.showMessageDialog(AdminTabPane,"Sửa tác giả thành công!");
                        show_TacGia();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Mã tác giả không tồn tại!");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
                }
                delJtextFieldTbTacGia();
            } 
            
        }
        catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnSua2ActionPerformed

    private void btnXoa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa2ActionPerformed
        // TODO add your handling code here:
        try{
            if(tbTacGia.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(rootPane,"Hãy chọn một dòng để xóa");
            } else try {
                if(TacGiaDAL.show().size() == 0){
                    JOptionPane.showMessageDialog(rootPane,"Không có thông tin để xóa");
                }
                else{
                    TacGia delTG = new TacGia();
                    delTG.setMaTG(txtMaTG1.getText());
                    int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        TacGiaDAL.delete(TacGiaDAL.show(), delTG);
                        model = (DefaultTableModel) tbTacGia.getModel();
                        model.setRowCount(0);
                        show_TacGia();
                        delJtextFieldTbTacGia();
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnXoa2ActionPerformed

    private void btnReset2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset2ActionPerformed
        // TODO add your handling code here:
        delJtextFieldTbTacGia();
    }//GEN-LAST:event_btnReset2ActionPerformed

    //Quản lý NhaXuatBan
    private void btnThem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThem3ActionPerformed
        // TODO add your handling code here:
        try{
            NhaXuatBan newNXB = new NhaXuatBan();
            newNXB.setMaNXB(txtMaNXB1.getText());
            newNXB.setTenNXB(txtTenNXB1.getText());
            newNXB.setDiaChi(txtDiaChi.getText());
            newNXB.setSDT(txtSDT.getText());
            if(NhaXuatBanDAL.insert(NhaXuatBanDAL.show(),newNXB)){
                JOptionPane.showMessageDialog(null,"Thêm nhà xuất bản thành công!");
                show_NhaXuatBan();
            }
            delJtextFieldTbNXB();
            
        }
        catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnThem3ActionPerformed

    private void btnSua3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSua3ActionPerformed
        // TODO add your handling code here:
        try{
            NhaXuatBan setNXB = new NhaXuatBan();
            setNXB.setMaNXB(txtMaNXB1.getText());
            setNXB.setTenNXB(txtTenNXB1.getText());
            setNXB.setDiaChi(txtDiaChi.getText());
            setNXB.setSDT(txtSDT.getText());
            int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn sửa?", "Thông báo", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                if(NhaXuatBanDAL.update(NhaXuatBanDAL.show(),setNXB)){
                    JOptionPane.showMessageDialog(AdminTabPane,"Sửa nhà xuất bản thành công!");
                    show_NhaXuatBan();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Mã nhà xuất bản không tồn tại!");
                }
                delJtextFieldTbNXB();
            } 
            
        }
        catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnSua3ActionPerformed

    private void btnXoa3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoa3ActionPerformed
        // TODO add your handling code here:
        try{
            if(tbNXB.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(rootPane,"Hãy chọn một dòng để xóa");
            } else if(NhaXuatBanDAL.show().size() == 0){
                JOptionPane.showMessageDialog(rootPane,"Không có thông tin để xóa");
            }
            else{
                NhaXuatBan delNXB = new NhaXuatBan();
                delNXB.setMaNXB(txtMaNXB1.getText());
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    NhaXuatBanDAL.delete(NhaXuatBanDAL.show(), delNXB);
                    model = (DefaultTableModel) tbTacGia.getModel();
                    model.setRowCount(0);
                    show_NhaXuatBan();
                    delJtextFieldTbNXB();
                } 
                
            }
            
        }
        catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnXoa3ActionPerformed

    private void btnReset3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReset3ActionPerformed
        // TODO add your handling code here:
        delJtextFieldTbNXB();
    }//GEN-LAST:event_btnReset3ActionPerformed

    //Quản lý Tài khoản Admin
    private void btnSuaTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaTKActionPerformed
        // TODO add your handling code here:
        try{
            TaiKhoan setTK = new TaiKhoan();
            setTK.setMaTaiKhoan(usernameAdmin.getText());
            char[] pf = passwordAdmin.getPassword();
            String value = new String(pf);
            char[] confirmpf = confirmPass.getPassword();
            String confirmValue = new String(confirmpf);
            setTK.setMatKhau(value);
            setTK.setVaiTro("Admin");
            if(value.equals(confirmValue)){
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn sửa?", "Thông báo", JOptionPane.YES_NO_OPTION);
            
                if (reply == JOptionPane.YES_OPTION) {
                    if(TaiKhoanDAL.update(TaiKhoanDAL.show(),setTK)){
                        JOptionPane.showMessageDialog(AdminTabPane,"Sửa tài khoản thành công!");
                        show_TaiKhoanAdmin();
                    }
                    else {
                        JOptionPane.showMessageDialog(null,"Mã tài khoản không tồn tại!");
                    }
            }
            
                delJtextFieldTbTKAmin();
            } 
            else{
                JOptionPane.showMessageDialog(null,"Mật khẩu xác nhận không chính xác!");
            }
            
        }
        catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnSuaTKActionPerformed

    private void btnHuyTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyTKActionPerformed
        // TODO add your handling code here:
        delJtextFieldTbTKAmin();
    }//GEN-LAST:event_btnHuyTKActionPerformed

    private void btnThemtkUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemtkUserActionPerformed
        // TODO add your handling code here:
        try{
            TaiKhoan newTK = new TaiKhoan();
            newTK.setMaTaiKhoan(usernameKH.getText());
            char[] pf = passwordKH.getPassword();
            String value = new String(pf);
            newTK.setMatKhau(value);
            newTK.setVaiTro("User");
            if(TaiKhoanDAL.insert(TaiKhoanDAL.show(),newTK)){
                JOptionPane.showMessageDialog(null,"Thêm tai khoản user thành công!");
                show_TaiKhoanUser();
            }
            delJtextFieldTbTKUser();
            
        }
        catch(HeadlessException | IOException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnThemtkUserActionPerformed

    private void delTkUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delTkUserActionPerformed
        // TODO add your handling code here:
        try{
            if(tbTaiKhoan2.getSelectedRow() == -1){
                JOptionPane.showMessageDialog(rootPane,"Hãy chọn một dòng để xóa");
            } else if(TaiKhoanDAL.showUser().size() == 0){
                JOptionPane.showMessageDialog(rootPane,"Không có thông tin để xóa");
            }
            else{
                TaiKhoan delTK = new TaiKhoan();
                delTK.setMaTaiKhoan(usernameKH.getText());
                int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                if (reply == JOptionPane.YES_OPTION) {
                    TaiKhoanDAL.delete(TaiKhoanDAL.show(), delTK);
                    model = (DefaultTableModel) tbTaiKhoan2.getModel();
                    model.setRowCount(0);
                    show_TaiKhoanUser();
                    delJtextFieldTbTKUser();
                } 
                
            }
            
        }
        catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_delTkUserActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        delJtextFieldTbTKUser();
    }//GEN-LAST:event_resetActionPerformed

    private void tbHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHoaDonMouseClicked
        try {
            // TODO add your handling code here:
            show_Row_tbHoaDon();
        } catch (SQLException ex) {
            Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tbHoaDonMouseClicked

    private void txtTenTGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenTGActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenTGActionPerformed

    
    
    
    public void AutomaticallyClosedMsgBox(long time, String text) {
        JOptionPane jop = new JOptionPane();
        jop.setMessageType(JOptionPane.INFORMATION_MESSAGE);
        jop.setMessage(text);
        JDialog dialog = jop.createDialog(null, "Thông báo");

        // Set timer
        new Thread(() -> {
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            dialog.dispose();
        }).start();

        dialog.setVisible(true);
    }
    
    //reset textField
    public void delJtextFieldTbSach(){
        txtMaSach1.setText("");
        txtTenSach1.setText("");
        txtNamXB1.setText("");
        txtSoTrang1.setText("");
        cboMaTG1.setSelectedIndex(0);
        cboMaNXB1.setSelectedIndex(0);
        txtDonGia1.setText("");
        txtSoLuongCon1.setText("");
    }
    public void delJtextFieldTbTacGia(){
        txtMaTG1.setText("");
        txtTenTG.setText("");
        
    }
    public void delJtextFieldTbNXB(){
        txtMaNXB1.setText("");
        txtTenNXB1.setText("");
        txtDiaChi.setText("");
        txtSDT.setText("");
        
    }
    public void delJtextFieldTbTKAmin(){
        usernameAdmin.setText("");
        passwordAdmin.setText("");
        confirmPass.setText("");
    }
    public void delJtextFieldTbTKUser(){
        usernameKH.setText("");
        passwordKH.setText("");
    }
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {
                    new AdminUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane AdminTabPane;
    private javax.swing.JButton btnHuyTK;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnReset1;
    private javax.swing.JButton btnReset2;
    private javax.swing.JButton btnReset3;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnSua2;
    private javax.swing.JButton btnSua3;
    private javax.swing.JButton btnSuaTK;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThem2;
    private javax.swing.JButton btnThem3;
    private javax.swing.JPanel btnThemTK;
    private javax.swing.JButton btnThemtkUser;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXoa2;
    private javax.swing.JButton btnXoa3;
    private javax.swing.JComboBox<String> cboMaNXB1;
    private javax.swing.JComboBox<String> cboMaTG1;
    private javax.swing.JCheckBox cboxShowPass;
    private javax.swing.JCheckBox cboxShowPass1;
    private javax.swing.JCheckBox cboxShowPass2;
    private javax.swing.JPasswordField confirmPass;
    private javax.swing.JButton delTkUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPasswordField passwordAdmin;
    private javax.swing.JPasswordField passwordKH;
    private javax.swing.JButton reset;
    private javax.swing.JTextField sum;
    private javax.swing.JTable tbDSDaBan;
    private javax.swing.JTable tbHoaDon;
    private javax.swing.JTable tbNXB;
    private javax.swing.JTable tbSach;
    private javax.swing.JTable tbTacGia;
    private javax.swing.JTable tbTaiKhoan1;
    private javax.swing.JTable tbTaiKhoan2;
    private javax.swing.JTextField totalRevenue;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtDonGia1;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtMaNXB1;
    private javax.swing.JTextField txtMaSach1;
    private javax.swing.JTextField txtMaTG1;
    private javax.swing.JTextField txtNamXB1;
    private javax.swing.JTextField txtNgayGiaoDich;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoLuongCon1;
    private javax.swing.JTextField txtSoTrang1;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenNXB1;
    private javax.swing.JTextField txtTenSach1;
    private javax.swing.JTextField txtTenTG;
    private javax.swing.JTextPane usernameAdmin;
    private javax.swing.JTextField usernameKH;
    // End of variables declaration//GEN-END:variables
}
