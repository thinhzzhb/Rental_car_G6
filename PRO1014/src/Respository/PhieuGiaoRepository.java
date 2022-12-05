/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.PhieuGiao;
import utility.DBConnection;


/**
 *
 * @author Admin
 */
public class PhieuGiaoRepository {
    
    public Boolean addPG(PhieuGiao pg){
         int checkInsert = 0;
        String query = "INSERT INTO PhieuGiao "
                + "([MaPhieuGiao], [NgayTao]) VALUES"
                + "(?, ?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, pg.getMaPG());
            ps.setObject(2, pg.getNgayTao());
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public Boolean updatePG(String ma, PhieuGiao pg){
         int checkInsert = 0;
        String query = "UPDATE PhieuGiao SET bienSoXe = ? WHERE MaPhieuGiao = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, pg.getBienSo());
            ps.setObject(2, ma);
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<PhieuGiao> getAll() {
        String query = "SELECT "
                + "[idPhieuGiao] ,[MaPhieuGiao] ,[bienSoXe] ,[NgayTao] "
                + "FROM [DB_DuAn1_GSix].[dbo].[PhieuGiao]";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<PhieuGiao> listPG = new ArrayList<>();
            while (rs.next()) {
                PhieuGiao pg = new PhieuGiao(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4));
                listPG.add(pg);
            }
            return listPG;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
