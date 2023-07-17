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
import net.proteanit.sql.DbUtils;



public class STAFFADD extends javax.swing.JInternalFrame {
    
    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    
    public int basic = 40000;
    public int bonus = 10000;
    public int salary = 0;
    public int empsalary;
    public int managersalary;
    
    
    
    public STAFFADD() throws SQLException {
        initComponents();
      
        con = DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "Itt/1718013");
        tableload();
        autoID();
        
    }
    
    private void tableload() throws SQLException 
    {
        String query = "SELECT * FROM staff";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        staffdetails.setModel(DbUtils.resultSetToTableModel(rs));
    }
private void autoID() throws SQLException
{
try {
    Statement s = con.createStatement();
    ResultSet res = s.executeQuery("SELECT Max(SERVICE_NO) FROM staff");
    res.next();
    
    res.getString("Max(SERVICE_NO)");
    
    if(res.getString("Max(SERVICE_NO)")==null)
    {
    sno.setText("S0001");
    }
    else
    {
    Long id = Long.parseLong(res.getString("Max(SERVICE_NO)").substring(2,res.getString("Max(SERVICE_NO)").length()));
            id++;
            sno.setText("S0" + String.format("%03d", id));
            }
   
}catch(SQLException ex) {
}
}
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lastname = new javax.swing.JTextField();
        firstname = new javax.swing.JTextField();
        type = new javax.swing.JComboBox<>();
        staffadd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        staffdetails = new javax.swing.JTable();
        sno = new javax.swing.JTextField();

        setTitle("STAFF ADD");
        setPreferredSize(new java.awt.Dimension(510, 711));

        jPanel1.setPreferredSize(new java.awt.Dimension(510, 711));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setText("SERVICE NO:");

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
        staffadd.setText("ADD");
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
        jScrollPane1.setViewportView(staffdetails);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(staffadd)
                .addGap(19, 19, 19))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8))
                .addGap(69, 69, 69)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(firstname, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)
                        .addComponent(lastname))
                    .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(firstname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lastname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(staffadd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed

    }//GEN-LAST:event_firstnameActionPerformed

    private void staffaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_staffaddActionPerformed
        try{                                           
            
            String sid = sno.getText();
            String fname = firstname.getText();
            String lname = lastname.getText();
            String stype = type.getSelectedItem().toString();            
            
            if(type.getSelectedItem().equals("EMPLOYEE"))
            {
                STAFFADD objmanager = new STAFFADD();
                salary = objmanager.employee();
            }
            else
            {
                manager objmanager = new manager();
                salary = objmanager.calmanagersalary();
            }
            try{
                String sql = "INSERT INTO Staff VALUES ('"+sid+"','"+fname+"','"+lname+"','"+stype+"','"+salary+"')";
                con = DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "Itt/1718013");
                pst=con.prepareStatement(sql);
                
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY ADDED");
                salary=0;
                tableload();
                autoID();
                
            }catch(Exception ex){
                
                JOptionPane.showMessageDialog(null, ex);
            }
            
            tableload();
        }catch(SQLException ex){
            
            Logger.getLogger(RESERVEADD.class.getName()).log(Level.SEVERE,null, ex);
        }
        sno.setText("");
        firstname.setText("");
        lastname.setText("");
        type.setSelectedItem("TYPE");
    }//GEN-LAST:event_staffaddActionPerformed

public int employee()
    {
        return empsalary = basic + bonus;
    }

class manager extends employee
{
    public int calmanagersalary(){
    
         return managersalary = basic + (bonus*3);
}
}

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
    private javax.swing.JTextField sno;
    private javax.swing.JButton staffadd;
    private javax.swing.JTable staffdetails;
    private javax.swing.JComboBox<String> type;
    // End of variables declaration//GEN-END:variables
}
