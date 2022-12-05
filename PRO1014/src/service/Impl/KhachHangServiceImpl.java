/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.KhachHangRespository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.KhachHang;
import service.KhachHangService;

/**
 *
 * @author Acer
 */
public class KhachHangServiceImpl implements KhachHangService {

    private KhachHangRespository KhachHangRespository = new KhachHangRespository();

    @Override
    public List<KhachHang> getAll() {
        return KhachHangRespository.getAll();
    }

    @Override
    public String Them(KhachHang kh) {
        boolean them = KhachHangRespository.them(kh);
        if (them) {
            return "Them thanh cong";
        } else {
            return "Them that bai";
        }
    }

    @Override
    public String ZenMa() {
        Random rd = new Random();
        int ranNub = rd.nextInt(999999);
        return "KH" + ranNub;
    }

    @Override
    public String Sua(KhachHang kh, String TenKh) {
        boolean sua = KhachHangRespository.Sua(kh, TenKh);
        if (sua) {
            return "Sua Thanh cong";
        } else {
            return "Sua that bai";
        }
    }

    @Override
    public KhachHang findbyName(String name) {
        return KhachHangRespository.findByName(name);
    }

}
