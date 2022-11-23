/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.KhachHang;

/**
 *
 * @author Acer
 */
public interface KhachHangService {

    List<KhachHang> getAll();

    String Them(KhachHang kh);

    String ZenMa();

    String Sua(KhachHang kh, String TenKh);

    List<KhachHang> listSearch(List<KhachHang> listkh, String TenKh);
}
