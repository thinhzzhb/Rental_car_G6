/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.ChiTietXe;
import utility.DBConnection;

/**
 *
 * @author Admin
 */
public class ChiTietXeRepository {
    public List<ChiTietXe> getAll(){
        String query = "select"
                + " idXe,idMS,tinhTrang,soKM,ngayBaoDuong,hinhAnh,tenXe,giaThue"
                + " from ChiTietXe";
        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
            ResultSet rs = ps.executeQuery();
            List<ChiTietXe> listxe = new ArrayList<>();
            while (rs.next()) {
                ChiTietXe ctxe = new ChiTietXe(rs.getInt(1), rs.getInt(2), rs.getString(7), rs.getString(3),rs.getString(4), rs.getDate(5), rs.getBytes(6), rs.getBigDecimal(8));
                listxe.add(ctxe);
            }
            return listxe;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
