/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class ChiTietHopDong {

    private Xe IdXe;
    private HopDong IdHd;
    private int SoLuongXe;
    private int DonGia;

    public ChiTietHopDong() {
    }

    public ChiTietHopDong(Xe IdXe, HopDong IdHd, int SoLuongXe, int DonGia) {
        this.IdXe = IdXe;
        this.IdHd = IdHd;
        this.SoLuongXe = SoLuongXe;
        this.DonGia = DonGia;
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

    public int getSoLuongXe() {
        return SoLuongXe;
    }

    public void setSoLuongXe(int SoLuongXe) {
        this.SoLuongXe = SoLuongXe;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }

}
