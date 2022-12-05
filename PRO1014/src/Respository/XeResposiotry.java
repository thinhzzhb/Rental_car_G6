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
        String query = "Select "
                + "idXe, maXe,idHangXe,soGhe,hinhAnh "
                + "from Xe";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<Xe> listxe = new ArrayList<>();
            while (rs.next()) {
                Xe xe = new Xe(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4), rs.getBytes(5));
                listxe.add(xe);
            }
            return listxe;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean add(Xe x) {
        int checkInsert = 0;
        String query = "insert into Xe "
                + "(maXe,idHangXe,soGhe,hinhAnh) "
                + "values (?, ?, ?, ?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, x.getMaXe());
            ps.setObject(2, x.getIdHangXe());
            ps.setObject(3, x.getSoGhe());
            ps.setObject(4, x.getHinhAnh());
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean update(int id, Xe x) {
        int checkUpdate = 0;
        String query = "UPDATE Xe SET idHangXe = ?, soGhe = ?, hinhAnh = ?"
                + " WHERE idXe = ?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, x.getIdHangXe());
            ps.setObject(2, x.getSoGhe());
            ps.setObject(3, x.getHinhAnh());
            ps.setObject(4, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Boolean delete(int id) {
        int checkUpdate = 0;
        String query = "DELETE FROM Xe WHERE idXe =?";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, id);
            checkUpdate = ps.executeUpdate();
            return checkUpdate > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Xe getOne(String MaXe) {
        String query = "SELECT [idXe]"
                + "      ,[maXe]"
                + "      ,[tenXe]"
                + "      ,[idHangXe]"
                + "      ,[soGhe]"
                + "      ,[hinhAnh]"
                + "  FROM [dbo].[Xe] WHERE [maXe]=?";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ps.setObject(1, MaXe);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Xe(rs.getString(1));
            }
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        }
        return null;
    }
}
