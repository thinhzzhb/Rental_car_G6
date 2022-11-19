/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.ChiTietHopDong;

/**
 *
 * @author Admin
 */
public interface ChiTietHopDongservice {

    public List<ChiTietHopDong> getAllfromDB();

    ChiTietHopDong findById(int id);

    String addCTHD(ChiTietHopDong cthd);

    String Update(int id, ChiTietHopDong c);
}
