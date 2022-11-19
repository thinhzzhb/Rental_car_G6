/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class NhanVien {

    private int idNv;
    private String MaNv;
    private String TenNv;
    private ChucVu idCv;
    private String DiaChi;
    private String Sdt;
    private boolean GioiTinh;

    public NhanVien() {
    }

    public NhanVien(int idNv, String MaNv, String TenNv, ChucVu idCv, String DiaChi, String Sdt, boolean GioiTinh) {
        this.idNv = idNv;
        this.MaNv = MaNv;
        this.TenNv = TenNv;
        this.idCv = idCv;
        this.DiaChi = DiaChi;
        this.Sdt = Sdt;
        this.GioiTinh = GioiTinh;
    }

    public NhanVien(String TenNv) {
        this.TenNv = TenNv;
    }

    public int getIdNv() {
        return idNv;
    }

    public void setIdNv(int idNv) {
        this.idNv = idNv;
    }

    public String getMaNv() {
        return MaNv;
    }

    public void setMaNv(String MaNv) {
        this.MaNv = MaNv;
    }

    public String getTenNv() {
        return TenNv;
    }

    public void setTenNv(String TenNv) {
        this.TenNv = TenNv;
    }

    public ChucVu getIdCv() {
        return idCv;
    }

    public void setIdCv(ChucVu idCv) {
        this.idCv = idCv;
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

    public boolean isGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(boolean GioiTinh) {
        this.GioiTinh = GioiTinh;
    }

}
