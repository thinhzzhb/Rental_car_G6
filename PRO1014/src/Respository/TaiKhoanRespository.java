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

    public List<TaiKhoan> getUser(String user, String pass) {
        String query = "SELECT [idTK],[username],[password],[vaiTro],[tinhtrang]"
                + " FROM [dbo].[TaiKhoan] "
                + "WHERE [username] =  ? "
                + "and [password] = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(2, user);
            ps.setString(3, pass);
            ResultSet rs = ps.executeQuery();
            List<TaiKhoan> listtk = new ArrayList<>();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4),rs.getInt(5));
                listtk.add(tk);
            }
            return listtk;
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
}
