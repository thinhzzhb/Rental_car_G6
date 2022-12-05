/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

import java.math.BigDecimal;

/**
 *
 * @author Admin
 */
public class CTHDViewModel {

    private String tenSp;
    private int soLuong;
    private BigDecimal donGia;
    private String bienSo;

    public CTHDViewModel() {
    }

    public CTHDViewModel(String tenSp, int soLuong, BigDecimal donGia, String bienSo) {
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.bienSo = bienSo;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public BigDecimal getDonGia() {
        return donGia;
    }

    public void setDonGia(BigDecimal donGia) {
        this.donGia = donGia;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    @Override
    public String toString() {
        return "CTHDViewModel{" + "tenSp=" + tenSp + ", soLuong=" + soLuong + ", donGia=" + donGia + ", bienSo=" + bienSo + '}';
    }

    
    
}
