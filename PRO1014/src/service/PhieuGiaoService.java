/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import java.util.Random;
import model.PhieuGiao;

/**
 *
 * @author Admin
 */
public interface PhieuGiaoService {

    Boolean addPg(PhieuGiao pg);

    public String ZenMA();

    public List<PhieuGiao> getList();
}
