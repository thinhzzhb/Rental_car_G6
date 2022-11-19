/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import graphics.PlaceholderJtextField;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author ppolo
 */
public class Register extends javax.swing.JFrame {

    private PlaceholderJtextField _placeHolder = new PlaceholderJtextField();

    /**
     * Creates new form Register
     */
    public Register(int chucVu) {
        initComponents();
        setGraphics();
        cbChucVu.removeAllItems();
        if (chucVu == 0) {
            cbChucVu.addItem("Quản lý");
            cbChucVu.addItem("Nhân viên");
        } else {
            cbChucVu.addItem("Nhân viên");
        }
        
    }

    private void setGraphics() {
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon("image//register.png").getImage());
        this.lblBackground.setIcon(new ImageIcon(""));
        this.lblUser.setIcon(new ImageIcon("image//user.png"));
        this.lblPassword.setIcon(new ImageIcon("image//lock.png"));
        this.lblRePassword.setIcon(new ImageIcon("image//lock.png"));

        _placeHolder.setPlaceJTextHolder(txtUser, "Tài khoản");
        _placeHolder.setPlaceJPasswordHolder(txtPassword, "Mật khẩu");
        txtPassword.setEchoChar((char) 0);
        _placeHolder.setPlaceJPasswordHolder(txtRePassword, "Nhập lại mật khẩu");
        txtRePassword.setEchoChar((char) 0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblRegister = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblUser = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        lblRePassword = new javax.swing.JLabel();
        txtRePassword = new javax.swing.JPasswordField();
        btnRegister = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        chkShowPass = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        cbChucVu = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        lblBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Register");
        setAutoRequestFocus(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRegister.setFont(new java.awt.Font("Times New Roman", 3, 32)); // NOI18N
        lblRegister.setForeground(new java.awt.Color(102, 102, 255));
        lblRegister.setText("ĐĂNG KÝ");
        getContentPane().add(lblRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, 150, -1));
        getContentPane().add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 30, 30));

        lblUser.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 30, 30));

        txtUser.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtUser.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUserFocusLost(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 280, 30));

        txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPasswordFocusLost(evt);
            }
        });
        getContentPane().add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 280, 30));
        getContentPane().add(lblRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 30, 30));

        txtRePassword.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        txtRePassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRePasswordFocusLost(evt);
            }
        });
        getContentPane().add(txtRePassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 280, 30));

        btnRegister.setBackground(new java.awt.Color(255, 102, 102));
        btnRegister.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnRegister.setText("ĐĂNG KÝ");
        btnRegister.setToolTipText("Đăng ký");
        btnRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegisterMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegisterMouseExited(evt);
            }
        });
        getContentPane().add(btnRegister, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 100, 30));

        btnLogin.setBackground(new java.awt.Color(255, 102, 102));
        btnLogin.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnLogin.setText("Quay lại");
        btnLogin.setToolTipText("Đăng nhập");
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLoginMouseExited(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        getContentPane().add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 110, 30));

        chkShowPass.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        chkShowPass.setText("Chấp nhận mọi");
        chkShowPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkShowPassActionPerformed(evt);
            }
        });
        getContentPane().add(chkShowPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, 25));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("điều khoản");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 270, -1, 25));

        btnExit.setBackground(new java.awt.Color(255, 102, 102));
        btnExit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 70, 30));

        cbChucVu.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cbChucVu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Quản lý", "Nhân viên", "Khách" }));
        getContentPane().add(cbChucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 120, 25));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Chức vụ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        lblBackground.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        lblBackground.setForeground(new java.awt.Color(153, 153, 255));
        getContentPane().add(lblBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        new Login().setVisible(true);
    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnRegisterMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseEntered
        // TODO add your handling code here:
        btnRegister.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnRegisterMouseEntered

    private void btnLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseEntered
        // TODO add your handling code here:
        btnLogin.setBackground(Color.GREEN);
    }//GEN-LAST:event_btnLoginMouseEntered

    private void btnRegisterMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegisterMouseExited
        // TODO add your handling code here:
        btnRegister.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnRegisterMouseExited

    private void btnLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseExited
        // TODO add your handling code here:
        btnLogin.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnLoginMouseExited

    private void chkShowPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkShowPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chkShowPassActionPerformed

    private void txtUserFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusGained
        // TODO add your handling code here:
        if (txtUser.getText().equals("Tài khoản")) {
            _placeHolder.removePlaceHolder(txtUser);
        }
        _placeHolder.hoverJTextField(txtUser);
    }//GEN-LAST:event_txtUserFocusGained

    private void txtUserFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserFocusLost
        // TODO add your handling code here:
        if (txtUser.getText().isBlank()) {
            _placeHolder.setPlaceJTextHolder(txtUser, "Tài khoản");
            txtUser.setFont(new java.awt.Font("Times New Roman", 0, 12));
            return;
        }
        _placeHolder.exitedJtextField(txtUser);
    }//GEN-LAST:event_txtUserFocusLost

    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusGained
        // TODO add your handling code here:
        if (txtPassword.getText().equals("Mật khẩu")) {
            _placeHolder.removePlaceJPasswordHolder(txtPassword);
            txtPassword.setEchoChar('*');
        }
        _placeHolder.hoverJTextField(txtPassword);
    }//GEN-LAST:event_txtPasswordFocusGained

    private void txtPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPasswordFocusLost
        // TODO add your handling code here:
        if (txtPassword.getText().isBlank()) {
            _placeHolder.setPlaceJPasswordHolder(txtPassword, "Mật khẩu");
            txtPassword.setFont(new java.awt.Font("Times New Roman", 0, 12));
            return;
        }
        _placeHolder.exitedJtextField(txtPassword);
    }//GEN-LAST:event_txtPasswordFocusLost

    private void txtRePasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusGained
        // TODO add your handling code here:

        if (txtRePassword.getText().equals("Nhập lại mật khẩu")) {
            txtRePassword.setEchoChar('*');
            _placeHolder.removePlaceJPasswordHolder(txtRePassword);
        }
        _placeHolder.hoverJTextField(txtRePassword);
    }//GEN-LAST:event_txtRePasswordFocusGained

    private void txtRePasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRePasswordFocusLost
        // TODO add your handling code here:
        if (txtRePassword.getText().isBlank()) {
            _placeHolder.setPlaceJPasswordHolder(txtRePassword, "Nhập lại mật khẩu");
            txtRePassword.setEchoChar((char) 0);
            txtRePassword.setFont(new java.awt.Font("Times New Roman", 0, 12));
            return;
        }
        _placeHolder.exitedJtextField(txtRePassword);
    }//GEN-LAST:event_txtRePasswordFocusLost

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
        btnExit.setBackground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        // TODO add your handling code here:
        btnExit.setBackground(new Color(255, 102, 102));
    }//GEN-LAST:event_btnExitMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRegister;
    private javax.swing.JComboBox<String> cbChucVu;
    private javax.swing.JCheckBox chkShowPass;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRePassword;
    private javax.swing.JLabel lblRegister;
    private javax.swing.JLabel lblUser;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtRePassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}