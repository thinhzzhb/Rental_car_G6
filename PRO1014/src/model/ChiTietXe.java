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
    private String tenXe;
    private String tinhTrang;
    private String soKm;
    private Date ngayBaoDuong;
    private byte[] anh;
    private String bienSo;
    private BigDecimal giaThue;
    private int trangThai;
    
    public ChiTietXe() {
    }

    public ChiTietXe(int idXe, int idMS, String tenXe, String tinhTrang, String soKm, Date ngayBaoDuong, byte[] anh, String bienSo, BigDecimal giaThue, int trangThai) {
        this.idXe = idXe;
        this.idMS = idMS;
        this.tenXe = tenXe;
        this.tinhTrang = tinhTrang;
        this.soKm = soKm;
        this.ngayBaoDuong = ngayBaoDuong;
        this.anh = anh;
        this.bienSo = bienSo;
        this.giaThue = giaThue;
        this.trangThai = trangThai;
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

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
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

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public BigDecimal getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(BigDecimal giaThue) {
        this.giaThue = giaThue;
    }

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

    

}
