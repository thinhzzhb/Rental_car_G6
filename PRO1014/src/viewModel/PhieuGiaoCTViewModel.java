/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package viewModel;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class PhieuGiaoCTViewModel {

    private String tenKH;
    
    private String CCCD;
    
    private String sdt;
    
    private String diaChi;
    
    private int soGhe;
    
    private String tenXe;
    
    private String tenMS;
    
    private String tinhTrang;
    
    private String bienSo;
    
    private BigDecimal giaThue;
    
    private int soKm;
    
    private Date ngayTao;

    public PhieuGiaoCTViewModel() {
    }

    public PhieuGiaoCTViewModel(String tenKH, String CCCD, String sdt, String diaChi, int soGhe, String tenXe, String tenMS, String tinhTrang, String bienSo, BigDecimal giaThue, int soKm, Date ngayTao) {
        this.tenKH = tenKH;
        this.CCCD = CCCD;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.soGhe = soGhe;
        this.tenXe = tenXe;
        this.tenMS = tenMS;
        this.tinhTrang = tinhTrang;
        this.bienSo = bienSo;
        this.giaThue = giaThue;
        this.soKm = soKm;
        this.ngayTao = ngayTao;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(int soGhe) {
        this.soGhe = soGhe;
    }

    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    public String getTenMS() {
        return tenMS;
    }

    public void setTenMS(String tenMS) {
        this.tenMS = tenMS;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public String getBienSo() {
        return bienSo;
    }

    public void setBienSo(String bienSo) {
        this.bienSo = bienSo;
    }

    public BigDecimal getGiaThue() {
        return giaThue;
    }

    public void setGiaThue(BigDecimal giaThue) {
        this.giaThue = giaThue;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date ngayTao) {
        this.ngayTao = ngayTao;
    }

    @Override
    public String toString() {
        return "PhieuGiaoCTViewModel{" + "tenKH=" + tenKH + ", CCCD=" + CCCD + ", sdt=" + sdt + ", diaChi=" + diaChi + ", soGhe=" + soGhe + ", tenXe=" + tenXe + ", tenMS=" + tenMS + ", tinhTrang=" + tinhTrang + ", bienSo=" + bienSo + ", giaThue=" + giaThue + ", soKm=" + soKm + ", ngayTao=" + ngayTao + '}';
    }
    
    

}
