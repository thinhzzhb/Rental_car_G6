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
    private int IdHangXe;
    private int soGhe;
    private byte[] hinhAnh;

    public Xe() {
    }

    public Xe(int IdXe, String MaXe, int IdHangXe, int soGhe, byte[] hinhAnh) {
        this.IdXe = IdXe;
        this.MaXe = MaXe;
        this.IdHangXe = IdHangXe;
        this.soGhe = soGhe;
        this.hinhAnh = hinhAnh;
    }

    public Xe(String MaXe) {
        this.MaXe = MaXe;
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

    public int getIdHangXe() {
        return IdHangXe;
    }

    public void setIdHangXe(int IdHangXe) {
        this.IdHangXe = IdHangXe;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public byte[] getHinhAnh() {
        return hinhAnh;
    }

    public void setHinhAnh(byte[] hinhAnh) {
        this.hinhAnh = hinhAnh;
    }

    @Override
    public String toString() {
        return "Xe{" + "IdXe=" + IdXe + ", MaXe=" + MaXe + ", IdHangXe=" + IdHangXe + ", soGhe=" + soGhe + ", hinhAnh=" + hinhAnh + '}';
    }

}
