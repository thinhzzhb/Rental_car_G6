/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.HoaDonThanhToanRespository;
import java.util.List;
import model.HoaDonThanhToan;
import service.HoaDonThanhToanService;

/**
 *
 * @author damducduoc
 */
public class HoaDonThanhToanIMPL implements HoaDonThanhToanService {
    
    private HoaDonThanhToanRespository hdttRep;

    public HoaDonThanhToanIMPL() {
        hdttRep = new HoaDonThanhToanRespository();
    }
    
    
    
    @Override
    public List<HoaDonThanhToan> getAll() {
        return hdttRep.getAll();
        }

    @Override
    public HoaDonThanhToan findByID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String addCTHD(HoaDonThanhToan hdtt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Update(int id, HoaDonThanhToan hdtt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
