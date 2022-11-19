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
                HoaDonThanhToan hdtt = new HoaDonThanhToan(rs.getInt(1), hd, rs.getDate(3), rs.getInt(4), rs.getInt(5), rs.getInt(6), rs.getInt(7));
                listhdtt.add(hdtt);
            }
            return listhdtt;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
