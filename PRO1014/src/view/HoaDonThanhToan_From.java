/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.HoaDonThanhToan;
import model.HopDong;
import service.HoaDonThanhToanService;
import service.Impl.HoaDonThanhToanIMPL;

/**
 *
 * @author Admin
 */
public class HoaDonThanhToan_From extends javax.swing.JFrame {

    /**
     * Creates new form HoaDonThanhToan_From
     */
    private DefaultTableModel _dtm;
    private List<HoaDonThanhToan> listHDTT = new ArrayList<>();
    private HoaDonThanhToanService hdTTSer = new HoaDonThanhToanIMPL();
    
    public HoaDonThanhToan_From() {
        initComponents();
        _dtm = (DefaultTableModel) tblHD.getModel();
        listHDTT = hdTTSer.getAll();
        loadtb(listHDTT);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtNgayTao = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtTienCoc = new javax.swing.JPasswordField();
        jLabel16 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        txtPhiPs = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtTongThanhToan = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtTongXe = new javax.swing.JTextField();
        lblMaHD = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btnSearchtk = new javax.swing.JButton();
        txtSearch = new javax.swing.JPasswordField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHD = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        jLabel14.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel14.setText("Mã Hóa Đơn");

        jLabel15.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel15.setText("Ngày tạo");

        txtNgayTao.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        jLabel17.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel17.setText("Tổng xe");

        jLabel16.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel16.setText("Tiền cọc");

        jLabel20.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel20.setText("Phí phát sinh");

        txtPhiPs.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel21.setText("Tổng thanh toán");

        txtTongThanhToan.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        btnThem.setBackground(new java.awt.Color(51, 255, 204));
        btnThem.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(102, 255, 204));
        btnSua.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnClear.setBackground(new java.awt.Color(51, 255, 204));
        btnClear.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnClear.setText("Làm mới");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel18.setText("Hóa đơn chi tiết");

        txtTongXe.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N

