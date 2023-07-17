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
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class STAFFDELETE extends javax.swing.JInternalFrame {
    
    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public STAFFDELETE() {
        try {
            initComponents();
            con = DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "Itt/1718013");
            tableload();
        } catch (SQLException ex) {
            Logger.getLogger(RESERVEUPDATE.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void tableload() throws SQLException 
    {
        String query = "SELECT * FROM staff";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        staffdetails.setModel(DbUtils.resultSetToTableModel(rs));
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        showsno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        staffadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffdetails = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        staffsrcht2 = new javax.swing.JTextField();

        setTitle("STAFF DELETE");
        setPreferredSize(new java.awt.Dimension(510, 711));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("SERVICE NO:");

        showsno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showsno.setText("SERVICE NO");

        jLabel4.setText("FIRST NAME");

        jLabel5.setText("LAST NAME");

        jLabel8.setText("EMPLOYEE TYPE");

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "TYPE", "MANAGER", "EMPLOYEE" }));

        staffadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        staffadd.setText("DELETE");
        staffadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffaddActionPerformed(evt);
            }
        });

        staffdetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        staffdetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                staffdetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(staffdetails);

        jPanel4.setBackground(new java.awt.Color(153, 153, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH HERE"));

        staffsrcht2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffsrcht2ActionPerformed(evt);
            }
        });
        staffsrcht2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                staffsrcht2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffsrcht2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffsrcht2)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showsno))
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                    .addComponent(lastname))
                .addGap(11, 11, 11)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffadd)
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(showsno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(staffadd)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
   
    }//GEN-LAST:event_firstnameActionPerformed

    private void staffaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffaddActionPerformed

       String sno = showsno.getText();
       
        int x = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        if(x==0)
        {
            try {           
                String query = "DELETE FROM Staff WHERE SERVICE_NO = '"+sno+"'";
                pst = con.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY DELETED");
            } catch (SQLException ex) {
                Logger.getLogger(RESERVEUPDATE.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        try {
            tableload();
        } catch (SQLException ex) {
            Logger.getLogger(RESERVEUPDATE.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
       showsno.setText("");
        firstname.setText("");
        lastname.setText("");
        type.setSelectedItem("TYPE");
    }//GEN-LAST:event_staffaddActionPerformed

    private void staffdetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_staffdetailsMouseClicked

        int r = staffdetails.getSelectedRow();

        String sno = staffdetails.getValueAt(r, 0).toString();
        String f_name = staffdetails.getValueAt(r, 1).toString();
        String l_name = staffdetails.getValueAt(r, 2).toString();
        String etype = staffdetails.getValueAt(r, 3).toString();

        showsno.setText(sno);
        firstname.setText(f_name);
        lastname.setText(l_name);
        type.setSelectedItem(etype);
    }//GEN-LAST:event_staffdetailsMouseClicked

    private void staffsrcht2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffsrcht2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffsrcht2ActionPerformed
public void searchmethod()
{
String srch = staffsrcht2.getText();
        
        try{
        String sql = "SELECT * FROM staff WHERE SERVICE_NO LIKE '%"+srch+"%' OR FIRST_NAME LIKE '%"+srch+"%'";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        staffdetails.setModel(DbUtils.resultSetToTableModel(rs));
}catch(SQLException ex) {}
        
}
    private void staffsrcht2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffsrcht2KeyReleased
        searchmethod();
    }//GEN-LAST:event_staffsrcht2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel showsno;
    private javax.swing.JButton staffadd;
    private javax.swing.JTable staffdetails;
    private javax.swing.JTextField staffsrcht;
    private javax.swing.JTextField staffsrcht1;
    private javax.swing.JTextField staffsrcht2;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
