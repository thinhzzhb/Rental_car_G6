/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class ChiTietHoaDon {

    private int IdXe;
    private int IdHd;
    private int SoLuongXe;
    private int DonGia;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(int IdXe, int IdHd, int SoLuongXe, int DonGia) {
        this.IdXe = IdXe;
        this.IdHd = IdHd;
        this.SoLuongXe = SoLuongXe;
        this.DonGia = DonGia;
    }

    public int getIdXe() {
        return IdXe;
    }

    public void setIdXe(int IdXe) {
        this.IdXe = IdXe;
    }

    public int getIdHd() {
        return IdHd;
    }

    public void setIdHd(int IdHd) {
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

    @Override
    public String toString() {
        return "ChiTietHopDong{" + "IdXe=" + IdXe + ", IdHd=" + IdHd + ", SoLuongXe=" + SoLuongXe + ", DonGia=" + DonGia + '}';
    }

    

}
