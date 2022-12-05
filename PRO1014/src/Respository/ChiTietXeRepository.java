/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietXe;
import utility.DBConnection;

/**
 *
 * @author Admin
 */
public class ChiTietXeRepository {
    public List<ChiTietXe> getAll(){
        String query = "SELECT "
                + "[idXe] ,[idMS] ,[tenXe] ,[tinhTrang] ,[soKM] ,[ngayBaoDuong] ,[hinhAnh] ,[bienSoXe] ,[giaThue], [trangThai]"
                + " FROM [DB_DuAn1_GSix].[dbo].[ChiTietXe]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietXe> listxe = new ArrayList<>();
            while (rs.next()) {
                ChiTietXe ctxe = new ChiTietXe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getBytes(7), rs.getString(8), rs.getBigDecimal(9), rs.getInt(10));
                listxe.add(ctxe);
            }
            return listxe;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
     public ChiTietXe findBS(String bs) {
        String query = "  SELECT "
                + "[idXe] ,[idMS] ,[tenXe] ,[tinhTrang] ,[soKM] ,[ngayBaoDuong] ,[hinhAnh] ,[bienSoXe] ,[giaThue], [trangThai]"
                + " FROM [DB_DuAn1_GSix].[dbo].[ChiTietXe]WHERE [bienSoXe] = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, bs);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ChiTietXe xeCT = new ChiTietXe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getBytes(7), rs.getString(8), rs.getBigDecimal(9),rs.getInt(10));
                return xeCT;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
