/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import service.PhieuGiaoCTService;
import Respository.ChiTietPhieuGiaoRepository;
import java.util.List;
import javax.swing.JOptionPane;
import model.PhieuGiaoChiTiet;
import viewModel.PhieuGiaoCTViewModel;

/**
 *
 * @author Admin
 */
public class PhieuGiaoCTIMPL implements PhieuGiaoCTService{
    private ChiTietPhieuGiaoRepository CTPRep;

    public PhieuGiaoCTIMPL() {
        CTPRep = new ChiTietPhieuGiaoRepository();
    }
    
    @Override
    public List<PhieuGiaoCTViewModel> getList() {
        return CTPRep.getAll();
    }

    @Override
    public String addPG(PhieuGiaoChiTiet pgt) {
//        if (pgt.getIdPG() == null) {
//            return "Không đc trống";
//        }
        if (CTPRep.add(pgt) == true) {
            return "Đã tạo phiếu giao chi tiết";
        } else {
            return "Thật bại";
        }
    }
    
}
