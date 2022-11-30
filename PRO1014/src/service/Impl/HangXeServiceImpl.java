/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.HangXeRespository;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import model.HangXe;
import service.HangXeService;

/**
 *
 * @author GALAXY
 */
public class HangXeServiceImpl implements HangXeService {

    private HangXeRespository HangXeRespository = new HangXeRespository();

    @Override
    public List<HangXe> getAll() {
        List<HangXe> _lst = new ArrayList<>();
        return HangXeRespository.getAll();
    }

    @Override
    public String add(HangXe hx) {
        if (hx.getTenHangXe() == null) {
            return "khong duoc de trong";
        } else if (HangXeRespository.add(hx) == true) {
            return "them thanh cong";
        } else {
            return "them that bai";
        }
    }

    @Override
    public String ZenMa() {
        Random rd = new Random();
        int ranNub = rd.nextInt(999999);
        return "HX" + ranNub;
    }

    @Override
    public String update(HangXe hx, String tenHangXe) {
        boolean update = HangXeRespository.update(hx, tenHangXe);
        if (update == true) {
            return " sua thanh cong";
        } else {
            return " sua that bai";
        }
    }

    public HangXe getnameById(int id) {
        return HangXeRespository.getNameById(id);
    }

    public int getIdFormName(String name) {
        return HangXeRespository.getIdFormName(name);
    }

}
