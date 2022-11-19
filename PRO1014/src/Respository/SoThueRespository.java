/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.SoThue;
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
public class SoThueRespository {

    public List<SoThue> getAll() {
        String query = "SELECT [idSo]\n"
                + "      ,[idXe]\n"
                + "      ,[idHD]\n"
                + "      ,[ngayNhan]\n"
                + "      ,[ngayTra]\n"
                + "  FROM [dbo].[SoThue]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<SoThue> listst = new ArrayList<>();
            while (rs.next()) {
                Xe xe = new Xe(rs.getString(2));
                HopDong hd = new HopDong(rs.getString(3));
                SoThue st = new SoThue(rs.getInt(1), xe, hd, rs.getDate(4), rs.getDate(5));
                listst.add(st);
            }
            return listst;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
