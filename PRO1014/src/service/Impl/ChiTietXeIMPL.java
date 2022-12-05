/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.ChiTietXeRepository;
import java.util.List;
import java.util.Random;
import model.ChiTietXe;
import service.ChiTietXeService;

/**
 *
 * @author Admin
 */
public class ChiTietXeIMPL implements ChiTietXeService {

    private ChiTietXeRepository ctSer = new ChiTietXeRepository();

    @Override
    public List<ChiTietXe> getAll() {
        return ctSer.getAll();
    }

    @Override
<<<<<<< HEAD
    public ChiTietXe findBS(String bs) {
        return ctSer.findBS(bs);
    }
    
=======
    public String them(ChiTietXe ctx) {
        boolean them = ctSer.them(ctx);
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
        return "X" + ranNub;
    }

>>>>>>> 85534e708e82da0a4cc199879cddd1928bdbfc76
}
