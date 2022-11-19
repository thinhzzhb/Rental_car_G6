/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.ChiTietHopDongRespository;
import java.util.List;
import model.ChiTietHopDong;
import service.ChiTietHopDongservice;

/**
 *
 * @author Admin
 */
public class ChitiethopdongIMPL implements ChiTietHopDongservice{

    private ChiTietHopDongRespository cthdRep;
    
    public ChitiethopdongIMPL() {
        cthdRep = new ChiTietHopDongRespository();
    }

    @Override
    public List<ChiTietHopDong> getAllfromDB() {
        return cthdRep.getAll();
    }

    @Override
    public ChiTietHopDong findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String addCTHD(ChiTietHopDong cthd) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String Update(int id, ChiTietHopDong c) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
