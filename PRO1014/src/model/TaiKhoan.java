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
    private int VaiTro;

    public TaiKhoan() {
    }

    public TaiKhoan(int IdTk, int VaiTro) {
        this.IdTk = IdTk;
        this.VaiTro = VaiTro;
    }

    public TaiKhoan(int VaiTro) {
        this.VaiTro = VaiTro;
    }

    public int getIdTk() {
        return IdTk;
    }

    public void setIdTk(int IdTk) {
        this.IdTk = IdTk;
    }

    public int getVaiTro() {
        return VaiTro;
    }

    public void setVaiTro(int VaiTro) {
        this.VaiTro = VaiTro;
    }

}
