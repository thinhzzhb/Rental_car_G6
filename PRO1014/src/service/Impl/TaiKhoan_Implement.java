/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.TaiKhoanRespository;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import model.TaiKhoan;
import service.Taikhoan_Interface;

/**
 *
 * @author Admin
 */
public class TaiKhoan_Implement implements Taikhoan_Interface {

    private TaiKhoanRespository tkRep;

    public TaiKhoan_Implement() {
        tkRep = new TaiKhoanRespository();
    }

    public String ZenMA() {
        Random rd = new Random();
        int ranNub = rd.nextInt(999999);
        return "Tk" + ranNub;
    }

    @Override
    public List<TaiKhoan> getAll() {
        return this.tkRep.getAll();
    }

    @Override
    public List<TaiKhoan> getUser(String user, String pass) {
        return this.getUser(user, pass);
    }

    @Override
    public String addTK(TaiKhoan tk) {
        if (tk.getUserName().isBlank()) {
            return "Tài khoản không được để trống";
        } else if (tk.getPass().isBlank()) {
            return "Mật khẩu không được để trống";

        } else if (tkRep.add(tk) == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(int id, TaiKhoan tk) {
        if (tk.getUserName() == null) {
            return "Tài khoản không được để trống";
        } else if (tk.getPass() == null) {
            return "Mật khẩu không được để trống";
        } else if (tkRep.update(id, tk) == true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public TaiKhoan findID(String username) {
        return tkRep.findID(username);
    }

    public Integer checkLogin(String User, String pass) {
        return tkRep.getUser(User, pass).getVaiTro();
    }

    @Override
    public String disable(int id, TaiKhoan t) {
        if (tkRep.disable(id, t)) {
            return "Tài khoản đã bị vô hiệu hóa";
        }else {
            return "Không thể vô hiệu hóa";
        }
    }

    @Override
    public String Xoa(int id) {
        if (tkRep.Xoa(id)) {
            return "Xóa thành công";
        }else {
            return "Xóa thất bại";
        }
    }
    public int stateChangeAccount(String userName){
        return tkRep.stateChangeAccount(userName);
    }
    public  int staChangeAC2(String user){
        return tkRep.stateChangeAccount2(user);
    }
}
