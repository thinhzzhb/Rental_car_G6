/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utility;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JPanel;
import view.Hopdong_Form;
import view.KhachHangForm;
import view.KhuyenMai_Form;
import view.NhanVien_form;
import view.SoDat_form;
import view.TaiKhoan_form;
import view.ThongKe_form;
import view.TrangChu;
import view.Xe_Form;

/**
 *
 * @author Admin
 */
public class ChuyenManHinh {

    private JPanel pnl;
    private String txtO = "";

    private ArrayList<DanhMuc> lst = null;

    public ChuyenManHinh(JPanel pnlNew) {
        this.pnl = pnlNew;
    }

    public void setView(JPanel pnlItem, JLabel jlbl) {
        txtO = "Trang chủ";

        pnlItem.setBackground(new Color(96, 100, 191));
        jlbl.setBackground(new Color(96, 100, 191));

        pnl.setLayout(new BorderLayout());
        pnl.add(new TrangChu());
        pnl.validate();
        pnl.repaint();
    }

    public void setEvent(ArrayList<DanhMuc> _lst) {
        this.lst = _lst;
        for (DanhMuc item : lst) {
            item.getLbl().addMouseListener(new LabelEvent(item.getTxt(), item.getLbl(), item.getPnl()));
        }
    }

    class LabelEvent implements MouseListener {

        private JPanel pnlNode;
        private JPanel pnlItem;
        private JLabel lblItem;
        private String txt;

        public LabelEvent(String txt, JLabel lblItem, JPanel pnlItem) {
            this.txt = txt;
            this.pnlItem = pnlItem;
            this.lblItem = lblItem;
            
        }

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (txt) {
                case "Trang chủ":
                    pnlNode = new TrangChu();
                    break;
                case "Quản Lý Xe":
                    pnlNode = new Xe_Form();
                    break;
                case "Hợp đồng":
                    pnlNode = new Hopdong_Form();
                    break;
                case "Khuyến mãi":
                    pnlNode = new KhuyenMai_Form();
                    break;
                case "Nhân viên":
                    pnlNode = new NhanVien_form();
                    break;
                case "Khách hàng":
                    pnlNode = new KhachHangForm();
                    break;
                case "Tài khoản":
                    pnlNode = new TaiKhoan_form();
                    break;
                case "Thống kê":
                    pnlNode = new ThongKe_form();
                    break;
                case "Sổ đặt":
                    pnlNode = new SoDat_form();
                    break;
                default:
                    pnlNode = new TrangChu();
                    break;
            }
            pnl.removeAll();
            pnl.setLayout(new BorderLayout());
            pnl.add(pnlNode);
            pnl.validate();
            pnl.repaint();
        }

        @Override
        public void mousePressed(MouseEvent e) {
            txtO = txt;
            pnlItem.setBackground(new Color(0,204,204));
            lblItem.setBackground(new Color(0,204,204));
        }

        @Override
        public void mouseReleased(MouseEvent e) {
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            pnlItem.setBackground(new Color(96, 100, 191));
            lblItem.setBackground(new Color(96, 100, 191));
        }

        @Override
        public void mouseExited(MouseEvent e) {
            if (!txtO.equalsIgnoreCase(txt)) {
                pnlItem.setBackground(new Color(153,255,204));
                lblItem.setBackground(new Color(153,255,204));
            }
        }

        public void setChangeBG(String txt) {
            for (DanhMuc item : lst) {
                if (item.getTxt().equalsIgnoreCase(txt)) {
                    item.getLbl().setBackground(new Color(96, 100, 191));
                    item.getPnl().setBackground(new Color(96, 100, 191));
                } else {
                    item.getLbl().setBackground(new Color(76, 175, 80));
                    item.getPnl().setBackground(new Color(76, 175, 80));
                }
            }
        }
    }
}
