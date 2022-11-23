/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.TaiKhoan;

/**
 *
 * @author Admin
 */
public interface Taikhoan_Interface {

    public List<TaiKhoan> getAll();

    public List<TaiKhoan> getUser(String User, String pass);

    String addTK(TaiKhoan tk);

    String update(int id, TaiKhoan tk);

    TaiKhoan findID(String username);

    String disable(int id, TaiKhoan t);

    String Xoa(int id);
}
