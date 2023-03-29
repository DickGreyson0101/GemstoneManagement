/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import ConnectDB.ConnectionUtils;
import Process.TKCaNhan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DELL
 */
public class QuanLyNhanVien extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyNhanVien
     */
    DefaultTableModel tableQLNV = new DefaultTableModel();
    int maNV = -1;

    public QuanLyNhanVien() {

        initComponents();
        setListNV();
        setVisible(true);
    }

    void setListNV() {
        try {
            tableQLNV = (DefaultTableModel) bang1.getModel();
            tableQLNV.setRowCount(0);
            Connection conn = null;
            conn = ConnectionUtils.getMyConnection();
            String SQL = "SELECT * FROM NHANVIEN ORDER BY MaNV";
            PreparedStatement ps = conn.prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            String row[] = new String[8];
            while (rs.next()) {
                row[0] = rs.getString(1);
                row[1] = rs.getString(2);
                row[2] = rs.getString(3);
                row[3] = rs.getString(4);
                Date ngayS = rs.getDate(5);
                row[4] = String.format("%td-%<tm-%<tY", ngayS);
                row[5] = rs.getString(6);
                row[6] = rs.getString(7);
                Date ngayVL = rs.getDate(8);
                row[7] = String.format("%td-%<tm-%<tY", ngayVL);
                tableQLNV.addRow(row);
            }
            bang1.setModel(tableQLNV);
        } catch (SQLException ex) {
            System.out.println("Xay ra loi");
        } catch (ClassNotFoundException cx) {

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        NS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        DC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        them = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        xoa = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        quayLai = new javax.swing.JButton();
        TNV = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        SDT = new javax.swing.JTextField();
        sua = new javax.swing.JButton();
        GT = new javax.swing.JComboBox<>();
        CV = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        NVL = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản Lý Nhân Viên");

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Ngày vào làm");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Giới tính");

        bang1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bang1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã NV", "Tên NV", "Chức vụ", "Giới tính", "Ngày sinh", "Địa chỉ", "Số DT", "Ngày vào làm"
            }
        ));
        bang1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bang1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bang1);
        if (bang1.getColumnModel().getColumnCount() > 0) {
            bang1.getColumnModel().getColumn(0).setMinWidth(80);
            bang1.getColumnModel().getColumn(0).setPreferredWidth(80);
            bang1.getColumnModel().getColumn(0).setMaxWidth(80);
        }

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Ngày sinh");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("SĐT");

        them.setBackground(new java.awt.Color(0, 0, 255));
        them.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        them.setForeground(new java.awt.Color(255, 255, 255));
        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Địa chỉ");

        xoa.setBackground(new java.awt.Color(255, 0, 0));
        xoa.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoa.setForeground(new java.awt.Color(255, 255, 255));
        xoa.setText("Xóa");
        xoa.setEnabled(false);
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Bảng nhân viên ");

        quayLai.setBackground(new java.awt.Color(102, 102, 102));
        quayLai.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        quayLai.setForeground(new java.awt.Color(255, 255, 255));
        quayLai.setText("Quay Lại");
        quayLai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quayLaiActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 51, 102));
        jLabel11.setText("Quản Lý Nhân Viên");

        sua.setBackground(new java.awt.Color(0, 255, 51));
        sua.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        sua.setForeground(new java.awt.Color(255, 255, 255));
        sua.setText("Sửa");
        sua.setEnabled(false);
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        GT.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NAM", "NỮ", "KHÁC"}));
        GT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GTActionPerformed(evt);
            }
        });

        CV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "QUẢN LÝ", "KẾ TOÁN", "BÁN HÀNG", "THU NGÂN" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tên nhân viên ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Chức vụ ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(334, 334, 334)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel3)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(quayLai)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(jLabel6)
                                        .addGap(18, 18, 18)
                                        .addComponent(GT, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TNV)
                                        .addComponent(DC, javax.swing.GroupLayout.PREFERRED_SIZE, 581, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(162, 162, 162)
                                .addComponent(jLabel11))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(NVL)
                            .addComponent(CV, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(46, 46, 46)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8)
                                .addGap(14, 14, 14))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(4, 4, 4)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(NS, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(617, 617, 617)
                                .addComponent(jLabel10)))))
                .addContainerGap(53, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(them)
                .addGap(129, 129, 129)
                .addComponent(xoa)
                .addGap(134, 134, 134)
                .addComponent(sua)
                .addGap(413, 413, 413))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel11))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(quayLai)))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(GT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(CV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NVL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sua)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(them)
                        .addComponent(xoa)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bang1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bang1MouseClicked
        int Index = bang1.getSelectedRow();
        if (Index < tableQLNV.getRowCount() && Index >= 0) {
            maNV = Integer.valueOf(tableQLNV.getValueAt(Index, 0).toString());
            TNV.setText(tableQLNV.getValueAt(Index, 1).toString());
            if (tableQLNV.getValueAt(Index, 2).toString().equals("QL")) {
                CV.setSelectedIndex(0);
            }
            if (tableQLNV.getValueAt(Index, 2).toString().equals("KT")) {
                CV.setSelectedIndex(1);
            }
            if (tableQLNV.getValueAt(Index, 2).toString().equals("BH")) {
                CV.setSelectedIndex(2);
            }
            if (tableQLNV.getValueAt(Index, 2).toString().equals("TN")) {
                CV.setSelectedIndex(3);
            }
            if (tableQLNV.getValueAt(Index, 3).toString().equals("NAM")) {
                GT.setSelectedIndex(0);
            } else if (tableQLNV.getValueAt(Index, 3).toString().equals("NỮ")) {
                GT.setSelectedIndex(1);
            } else {
                GT.setSelectedIndex(2);
            }
            NS.setText(tableQLNV.getValueAt(Index, 4).toString());
            DC.setText(tableQLNV.getValueAt(Index, 5).toString());
            SDT.setText(tableQLNV.getValueAt(Index, 6).toString());
            NVL.setText(tableQLNV.getValueAt(Index, 7).toString());
            sua.setEnabled(true);
            xoa.setEnabled(true);
            them.setEnabled(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_bang1MouseClicked

    private void GTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GTActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GTActionPerformed

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        String tenNV = TNV.getText();
        String diaC = DC.getText();
        String soDT = SDT.getText();
        String ngayS = NS.getText();
        String ngayVL = NVL.getText();
        if (tenNV.equals("") || diaC.equals("") || soDT.equals("") || ngayS.equals("") || ngayVL.equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống !!!");
            return;
        }
        int sol = Integer.valueOf(soDT);
        if (sol <= 0) {
            JOptionPane.showMessageDialog(this, "Số không hợp lệ !!!");
            return;
        }
        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Thêm", "Thêm", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }
        Connection conn = null;
        try {

            conn = ConnectionUtils.getMyConnection();
            String SQL = "INSERT INTO NHANVIEN(TenNV,ChucVu,GioiTinh,NgaySinh,DiaChi,SDT,NgayVaoLam) VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(SQL);

            ps.setString(1, TNV.getText().toString());
            if (CV.getSelectedIndex() == 0) {
                ps.setString(2, "QL");
            }
            if (CV.getSelectedIndex() == 1) {
                ps.setString(2, "KT");
            }
            if (CV.getSelectedIndex() == 2) {
                ps.setString(2, "BH");
            }
            if (CV.getSelectedIndex() == 3) {
                ps.setString(2, "TN");
            }

            ps.setString(3, GT.getSelectedItem().toString());
            ps.setString(4, NS.getText().toString());
            ps.setString(5, DC.getText().toString());
            ps.setString(6, SDT.getText().toString());
            ps.setString(7, NVL.getText().toString());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Thêm thành công !!!");
            setListNV();
            TNV.setText("");
            DC.setText("");
            SDT.setText("");
            NS.setText("");
            NVL.setText("");
        } catch (SQLException ex) {
            System.out.println(ex);
            JOptionPane.showMessageDialog(this, "Số điện thoại phải là số !!!, Ngày tháng có định dạng là: Ngày-Tháng-Năm");
        } catch (ClassNotFoundException cx) {

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_themActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        Connection conn = null;
        try {

            conn = ConnectionUtils.getMyConnection();
            String SQL = "DELETE FROM NHANVIEN WHERE MANV = ?";
            PreparedStatement ps = conn.prepareStatement(SQL);

            ps.setInt(1, maNV);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "Xóa thành công !!!");
            TNV.setText("");
            DC.setText("");
            SDT.setText("");
            NS.setText("");
            NVL.setText("");
            sua.setEnabled(false);
            xoa.setEnabled(false);
            them.setEnabled(true);
            setListNV();
        } catch (SQLException ex) {
            System.out.println(ex);
            System.out.println("Xảy ra lỗi!");

        } catch (ClassNotFoundException cx) {

        }
    }//GEN-LAST:event_xoaActionPerformed

    private void quayLaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quayLaiActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Menu.main(null);
    }//GEN-LAST:event_quayLaiActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        // TODO add your handling code here:
        int Index = bang1.getSelectedRow();
        if (!(Index < tableQLNV.getRowCount() && Index >= 0)) {
            JOptionPane.showMessageDialog(this, "Chọn đối tác cần sửa !!!");
            return;
        }
        String chucV = "";
        if (CV.getSelectedIndex() == 0) {
            chucV = "QL";
        }
        if (CV.getSelectedIndex() == 1) {
            chucV = "KT";
        }
        if (CV.getSelectedIndex() == 2) {
            chucV = "BH";
        }
        if (CV.getSelectedIndex() == 3) {
            chucV = "TN";
        }
        String gioiT = GT.getSelectedItem().toString();
        String tenNV = TNV.getText();
        String diaC = DC.getText();
        String soDT = SDT.getText();
        String ngayS = NS.getText();
        String ngayVL = NVL.getText();
        int sol = Integer.valueOf(soDT);
        if (sol <= 0) {
            JOptionPane.showMessageDialog(this, "Số không hợp lệ !!!");
            return;
        }
        if (tenNV.equals("") || diaC.equals("") || soDT.equals("") || ngayS.equals("") || ngayVL.equals("")) {
            JOptionPane.showMessageDialog(this, "Không được để trống !!!");
            return;
        }
        int ret = 0;
        ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn Sửa", "Sửa", JOptionPane.YES_NO_OPTION);
        if (!(ret == JOptionPane.YES_OPTION)) {
            return;
        }

        try {
            TKCaNhan tk = new TKCaNhan();
            int check = tk.updateNV(maNV, tenNV, chucV, gioiT, ngayS, diaC, soDT, ngayVL);
            setListNV();
            JOptionPane.showMessageDialog(this, "Sửa thành công !!!");
            setListNV();
            TNV.setText("");
            DC.setText("");
            SDT.setText("");
            NS.setText("");
            NVL.setText("");
            sua.setEnabled(false);
            xoa.setEnabled(false);
            them.setEnabled(true);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Sửa thất bại !!!");
        }

    }//GEN-LAST:event_suaActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyNhanVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyNhanVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CV;
    private javax.swing.JTextField DC;
    private javax.swing.JComboBox<String> GT;
    private javax.swing.JTextField NS;
    private javax.swing.JTextField NVL;
    private javax.swing.JTextField SDT;
    private javax.swing.JTextField TNV;
    private javax.swing.JTable bang1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton quayLai;
    private javax.swing.JButton sua;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}