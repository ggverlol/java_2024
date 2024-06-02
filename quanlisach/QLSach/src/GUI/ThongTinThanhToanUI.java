/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import BLL.*;
import DAL.*;
import Entities.*;
import Tools.WriteDataToDatabase;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class ThongTinThanhToanUI extends javax.swing.JFrame {

    private String maHD, tenKH, date = String.valueOf(java.time.LocalDate.now());
    ArrayList<SachTrongGioHang> list ;
    int stt;
    public ThongTinThanhToanUI(){
        initComponents();
    }
    public ThongTinThanhToanUI(String TenKH, ArrayList<SachTrongGioHang> a) throws SQLException {
        initComponents();
        
        list = a;
        tenKH = TenKH;
        stt = (list!=null)?list.size()+1:1;
        maHD = "HD"+String.valueOf(stt);
        txtMaHoaDon.setText(maHD);
        txtTenKH.setText(TenKH);
        txtNgayGD.setText(date);
        txtSoLuong.setText(String.valueOf(SachTrongGioHangDAL.showSoLuong(TenKH)));
        txtThanhTien.setText(String.valueOf(SachTrongGioHangDAL.showthanhTien(TenKH)));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtMaHoaDon = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtNgayGD = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtThanhTien = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel8.setBackground(new java.awt.Color(204, 255, 204));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(83, 58, 255));
        jLabel8.setText("Thông tin giao dịch");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Mã hóa đơn: ");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tên khách hàng:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Số lượng mua:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setText("Ngày giao dịch");

        txtMaHoaDon.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtMaHoaDon.setFocusable(false);

        txtTenKH.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTenKH.setFocusable(false);

        txtNgayGD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNgayGD.setFocusable(false);

        txtSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtSoLuong.setFocusable(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel13.setText("Thành tiền:");

        txtThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtThanhTien.setFocusable(false);

        btnConfirm.setText("Xác nhận");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnHuy.setText("Hủy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNgayGD, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHuy)
                .addGap(143, 143, 143))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel8)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMaHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNgayGD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnHuy))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UserUI dn = null;
        try {
            dn = new UserUI();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        dn.showWindow();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        // TODO add your handling code here:
        HoaDon a =new HoaDon();
        a.setMaHD(maHD);
        a.setTenKH(tenKH);
        a.setNgayGiaoDich(date);
        a.setSachMua(list);
        try {
            a.setSoLuong(SachTrongGioHangDAL.showSoLuong(tenKH));
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            a.setThanhTien(SachTrongGioHangDAL.showthanhTien(tenKH));
        } catch (SQLException ex) {
            Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(Level.SEVERE, null, ex);
        }
        int reply = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn thanh toán?", "Thông báo", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            try {
                try {
                    HoaDonDAL.insert(HoaDonDAL.show(), a);
                } catch (SQLException ex) {
                    Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (IOException ex) {
                ex.printStackTrace();
                Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(null,"Thanh toán thành công!");
            try {
                xoaSachTrongGio(tenKH);
            } catch (IOException ex) {
                Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
            UserUI dn = null;
            try {
                dn = new UserUI();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            dn.showWindow();
        }
        else{
            txtMaHoaDon.setText("");
            txtTenKH.setText("");
            txtNgayGD.setText("");
            txtSoLuong.setText("");
            txtThanhTien.setText("");
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void xoaSachTrongGio(String tenKH) throws IOException{
        WriteDataToDatabase.xoaSachTrongGio(tenKH);
    }
    public void showWindow() {
            this.setSize(600, 500);
            this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
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
            java.util.logging.Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongTinThanhToanUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongTinThanhToanUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnHuy;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMaHoaDon;
    private javax.swing.JTextField txtNgayGD;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtThanhTien;
    // End of variables declaration//GEN-END:variables
}
