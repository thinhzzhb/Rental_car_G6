/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package graphics;

import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author ppolo
 */
public class PlaceholderJtextField {

    //phương thức thêm place holder vào JTextField
    public void setPlaceJTextHolder(JTextField txt, String text) {
        txt.setForeground(Color.LIGHT_GRAY);
        txt.setText(text);
    }

    //phương thức bỏ place holder khỏi JTextField
    public void removePlaceHolder(JTextField txt) {
        txt.setForeground(Color.LIGHT_GRAY);
        txt.setText("");
    }

    //phương thức thêm place holder vào JPasswordField
    public void setPlaceJPasswordHolder(JPasswordField txt, String text) {
        txt.setForeground(Color.LIGHT_GRAY);
        txt.setText(text);
    }

    //phương thức bỏ place holder khỏi JPasswordField
    public void removePlaceJPasswordHolder(JPasswordField txt) {
        txt.setForeground(Color.LIGHT_GRAY);
        txt.setText("");
    }

    //Khi forcus vào các jtext field sẽ thay đổi viền và màu chữ
    public void hoverJTextField(JTextField txt) {
        txt.setFont(new java.awt.Font("Times New Roman", 1, 14));
        txt.setForeground(new Color(51, 51, 255));
        txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 2, true));
    }

    //khi thoát forcus sẽ trở lại bình thường
    public void exitedJtextField(JTextField txt) {
        txt.setFont(new java.awt.Font("Times New Roman", 0, 12));
        txt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        
    }
}
