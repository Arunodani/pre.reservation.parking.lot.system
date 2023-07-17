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

public class STAFFUPDATE extends javax.swing.JInternalFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public STAFFUPDATE() {
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
        jPanel1 = new javax.swing.JPanel();
        staffsrcht = new javax.swing.JTextField();

        setTitle("STAFF UPDATE");
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
        staffadd.setText("UPDATE");
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

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH HERE"));

        staffsrcht.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                staffsrchtActionPerformed(evt);
            }
        });
        staffsrcht.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                staffsrchtKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(staffsrcht, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(staffsrcht)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
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
                            .addComponent(lastname, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                            .addComponent(firstname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(staffadd)))
                .addContainerGap())
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addComponent(staffadd)
                .addGap(33, 33, 33)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        
        String sid = showsno.getText();
        String fname = firstname.getText();
        String lname = lastname.getText();
        String stype = type.getSelectedItem().toString();
        
        int x = JOptionPane.showConfirmDialog(null, "Do you want to update?");
        if(x==0)
        {
            try {           
                String query = "UPDATE Staff SET FIRST_NAME = '"+fname+"', LAST_NAME = '"+lname+"',TYPE = '"+stype+"'WHERE SERVICE_NO = '"+sid+"'";
                pst = con.prepareStatement(query);
                pst.execute();
                JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY UPDATED");
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

    private void staffsrchtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffsrchtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_staffsrchtActionPerformed
public void searchmethod()
{
String srch = staffsrcht.getText();
        
        try{
        String sql = "SELECT * FROM staff WHERE SERVICE_NO LIKE '%"+srch+"%' OR FIRST_NAME LIKE '%"+srch+"%'";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        staffdetails.setModel(DbUtils.resultSetToTableModel(rs));
}catch(SQLException ex) {}
        
}
    private void staffsrchtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_staffsrchtKeyReleased
       searchmethod();
    }//GEN-LAST:event_staffsrchtKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField firstname;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField lastname;
    private javax.swing.JLabel showsno;
    private javax.swing.JButton staffadd;
    private javax.swing.JTable staffdetails;
    private javax.swing.JTextField staffsrcht;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
