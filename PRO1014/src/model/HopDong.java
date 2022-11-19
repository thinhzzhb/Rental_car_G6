/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class HopDong {

    private int IdHd;
    private String MaHd;
    private KhachHang IdKh;
    private Xe IdXe;
    private NhanVien IdNv;
    private String DieuKhoanHd;
    private int TienCoc;
    private String ThoaThuanDenBu;
    private int PhiPs;

    public HopDong() {
    }

    public HopDong(int IdHd, String MaHd, KhachHang IdKh, Xe IdXe, NhanVien IdNv, String DieuKhoanHd, int TienCoc, String ThoaThuanDenBu, int PhiPs) {
        this.IdHd = IdHd;
        this.MaHd = MaHd;
        this.IdKh = IdKh;
        this.IdXe = IdXe;
        this.IdNv = IdNv;
        this.DieuKhoanHd = DieuKhoanHd;
        this.TienCoc = TienCoc;
        this.ThoaThuanDenBu = ThoaThuanDenBu;
        this.PhiPs = PhiPs;
    }

    public HopDong(String DieuKhoanHd) {
        this.DieuKhoanHd = DieuKhoanHd;
    }

    public int getIdHd() {
        return IdHd;
    }

    public void setIdHd(int IdHd) {
        this.IdHd = IdHd;
    }

    public String getMaHd() {
        return MaHd;
    }

    public void setMaHd(String MaHd) {
        this.MaHd = MaHd;
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

    public NhanVien getIdNv() {
        return IdNv;
    }

    public void setIdNv(NhanVien IdNv) {
        this.IdNv = IdNv;
    }

    public String getDieuKhoanHd() {
        return DieuKhoanHd;
    }

    public void setDieuKhoanHd(String DieuKhoanHd) {
        this.DieuKhoanHd = DieuKhoanHd;
    }

    public int getTienCoc() {
        return TienCoc;
    }

    public void setTienCoc(int TienCoc) {
        this.TienCoc = TienCoc;
    }

    public String getThoaThuanDenBu() {
        return ThoaThuanDenBu;
    }

    public void setThoaThuanDenBu(String ThoaThuanDenBu) {
        this.ThoaThuanDenBu = ThoaThuanDenBu;
    }

    public int getPhiPs() {
        return PhiPs;
    }

    public void setPhiPs(int PhiPs) {
        this.PhiPs = PhiPs;
    }

}
