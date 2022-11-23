/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class KhachHang {

    private int idKh;
    private String maKh;
    private String TenKh;
    private String DiaChi;
    private String Sdt;
    private String Cccd;
    private boolean GioiTinh;
    private ChucVu IdCv;

    public KhachHang() {
    }

    public KhachHang(int idKh, String maKh, String TenKh, String DiaChi, String Sdt, String Cccd, boolean GioiTinh, ChucVu IdCv) {
        this.idKh = idKh;
        this.maKh = maKh;
        this.TenKh = TenKh;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.Cccd = Cccd;
        this.GioiTinh = GioiTinh;
        this.IdCv = IdCv;
    }

    public KhachHang(String maKh, String TenKh, String DiaChi, String Sdt, String Cccd, boolean GioiTinh) {
        this.maKh = maKh;
        this.TenKh = TenKh;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.Cccd = Cccd;
        this.GioiTinh = GioiTinh;
    }

    public KhachHang(String TenKh) {
        this.TenKh = TenKh;
    }

    public int getIdKh() {
        return idKh;
    }

    public void setIdKh(int idKh) {
        this.idKh = idKh;
    }

    public String getMaKh() {
        return maKh;
    }

    public void setMaKh(String maKh) {
        this.maKh = maKh;
    }

    public String getTenKh() {
        return TenKh;
    }

    public void setTenKh(String TenKh) {
        this.TenKh = TenKh;
    }

    public String getDiaChi() {
        return DiaChi;
    }

    public void setDiaChi(String DiaChi) {
        this.DiaChi = DiaChi;
    }

    public String getSdt() {
        return Sdt;
    }

    public void setSdt(String Sdt) {
        this.Sdt = Sdt;
    }

    public String getCccd() {
        return Cccd;
    }

    public void setCccd(String Cccd) {
        this.Cccd = Cccd;
    }

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

    public ChucVu getIdCv() {
        return IdCv;
    }

    public void setIdCv(ChucVu IdCv) {
        this.IdCv = IdCv;
    }

    public Object[] todataRow() {
        return new Object[]{maKh, TenKh, GioiTinh == true ? "Nam" : "Nu", DiaChi, Sdt, Cccd};
    }
}
