/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class MauSac {

    private int idMs;
    private String MaMs;
    private String TenMs;

    public MauSac() {
    }

    public MauSac(int idMs, String MaMs, String TenMs) {
        this.idMs = idMs;
        this.MaMs = MaMs;
        this.TenMs = TenMs;
    }

    public MauSac(String TenMs) {
        this.TenMs = TenMs;
    }

    public int getIdMs() {
        return idMs;
    }

    public void setIdMs(int idMs) {
        this.idMs = idMs;
    }

    public String getMaMs() {
        return MaMs;
    }

    public void setMaMs(String MaMs) {
        this.MaMs = MaMs;
    }

    public String getTenMs() {
        return TenMs;
    }

    public void setTenMs(String TenMs) {
        this.TenMs = TenMs;
    }

}
