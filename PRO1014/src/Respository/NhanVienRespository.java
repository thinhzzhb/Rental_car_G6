/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.NhanVien;
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
public class NhanVienRespository {

    public List<NhanVien> getAll() {
        String query = "SELECT [idNV]\n"
                + "      ,[maNV]\n"
                + "      ,[tenNV]\n"
                + "      ,[idCV]\n"
                + "      ,[diaChi]\n"
                + "      ,[SDT]\n"
                + "      ,[gioiTinh]\n"
                + "  FROM [dbo].[NhanVien]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> listnv = new ArrayList<>();
            while (rs.next()) {
                ChucVu cv = new ChucVu(rs.getString(4));
                NhanVien nv = new NhanVien(rs.getInt(1), rs.getString(2), rs.getString(3), cv, rs.getString(5), rs.getString(6), rs.getBoolean(7));
                listnv.add(nv);
            }
            return listnv;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
