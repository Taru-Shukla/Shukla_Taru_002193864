/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ClinicSystem;
import model.Encounter;
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
public class AddPatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPatientJPanel
     */
    
    int row, column;
    DefaultTableModel defaultTableModel;
    VitalSignHistory vitalSignHistory;
    
    
    public AddPatientJPanel(VitalSignHistory vitalSignHistory) {
        initComponents();
        this.vitalSignHistory = vitalSignHistory;
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
        lblPatientName = new javax.swing.JLabel();
        lblPatientAge = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblContactNumber = new javax.swing.JLabel();
        lblResidence = new javax.swing.JLabel();
        txtPatientName = new javax.swing.JTextField();
        txtPatientAge = new javax.swing.JTextField();
        txtPatientContactNumber = new javax.swing.JTextField();
        txtPatientResidence = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        lblPatientClinicNumber = new javax.swing.JLabel();
        txtPatientClinicId = new javax.swing.JTextField();
        comboBoxPatientCity = new javax.swing.JComboBox<>();
        comboBoxPatientCommunity = new javax.swing.JComboBox<>();
        jRadioButtonPMale = new javax.swing.JRadioButton();
        jRadioButtonPFemale = new javax.swing.JRadioButton();
        jRadioButtonPOthers = new javax.swing.JRadioButton();
        lblBodyTemperature2 = new javax.swing.JLabel();
        lblBloodPressureSystolic = new javax.swing.JLabel();
        lblHeartRate2 = new javax.swing.JLabel();
        lblBodyWeight2 = new javax.swing.JLabel();
        lblDate2 = new javax.swing.JLabel();
        txtVisitDate = new javax.swing.JTextField();
        txtPatientBodyWeight = new javax.swing.JTextField();
        txtPatientHeartRate = new javax.swing.JTextField();
        txtPatientBloodPressureSystolic = new javax.swing.JTextField();
        txtPatientBodyTemperature = new javax.swing.JTextField();
        btnAddPatient = new javax.swing.JButton();
        lblBloodPressureDiastolic = new javax.swing.JLabel();
        txtPatientBloodPressureDiastolic = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePatientDirectoryData = new javax.swing.JTable();

        lblPatientName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPatientName.setText("Patient Name");

        lblPatientAge.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPatientAge.setText("Patient Age");

        lblGender.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblGender.setText("Gender");

        lblContactNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblContactNumber.setText("Contact Number");

        lblResidence.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblResidence.setText("Residence");

        txtPatientAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientAgeActionPerformed(evt);
            }
        });

        lblCity.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblCity.setText("City");

        lblCommunity.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblCommunity.setText("Community");

        lblPatientClinicNumber.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPatientClinicNumber.setText("Patient ID");

        comboBoxPatientCity.setEditable(true);
        comboBoxPatientCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "NewYork", "Worcester", "Springfield", "Cambridge", "Lowell" }));

        comboBoxPatientCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allston", "Back Bay", "Mission Hill", "Roxbury" }));
        comboBoxPatientCommunity.setSelectedIndex(-1);

        jRadioButtonPMale.setText("Male");

        jRadioButtonPFemale.setText("Female");

        jRadioButtonPOthers.setText("Others");
        jRadioButtonPOthers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPOthersActionPerformed(evt);
            }
        });

        lblBodyTemperature2.setText("Body Temperature");

        lblBloodPressureSystolic.setText("Blood Pressure Systolic");

        lblHeartRate2.setText("Heart Rate");

        lblBodyWeight2.setText("Body Weight");

        lblDate2.setText("Date");

        btnAddPatient.setText("Add Patient");
        btnAddPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPatientActionPerformed(evt);
            }
        });

        lblBloodPressureDiastolic.setText("Blood Pressure Diastolic");

        txtPatientBloodPressureDiastolic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientBloodPressureDiastolicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(438, 438, 438)
                .addComponent(btnAddPatient)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPatientName)
                    .addComponent(lblPatientAge)
                    .addComponent(lblGender)
                    .addComponent(lblContactNumber)
                    .addComponent(lblResidence))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jRadioButtonPMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonPFemale)
                        .addGap(12, 12, 12)
                        .addComponent(jRadioButtonPOthers))
                    .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPatientResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCommunity)
                            .addComponent(lblPatientClinicNumber)
                            .addComponent(lblCity))
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPatientClinicId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBoxPatientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBodyTemperature2)
                            .addComponent(lblBloodPressureSystolic)
                            .addComponent(lblHeartRate2)
                            .addComponent(lblBodyWeight2)
                            .addComponent(lblDate2)
                            .addComponent(lblBloodPressureDiastolic))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVisitDate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientBodyWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientBloodPressureSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientBloodPressureDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(175, 175, 175))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientName)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientAge)
                            .addComponent(txtPatientAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblGender)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jRadioButtonPMale)
                                .addComponent(jRadioButtonPFemale)
                                .addComponent(jRadioButtonPOthers)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblContactNumber)
                            .addComponent(txtPatientContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResidence)
                            .addComponent(txtPatientResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCity)
                            .addComponent(comboBoxPatientCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCommunity)
                            .addComponent(comboBoxPatientCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPatientClinicNumber)
                            .addComponent(txtPatientClinicId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBodyTemperature2)
                            .addComponent(txtPatientBodyTemperature, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBloodPressureSystolic)
                            .addComponent(txtPatientBloodPressureSystolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientBloodPressureDiastolic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBloodPressureDiastolic))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHeartRate2)
                            .addComponent(txtPatientHeartRate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBodyWeight2)
                            .addComponent(txtPatientBodyWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDate2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVisitDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addComponent(btnAddPatient)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("ADD PATIENT");

        jTablePatientDirectoryData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Contact", "Residence", "Community", "City", "Patient Id", "Body Temperature", "Systolic BP", "Diastolic BP", "Heart Rate", "Body Weight", "Date"
            }
        ));
        jScrollPane2.setViewportView(jTablePatientDirectoryData);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(439, 439, 439)
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(34, 34, 34)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(457, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPatientAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientAgeActionPerformed

    private void jRadioButtonPOthersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPOthersActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPOthersActionPerformed

    private void btnAddPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPatientActionPerformed
        // TODO add your handling code here:
        //        for(Cars cr : carsList){
            //            if(txtSerialNumber.getText().equalsIgnoreCase(cr.serialNumber)){
                //                JOptionPane.showMessageDialog(this, "Duplicate Serial Number Found! Serial Number must be Unique!");
                //                return;
                //            }
            //        }
        String patientName =txtPatientName.getText();
        int patientAge = Integer.parseInt(txtPatientAge.getText());

        String gender="";
        if((jRadioButtonPMale.isSelected()==false)&&(jRadioButtonPFemale.isSelected()==false)&&(jRadioButtonPOthers.isSelected()==false)){
            JOptionPane.showMessageDialog(null,"Please select radio button");

        }else{
            if (jRadioButtonPMale.isSelected()) {
                gender="Male";
            }else if(jRadioButtonPFemale.isSelected()){
                gender="Female";
            }else if (jRadioButtonPOthers.isSelected()){
                gender="Other";
            }}
            long contactNumber= Long.parseLong(txtPatientContactNumber.getText());
            String cityName= comboBoxPatientCity.getSelectedItem().toString();
            String CommunityName = comboBoxPatientCommunity.getSelectedItem().toString();
            String residence = txtPatientResidence.getText();
            int patientClinicId = Integer.parseInt(txtPatientClinicId.getText());

            double bodyTemperature = Double.parseDouble(txtPatientBodyTemperature.getText());
            double bloodPressureSystolic = Double.parseDouble(txtPatientBloodPressureSystolic.getText());
            double bloodPressureDiastolic = Double.parseDouble(txtPatientBloodPressureDiastolic.getText());
            double heartRate = Double.parseDouble(txtPatientHeartRate.getText());
            double bodyWeight = Double.parseDouble(txtPatientBodyWeight.getText());
            String date = txtVisitDate.getText();

            VitalSigns uc = vitalSignHistory.addNewPatient();
            uc.setPatientName(patientName);
            uc.setPatientAge(patientAge);
            uc.setPatientGender(gender);
            uc.setContactNumber(contactNumber);
            uc.setResidence(residence);
            uc.setCommunity(CommunityName);
            uc.setCity(cityName);
            uc.setPatientId(patientClinicId);
            uc.setContactNumber(contactNumber);
            uc.setBodyTemperature(bodyTemperature);
            uc.setBloodPressureSystolic(bloodPressureSystolic);
            uc.setBloodPressureDiastolic(bloodPressureDiastolic);
            uc.setHeartRate(heartRate);
            uc.setWeight(bodyWeight);
            uc.setDate(date);

            JOptionPane.showMessageDialog(this, "New Person Details Added");

            populatePatientTable();
            clearField();

    }//GEN-LAST:event_btnAddPatientActionPerformed

    private void txtPatientBloodPressureDiastolicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientBloodPressureDiastolicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientBloodPressureDiastolicActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPatient;
    private javax.swing.JComboBox<String> comboBoxPatientCity;
    private javax.swing.JComboBox<String> comboBoxPatientCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonPFemale;
    private javax.swing.JRadioButton jRadioButtonPMale;
    private javax.swing.JRadioButton jRadioButtonPOthers;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTablePatientDirectoryData;
    private javax.swing.JLabel lblBloodPressureDiastolic;
    private javax.swing.JLabel lblBloodPressureSystolic;
    private javax.swing.JLabel lblBodyTemperature2;
    private javax.swing.JLabel lblBodyWeight2;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblDate2;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblHeartRate2;
    private javax.swing.JLabel lblPatientAge;
    private javax.swing.JLabel lblPatientClinicNumber;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblResidence;
    private javax.swing.JTextField txtPatientAge;
    private javax.swing.JTextField txtPatientBloodPressureDiastolic;
    private javax.swing.JTextField txtPatientBloodPressureSystolic;
    private javax.swing.JTextField txtPatientBodyTemperature;
    private javax.swing.JTextField txtPatientBodyWeight;
    private javax.swing.JTextField txtPatientClinicId;
    private javax.swing.JTextField txtPatientContactNumber;
    private javax.swing.JTextField txtPatientHeartRate;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientResidence;
    private javax.swing.JTextField txtVisitDate;
    // End of variables declaration//GEN-END:variables

    private void populatePatientTable() {
        defaultTableModel = (DefaultTableModel)jTablePatientDirectoryData.getModel();
        defaultTableModel.setRowCount(0);
        
        for(VitalSigns uc : vitalSignHistory.getVitalSignArrayList()){
            Object[] row = new Object[14];
            row[0]= uc;
            row[1]= uc.getPatientAge();
            row[2]= uc.getPatientGender();
            row[3]= uc.getContactNumber();
            row[4]= uc.getResidence();
            row[5]= uc.getCommunity();
            row[6]= uc.getCity();
            row[7]= uc.getPatientId();
            row[8]= uc.getBodyTemperature();
            row[9]= uc.getBloodPressureSystolic();
            row[10]= uc.getBloodPressureDiastolic();
            row[11]= uc.getHeartRate();
            row[12]=uc.getWeight();
            row[13]= uc.getDate();
            defaultTableModel.addRow(row); 
        }  
    }

    private void clearField() {
        txtPatientName.setText("");
        txtPatientAge.setText("");
        txtPatientContactNumber.setText("");
        txtPatientResidence.setText("");
        comboBoxPatientCity.setSelectedIndex(-1);
        comboBoxPatientCommunity.setSelectedIndex(-1);
        txtPatientClinicId.setText("");
        txtPatientBodyTemperature.setText("");
        txtPatientBloodPressureSystolic.setText("");
        txtPatientBloodPressureDiastolic.setText("");
        txtPatientHeartRate.setText("");
        txtPatientBodyWeight.setText("");
        txtVisitDate.setText("");
    }  
}
