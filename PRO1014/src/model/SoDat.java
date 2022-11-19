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
public class SoDat {

    private int IdSoDat;
    private KhachHang IdKh;
    private Xe IdXe;
    private Date NgayDat;
    private Date NgayHenLay;
    private int SoLuongXe;

    public SoDat() {
    }

    public SoDat(int IdSoDat, KhachHang IdKh, Xe IdXe, Date NgayDat, Date NgayHenLay, int SoLuongXe) {
        this.IdSoDat = IdSoDat;
        this.IdKh = IdKh;
        this.IdXe = IdXe;
        this.NgayDat = NgayDat;
        this.NgayHenLay = NgayHenLay;
        this.SoLuongXe = SoLuongXe;
    }

    public int getIdSoDat() {
        return IdSoDat;
    }

    public void setIdSoDat(int IdSoDat) {
        this.IdSoDat = IdSoDat;
    }

    public KhachHang getIdKh() {
        return IdKh;
    }

    public void setIdKh(KhachHang IdKh) {
        this.IdKh = IdKh;
    }

    public Xe getIdXe() {
        return IdXe;
    }

    public void setIdXe(Xe IdXe) {
        this.IdXe = IdXe;
    }

    public Date getNgayDat() {
        return NgayDat;
    }

    public void setNgayDat(Date NgayDat) {
        this.NgayDat = NgayDat;
    }

    public Date getNgayHenLay() {
        return NgayHenLay;
    }

    public void setNgayHenLay(Date NgayHenLay) {
        this.NgayHenLay = NgayHenLay;
    }

    public int getSoLuongXe() {
        return SoLuongXe;
    }

    public void setSoLuongXe(int SoLuongXe) {
        this.SoLuongXe = SoLuongXe;
    }

}
