/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class PhieuGiaoChiTiet {
    private int idPG;
    private int idXe;
    private int idKh;
    private String tinhtrang;
    private String GhiChu;

    public PhieuGiaoChiTiet() {
    }

    public PhieuGiaoChiTiet(int idPG, int idXe, int idKh, String tinhtrang, String GhiChu) {
        this.idPG = idPG;
        this.idXe = idXe;
        this.idKh = idKh;
        this.tinhtrang = tinhtrang;
        this.GhiChu = GhiChu;
    }

    public int getIdPG() {
        return idPG;
    }

    public void setIdPG(int idPG) {
        this.idPG = idPG;
    }

    public int getIdXe() {
        return idXe;
    }

    public void setIdXe(int idXe) {
        this.idXe = idXe;
    }

    public int getIdKh() {
        return idKh;
    }

    public void setIdKh(int idKh) {
        this.idKh = idKh;
    }

    public String getTinhtrang() {
        return tinhtrang;
    }

    public void setTinhtrang(String tinhtrang) {
        this.tinhtrang = tinhtrang;
    }

    public String getGhiChu() {
        return GhiChu;
    }

    public void setGhiChu(String GhiChu) {
        this.GhiChu = GhiChu;
    }

    @Override
    public String toString() {
        return "PhieuGiaoChiTiet{" + "idPG=" + idPG + ", idXe=" + idXe + ", idKh=" + idKh + ", tinhtrang=" + tinhtrang + ", GhiChu=" + GhiChu + '}';
    }
    
}
