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
        String query = "  INSERT INTO PhieuGiao "
                + "(maPG, ngayTao) VALUES"
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
    public Boolean update(String ma, PhieuGiao pg){
         int checkInsert = 0;
        String query = "UPDATE PhieuGiao SET "
                + "tenKhachHang = ?,tienCoc = ?,tongTienDuTinh = ?,tinhTrangXe = ?\n" +
                  "WHERE maPG = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, pg.getTenKhach());
            ps.setObject(2, pg.getTienCoc());
            ps.setObject(3, pg.getTongTienTamTinh());
            ps.setObject(4, pg.getTinhTrangXe());
            
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public List<PhieuGiao> getAll() {
        String query = "SELECT [idPG],[ngayTao],[tenKhachHang],[tienCoc],[tongTienDuTinh],[tinhTrangXe],[maPG]"
                + " FROM [DB_DuAn1].[dbo].[PhieuGiao]";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<PhieuGiao> listPG = new ArrayList<>();
            while (rs.next()) {
                PhieuGiao pg = new PhieuGiao(rs.getInt(1), rs.getString(6), rs.getString(7), rs.getDate(2), rs.getString(3), rs.getBigDecimal(4), rs.getBigDecimal(5));
                listPG.add(pg);
            }
            return listPG;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

}
