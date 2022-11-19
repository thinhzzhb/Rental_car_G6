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
public class SoThue {

    private int IdSo;
    private Xe IdXe;
    private HopDong IdHd;
    private Date NgayNhan;
    private Date NgayTra;

    public SoThue() {
    }

    public SoThue(int IdSo, Xe IdXe, HopDong IdHd, Date NgayNhan, Date NgayTra) {
        this.IdSo = IdSo;
        this.IdXe = IdXe;
        this.IdHd = IdHd;
        this.NgayNhan = NgayNhan;
        this.NgayTra = NgayTra;
    }

    public int getIdSo() {
        return IdSo;
    }

    public void setIdSo(int IdSo) {
        this.IdSo = IdSo;
    }

    public Xe getIdXe() {
        return IdXe;
    }

    public void setIdXe(Xe IdXe) {
        this.IdXe = IdXe;
    }

    public HopDong getIdHd() {
        return IdHd;
    }

    public void setIdHd(HopDong IdHd) {
        this.IdHd = IdHd;
    }

    public Date getNgayNhan() {
        return NgayNhan;
    }

    public void setNgayNhan(Date NgayNhan) {
        this.NgayNhan = NgayNhan;
    }

    public Date getNgayTra() {
        return NgayTra;
    }

    public void setNgayTra(Date NgayTra) {
        this.NgayTra = NgayTra;
    }

}
