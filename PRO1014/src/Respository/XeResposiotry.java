/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.Xe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.HangXe;
import model.MauSac;

/**
 *
 * @author Acer
 */
public class XeResposiotry {
    
    public List<Xe> getAll() {
        String query = "SELECT [idXe]\n"
                + "      ,[maXe]\n"
                + "      ,[idHangXe]\n"
                + "      ,[idMS]\n"
                + "      ,[tenXe]\n"
                + "      ,[bienSoXe]\n"
                + "      ,[tinhTrangXe]\n"
                + "  FROM [dbo].[Xe]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<Xe> listxe = new ArrayList<>();
            while (rs.next()) {
                HangXe hx = new HangXe(rs.getString(3));
                MauSac ms = new MauSac(rs.getString(4));
                Xe xe = new Xe(rs.getInt(1), rs.getString(2), hx, ms, rs.getString(5), rs.getString(6), rs.getString(7));
                listxe.add(xe);
            }
            return listxe;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
