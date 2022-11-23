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
    public List<HoaDonThanhToan> findByIDHD(List<HoaDonThanhToan> listHD, int idHD) {
        List<HoaDonThanhToan> findByIDHD = new ArrayList<>();
        for (HoaDonThanhToan x : listHD) {
            if (x.getIdHd().contains(idHD)) {
                findByIDHD.add(x);
            }
        }
        return findByIDHD;
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
