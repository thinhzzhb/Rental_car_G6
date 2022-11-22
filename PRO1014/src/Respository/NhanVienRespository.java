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

/**
 *
 * @author Acer
 */
public class NhanVienRespository {

    public List<NhanVien> getAll() {
        String query = "SELECT maNV, tenNV, gioiTinh, SDT, diaChi\n"
                + "FROM     dbo.NhanVien";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<NhanVien> listnv = new ArrayList<>();
            while (rs.next()) {
                NhanVien nv = new NhanVien(rs.getString(1), rs.getString(2), rs.getString(5), rs.getString(4), rs.getBoolean(3));
                listnv.add(nv);
            }
            return listnv;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean Them(NhanVien nv) {
        String query = "INSERT INTO [dbo].[NhanVien]\n"
                + "           ([maNV]\n"
                + "           ,[tenNV]\n"
                + "           ,[diaChi]\n"
                + "           ,[SDT]\n"
                + "           ,[gioiTinh])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?)";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, nv.getMaNv());
            ps.setObject(2, nv.getTenNv());
            ps.setObject(5, nv.isGioiTinh());
            ps.setObject(4, nv.getSdt());
            ps.setObject(3, nv.getDiaChi());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean Xoa(String Tennv) {
        String query = "DELETE FROM [dbo].[NhanVien]\n"
                + "      WHERE [tenNV] = ? ";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, Tennv);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean Sua(NhanVien nv, String Tennv) {
        String query = "UPDATE [dbo].[NhanVien]\n"
                + "   SET [maNV] = ?"
                + "      ,[diaChi] = ?"
                + "      ,[SDT] = ?"
                + "      ,[gioiTinh] = ?"
                + " WHERE [tenNV] = ? ";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, nv.getMaNv());
            ps.setObject(2, nv.getDiaChi());
            ps.setObject(3, nv.getSdt());
            ps.setObject(4, nv.isGioiTinh());
            ps.setObject(5, Tennv);

            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
