/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.PhieuGiaoRepository;
import java.util.List;
import java.util.Random;
import model.PhieuGiao;
import service.PhieuGiaoService;

/**
 *
 * @author Admin
 */
public class PhieuGiaoIMPL implements PhieuGiaoService {

    private PhieuGiaoRepository pgRep;

    public PhieuGiaoIMPL() {
        pgRep = new PhieuGiaoRepository();
    }

    @Override
    public String addPg(PhieuGiao pg) {
        boolean addPG = pgRep.addPG(pg);
        if (addPG == true) {
            return "Tạo phiếu giao thành công";
        } else {
            return "Không tạo được phiếu giao";
        }
    }

    @Override
    public String ZenMA() {
        Random rd = new Random();
        int ranNub = rd.nextInt(999999);
        return "Pg" + ranNub;
    }

    @Override
    public List<PhieuGiao> getList() {
        return pgRep.getAll();
    }

    @Override
    public String updatePg(String Ma, PhieuGiao pg) {
        boolean Update = pgRep.updatePG(Ma,pg);
        if (Update == true) {
            return "Đã cập nhật Phiếu giao";
        } else {
            return "Cập nhật thất bại";
        }
    }

}
