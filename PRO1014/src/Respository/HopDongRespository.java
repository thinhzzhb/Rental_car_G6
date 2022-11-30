/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respository;

import utility.DBConnection;
import java.util.List;
import model.HopDong;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.KhachHang;
import model.NhanVien;
import model.Xe;

/**
 *
 * @author Acer
 */
public class HopDongRespository {

//    public List<HopDong> getAll() {
//        String query = "SELECT [idHD]\n"
//                + "      ,[maHD]\n"
//                + "      ,[idKH]\n"
//                + "      ,[idXe]\n"
//                + "      ,[idNV]\n"
//                + "      ,[dieuKhoanHD]\n"
//                + "      ,[tienCoc]\n"
//                + "      ,[thoaThuanDenBu]\n"
//                + "      ,[phiPS]\n"
//                + "  FROM [dbo].[HopDong]";
//        try ( Connection con = DBConnection.getConnection();  PreparedStatement ps = con.prepareStatement(query);) {
//            ResultSet rs = ps.executeQuery();
//            List<HopDong> listhd = new ArrayList<>();
//            while (rs.next()) {
//                KhachHang kh = new KhachHang(rs.getString(3));
//                Xe xe = new Xe(rs.getString(4));
//                NhanVien nv = new NhanVien(rs.getString(5));
//                HopDong hd = new HopDong(rs.getInt(1), rs.getString(2), kh, xe, nv, rs.getString(6), rs.getInt(7), rs.getString(8), rs.getInt(9));
//                listhd.add(hd);
//            }
//            return listhd;
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        }
//        return null;
//    }
}
