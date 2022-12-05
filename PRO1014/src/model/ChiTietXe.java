/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class ChiTietXe {
<<<<<<< HEAD
    private int idXe;
    private int idMS;
    private String tenXe;
=======

    private Xe idXe;
    private MauSac idMS;
    private HangXe tenhang;
    private String soKm;
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
    private String tinhTrang;
    private String soKm;
    private Date ngayBaoDuong;
    private byte[] anh;
<<<<<<< HEAD
    private String bienSo;
=======
    private String BienSoXe;
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
    private BigDecimal giaThue;
    private int trangThai;
    
    public ChiTietXe() {
    }

<<<<<<< HEAD
    public ChiTietXe(int idXe, int idMS, String tenXe, String tinhTrang, String soKm, Date ngayBaoDuong, byte[] anh, String bienSo, BigDecimal giaThue, int trangThai) {
=======
    public ChiTietXe(Xe idXe, MauSac idMS, HangXe tenhang, String soKm, String tinhTrang, Date ngayBaoDuong, byte[] anh, String BienSoXe, BigDecimal giaThue) {
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
        this.idXe = idXe;
        this.idMS = idMS;
        this.tenXe = tenXe;
        this.tinhTrang = tinhTrang;
        this.soKm = soKm;
        this.ngayBaoDuong = ngayBaoDuong;
        this.anh = anh;
<<<<<<< HEAD
        this.bienSo = bienSo;
=======
        this.BienSoXe = BienSoXe;
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
        this.giaThue = giaThue;
        this.trangThai = trangThai;
    }

    public Xe getIdXe() {
        return idXe;
    }

    public void setIdXe(Xe idXe) {
        this.idXe = idXe;
    }

    public MauSac getIdMS() {
        return idMS;
    }

    public void setIdMS(MauSac idMS) {
        this.idMS = idMS;
    }

<<<<<<< HEAD
    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
=======
    public HangXe getTenhang() {
        return tenhang;
    }

    public void setTenhang(HangXe tenhang) {
        this.tenhang = tenhang;
    }

    public String getSoKm() {
        return soKm;
    }

    public void setSoKm(String soKm) {
        this.soKm = soKm;
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getSoKm() {
        return soKm;
    }

    public void setSoKm(String soKm) {
        this.soKm = soKm;
    }

    public Date getNgayBaoDuong() {
        return ngayBaoDuong;
    }

    public void setNgayBaoDuong(Date ngayBaoDuong) {
        this.ngayBaoDuong = ngayBaoDuong;
    }

    public byte[] getAnh() {
        return anh;
    }

    public void setAnh(byte[] anh) {
        this.anh = anh;
    }

<<<<<<< HEAD
    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
=======
    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
    }

    public BigDecimal getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(BigDecimal giaThue) {
        this.giaThue = giaThue;
    }

<<<<<<< HEAD
    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return "ChiTietXe{" + "idXe=" + idXe + ", idMS=" + idMS + ", tenXe=" + tenXe + ", tinhTrang=" + tinhTrang + ", soKm=" + soKm + ", ngayBaoDuong=" + ngayBaoDuong + ", anh=" + anh + ", bienSo=" + bienSo + ", giaThue=" + giaThue + ", trangThai=" + trangThai + '}';
    }

    

=======
    public Object[] todataRow() {
        return new Object[]{idXe.getMaXe(), tenhang.getTenHangXe(), idMS.getTenMs(), tinhTrang, soKm, ngayBaoDuong, anh, BienSoXe, giaThue};

    }
>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
}
