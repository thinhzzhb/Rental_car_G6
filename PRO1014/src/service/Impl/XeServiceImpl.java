/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.XeResposiotry;
import java.util.List;
import java.util.Random;
import model.HangXe;
import model.Xe;
import service.XeService_interface;

/**
 *
 * @author Admin
 */
public class XeServiceImpl implements XeService_interface {

    private XeResposiotry _xeRep;

    public XeServiceImpl() {
        _xeRep = new XeResposiotry();
    }

    public String ZenMA() {
        Random rd = new Random();
        int ranNub = rd.nextInt(999999);
        return "Car" + ranNub;
    }

    @Override
    public List<Xe> getAll() {
        return _xeRep.getAll();
    }

    @Override
    public String add(Xe x) {
        boolean addXe = _xeRep.add(x);
        if (addXe == true) {
            return "Thêm thành công";
        } else {
            return "Thêm thất bại";
        }
    }

    @Override
    public String update(Xe x, int idHang) {
        boolean UpdateXe = _xeRep.update(idHang, x);
        if (UpdateXe == true) {
            return "Sửa thành công";
        } else {
            return "Sửa thất bại";
        }
    }

    @Override
    public String delete(int id) {
        boolean deleteXe = _xeRep.delete(id);
        if (deleteXe == true) {
            return "Xóa thành công";
        } else {
            return "Xóa thất bại";
        }
    }

    @Override
    public Xe getOne(String MaXe) {
        return _xeRep.getOne(MaXe);
    }

}
