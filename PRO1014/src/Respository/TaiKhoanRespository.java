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
        String query = "SELECT [idTK],[username],[password],[vaiTro],[tinhtrang]"
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
               return new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getInt(5));
                
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
    public List<TaiKhoan> getAll() {
        String query = "SELECT [idTK],[username],[password],[vaiTro],[tinhtrang]"
                + " FROM [dbo].[TaiKhoan] ";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<TaiKhoan> listtkA = new ArrayList<>();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getInt(5));
                listtkA.add(tk);
            }
            return listtkA;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public TaiKhoan add(TaiKhoan t ) {
        String query = "INSERT INTO TaiKhoan "
                + "(username,[password],vaiTro,tinhtrang) "
                + "VALUES (?, ?, ?, ?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, t.getUserName());
            ps.setString(2, t.getPass());
            ps.setInt(3, t.getVaiTro());
            ps.setInt(4, t.getTinhTrang());
            ps.execute();
            return t;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
     public boolean checkExists(String user) {
         int count = 0;
        String query = "select COUNT(*)[C] "
                + "from TaiKhoan where username = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            count = ps.executeUpdate();
            while (count > 1 ) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