        lblMaHD.setBackground(new java.awt.Color(255, 255, 255));
        lblMaHD.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        lblMaHD.setText("_");
        lblMaHD.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(39, 39, 39)
                                .addComponent(txtTongXe, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel14)
                                    .addGap(18, 18, 18)
                                    .addComponent(lblMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addGap(32, 32, 32)
                                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 133, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPhiPs, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTongThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnThem)
                        .addGap(18, 18, 18)
                        .addComponent(btnSua)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear)
                        .addGap(356, 356, 356))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel18)
                .addGap(25, 25, 25)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtTienCoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(lblMaHD))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20)
                    .addComponent(txtPhiPs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(txtTongThanhToan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTongXe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSua)
                    .addComponent(btnClear)
                    .addComponent(btnThem))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));

        jLabel19.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        jLabel19.setText("Danh sách hóa đơn");

        btnSearchtk.setBackground(new java.awt.Color(51, 255, 204));
        btnSearchtk.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        btnSearchtk.setText("Tìm kiếm id Hợp đồng");
        btnSearchtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchtkActionPerformed(evt);
            }
        });

        tblHD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã hợp đồng", "Ngày tạo", "Tổng xe", "Tiền cọc", "Phí phát sinh", "Tổng thanh toán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblHD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblHDMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblHD);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearchtk)
                        .addGap(18, 18, 18)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel19))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSearchtk, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(14, 14, 14)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        try {
            // TODO add your handling code here:
            
            String ngayTaoStr = this.txtNgayTao.getText();
            String tongXeStr = this.txtTongXe.getText();
            String tienCocStr = this.txtTienCoc.getText();
            String phiPsStr = this.txtPhiPs.getText();
            String tongTTStr = this.txtTongThanhToan.getText();
            
            int tongXe = Integer.parseInt(tongXeStr);
            int tienCoc = Integer.parseInt(tienCocStr);
            int phiPs = Integer.parseInt(phiPsStr);
            int tongTT = Integer.parseInt(tongTTStr);
            Date ngayTao = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTaoStr);
            HoaDonThanhToan h = new HoaDonThanhToan();
            h.setNgayTao(ngayTao);
            h.setTongXe(tongXe);
            h.setTienCoc(tienCoc);
            h.setPhiPs(phiPs);
            h.setTongThanhToan(tongTT);
            
            loadtb(listHDTT);
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonThanhToan_From.class.getName()).log(Level.SEVERE, null, ex);
        }
        
                
        
    }//GEN-LAST:event_btnThemActionPerformed

    
    private void tblHDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblHDMouseClicked
        // TODO add your handling code here:     
        int selectRow = tblHD.getSelectedRow();
        lblMaHD.setText(tblHD.getValueAt(selectRow, 0).toString());
        txtNgayTao.setText(tblHD.getValueAt(selectRow, 1).toString());
        txtTongXe.setText(tblHD.getValueAt(selectRow, 2).toString());
        txtTienCoc.setText(tblHD.getValueAt(selectRow, 3).toString());
        txtPhiPs.setText(tblHD.getValueAt(selectRow, 4).toString());
        txtTongThanhToan.setText(tblHD.getValueAt(selectRow, 5).toString());
        
        
    }//GEN-LAST:event_tblHDMouseClicked

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        try {
            // TODO add your handling code here:
            String ngayTaoStr = this.txtNgayTao.getText();
            String tongXeStr = this.txtTongXe.getText();
            String tienCocStr = this.txtTienCoc.getText();
            String phiPsStr = this.txtPhiPs.getText();
            String tongTTStr = this.txtTongThanhToan.getText();
            
            
            int tongXe = Integer.parseInt(tongXeStr);
            int tienCoc = Integer.parseInt(tienCocStr);
            int phiPs = Integer.parseInt(phiPsStr);
            int tongTT = Integer.parseInt(tongTTStr);
            
            Date ngayTao = new SimpleDateFormat("dd/MM/yyyy").parse(ngayTaoStr);
            
            HoaDonThanhToan h = new HoaDonThanhToan();
            h.setNgayTao(ngayTao);
            h.setTongXe(tongXe);
            h.setTienCoc(tienCoc);
            h.setPhiPs(phiPs);
            h.setTongThanhToan(tongTT);
            
            loadtb(listHDTT);
        } catch (ParseException ex) {
            Logger.getLogger(HoaDonThanhToan_From.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        lblMaHD.setText("");
        txtNgayTao.setText("");
        txtTongXe.setText("");
        txtTienCoc.setText("");
        txtPhiPs.setText("");
        txtTongThanhToan.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnSearchtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchtkActionPerformed
        String idHDTTStr = txtSearch.getText();
        int idHDTT = Integer.parseInt(idHDTTStr);
        List<HoaDonThanhToan> listSearch = hdTTSer.findByIDHDTT(listHDTT, idHDTT);
        loadtb(listSearch);
    }//GEN-LAST:event_btnSearchtkActionPerformed

    private void loadtb(List<HoaDonThanhToan> listHDTT) {
        _dtm.setRowCount(0);
        _dtm.setRowCount(0);
        for (HoaDonThanhToan x : listHDTT) {
            _dtm.addRow(x.toDataRow());
        }
    }
    /**
     * @param args the command line arguments
     */
    
    /*
    public static void main(String args[]) {
        // Set the Nimbus look and feel 
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        // If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         // For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(HoaDonThanhToan_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HoaDonThanhToan_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HoaDonThanhToan_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HoaDonThanhToan_From.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        // Create and display the form 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HoaDonThanhToan_From();//.setVisible(true);
            }
        });
    }
        */
    
        
    
                                       
                             
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnSearchtk;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMaHD;
    private javax.swing.JTable tblHD;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtPhiPs;
    private javax.swing.JPasswordField txtSearch;
    private javax.swing.JPasswordField txtTienCoc;
    private javax.swing.JTextField txtTongThanhToan;
    private javax.swing.JTextField txtTongXe;
    // End of variables declaration//GEN-END:variables

}
