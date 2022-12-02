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
    public Boolean addPg(PhieuGiao pg) {
        return pgRep.addPG(pg);
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

}
