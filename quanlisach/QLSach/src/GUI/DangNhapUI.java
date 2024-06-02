package GUI;

import Entities.TaiKhoan;
import Tools.DatabaseToList;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DangNhapUI extends JFrame {
    JTextField txtTaiKhoan, txtMatKhau;
    JButton btnDangNhap, btnThoat;

    public DangNhapUI(String title) {
        super(title);
        addControl();
        addEvents();
    }

    private void addControl() {

        Container conn = getContentPane();
        JPanel pnMain = new JPanel();
        pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
        conn.add(pnMain);
        JPanel pnTitle = new JPanel();
        pnTitle.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel lblTitle = new JLabel("Đăng nhập hệ thống ");
        lblTitle.setForeground(Color.BLUE);
        Font fontTitle = new Font("arial", Font.BOLD, 18);
        lblTitle.setFont(fontTitle);
        pnTitle.add(lblTitle);
        pnMain.add(pnTitle);

        JPanel pnDangNhap = new JPanel();
        pnDangNhap.setLayout(new BoxLayout(pnDangNhap, BoxLayout.Y_AXIS));
        pnMain.add(pnDangNhap);

        JPanel pnTaiKhoan = new JPanel();
        pnTaiKhoan.setLayout(new FlowLayout());
        JLabel lblTaiKhoan = new JLabel("Tài khoản");
        txtTaiKhoan = new JTextField(20);
        pnTaiKhoan.add(lblTaiKhoan);
        pnTaiKhoan.add(txtTaiKhoan);
        pnDangNhap.add(pnTaiKhoan);

        JPanel pnMatKhau = new JPanel();
        pnMatKhau.setLayout(new FlowLayout());
        JLabel lblMatKhau = new JLabel("Mật Khẩu");
        txtMatKhau = new JPasswordField(20);
        pnMatKhau.add(lblMatKhau);
        pnMatKhau.add(txtMatKhau);
        pnDangNhap.add(pnMatKhau);

        JPanel pnButton = new JPanel();
        pnButton.setLayout(new FlowLayout(FlowLayout.CENTER));
        btnDangNhap = new JButton("Đăng nhập");
        btnThoat = new JButton("Thoát");
        pnButton.add(btnDangNhap);
        pnButton.add(btnThoat);
        pnDangNhap.add(pnButton);
        btnThoat.setPreferredSize(btnDangNhap.getPreferredSize());
        TitledBorder border = new TitledBorder(BorderFactory.createLineBorder(Color.red), "Thông tin đăng nhập ");
        pnDangNhap.setBorder(border);
    }

    private void addEvents() {
        btnDangNhap.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    try {
                        xuLyDangNhap();
                    } catch (SQLException ex) {
                        Logger.getLogger(DangNhapUI.class.getName()).log(Level.SEVERE, null, ex);
                    }
                } catch (IOException ex) {
                    Logger.getLogger(DangNhapUI.class.getName()).log(Level.WARNING, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(DangNhapUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        btnThoat.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

    }

    public static String username;

    protected void xuLyDangNhap() throws IOException, ClassNotFoundException, SQLException {
        if (txtTaiKhoan.getText().equals("") || txtMatKhau.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Vui lòng điền toàn bộ thông tin");
        } else {
            this.dispose();
            String vaitro = "", isUser = "User", isAdmin = "Admin";
            ArrayList<TaiKhoan> listTK = DatabaseToList.Doc_TaiKhoan_Tu_CSDL();
            for (TaiKhoan item : listTK) {
                if (item.getMaTaiKhoan().equals(txtTaiKhoan.getText()) && item.getMatKhau().equals(txtMatKhau.getText())) {
                    vaitro = item.getVaiTro();
                    username = item.getMaTaiKhoan();
                    break;
                }
            }
            if (vaitro.equals(isUser)) {
                UserUI nv = new UserUI();
                nv.setVisible(true);

            } else if(vaitro.equals(isAdmin)){
                AdminUI ql = new AdminUI();
                ql.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Tên đăng nhập hoặc mật khẩu không tồn tại");
                txtTaiKhoan.setText("");
                txtMatKhau.setText("");
                username = "";
                DangNhapUI dn = new DangNhapUI("Vui lòng đăng nhập để tiếp tục");
                dn.showWindow();
            }

        }
    }

    public void showWindow() {
        this.setSize(350, 250);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        DangNhapUI dn = new DangNhapUI("Vui lòng đăng nhập để tiếp tục");
        dn.showWindow();
    }
}
