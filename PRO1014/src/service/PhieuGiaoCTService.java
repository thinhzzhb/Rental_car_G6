/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.PhieuGiaoChiTiet;
import viewModel.PhieuGiaoCTViewModel;

/**
 *
 * @author Admin
 */
public interface PhieuGiaoCTService {

    public List<PhieuGiaoCTViewModel> getList();
    
    String addPG (PhieuGiaoChiTiet pgt);
}
