/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.HoaDonThanhToan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HopDong;

/**
 *
 * @author Acer
 */
public class HoaDonThanhToanRespository {

    public List<HoaDonThanhToan> getAll() {
        String query = "SELECT [idHDTT]\n"
                + "      ,[idHD]\n"
                + "      ,[ngayTao]\n"
                + "      ,[tongXe]\n"
                + "      ,[tienCoc]\n"
                + "      ,[phiPS]\n"
                + "      ,[tongThanhToan]\n"
                + "  FROM [dbo].[HoaDonTT]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HoaDonThanhToan> listhdtt = new ArrayList<>();
            while (rs.next()) {
                HopDong hd = new HopDong(rs.getString(2));
//                listhdtt.add(hdtt);
            }
            return listhdtt;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
    
    public boolean Add(HoaDonThanhToan hd) {
        String query = "INSERT INTO [dbo].[HoaDonTT]\n"
                + "      [idHDTT]\n"
                + "      ,[idHD]\n"
                + "      ,[ngayTao]\n"
                + "      ,[tongXe]\n"
                + "      ,[tienCoc]\n"
                + "      ,[phiPS]\n"
                + "      ,[tongThanhToan]\n"
                + "     VALUES\n"
                + "           (?,?,?,?,?,?,?)";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hd.getIdHdtt());
            ps.setObject(2, hd.getIdHd());
            ps.setObject(3, hd.getNgayTao());
            ps.setObject(4, hd.getTongXe());
            ps.setObject(5, hd.getTienCoc());
            ps.setObject(6, hd.getPhiPs());
            ps.setObject(7, hd.getTongThanhToan());
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }


    public boolean Remove(int idHDTT) {
        String query = "DELETE FROM [dbo].[HoaDonTT]\n"
                + "      WHERE [idHDTT] = ? ";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, idHDTT);
            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }

    public boolean Update(HoaDonThanhToan hdtt, int idHDTT) {
        String query = "UPDATE [dbo].[HoaDonTT]\n"
                + "   SET [idHD] = ?"
                + "      ,[ngayTao] = ?"
                + "      ,[tongXe] = ?"
                + "      ,[tienCoc] = ?"
                + "      ,[phiPS] = ?"
                + "      ,[tongThanhToan] = ?"
                + " WHERE [idHDTT] = ? ";
        int check = 0;
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, hdtt.getIdHd());
            ps.setObject(3, hdtt.getNgayTao());
            ps.setObject(4, hdtt.getTongXe());
            ps.setObject(5, hdtt.getTienCoc());
            ps.setObject(6, hdtt.getPhiPs());
            ps.setObject(7, hdtt.getTongThanhToan());
            ps.setObject(5, idHDTT);

            check = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return check > 0;
    }
}
