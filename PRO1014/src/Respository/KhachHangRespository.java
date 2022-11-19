/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.KhachHang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.ChucVu;

/**
 *
 * @author Acer
 */
public class KhachHangRespository {

    public List<KhachHang> getAll() {
        String query = "SELECT [idKH]\n"
                + "      ,[maKH]\n"
                + "      ,[tenKH]\n"
                + "      ,[diaChi]\n"
                + "      ,[sdt]\n"
                + "      ,[cccd]\n"
                + "      ,[gioiTinh]\n"
                + "      ,[idCV]\n"
                + "  FROM [dbo].[KhachHang]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<KhachHang> listkh = new ArrayList<>();
            while (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(8));
                KhachHang kh = new KhachHang(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(7), cv);
                listkh.add(kh);
            }
            return listkh;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
