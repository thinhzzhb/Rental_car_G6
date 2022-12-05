/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class PhieuGiao {
    private int idPG;
    private String maPG;
    private String bienSo;
    private Date ngayTao;
    

    public PhieuGiao() {
    }

    public PhieuGiao(int idPG, String maPG, String bienSo, Date ngayTao) {
        this.idPG = idPG;
        this.maPG = maPG;
        this.bienSo = bienSo;
        this.ngayTao = ngayTao;
    }

    public int getIdPG() {
        return idPG;
    }

    public void setIdPG(int idPG) {
        this.idPG = idPG;
    }

    public String getMaPG() {
        return maPG;
    }

    public void setMaPG(String maPG) {
        this.maPG = maPG;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "PhieuGiao{" + "idPG=" + idPG + ", maPG=" + maPG + ", bienSo=" + bienSo + ", ngayTao=" + ngayTao + '}';
    }

    
}
