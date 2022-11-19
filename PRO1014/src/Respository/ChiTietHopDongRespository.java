/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.ChiTietHopDong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HopDong;
import model.Xe;

/**
 *
 * @author Acer
 */
public class ChiTietHopDongRespository {

    public List<ChiTietHopDong> getAll() {
        String query = "SELECT [idXe]\n"
                + "      ,[idHD]\n"
                + "      ,[soLuongXe]\n"
                + "      ,[donGia]\n"
                + "  FROM [dbo].[ChiTietHopDong]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietHopDong> listcthd = new ArrayList<>();
            while (rs.next()) {
                Xe xe = new Xe(rs.getString(1));
                HopDong hd = new HopDong(rs.getString(2));
                ChiTietHopDong cthd = new ChiTietHopDong(xe, hd, rs.getInt(3), rs.getInt(4));
                listcthd.add(cthd);
            }
            return listcthd;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
