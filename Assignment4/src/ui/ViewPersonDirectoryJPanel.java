/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Patient;
import model.PatientDirectory;
import model.Person;
import model.PersonDirectory;
import model.VitalSignHistory;
import model.VitalSigns;

/**
 *
 * @author tarushukla
 */
public class ViewPersonDirectoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPersonDirectoryJPanel
     */
    PersonDirectory personDirectoryArrayList;
    DefaultTableModel defaultTableModel;
    int row, column;
    
    
    
    public ViewPersonDirectoryJPanel(PersonDirectory personDirectoryArrayList) {
        initComponents();
        this.personDirectoryArrayList = personDirectoryArrayList;
        populateTable();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableViewPersonDirectory = new javax.swing.JTable();
        lblPersonDirectory = new javax.swing.JLabel();

        jTableViewPersonDirectory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Contact Number", "Residence", "Community", "City"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableViewPersonDirectory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableViewPersonDirectoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableViewPersonDirectory);

        lblPersonDirectory.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        lblPersonDirectory.setText("Person Directory ");
        lblPersonDirectory.setSize(new java.awt.Dimension(45, 40));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(395, 395, 395)
                        .addComponent(lblPersonDirectory)
                        .addGap(0, 160, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lblPersonDirectory)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(240, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTableViewPersonDirectoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableViewPersonDirectoryMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jTableViewPersonDirectoryMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableViewPersonDirectory;
    private javax.swing.JLabel lblPersonDirectory;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        defaultTableModel = (DefaultTableModel)jTableViewPersonDirectory.getModel();
        defaultTableModel.setRowCount(0);
        
        for(Person person : personDirectoryArrayList.getPersonDirectoryArrayList()){
            Object[] row = new Object[7];
            row[0]= person;
            row[1]= person.getPersonAge();
            row[2]= person.getGender();
            row[3]= person.getContactNumber();
            row[4]= person.getHouseAddress();
            row[5]= person.getCommunityName();
            row[6]= person.getCityName();
            
            defaultTableModel.addRow(row); 
        }
    }
}
