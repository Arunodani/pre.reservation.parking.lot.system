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


public class RESERVEDELETE extends javax.swing.JInternalFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public RESERVEDELETE() {
        initComponents();
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
        String query = "SELECT * FROM reserve";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        vehicledetails.setModel(DbUtils.resultSetToTableModel(rs));
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        amu = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ownername = new javax.swing.JTextField();
        ownerid = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        vehicleno = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        contactno = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        type = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        durationS = new javax.swing.JComboBox<>();
        vehicledelete = new javax.swing.JButton();
        lotno = new javax.swing.JLabel();
        showlot = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        reservesrcht1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicledetails = new javax.swing.JTable();

        setTitle("RESERVE DELETE");
        setPreferredSize(new java.awt.Dimension(510, 711));

        amu.setBackground(new java.awt.Color(204, 255, 204));

        jLabel2.setText("LOT NO:");

        jLabel4.setText("NAME OF THE OWNER:");

        jLabel5.setText("ID NO:");

        ownername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ownernameActionPerformed(evt);
            }
        });

        jLabel6.setText("VEHICLE NO:");

        jLabel7.setText("CONTACT NO:");

        jLabel8.setText("VEHICLE TYPE");

        type.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "VEHICLE TYPE", "CAR", "VAN", "JEEP" }));

        jLabel9.setText("DURATION");

        durationS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "DURATION", "4WEEKS", "8WEEKS" }));

        vehicledelete.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vehicledelete.setText("DELETE");
        vehicledelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicledeleteActionPerformed(evt);
            }
        });

        lotno.setText("  ");

        showlot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showlot.setText("LOT");

        jPanel5.setBackground(new java.awt.Color(51, 255, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("SEARCH HERE"));

        reservesrcht1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservesrcht1ActionPerformed(evt);
            }
        });
        reservesrcht1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                reservesrcht1KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(reservesrcht1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reservesrcht1)
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout amuLayout = new javax.swing.GroupLayout(amu);
        amu.setLayout(amuLayout);
        amuLayout.setHorizontalGroup(
            amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addGroup(amuLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showlot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(amuLayout.createSequentialGroup()
                        .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownername)
                            .addComponent(ownerid)
                            .addComponent(vehicleno)
                            .addComponent(contactno, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(lotno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(amuLayout.createSequentialGroup()
                        .addComponent(durationS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                        .addComponent(vehicledelete)))
                .addGap(24, 24, 24))
        );
        amuLayout.setVerticalGroup(
            amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(amuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(lotno)
                    .addComponent(showlot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(amuLayout.createSequentialGroup()
                        .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(ownername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(ownerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(vehicleno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(durationS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vehicledelete))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        vehicledetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        vehicledetails.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicledetailsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vehicledetails);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(amu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 677, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(237, 237, 237)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(amu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ownernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownernameActionPerformed
        
    }//GEN-LAST:event_ownernameActionPerformed

    abstract class displayMessage
    {
    private void confirmMessaage()
    {
        JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY DELETED");
    }
    }
    
    private void vehicledeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicledeleteActionPerformed
        String vno = vehicleno.getText();
       
        int x = JOptionPane.showConfirmDialog(null, "Do you want to delete?");
        if(x==0)
        {
            try {           
                String query = "DELETE FROM reserve WHERE VEHICLE_NO = '"+vno+"'";
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
                    
        showlot.setText("");
        ownername.setText("");
        ownerid.setText("");
        vehicleno.setText("");
        contactno.setText("");
        type.setSelectedItem("VEHICLE TYPE");
        durationS.setSelectedItem("DURATION");
    }//GEN-LAST:event_vehicledeleteActionPerformed

    private void vehicledetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicledetailsMouseClicked
        int r = vehicledetails.getSelectedRow();

        String lno = vehicledetails.getValueAt(r, 0).toString();
        String name = vehicledetails.getValueAt(r, 1).toString();
        String id = vehicledetails.getValueAt(r, 2).toString();
        String vno = vehicledetails.getValueAt(r, 3).toString();
        String cno = vehicledetails.getValueAt(r, 4).toString();
        String vtype = vehicledetails.getValueAt(r, 5).toString();
        String vduration = vehicledetails.getValueAt(r, 6).toString();
        
        showlot.setText(lno);
        ownername.setText(name);
        ownerid.setText(id);
        vehicleno.setText(vno);
        contactno.setText(cno);
        type.setSelectedItem(vtype);
        durationS.setSelectedItem(vduration);
    }//GEN-LAST:event_vehicledetailsMouseClicked

    private void reservesrcht1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservesrcht1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reservesrcht1ActionPerformed
public void searchmethod()
    {
    String srch = reservesrcht1.getText();
        
        try{
        String sql = "SELECT * FROM reserve WHERE ID_NO LIKE '%"+srch+"%' OR VEHICLE_NO LIKE '%"+srch+"%'";
        
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        vehicledetails.setModel(DbUtils.resultSetToTableModel(rs));
    }catch(SQLException ex) {}
        
    }
    private void reservesrcht1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_reservesrcht1KeyReleased
        searchmethod();
    }//GEN-LAST:event_reservesrcht1KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel amu;
    private javax.swing.JTextField contactno;
    private javax.swing.JComboBox<String> durationS;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lotno;
    private javax.swing.JTextField ownerid;
    private javax.swing.JTextField ownername;
    private javax.swing.JTextField reservesrcht;
    private javax.swing.JTextField reservesrcht1;
    private javax.swing.JLabel showlot;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton vehicledelete;
    private javax.swing.JTable vehicledetails;
    private javax.swing.JTextField vehicleno;
    // End of variables declaration//GEN-END:variables
}
