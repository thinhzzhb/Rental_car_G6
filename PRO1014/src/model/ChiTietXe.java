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

    private Xe idXe;
    private MauSac idMS;
    private HangXe tenhang;
    private String soKm;
    private String tinhTrang;
    private Date ngayBaoDuong;
    private byte[] anh;
    private String BienSoXe;
    private BigDecimal giaThue;

    public ChiTietXe() {
    }

    public ChiTietXe(Xe idXe, MauSac idMS, HangXe tenhang, String soKm, String tinhTrang, Date ngayBaoDuong, byte[] anh, String BienSoXe, BigDecimal giaThue) {
        this.idXe = idXe;
        this.idMS = idMS;
        this.tenhang = tenhang;
        this.soKm = soKm;
        this.tinhTrang = tinhTrang;
        this.ngayBaoDuong = ngayBaoDuong;
        this.anh = anh;
        this.BienSoXe = BienSoXe;
        this.giaThue = giaThue;
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
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
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

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    public BigDecimal getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(BigDecimal giaThue) {
        this.giaThue = giaThue;
    }

    public Object[] todataRow() {
        return new Object[]{idXe.getMaXe(), tenhang.getTenHangXe(), idMS.getTenMs(), tinhTrang, soKm, ngayBaoDuong, anh, BienSoXe, giaThue};

    }
}
