/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.ChiTietHoaDon;

/**
 *
 * @author Admin
 */
public interface ChiTietHopDongservice {

    public List<ChiTietHoaDon> getAllfromDB();

    ChiTietHoaDon findById(int id);

    String addCTHD(ChiTietHoaDon cthd);

    String Update(int id, ChiTietHoaDon c);
}
