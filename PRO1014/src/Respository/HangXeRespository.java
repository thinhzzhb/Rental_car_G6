/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.HangXe;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class HangXeRespository {

    public List<HangXe> getAll() {
        String query = "SELECT [idHangXe]\n"
                + "      ,[maHangXe]\n"
                + "      ,[tenHangXe]\n"
                + "  FROM [dbo].[HangXe]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<HangXe> listhx = new ArrayList<>();
            while (rs.next()) {
                HangXe hx = new HangXe(rs.getInt(1), rs.getString(2), rs.getString(3));
                listhx.add(hx);
            }
            return listhx;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
