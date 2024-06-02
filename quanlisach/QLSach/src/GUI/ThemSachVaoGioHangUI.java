/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;


import BLL.*;
import DAL.*;
import Entities.Sach;
import Entities.SachTrongGioHang;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ThemSachVaoGioHangUI extends javax.swing.JFrame {

    
    public ThemSachVaoGioHangUI() {
        initComponents();
    }
    
    static Sach newSach;
    
    public ThemSachVaoGioHangUI(String maTaiKhoan, Sach sachDaChon, int soLuong) throws SQLException {
        initComponents();
        this.showTenSach.setText(sachDaChon.getTenSach());
        newSach = sachDaChon;
        this.showNamXB.setText(String.valueOf(sachDaChon.getNamXuatBan()));
        this.showSoTrang.setText(String.valueOf(sachDaChon.getSoTrang()));
        this.showNXB.setText((String)NhaXuatBanDAL.GetTenNXB(sachDaChon.getMaNXB()));
        this.showTenTG.setText(TacGiaDAL.GetTenTG(sachDaChon.getMaTG()));
        
        this.showDonGia.setText(String.valueOf(sachDaChon.getDonGia()));
        this.showSoLuong.setText(String.valueOf(soLuong));
        
        this.showThanhTien.setText(String.valueOf(soLuong * sachDaChon.getDonGia()));
    }

    
    public void showWindow() {
        this.setSize(711, 500);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        showTenSach = new javax.swing.JTextField();
        showNamXB = new javax.swing.JTextField();
        showSoTrang = new javax.swing.JTextField();
        showTenTG = new javax.swing.JTextField();
        showNXB = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnThemGio = new javax.swing.JButton();
        btnExit1 = new javax.swing.JButton();
        showDonGia = new javax.swing.JTextField();
        showSoLuong = new javax.swing.JTextField();
        showThanhTien = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("Thông tin sản phẩm");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tên sách");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Số trang");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Năm xuất bản");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Tên tác giả");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Tên NXB");

        showTenSach.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showTenSach.setFocusable(false);

        showNamXB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showNamXB.setFocusable(false);

        showSoTrang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showSoTrang.setFocusable(false);

        showTenTG.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showTenTG.setFocusable(false);

        showNXB.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showNXB.setFocusable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showNXB, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(0, 16, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(showTenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(showNamXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(showSoTrang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(showTenTG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(showNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 0, 51));
        jLabel7.setText("Thêm vào giỏ hàng");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Đơn giá");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Số lượng");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Tổng");

        btnThemGio.setBackground(new java.awt.Color(102, 255, 0));
        btnThemGio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnThemGio.setForeground(new java.awt.Color(255, 0, 0));
        btnThemGio.setText("Thêm vào giỏ");
        btnThemGio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemGioActionPerformed(evt);
            }
        });

        btnExit1.setBackground(new java.awt.Color(102, 255, 0));
        btnExit1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnExit1.setForeground(new java.awt.Color(255, 0, 0));
        btnExit1.setText("Thoát");
        btnExit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExit1ActionPerformed(evt);
            }
        });

        showDonGia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showDonGia.setFocusable(false);

        showSoLuong.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showSoLuong.setFocusable(false);

        showThanhTien.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        showThanhTien.setFocusable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(63, 63, 63))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(24, 24, 24)
                        .addComponent(showDonGia))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(41, 41, 41)
                        .addComponent(showThanhTien))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(showSoLuong))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnThemGio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addComponent(btnExit1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel7)
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(showDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(showSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(showThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThemGio)
                    .addComponent(btnExit1))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExit1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        UserUI dn = null;
        try {
            dn = new UserUI();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        dn.showWindow();
    }//GEN-LAST:event_btnExit1ActionPerformed

    private void btnThemGioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemGioActionPerformed
        // TODO add your handling code here:
        try{
            this.dispose();
            SachTrongGioHang a = new SachTrongGioHang();
            a.setMaTaiKhoan(DangNhapUI.username);
            a.setSachDaChon(newSach);
            a.setSoLuong(Integer.parseInt(showSoLuong.getText()));
            SachTrongGioHangDAL.insert(SachTrongGioHangDAL.show(DangNhapUI.username), a);
            UserUI dn = new UserUI();
            dn.showWindow();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Có lỗi xảy ra: "+e.getMessage());
        }
    }//GEN-LAST:event_btnThemGioActionPerformed

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
            java.util.logging.Logger.getLogger(ThemSachVaoGioHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSachVaoGioHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSachVaoGioHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSachVaoGioHangUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSachVaoGioHangUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit1;
    private javax.swing.JButton btnThemGio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField showDonGia;
    private javax.swing.JTextField showNXB;
    private javax.swing.JTextField showNamXB;
    private javax.swing.JTextField showSoLuong;
    private javax.swing.JTextField showSoTrang;
    private javax.swing.JTextField showTenSach;
    private javax.swing.JTextField showTenTG;
    private javax.swing.JTextField showThanhTien;
    // End of variables declaration//GEN-END:variables
}
