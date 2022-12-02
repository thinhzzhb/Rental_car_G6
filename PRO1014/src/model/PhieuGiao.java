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
public class PhieuGiao {
    private int idPG;
    private String tinhTrangXe;
    private String maPG;
    private Date ngayTao;
    private String tenKhach;
    private BigDecimal tienCoc;
    private BigDecimal tongTienTamTinh;

    public PhieuGiao() {
    }

    public PhieuGiao(int idPG, String tinhTrangXe, String maPG, Date ngayTao, String tenKhach, BigDecimal tienCoc, BigDecimal tongTienTamTinh) {
        this.idPG = idPG;
        this.tinhTrangXe = tinhTrangXe;
        this.maPG = maPG;
        this.ngayTao = ngayTao;
        this.tenKhach = tenKhach;
        this.tienCoc = tienCoc;
        this.tongTienTamTinh = tongTienTamTinh;
    }

    public int getIdPG() {
        return idPG;
    }

    public void setIdPG(int idPG) {
        this.idPG = idPG;
    }

    public String getTinhTrangXe() {
        return tinhTrangXe;
    }

    public void setTinhTrangXe(String tinhTrangXe) {
        this.tinhTrangXe = tinhTrangXe;
    }

    public String getMaPG() {
        return maPG;
    }

    public void setMaPG(String maPG) {
        this.maPG = maPG;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTenKhach() {
        return tenKhach;
    }

    public void setTenKhach(String tenKhach) {
        this.tenKhach = tenKhach;
    }

    public BigDecimal getTienCoc() {
        return tienCoc;
    }

    public void setTienCoc(BigDecimal tienCoc) {
        this.tienCoc = tienCoc;
    }

    public BigDecimal getTongTienTamTinh() {
        return tongTienTamTinh;
    }

    public void setTongTienTamTinh(BigDecimal tongTienTamTinh) {
        this.tongTienTamTinh = tongTienTamTinh;
    }

    @Override
    public String toString() {
        return "PhieuGiao{" + "idPG=" + idPG + ", tinhTrangXe=" + tinhTrangXe + ", maPG=" + maPG + ", ngayTao=" + ngayTao + ", tenKhach=" + tenKhach + ", tienCoc=" + tienCoc + ", tongTienTamTinh=" + tongTienTamTinh + '}';
    }
    
    
    
}
