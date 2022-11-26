/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class TaiKhoanRespository {

    public TaiKhoan getUser(String user, String pass) {
        String query = "SELECT [idTK],maTK,[username],[password],[vaiTro],[TinhTrang]"
                + " FROM [dbo].[TaiKhoan] "
                + "WHERE [username] =  ? "
                + "and [password] = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, user);
            ps.setString(2, pass);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<TaiKhoan> getAll() {
        String query = "SELECT [idTK],maTK,[username],[password],[vaiTro],[TinhTrang]"
                + " FROM [dbo].[TaiKhoan] ";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<TaiKhoan> listtkA = new ArrayList<>();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
                listtkA.add(tk);
            }
            return listtkA;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean add(TaiKhoan t) {
        int checkInsert = 0;
        String query = "INSERT INTO TaiKhoan "
                + "(maTk,username,[password],vaiTro,TinhTrang) "
                + "VALUES ( ?, ?, ?, ?, ?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, t.getMaTK());
            ps.setObject(2, t.getUserName());
            ps.setObject(3, t.getPass());
            ps.setObject(4, t.getVaiTro());
            ps.setObject(5, t.getTinhTrang());
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean update(int id, TaiKhoan t) {
        int checkUpdate = 0;
        String query = "UPDATE TaiKhoan"
                + " SET username =? ,[password] =? ,vaiTro = ?"
                + " WHERE idTK = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, t.getUserName());
            ps.setObject(2, t.getPass());
            ps.setObject(3, t.getVaiTro());
            ps.setObject(4, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean disable(int id, TaiKhoan t) {
        int checkUpdate = 0;
        String query = "UPDATE TaiKhoan"
                + " SET TinhTrang =?"
                + " WHERE idTK= ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, t.getTinhTrang());
            ps.setObject(2, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
//     public boolean checkExists(String user) {
//         int count = 0;
//        String query = "select COUNT(*)[C] "
//                + "from TaiKhoan where username = ?";
//        try {
//            Connection con = DBConnection.getConnection();
//            PreparedStatement ps = con.prepareStatement(query);
//            count = ps.executeUpdate();
//            while (count > 1 ) {
//                return true;
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return false;
//    }

    public TaiKhoan findID(String name) {
        String query = "SELECT [idTK],maTK,[username],[password],[vaiTro],[TinhTrang]"
                + " FROM [dbo].[TaiKhoan]"
                + "WHERE username = ? ";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, name);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getInt(6));
                return tk;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean Xoa(int id) {
        int checkUpdate = 0;
        String query = "delete TaiKhoan where idTK = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static int stateChangeAccount(String userName) {
        int checkAC = 0;
        String sql = "UPDATE TaiKhoan SET TinhTrang = 2 where username = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, userName);
            checkAC = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkAC;
    }
    public static int stateChangeAccount2(String userName) {
        int checkAC = 0;
        String sql = "UPDATE TaiKhoan SET TinhTrang = 1 where username = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setObject(1, userName);
            checkAC = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checkAC;
    }
}
