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
    private int idXe;
    private int idMS;
    private String tenhang;
    private String soKm;
    private String tinhTrang;
    private Date ngayBaoDuong;
    private byte[] anh;
    private BigDecimal giaThue;

    public ChiTietXe() {
    }

    public ChiTietXe(int idXe, int idMS, String tenhang, String soKm, String tinhTrang, Date ngayBaoDuong, byte[] anh, BigDecimal giaThue) {
        this.idXe = idXe;
        this.idMS = idMS;
        this.tenhang = tenhang;
        this.soKm = soKm;
        this.tinhTrang = tinhTrang;
        this.ngayBaoDuong = ngayBaoDuong;
        this.anh = anh;
        this.giaThue = giaThue;
    }

    public int getIdXe() {
        return idXe;
    }

    public void setIdXe(int idXe) {
        this.idXe = idXe;
    }

    public int getIdMS() {
        return idMS;
    }

    public void setIdMS(int idMS) {
        this.idMS = idMS;
    }

    public String getTenhang() {
        return tenhang;
    }

    public void setTenhang(String tenhang) {
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

    public BigDecimal getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(BigDecimal giaThue) {
        this.giaThue = giaThue;
    }

    @Override
    public String toString() {
        return "ChiTietXe{" + "idXe=" + idXe + ", idMS=" + idMS + ", tenhang=" + tenhang + ", soKm=" + soKm + ", tinhTrang=" + tinhTrang + ", ngayBaoDuong=" + ngayBaoDuong + ", anh=" + anh + ", giaThue=" + giaThue + '}';
    }

    
    
    
}
