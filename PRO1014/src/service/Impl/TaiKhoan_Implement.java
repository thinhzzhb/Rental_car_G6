/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.TaiKhoanRespository;
import java.util.List;
import model.TaiKhoan;
import service.Taikhoan_Interface;

/**
 *
 * @author Admin
 */
public class TaiKhoan_Implement implements Taikhoan_Interface{
    private TaiKhoanRespository tkRep;

    public TaiKhoan_Implement() {
        tkRep = new TaiKhoanRespository();
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
    public TaiKhoan addTK(TaiKhoan tk) {
//        if (tk.getUserName() == null) {
//            return "Tài khoản không được để trống";
//        }else if (tk.getPass() == null) {
//            return "Mật khẩu không được để trống";
//        } else if (tkRep.checkExists(tk.getUserName()) == true) {
//            return "Tên tài khoản đã tồn tại";
//        } else {
//        }
      return tk;
    }

    @Override
    public String update(int id, TaiKhoan tk) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TaiKhoan findID(String username) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public Integer checkLogin(String User, String pass){
        if (tkRep.getUser(User, pass)==null) {
            return -1;
        }
        return tkRep.getUser(User, pass).getVaiTro();
    }
}
