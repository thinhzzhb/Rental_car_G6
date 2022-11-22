/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import model.HangXe;

/**
 *
 * @author GALAXY
 */
public interface HangXeService {

    List<HangXe> getAll();

    String add(HangXe hx);

    String update(HangXe hx, String tenHangXe);

    String ZenMa();

}
