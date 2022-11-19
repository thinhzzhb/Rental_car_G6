/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class HangXe {

    private int IdHangXe;
    private String MaHangXe;
    private String TenHangXe;

    public HangXe() {
    }

    public HangXe(int IdHangXe, String MaHangXe, String TenHangXe) {
        this.IdHangXe = IdHangXe;
        this.MaHangXe = MaHangXe;
        this.TenHangXe = TenHangXe;
    }

    public HangXe(String TenHangXe) {
        this.TenHangXe = TenHangXe;
    }

    public int getIdHangXe() {
        return IdHangXe;
    }

    public void setIdHangXe(int IdHangXe) {
        this.IdHangXe = IdHangXe;
    }

    public String getMaHangXe() {
        return MaHangXe;
    }

    public void setMaHangXe(String MaHangXe) {
        this.MaHangXe = MaHangXe;
    }

    public String getTenHangXe() {
        return TenHangXe;
    }

    public void setTenHangXe(String TenHangXe) {
        this.TenHangXe = TenHangXe;
    }

}
