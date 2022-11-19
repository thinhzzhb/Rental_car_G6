/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.ChucVu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.TaiKhoan;

/**
 *
 * @author Acer
 */
public class ChucVuRespository {

    public List<ChucVu> getAll() {
        String query = "SELECT [idCV]\n"
                + "      ,[maChucVu]\n"
                + "      ,[tenChucVu]\n"
                + "      ,[idTK]\n"
                + "  FROM [dbo].[ChucVu]";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement pr = con.prepareStatement(query);) {
            ResultSet rs = pr.executeQuery();
            List<ChucVu> listcv = new ArrayList<>();
            while (rs.next()) {
                TaiKhoan tk = new TaiKhoan(rs.getInt(4));
                ChucVu cv = new ChucVu(rs.getInt(1), rs.getString(2), rs.getString(3), tk);
                listcv.add(cv);
            }
            return listcv;
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
