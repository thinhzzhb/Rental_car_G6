/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class Xe {

    private int IdXe;
    private String MaXe;
    private HangXe IdHangXe;
    private MauSac IdMauSac;
    private String TenXe;
    private String BienSoXe;
    private String TinhTrangXe;

    public Xe() {
    }

    public Xe(int IdXe, String MaXe, HangXe IdHangXe, MauSac IdMauSac, String TenXe, String BienSoXe, String TinhTrangXe) {
        this.IdXe = IdXe;
        this.MaXe = MaXe;
        this.IdHangXe = IdHangXe;
        this.IdMauSac = IdMauSac;
        this.TenXe = TenXe;
        this.BienSoXe = BienSoXe;
        this.TinhTrangXe = TinhTrangXe;
    }

    public Xe(String TenXe) {
        this.TenXe = TenXe;
    }

    public int getIdXe() {
        return IdXe;
    }

    public void setIdXe(int IdXe) {
        this.IdXe = IdXe;
    }

    public String getMaXe() {
        return MaXe;
    }

    public void setMaXe(String MaXe) {
        this.MaXe = MaXe;
    }

    public HangXe getIdHangXe() {
        return IdHangXe;
    }

    public void setIdHangXe(HangXe IdHangXe) {
        this.IdHangXe = IdHangXe;
    }

    public MauSac getIdMauSac() {
        return IdMauSac;
    }

    public void setIdMauSac(MauSac IdMauSac) {
        this.IdMauSac = IdMauSac;
    }

    public String getTenXe() {
        return TenXe;
    }

    public void setTenXe(String TenXe) {
        this.TenXe = TenXe;
    }

    public String getBienSoXe() {
        return BienSoXe;
    }

    public void setBienSoXe(String BienSoXe) {
        this.BienSoXe = BienSoXe;
    }

    public String getTinhTrangXe() {
        return TinhTrangXe;
    }

    public void setTinhTrangXe(String TinhTrangXe) {
        this.TinhTrangXe = TinhTrangXe;
    }

}
