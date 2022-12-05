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
import model.PhieuGiaoChiTiet;
import utility.DBConnection;
import viewModel.PhieuGiaoCTViewModel;

/**
 *
 * @author Admin
 */
public class ChiTietPhieuGiaoRepository {
    public List<PhieuGiaoCTViewModel> getAll() {
        String query = "  SELECT "
                + "k.tenKH, k.cccd, k.sdt, k.diaChi,x.soGhe, ctx.tenXe, m.tenMS,ctx.tinhTrang, ctx.bienSoXe,ctx.giaThue, ctx.soKM, p.NgayTao  "
                + "FROM PhieuGiaoChiTiet pct JOIN PhieuGiao p ON pct.idPhieuGiao = p.idPhieuGiao "
                + "JOIN KhachHang k ON k.idKH = pct.idKH JOIN Xe x ON pct.idXe = x.idXe "
                + "JOIN ChiTietXe ctx ON ctx.idXe = x.idXe JOIN MauSac m ON ctx.idMS = m.idMS";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            List<PhieuGiaoCTViewModel> listCTPG = new ArrayList<>();
            while (rs.next()) {
                PhieuGiaoCTViewModel tk = new PhieuGiaoCTViewModel(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5), rs.getString(6), rs.getString(7), rs.getString(8), rs.getString(9), rs.getBigDecimal(10), rs.getInt(11), rs.getDate(12));
                listCTPG.add(tk);
            }
            return listCTPG;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
     public Boolean add(PhieuGiaoChiTiet PCT) {
        int checkInsert = 0;
        String query = "INSERT INTO PhieuGiaoChiTiet "
                + "(idPhieuGiao,idXe,idKH,tinhTrangXe,GhiChu) "
                + "VALUES (?, ?, ?, ?, ?)";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(query);
            ps.setObject(1, PCT.getIdPG());
            ps.setObject(2, PCT.getIdXe());
            ps.setObject(3, PCT.getIdKh());
            ps.setObject(4, PCT.getTinhtrang());
            ps.setObject(5, PCT.getGhiChu());
            checkInsert = ps.executeUpdate();
            return checkInsert > 0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
