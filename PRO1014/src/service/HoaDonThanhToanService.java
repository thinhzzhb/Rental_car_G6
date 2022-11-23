/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HoaDonThanhToan;

/**
 *
 * @author damducduoc
 */
public interface HoaDonThanhToanService {

    public List<HoaDonThanhToan> getAll();

    //HoaDonThanhToan findByIDHD(int id);
    
    List<HoaDonThanhToan> findByIDHDTT(List<HoaDonThanhToan> listHDTT, int idHDTT);

    String add(HoaDonThanhToan hdtt);

    String Update(int id, HoaDonThanhToan hdtt);
    
    String Remove(int id);
}
