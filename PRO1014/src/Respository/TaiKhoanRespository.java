/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.TaiKhoan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class TaiKhoanRespository {

    public List<TaiKhoan> getAll() {
        String query = "SELECT [idTK]\n"
                + "      ,[vaiTro]\n"
                + "  FROM [dbo].[TaiKhoan]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<TaiKhoan> listtk = new ArrayList<>();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getInt(1), rs.getInt(2));
                listtk.add(tk);
            }
            return listtk;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
