/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class TaiKhoan {

    private int IdTk;
    private String userName;
    private String pass;
    private int VaiTro;
    private int tinhTrang;
    
    public TaiKhoan() {
    }

    public TaiKhoan(int IdTk) {
        this.IdTk = IdTk;
    }

    public TaiKhoan(int IdTk, String userName, String pass, int VaiTro, int tinhTrang) {
        this.IdTk = IdTk;
        this.userName = userName;
        this.pass = pass;
        this.VaiTro = VaiTro;
        this.tinhTrang = tinhTrang;
    }

    public int getIdTk() {
        return IdTk;
    }

    public void setIdTk(int IdTk) {
        this.IdTk = IdTk;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public int getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(int VaiTro) {
        this.VaiTro = VaiTro;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "IdTk=" + IdTk + ", userName=" + userName + ", pass=" + pass + ", VaiTro=" + VaiTro + ", tinhTrang=" + tinhTrang + '}';
    }

    
    
    
}
