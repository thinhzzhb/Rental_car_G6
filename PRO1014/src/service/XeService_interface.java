/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.Xe;

/**
 *
 * @author Admin
 */
public interface XeService_interface {
    
    List<Xe> getAll();

    String add(Xe x);

    String update(Xe x, int idHang);

    String delete(int id);
    
}