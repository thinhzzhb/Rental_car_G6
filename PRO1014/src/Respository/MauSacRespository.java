/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.MauSac;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class MauSacRespository {

    public List<MauSac> getAll() {
        String query = "SELECT [idMS]\n"
                + "      ,[maMS]\n"
                + "      ,[tenMS]\n"
                + "  FROM [dbo].[MauSac]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<MauSac> listms = new ArrayList<>();
            while (rs.next()) {
                MauSac ms = new MauSac(rs.getInt(1), rs.getString(2), rs.getString(3));
                listms.add(ms);
            }
            return listms;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
