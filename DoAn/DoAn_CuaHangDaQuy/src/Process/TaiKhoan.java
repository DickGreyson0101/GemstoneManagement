/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Process;

import ConnectDB.ConnectionUtils;
import File.ReadWriteFile;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author thetu
 */
public class TaiKhoan {

    public ResultSet getListTK() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "SELECT * from TAIKHOAN order by MANV asc";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public String getRoll(int maNV) throws SQLException, ClassNotFoundException {
        String roll ="";
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "SELECT CHUCVU  from NHANVIEN where MANV = ?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setInt(1, maNV);
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            roll = rs.getString(1);
        }
        return roll;
    }

    public ResultSet getListMaNV() throws SQLException, ClassNotFoundException {
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "SELECT MANV from NHANVIEN order by MANV asc";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        return rs;
    }

    public int checkTK(String tenTK) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "SELECT * FROM TAIKHOAN where TENTK = ?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(1, tenTK);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return 0;
        } else {
            return 1;
        }
    }

    public int checkDN(String tenTK, String MK) throws SQLException, ClassNotFoundException {
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "SELECT * FROM TAIKHOAN where TENTK = ? AND MATKHAU = ?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(1, tenTK);
        ps.setString(2, MK);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            return Integer.valueOf(rs.getString(1));
        } else {
            return -1;
        }
    }

    public int addTK(int maNV, String tenTK, String MK) throws ClassNotFoundException, SQLException {
        int i = 0;
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "insert into TAIKHOAN(MANV, tenTK, MatKhau) values (?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(2, tenTK);
        ps.setString(3, MK);
        i = ps.executeUpdate();
        return i;
    }

    public int remoteTK(int maNV) throws ClassNotFoundException, SQLException {
        int i = 0;
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "delete TAIKHOAN where MANV = ?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setInt(1, maNV);
        i = ps.executeUpdate();
        return i;
    }

    public int updateTK(int maNV, String tenTK, String MK) throws ClassNotFoundException, SQLException {
        int i = 0;
        Connection conn = null;
        conn = ConnectionUtils.getMyConnection();
        String SQL = "update TAIKHOAN set TENTK = ?, MATKHAU = ? where MANV = ?";
        PreparedStatement ps = conn.prepareStatement(SQL);
        ps.setString(1, tenTK);
        ps.setString(2, MK);
        ps.setInt(3, maNV);
        i = ps.executeUpdate();
        return i;
    }

}
