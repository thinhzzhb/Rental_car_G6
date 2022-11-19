/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.SoDat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.KhachHang;
import model.Xe;

/**
 *
 * @author Acer
 */
public class SoDatRespository {

    public List<SoDat> getAll() {
        String query = "SELECT [idSoDat]\n"
                + "      ,[idKH]\n"
                + "      ,[idXe]\n"
                + "      ,[ngayDat]\n"
                + "      ,[ngayHenLay]\n"
                + "      ,[soLuongXe]\n"
                + "  FROM [dbo].[soDat]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<SoDat> lissd = new ArrayList<>();
            while (rs.next()) {
                KhachHang kh = new KhachHang(rs.getString(2));
                Xe xe = new Xe(rs.getString(3));
                SoDat sd = new SoDat(rs.getInt(1), kh, xe, rs.getDate(4), rs.getDate(5), rs.getInt(6));
                lissd.add(sd);
            }
            return lissd;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
