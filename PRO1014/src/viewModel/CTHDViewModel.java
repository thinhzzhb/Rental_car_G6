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

    public CTHDViewModel() {
    }

    public CTHDViewModel(String tenSp, int soLuong, BigDecimal donGia) {
        this.tenSp = tenSp;
        this.soLuong = soLuong;
        this.donGia = donGia;
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
    
}
