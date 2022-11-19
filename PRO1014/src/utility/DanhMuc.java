/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Admin
 */
public class DanhMuc {
    private String txt;
    private JPanel pnl;
    private JLabel lbl;

    public DanhMuc() {
    }

    public DanhMuc(String txt, JPanel pnl, JLabel lbl) {
        this.txt = txt;
        this.pnl = pnl;
        this.lbl = lbl;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public JPanel getPnl() {
        return pnl;
    }

    public void setPnl(JPanel pnl) {
        this.pnl = pnl;
    }

    public JLabel getLbl() {
        return lbl;
    }

    public void setLbl(JLabel lbl) {
        this.lbl = lbl;
    }
    
}
