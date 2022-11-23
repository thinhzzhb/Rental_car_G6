/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.NhanVienRespository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.NhanVien;
import service.NhanVienService;

/**
 *
 * @author Acer
 */
public class NhanVienServiceImpl implements NhanVienService {

    public NhanVienRespository NhanVienRespository = new NhanVienRespository();

    @Override
    public List<NhanVien> getAll() {
        return NhanVienRespository.getAll();
    }

    @Override
    public String Them(NhanVien nv) {
        boolean them = NhanVienRespository.Them(nv);
        if (them) {
            return "Them Thanh Cong";
        } else {
            return "Them That Bai";
        }
    }

    @Override
    public List<NhanVien> listSearch(List<NhanVien> listnv, String TenNv) {
        List<NhanVien> listSearch = new ArrayList<>();
        for (NhanVien x : listnv) {
            if (x.getTenNv().contains(TenNv)) {
                listSearch.add(x);
            }
        }
        return listSearch;
    }

    @Override
    public String Xoa(String tenNV) {
        boolean xoa = NhanVienRespository.Xoa(tenNV);
        if (xoa) {
            return "Xoa Thanh Cong";
        } else {
            return "Xoa That Bai";
        }
    }

    @Override
    public String Sua(NhanVien nv, String tenNV) {
        boolean sua = NhanVienRespository.Sua(nv, tenNV);
        if (sua) {
            return "Sua Thanh cong";
        } else {
            return "Sua that Bai";
        }
    }

    @Override
    public String ZenMa() {
        Random rd = new Random();
        int ranNub = rd.nextInt(999999);
        return "NV" + ranNub;
    }
}
