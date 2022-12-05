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
import model.HangXe;
import model.MauSac;
import model.Xe;
import utility.DBConnection;

/**
 *
 * @author Admin
 */
public class ChiTietXeRepository {
<<<<<<< HEAD
    public List<ChiTietXe> getAll(){
        String query = "SELECT "
                + "[idXe] ,[idMS] ,[tenXe] ,[tinhTrang] ,[soKM] ,[ngayBaoDuong] ,[hinhAnh] ,[bienSoXe] ,[giaThue], [trangThai]"
                + " FROM [DB_DuAn1_GSix].[dbo].[ChiTietXe]";
=======

    public List<ChiTietXe> getAll() {
        String query = "SELECT dbo.Xe.maXe, dbo.MauSac.tenMS, dbo.HangXe.tenHangXe, dbo.ChiTietXe.tinhTrang, dbo.ChiTietXe.soKM, dbo.ChiTietXe.ngayBaoDuong, dbo.ChiTietXe.hinhAnh, dbo.ChiTietXe.bienSoXe, dbo.ChiTietXe.giaThue\n"
                + "FROM     dbo.ChiTietXe INNER JOIN\n"
                + "                  dbo.HangXe ON dbo.ChiTietXe.idHX = dbo.HangXe.idHangXe INNER JOIN\n"
                + "                  dbo.MauSac ON dbo.ChiTietXe.idMS = dbo.MauSac.idMS INNER JOIN\n"
                + "                  dbo.Xe ON dbo.ChiTietXe.idXe = dbo.Xe.idXe AND dbo.HangXe.idHangXe = dbo.Xe.idHangXe";
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietXe> listxe = new ArrayList<>();
            while (rs.next()) {
<<<<<<< HEAD
                ChiTietXe ctxe = new ChiTietXe(rs.getInt(1), rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getDate(6), rs.getBytes(7), rs.getString(8), rs.getBigDecimal(9), rs.getInt(10));
=======
                Xe x = new Xe(rs.getString(1));
                MauSac ms = new MauSac(rs.getString(2));
                HangXe hx = new HangXe(rs.getString(3));
                ChiTietXe ctxe = new ChiTietXe(x, ms, hx, rs.getString(5), rs.getString(4), rs.getDate(6), rs.getBytes(7), rs.getString(8), rs.getBigDecimal(9));
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
                listxe.add(ctxe);
            }
            return listxe;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
<<<<<<< HEAD
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
=======

    public boolean them(ChiTietXe ctx) {
        String query = "INSERT INTO [dbo].[ChiTietXe]"
                + "           ([idXe]"
                + "           ,[idMS]"
                + "           ,[idHX]"
                + "           ,[tinhTrang]"
                + "           ,[soKM]"
                + "           ,[ngayBaoDuong]"
                + "           ,[hinhAnh]"
                + "           ,[bienSoXe]"
                + "           ,[giaThue])"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, ctx.getIdXe().getMaXe());
            ps.setObject(2, ctx.getIdMS().getTenMs());
            ps.setObject(3, ctx.getTenhang().getTenHangXe());
            ps.setObject(4, ctx.getTinhTrang());
            ps.setObject(5, ctx.getSoKm());
            ps.setObject(6, ctx.getNgayBaoDuong());
            ps.setObject(7, ctx.getAnh());
            ps.setObject(8, ctx.getBienSoXe());
            ps.setObject(9, ctx.getGiaThue());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
    }
}
