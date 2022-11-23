/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.NhanVien;

/**
 *
 * @author Acer
 */
public interface NhanVienService {

    List<NhanVien> getAll();

    String Them(NhanVien nv);

    List<NhanVien> listSearch(List<NhanVien> listnv, String TenNv);

    String Xoa(String tenNV);

    String Sua(NhanVien nv, String tenNV);
    
    String ZenMa();
}
