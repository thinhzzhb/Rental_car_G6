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
        String query = "SELECT maKH, tenKH, gioiTinh, diaChi, sdt, cccd\n"
                + "FROM     dbo.KhachHang";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<KhachHang> listkh = new ArrayList<>();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(1), rs.getString(2), rs.getString(4), rs.getString(5), rs.getString(6), rs.getBoolean(3));
                listkh.add(kh);
            }
            return listkh;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }

    public boolean them(KhachHang kh) {
        String query = "INSERT INTO [dbo].[KhachHang]\n"
                + "           ([maKH]\n"
                + "           ,[tenKH]\n"
                + "           ,[diaChi]\n"
                + "           ,[sdt]\n"
                + "           ,[cccd]\n"
                + "           ,[gioiTinh])\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getMaKh());
            ps.setObject(2, kh.getTenKh());
            ps.setObject(3, kh.getDiaChi());
            ps.setObject(4, kh.getSdt());
            ps.setObject(5, kh.getCccd());
            ps.setObject(6, kh.isGioiTinh());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean Sua(KhachHang kh, String Tenkh) {
        String query = "UPDATE [dbo].[KhachHang]\n"
                + "   SET [maKH] = ?"
                + "      ,[diaChi] = ?"
                + "      ,[sdt] = ?"
                + "      ,[cccd] = ?"
                + "      ,[gioiTinh] = ?"
                + " WHERE [tenKH] = ?";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, kh.getMaKh());
            ps.setObject(2, kh.getDiaChi());
            ps.setObject(3, kh.getSdt());
            ps.setObject(4, kh.getCccd());
            ps.setObject(5, kh.isGioiTinh());
            ps.setObject(6, Tenkh);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
