/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package INTERF;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class SING_UP extends javax.swing.JFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    
    public SING_UP() throws SQLException {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        SERVICE_NO_T = new javax.swing.JTextField();
        SING_UP_PW_T = new javax.swing.JPasswordField();
        SIGN_IN_B = new javax.swing.JButton();
        SIGN_IN_BACK_B = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SIGN UP");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setText("SERVICE NO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel5.setText("PASSWORD");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        SERVICE_NO_T.setToolTipText("THIS IS YOUR USER NAME");
        jPanel1.add(SERVICE_NO_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 90, 280, -1));

        SING_UP_PW_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SING_UP_PW_TActionPerformed(evt);
            }
        });
        jPanel1.add(SING_UP_PW_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 280, -1));

        SIGN_IN_B.setText("SIGN UP");
        SIGN_IN_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGN_IN_BActionPerformed(evt);
            }
        });
        jPanel1.add(SIGN_IN_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        SIGN_IN_BACK_B.setText("BACK");
        SIGN_IN_BACK_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGN_IN_BACK_BActionPerformed(evt);
            }
        });
        jPanel1.add(SIGN_IN_BACK_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SING_UP_PW_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SING_UP_PW_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SING_UP_PW_TActionPerformed

    private void SIGN_IN_BACK_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGN_IN_BACK_BActionPerformed
        LOGIN objlogin = new LOGIN();
        objlogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SIGN_IN_BACK_BActionPerformed

    private void SIGN_IN_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGN_IN_BActionPerformed
       
        String sno = SERVICE_NO_T.getText();
        String pword = SING_UP_PW_T.getText();
        try{
            
            String sql = "INSERT INTO users values ('"+sno+"','"+pword+"')";
            con = DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "Itt/1718013");
            pst=con.prepareStatement(sql);
            
            pst.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY ADDED");
            
            LOGIN objlogin = new LOGIN();
            objlogin.setVisible(true);
            this.dispose();
        }catch(Exception ex){
            
            JOptionPane.showMessageDialog(null, "YOU ARE NOT REGISTERED AS AN EMPLOYEE");
        }
       
    }//GEN-LAST:event_SIGN_IN_BActionPerformed

    
    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SING_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SING_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SING_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SING_UP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
      
       
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new SING_UP().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(SING_UP.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField SERVICE_NO_T;
    private javax.swing.JButton SIGN_IN_B;
    private javax.swing.JButton SIGN_IN_BACK_B;
    private javax.swing.JPasswordField SING_UP_PW_T;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
