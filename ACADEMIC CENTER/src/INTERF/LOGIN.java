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
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class LOGIN extends javax.swing.JFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    public LOGIN() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        LOGIN_B = new javax.swing.JButton();
        SIGN_UP_B = new javax.swing.JButton();
        USER_ID_T = new javax.swing.JTextField();
        PWORD_T = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHALMERS CAR PARK", javax.swing.border.TitledBorder.RIGHT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(0, 0, 204))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("USER ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setText("PASSWORD");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        LOGIN_B.setText("LOGIN");
        LOGIN_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LOGIN_BActionPerformed(evt);
            }
        });
        jPanel1.add(LOGIN_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        SIGN_UP_B.setText("SIGN UP");
        SIGN_UP_B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SIGN_UP_BActionPerformed(evt);
            }
        });
        jPanel1.add(SIGN_UP_B, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));
        jPanel1.add(USER_ID_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 200, 30));
        jPanel1.add(PWORD_T, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 350, 220));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void LOGIN_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LOGIN_BActionPerformed
        
        //STORE USER NAME AND PASSWORD
        String username;
        String password;
        
        username = USER_ID_T.getText();
        password = PWORD_T.getText();
        
        //Both fields are blank
        if(username.equals("")&&password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter UserName and Password");
        }
        //Only entered UserName
        else if (!(username.equals(""))&&password.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Enter Password");
        }
        //Only entered Password
       else if (username.equals("")&&!(password.equals("")))
        {
            JOptionPane.showMessageDialog(this, "Enter UserName");
        }
        else
       {
        try{
                       
            String query;
            query = "SELECT SERVICE_NO, PASSWORD FROM users WHERE SERVICE_NO='"+username+"' AND PASSWORD='"+password+"'";
            con = DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "Itt/1718013");
            pst=con.prepareStatement(query);
            ResultSet rs = pst.executeQuery(query);
            
            if(rs.next())
            {
              //DISPLAY MAIN WINDOW AFTER CLICK THE LOGIN BUTTON IF SUCCESSFUL
               MAIN objmain = new MAIN();
               objmain.setVisible(true);
               this.dispose();
            }
            else
            {
                //IF USERNAME AND PASSWORD WRONG
                JOptionPane.showMessageDialog(this, "User Name or Password is incorrect");
                USER_ID_T.setText("");
                PWORD_T.setText("");
            }
            
            
        }catch (SQLException ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
       }
        
    }//GEN-LAST:event_LOGIN_BActionPerformed

    private void SIGN_UP_BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SIGN_UP_BActionPerformed
        SING_UP objsignUp = null;
        try {
            objsignUp = new SING_UP();
        } catch (SQLException ex) {
            Logger.getLogger(LOGIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        objsignUp.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SIGN_UP_BActionPerformed

    
    public static void main(String args[]) {
    
   
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LOGIN_B;
    private javax.swing.JPasswordField PWORD_T;
    private javax.swing.JButton SIGN_UP_B;
    private javax.swing.JTextField USER_ID_T;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
