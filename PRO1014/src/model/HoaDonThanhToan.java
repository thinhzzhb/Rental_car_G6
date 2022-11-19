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
    private int tongXe;
    private int TienCoc;
    private int PhiPs;
    private int TongThanhToan;

    public HoaDonThanhToan() {
    }

    public HoaDonThanhToan(int IdHdtt, HopDong IdHd, Date ngayTao, int tongXe, int TienCoc, int PhiPs, int TongThanhToan) {
        this.IdHdtt = IdHdtt;
        this.IdHd = IdHd;
        this.ngayTao = ngayTao;
        this.tongXe = tongXe;
        this.TienCoc = TienCoc;
        this.PhiPs = PhiPs;
        this.TongThanhToan = TongThanhToan;
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

    public int getTongThanhToan() {
        return TongThanhToan;
    }

    public void setTongThanhToan(int TongThanhToan) {
        this.TongThanhToan = TongThanhToan;
    }

}
