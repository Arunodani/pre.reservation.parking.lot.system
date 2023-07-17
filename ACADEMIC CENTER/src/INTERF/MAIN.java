/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERF;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;




public class MAIN extends javax.swing.JFrame {

   
    
    public MAIN() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        logoutb = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        reserve_addB = new javax.swing.JButton();
        reserve_updateB = new javax.swing.JButton();
        reserve_deleteB = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        STAFF_ADDB = new javax.swing.JButton();
        STAFF_UPDATEB = new javax.swing.JButton();
        STAFF_DELETEB = new javax.swing.JButton();
        mainpane = new javax.swing.JDesktopPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        jPanel7.setBackground(new java.awt.Color(255, 51, 153));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 170, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HOME");
        setMinimumSize(new java.awt.Dimension(700, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 0, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setPreferredSize(new java.awt.Dimension(908, 200));

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CHALMERS CAR PARK");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(254, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutb.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        logoutb.setText("LOGOUT");
        logoutb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbActionPerformed(evt);
            }
        });
        jPanel2.add(logoutb, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 590, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        reserve_addB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reserve_addB.setForeground(new java.awt.Color(102, 0, 102));
        reserve_addB.setText("ADD");
        reserve_addB.setContentAreaFilled(false);
        reserve_addB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reserve_addB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserve_addBActionPerformed(evt);
            }
        });

        reserve_updateB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reserve_updateB.setForeground(new java.awt.Color(102, 0, 102));
        reserve_updateB.setText("UPDATE");
        reserve_updateB.setContentAreaFilled(false);
        reserve_updateB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reserve_updateB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserve_updateBActionPerformed(evt);
            }
        });

        reserve_deleteB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        reserve_deleteB.setForeground(new java.awt.Color(102, 0, 102));
        reserve_deleteB.setText("DELETE");
        reserve_deleteB.setContentAreaFilled(false);
        reserve_deleteB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reserve_deleteB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reserve_deleteBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("RESERVE THE LOT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(reserve_addB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reserve_updateB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(reserve_deleteB))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reserve_addB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserve_updateB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reserve_deleteB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 250, -1));

        jPanel5.setBackground(new java.awt.Color(204, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setText("STAFF DETAILS");

        STAFF_ADDB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        STAFF_ADDB.setForeground(new java.awt.Color(102, 0, 102));
        STAFF_ADDB.setText("ADD");
        STAFF_ADDB.setContentAreaFilled(false);
        STAFF_ADDB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STAFF_ADDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STAFF_ADDBActionPerformed(evt);
            }
        });

        STAFF_UPDATEB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        STAFF_UPDATEB.setForeground(new java.awt.Color(102, 0, 102));
        STAFF_UPDATEB.setText("UPDATE");
        STAFF_UPDATEB.setContentAreaFilled(false);
        STAFF_UPDATEB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STAFF_UPDATEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STAFF_UPDATEBActionPerformed(evt);
            }
        });

        STAFF_DELETEB.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        STAFF_DELETEB.setForeground(new java.awt.Color(102, 0, 102));
        STAFF_DELETEB.setText("DELETE");
        STAFF_DELETEB.setContentAreaFilled(false);
        STAFF_DELETEB.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        STAFF_DELETEB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                STAFF_DELETEBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(STAFF_ADDB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(STAFF_UPDATEB)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(STAFF_DELETEB)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(STAFF_ADDB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STAFF_UPDATEB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(STAFF_DELETEB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 250, -1));

        mainpane.setBackground(new java.awt.Color(153, 0, 0));

        javax.swing.GroupLayout mainpaneLayout = new javax.swing.GroupLayout(mainpane);
        mainpane.setLayout(mainpaneLayout);
        mainpaneLayout.setHorizontalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
        );
        mainpaneLayout.setVerticalGroup(
            mainpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.add(mainpane, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 510, 500));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 250, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 120, 250, 500));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGES/logo2.jpg"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 790, 630));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void STAFF_UPDATEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STAFF_UPDATEBActionPerformed
        mainpane.removeAll();
        STAFFUPDATE obj = new STAFFUPDATE();
        mainpane.add(obj).setVisible(true); 
        
    }//GEN-LAST:event_STAFF_UPDATEBActionPerformed

    private void STAFF_DELETEBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STAFF_DELETEBActionPerformed
        mainpane.removeAll();
        STAFFDELETE obj = new STAFFDELETE();
        mainpane.add(obj).setVisible(true); 
        
    }//GEN-LAST:event_STAFF_DELETEBActionPerformed

    private void STAFF_ADDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_STAFF_ADDBActionPerformed
        mainpane.removeAll();
        STAFFADD obj = new STAFFADD();
        mainpane.add(obj).setVisible(true);        
    }//GEN-LAST:event_STAFF_ADDBActionPerformed

    private void reserve_deleteBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserve_deleteBActionPerformed
        mainpane.removeAll();
        RESERVEDELETE obj = new RESERVEDELETE();
        mainpane.add(obj).setVisible(true);
        
    }//GEN-LAST:event_reserve_deleteBActionPerformed

    private void reserve_addBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserve_addBActionPerformed
        try {
            mainpane.removeAll();
            RESERVEADD obj = new RESERVEADD();
            mainpane.add(obj).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(MAIN.class.getName()).log(Level.SEVERE, null, ex);
        }

   
    }//GEN-LAST:event_reserve_addBActionPerformed

    private void reserve_updateBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reserve_updateBActionPerformed

        mainpane.removeAll();
        RESERVEUPDATE obj = new RESERVEUPDATE();
        mainpane.add(obj).setVisible(true);
    }//GEN-LAST:event_reserve_updateBActionPerformed

    private void logoutbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbActionPerformed
       
       int x = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        if(x==0)
        {
        System.exit(0);
        }
    }//GEN-LAST:event_logoutbActionPerformed
                                             

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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MAIN().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton STAFF_ADDB;
    private javax.swing.JButton STAFF_DELETEB;
    private javax.swing.JButton STAFF_UPDATEB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logoutb;
    private javax.swing.JDesktopPane mainpane;
    private javax.swing.JButton reserve_addB;
    private javax.swing.JButton reserve_deleteB;
    private javax.swing.JButton reserve_updateB;
    // End of variables declaration//GEN-END:variables
}
