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

public class RESERVEADD extends javax.swing.JInternalFrame {

    public Connection con = null; 
    public PreparedStatement pst = null;
    ResultSet rs = null;
    
    public int carvanweek4 = 500;
    public int jeepweek4 = 700;
    public int discount = 200;
    public int amount = 0;
    
    public RESERVEADD() throws SQLException {
        initComponents();
        try{
        con = DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "Itt/1718013");
        tableload();
        }
        catch (Exception e)
        {}
    }
   
    
    private void tableload() throws SQLException
    {
        String query = "SELECT * FROM reserve";
        pst = con.prepareStatement(query);
        rs = pst.executeQuery();
        
        vehicledetails.setModel(DbUtils.resultSetToTableModel(rs));
    }

    private void objamount(int carweek4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
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
        vehicleadd = new javax.swing.JButton();
        lotno = new javax.swing.JLabel();
        showlot = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicledetails = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setTitle("CREATE RESERVATION");
        setMinimumSize(new java.awt.Dimension(510, 430));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        vehicleadd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        vehicleadd.setText("ADD");
        vehicleadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vehicleaddActionPerformed(evt);
            }
        });

        lotno.setText("  ");

        showlot.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        showlot.setText("LOT");

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
                        .addComponent(durationS, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                        .addComponent(vehicleadd))
                    .addGroup(amuLayout.createSequentialGroup()
                        .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ownername)
                            .addComponent(ownerid)
                            .addComponent(vehicleno)
                            .addComponent(contactno, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(lotno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(contactno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(amuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(amuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(durationS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(58, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, amuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(vehicleadd)
                        .addGap(42, 42, 42))))
        );

        jPanel1.add(amu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 490, 240));

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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 237, 490, 440));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 494, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ownernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ownernameActionPerformed

    }//GEN-LAST:event_ownernameActionPerformed

    private void vehicleaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vehicleaddActionPerformed
       
        try{                                           
            
            String name = ownername.getText();
            String id = ownerid.getText();
            String vno = vehicleno.getText();
            String cno = contactno.getText();
            String vtype = type.getSelectedItem().toString();
            String time = durationS.getSelectedItem().toString();
            
            
            if(type.getSelectedItem().equals("CAR")||type.getSelectedItem().equals("VAN"))
            {
                if(durationS.getSelectedItem().equals("4WEEKS"))
                {
                    amount = amount+carvanweek4;
                }
                else
                {
                    try {
                        RESERVEADD objreserve = new RESERVEADD();
                        amount = objreserve.calculateAmount(carvanweek4);
                    } catch (SQLException ex) {
                        Logger.getLogger(RESERVEADD.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            else
            {
                if(durationS.getSelectedItem().equals("4WEEKS"))
                {
                    amount = amount+jeepweek4;
                }
                else
                {
                    try {
                        RESERVEADD objreserve = new RESERVEADD();
                        amount = objreserve.calculateAmount(jeepweek4, discount);
                    } catch (SQLException ex) {
                        Logger.getLogger(RESERVEADD.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            try{
                String sql = "INSERT INTO reserve (OWNER_NAME,ID_NO,VEHICLE_NO,CONTACT_NO,VEHICLE_TYPE,DURATION,AMOUNT) VALUES ('"+name+"','"+id+"','"+vno+"','"+cno+"','"+vtype+"','"+time+"','"+amount+"')";
                con = DriverManager.getConnection("jdbc:mysql://localhost/car_park_management_system", "root", "Itt/1718013");
                pst=con.prepareStatement(sql);
                
                pst.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "DATA SUCCESSFULLY ADDED");
                amount=0;
                tableload();
                
            }catch(Exception ex){
                
                JOptionPane.showMessageDialog(null, ex);
            }
            
            tableload();
        }catch(SQLException ex){
            
            Logger.getLogger(RESERVEADD.class.getName()).log(Level.SEVERE,null, ex);
        }
        showlot.setText("");
        ownername.setText("");
        ownerid.setText("");
        vehicleno.setText("");
        contactno.setText("");
        type.setSelectedItem("VEHICLE TYPE");
        durationS.setSelectedItem("DURATION");
    }//GEN-LAST:event_vehicleaddActionPerformed

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
public int calculateAmount(int x)
    {
        return amount = x*2;
    }
public int calculateAmount(int x, int y)
    {
        return amount = (x*2)-y;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel amu;
    private javax.swing.JTextField contactno;
    private javax.swing.JComboBox<String> durationS;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lotno;
    private javax.swing.JTextField ownerid;
    private javax.swing.JTextField ownername;
    private javax.swing.JLabel showlot;
    private javax.swing.JComboBox<String> type;
    private javax.swing.JButton vehicleadd;
    private javax.swing.JTable vehicledetails;
    private javax.swing.JTextField vehicleno;
    // End of variables declaration//GEN-END:variables
}
