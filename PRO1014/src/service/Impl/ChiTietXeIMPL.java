/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service.Impl;

import Respository.ChiTietXeRepository;
import java.util.List;
import model.ChiTietXe;
import service.ChiTietXeService;

/**
 *
 * @author Admin
 */
public class ChiTietXeIMPL implements ChiTietXeService{
    
   private ChiTietXeRepository ctSer = new ChiTietXeRepository();
    
    @Override
    public List<ChiTietXe> getAll() {
        return ctSer.getAll();
    }
    
}
