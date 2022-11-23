/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.HoaDonThanhToanRespository;
import java.util.ArrayList;
import java.util.List;
import model.HoaDonThanhToan;
import service.HoaDonThanhToanService;

/**
 *
 * @author damducduoc
 */
public class HoaDonThanhToanIMPL implements HoaDonThanhToanService {
    
    private HoaDonThanhToanRespository hdTTRespository = new HoaDonThanhToanRespository();

    @Override
    public List<HoaDonThanhToan> getAll() {
        return hdTTRespository.getAll();
        }

    
    @Override
    public String add (HoaDonThanhToan hdtt) {
        boolean add = hdTTRespository.Add(hdtt);
        if (add) {
            return "Them Thanh Cong";
        } else {
            return "Them That Bai";
        }
    }

    @Override
    public String Update(int id, HoaDonThanhToan hdtt) {
        boolean update = hdTTRespository.Update(hdtt, id);
        if (update) {
            return "Sua Thanh cong";
        } else {
            return "Sua that Bai";
        }
    }
    @Override
    public List<HoaDonThanhToan> findByIDHDTT(List<HoaDonThanhToan> listHDTT, int idHDTT) {
        List<HoaDonThanhToan> findByIDHDTT = new ArrayList<>();
        for (HoaDonThanhToan x : listHDTT) {
            if (x.getIdHdtt() == idHDTT) {
                findByIDHDTT.add(x);
            }
        }
        return findByIDHDTT;
    }

    @Override
    public String Remove(int idHDTT) {
        boolean remove = hdTTRespository.Remove(idHDTT);
        if (remove) {
            return "Xoa Thanh Cong";
        } else {
            return "Xoa That Bai";
        }
    }
}
