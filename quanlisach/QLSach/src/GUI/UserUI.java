/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.*;
import Entities.*;
import DAL.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;


public class UserUI extends javax.swing.JFrame {

    
    DefaultTableModel model;
    DefaultTableCellRenderer renderer = new DefaultTableCellRenderer();
    public UserUI() throws SQLException {
        initComponents();
        
        show_Sach();
        show_GioHang();
    }

    public void show_Sach(){
        model = (DefaultTableModel) tbSachUser.getModel();
        tbSachUser.setModel(SachBLL.show());
        
        renderer.setHorizontalAlignment( JLabel.CENTER );
        tbSachUser.setDefaultRenderer(Object.class, renderer);
     
        txtSoLuong.getVisibleRect();
    }
    
    public void show_GioHang() throws SQLException{
        if(SachTrongGioHangDAL.show(DangNhapUI.username)!=null){
            model = (DefaultTableModel) tbGioHang.getModel();
        
        tbGioHang.setModel(SachTrongGioHangBLL.show(DangNhapUI.username));
        }
        
        
        renderer.setHorizontalAlignment( JLabel.CENTER );
        
    }
    
    public void show_Row(){
        int i = tbSachUser.getSelectedRow();
        txtTenSachUser.setText((String)(tbSachUser.getValueAt(i,2)));
    }
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        btnLogOut = new javax.swing.JButton();
        userInfo = new javax.swing.JButton();
        tabbedPane = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtSearchSach = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbSachUser = new javax.swing.JTable();
        btnThemVaoGio = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtTenSachUser = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        btnResetTB = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbGioHang = new javax.swing.JTable();
        btnThoat = new javax.swing.JButton();
        btnThanhToan = new javax.swing.JButton();
        btnXoaGioHang = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 216, 253));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 106, 122), 2));
        jPanel1.setPreferredSize(new java.awt.Dimension(1300, 81));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 38, 66));
        jLabel1.setText("CỬA HÀNG SÁCH XANH");

        jLabel25.setBackground(new java.awt.Color(153, 255, 255));

        btnLogOut.setText("Log out");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        userInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/employee.jpg"))); // NOI18N
        userInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        userInfo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        userInfo.setMaximumSize(new java.awt.Dimension(40, 40));
        userInfo.setMinimumSize(new java.awt.Dimension(40, 40));
        userInfo.setPreferredSize(new java.awt.Dimension(40, 40));
        userInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel25)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLogOut)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(btnLogOut))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(userInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        tabbedPane.setBackground(new java.awt.Color(255, 255, 102));
        tabbedPane.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setBackground(new java.awt.Color(255, 216, 253));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 58, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Thông tin sách");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tìm kiếm:");

        txtSearchSach.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/search.jpg"))); // NOI18N
        btnSearch.setActionCommand("Search");
        btnSearch.setMaximumSize(new java.awt.Dimension(30, 30));
        btnSearch.setMinimumSize(new java.awt.Dimension(30, 30));
        btnSearch.setPreferredSize(new java.awt.Dimension(30, 30));
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        tbSachUser.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Tên sách", "Năm xuất bản", "Số trang", "Tác giả", "Nhà xuất bản", "Đơn giá", "Số lượng còn"
            }
        ));
        tbSachUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbSachUserMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbSachUser);

        btnThemVaoGio.setBackground(new java.awt.Color(255, 255, 153));
        btnThemVaoGio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemVaoGio.setForeground(new java.awt.Color(0, 0, 255));
        btnThemVaoGio.setText("Thêm vào giỏ");
        btnThemVaoGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemVaoGioActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Tên sách:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Số lượng:");

        txtTenSachUser.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTenSachUser.setFocusable(false);

        txtSoLuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnResetTB.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/resetIcon (1).png"))); // NOI18N
        btnResetTB.setMaximumSize(new java.awt.Dimension(30, 30));
        btnResetTB.setMinimumSize(new java.awt.Dimension(30, 30));
        btnResetTB.setPreferredSize(new java.awt.Dimension(30, 30));
        btnResetTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetTBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearchSach, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnResetTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtTenSachUser, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, Short.MAX_VALUE)
                .addComponent(btnThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(149, 149, 149))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSearchSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnResetTB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemVaoGio, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(txtTenSachUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        tabbedPane.addTab("Sách", jPanel2);

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));

        jLabel4.setBackground(new java.awt.Color(255, 216, 253));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(83, 58, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Giỏ hàng");

        tbGioHang.setModel(SachTrongGioHangBLL.show(DangNhapUI.username));
        jScrollPane2.setViewportView(tbGioHang);

        btnThoat.setBackground(new java.awt.Color(255, 255, 153));
        btnThoat.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat.setForeground(new java.awt.Color(0, 51, 255));
        btnThoat.setText("Thoát");

        btnThanhToan.setBackground(new java.awt.Color(255, 255, 153));
        btnThanhToan.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThanhToan.setForeground(new java.awt.Color(0, 51, 255));
        btnThanhToan.setText("Thanh toán");
        btnThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThanhToanActionPerformed(evt);
            }
        });

        btnXoaGioHang.setBackground(new java.awt.Color(255, 255, 153));
        btnXoaGioHang.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnXoaGioHang.setForeground(new java.awt.Color(0, 51, 255));
        btnXoaGioHang.setText("Xóa");
        btnXoaGioHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaGioHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 1012, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(btnThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnXoaGioHang)
                .addGap(188, 188, 188)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnThanhToan)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnThoat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnXoaGioHang)))
                .addGap(21, 21, 21))
        );

        tabbedPane.addTab("Giỏ hàng", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1016, Short.MAX_VALUE)
                    .addComponent(tabbedPane))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(tabbedPane))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        AutomaticallyClosedMsgBox(2000, "Đang đăng xuất.\nXin hãy đợi...");
        this.dispose();
        DangNhapUI dn = new DangNhapUI("Quản lý sách");
        dn.showWindow();
    }//GEN-LAST:event_btnLogOutActionPerformed

    private void userInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userInfoActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ThongTinUserUI dn = new ThongTinUserUI();
        dn.showWindow();
    }//GEN-LAST:event_userInfoActionPerformed

    private void btnResetTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetTBActionPerformed
        // TODO add your handling code here:
        show_Sach();
        txtSearchSach.setText("");
        txtTenSachUser.setText("");
        txtSoLuong.setText("");

    }//GEN-LAST:event_btnResetTBActionPerformed

    private void btnThemVaoGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemVaoGioActionPerformed
        // TODO add your handling code here:
        try{
            Sach s = SachDAL.GetSach(txtTenSachUser.getText());
            this.dispose();
            if(Integer.parseInt(txtSoLuong.getText()) <= s.getSoLuongCon()) {
                this.dispose();
                ThemSachVaoGioHangUI dn = new ThemSachVaoGioHangUI(DangNhapUI.username,s, Integer.parseInt(txtSoLuong.getText()));
                dn.showWindow();
            }
            else {
                JOptionPane.showMessageDialog(null,"Số lượng vượt quá!");
                this.dispose();
                UserUI dn = new UserUI();
                dn.showWindow();
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Có lỗi: "+e);
        }
    }//GEN-LAST:event_btnThemVaoGioActionPerformed

    private void tbSachUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbSachUserMouseClicked
        // TODO add your handling code here:
        show_Row();
    }//GEN-LAST:event_tbSachUserMouseClicked

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        model = (DefaultTableModel) tbSachUser.getModel();
        model.setRowCount(0);
        int i=1;
        for(Sach item:SachDAL.show()){
            if(item.getTenSach().equalsIgnoreCase(txtSearchSach.getText())){
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
    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThanhToanActionPerformed
        try {
            // TODO add your handling code here:
            this.dispose();
            ThongTinThanhToanUI dn = new ThongTinThanhToanUI(DangNhapUI.username,SachTrongGioHangDAL.show(DangNhapUI.username));
            dn.showWindow();
        } catch (SQLException ex) {
            Logger.getLogger(UserUI.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnThanhToanActionPerformed

    private void btnXoaGioHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaGioHangActionPerformed
        // TODO add your handling code here:
        try{
            int i = tbGioHang.getSelectedRow();
            if(i == -1){
                JOptionPane.showMessageDialog(rootPane,"Hãy chọn một dòng để xóa");
            } else try {
                if(SachTrongGioHangDAL.show(DangNhapUI.username).isEmpty()){
                    JOptionPane.showMessageDialog(rootPane,"Không có sách trong giỏ hàng để xóa");
                }
                else{
                    SachTrongGioHang delBook = SachTrongGioHangDAL.show(DangNhapUI.username).get(i);
                    int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?", "Thông báo", JOptionPane.YES_NO_OPTION);
                    if (reply == JOptionPane.YES_OPTION) {
                        SachTrongGioHangDAL.delete(SachTrongGioHangDAL.show(DangNhapUI.username), delBook);
                        model = (DefaultTableModel) tbGioHang.getModel();
                        model.setRowCount(0);
                        show_GioHang();
                    }
                    
                }
            } catch (SQLException ex) {
                Logger.getLogger(UserUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        catch(IOException | NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnXoaGioHangActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new UserUI().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(UserUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

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
    
    public void showWindow() {
        this.setSize(1024, 713);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnResetTB;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnThanhToan;
    private javax.swing.JButton btnThemVaoGio;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoaGioHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabbedPane;
    private javax.swing.JTable tbGioHang;
    private javax.swing.JTable tbSachUser;
    private javax.swing.JTextField txtSearchSach;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSachUser;
    private javax.swing.JButton userInfo;
    // End of variables declaration//GEN-END:variables
}
