/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.MauSacRespository;
import java.util.List;
import model.MauSac;
import service.MauSacService;

/**
 *
 * @author Acer
 */
public class MauSacServiceImpl implements MauSacService {

    private MauSacRespository MauSacRespository = new MauSacRespository();

    @Override
    public List<MauSac> getAll() {
        return MauSacRespository.getAll();
    }

    @Override
    public MauSac getOne(String MaMs) {
        return MauSacRespository.getOne(MaMs);
    }

}
