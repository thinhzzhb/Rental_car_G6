/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author Acer
 */
public class HoaDonThanhToan {

    private int IdHdtt;
    private HopDong IdHd;
    private Date ngayTao;
    private String tinhTrangXe;
    private int tongXe;
    private int TienCoc;
    private int PhiPs;
    private String ghiChu;
    private int TongThanhToan;
    private int tinhTrang;

    public HoaDonThanhToan() {
    }

    public HoaDonThanhToan(int IdHdtt, HopDong IdHd, Date ngayTao, String tinhTrangXe, int tongXe, int TienCoc, int PhiPs, String ghiChu, int TongThanhToan, int tinhTrang) {
        this.IdHdtt = IdHdtt;
        this.IdHd = IdHd;
        this.ngayTao = ngayTao;
        this.tinhTrangXe = tinhTrangXe;
        this.tongXe = tongXe;
        this.TienCoc = TienCoc;
        this.PhiPs = PhiPs;
        this.ghiChu = ghiChu;
        this.TongThanhToan = TongThanhToan;
        this.tinhTrang = tinhTrang;
    }

    public int getIdHdtt() {
        return IdHdtt;
    }

    public void setIdHdtt(int IdHdtt) {
        this.IdHdtt = IdHdtt;
    }

    public HopDong getIdHd() {
        return IdHd;
    }

    public void setIdHd(HopDong IdHd) {
        this.IdHd = IdHd;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    public String getTinhTrangXe() {
        return tinhTrangXe;
    }

    public void setTinhTrangXe(String tinhTrangXe) {
        this.tinhTrangXe = tinhTrangXe;
    }

    public int getTongXe() {
        return tongXe;
    }

    public void setTongXe(int tongXe) {
        this.tongXe = tongXe;
    }

    public int getTienCoc() {
        return TienCoc;
    }

    public void setTienCoc(int TienCoc) {
        this.TienCoc = TienCoc;
    }

    public int getPhiPs() {
        return PhiPs;
    }

    public void setPhiPs(int PhiPs) {
        this.PhiPs = PhiPs;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public int getTongThanhToan() {
        return TongThanhToan;
    }

    public void setTongThanhToan(int TongThanhToan) {
        this.TongThanhToan = TongThanhToan;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "HoaDonThanhToan{" + "IdHdtt=" + IdHdtt + ", IdHd=" + IdHd + ", ngayTao=" + ngayTao + ", tinhTrangXe=" + tinhTrangXe + ", tongXe=" + tongXe + ", TienCoc=" + TienCoc + ", PhiPs=" + PhiPs + ", ghiChu=" + ghiChu + ", TongThanhToan=" + TongThanhToan + ", tinhTrang=" + tinhTrang + '}';
    }

   

    

}
