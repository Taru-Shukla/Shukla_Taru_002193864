/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.awt.Image;
import javax.swing.ImageIcon;
import model.Profile;


/**
 *
 * @author tarushukla
 */
public class DisplayJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DisplayJPanel
     */
        Profile profile;

    public DisplayJPanel(Profile profile) {
        initComponents();
        
        this.profile = profile;
        displayProfile();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGeoData = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblTeleNum = new javax.swing.JLabel();
        lblFAX = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblSSN = new javax.swing.JLabel();
        lblMedic = new javax.swing.JLabel();
        lblHealthNum = new javax.swing.JLabel();
        lblBankNum = new javax.swing.JLabel();
        lblLicenseNum = new javax.swing.JLabel();
        lblVehicleId = new javax.swing.JLabel();
        lblDeviceId = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        lblIPAddress = new javax.swing.JLabel();
        lblBioId = new javax.swing.JLabel();
        lblImage = new javax.swing.JLabel();
        lblUniqueID = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGeoData = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        txtTeleNum = new javax.swing.JTextField();
        txtFAX = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtSSN = new javax.swing.JTextField();
        txtMedic = new javax.swing.JTextField();
        txtHealthNum = new javax.swing.JTextField();
        txtBankNum = new javax.swing.JTextField();
        txtLicenseNum = new javax.swing.JTextField();
        txtVehicleId = new javax.swing.JTextField();
        txtDeviceId = new javax.swing.JTextField();
        txtLinkedIn = new javax.swing.JTextField();
        txtIPAddress = new javax.swing.JTextField();
        txtUniqueID = new javax.swing.JTextField();
        jLabelFace = new javax.swing.JLabel();
        jLabelBio = new javax.swing.JLabel();

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Display Profile ");

        lblName.setText("Name");

        lblGeoData.setText("Geographic Data");

        lblDOB.setText("Date of Birth");

        lblTeleNum.setText("Telephone Number");

        lblFAX.setText("FAX Number");

        lblEmail.setText("Email Address");

        lblSSN.setText("Social Security Number");

        lblMedic.setText("Medical Record Number");

        lblHealthNum.setText("Health Plan Beneficiary Number");

        lblBankNum.setText("Bank Account Number");

        lblLicenseNum.setText("License Number");

        lblVehicleId.setText("Vehicle Identifier");

        lblDeviceId.setText("Device Identifier");

        lblLinkedIn.setText("LinkedIn");

        lblIPAddress.setText("Internet Protocol Address");

        lblBioId.setText("Biometric Identifier");

        lblImage.setText("Full Face Photo");

        lblUniqueID.setText("Unique Identifying Number");

        txtName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });

        txtTeleNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTeleNumActionPerformed(evt);
            }
        });

        txtFAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFAXActionPerformed(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        txtBankNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBankNumActionPerformed(evt);
            }
        });

        txtVehicleId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVehicleIdActionPerformed(evt);
            }
        });

        txtLinkedIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLinkedInActionPerformed(evt);
            }
        });

        txtUniqueID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUniqueID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUniqueIDActionPerformed(evt);
            }
        });

        jLabelBio.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImage)
                    .addComponent(lblUniqueID)
                    .addComponent(lblBioId))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(txtUniqueID))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFace, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelBio, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(329, 329, 329)
                .addComponent(lblTitle)
                .addContainerGap(394, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblName)
                        .addComponent(lblGeoData)
                        .addComponent(lblDOB)
                        .addComponent(lblTeleNum)
                        .addComponent(lblFAX)
                        .addComponent(lblEmail)
                        .addComponent(lblSSN)
                        .addComponent(lblMedic)
                        .addComponent(lblHealthNum)
                        .addComponent(lblBankNum)
                        .addComponent(lblLicenseNum)
                        .addComponent(lblVehicleId)
                        .addComponent(lblDeviceId)
                        .addComponent(lblLinkedIn)
                        .addComponent(lblIPAddress))
                    .addGap(51, 51, 51)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtBankNum)
                        .addComponent(txtVehicleId)
                        .addComponent(txtDeviceId)
                        .addComponent(txtLinkedIn)
                        .addComponent(txtIPAddress)
                        .addComponent(txtLicenseNum, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtHealthNum)
                        .addComponent(txtMedic, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtSSN, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtFAX, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtTeleNum, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtDOB)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtGeoData)
                                .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 573, Short.MAX_VALUE))))
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 474, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelBio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBioId))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabelFace, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblImage)
                        .addGap(56, 56, 56)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueID)
                    .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblName)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblGeoData)
                        .addComponent(txtGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDOB)
                        .addComponent(txtDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblTeleNum)
                        .addComponent(txtTeleNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFAX)
                        .addComponent(txtFAX, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblSSN)
                        .addComponent(txtSSN, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblMedic)
                        .addComponent(txtMedic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblHealthNum)
                        .addComponent(txtHealthNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBankNum)
                        .addComponent(txtBankNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLicenseNum)
                        .addComponent(txtLicenseNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblVehicleId)
                        .addComponent(txtVehicleId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblDeviceId)
                        .addComponent(txtDeviceId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblLinkedIn)
                        .addComponent(txtLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblIPAddress)
                        .addComponent(txtIPAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(234, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtTeleNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTeleNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTeleNumActionPerformed

    private void txtFAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFAXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFAXActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtBankNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBankNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBankNumActionPerformed

    private void txtVehicleIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVehicleIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVehicleIdActionPerformed

    private void txtLinkedInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLinkedInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLinkedInActionPerformed

    private void txtUniqueIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUniqueIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUniqueIDActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelBio;
    private javax.swing.JLabel jLabelFace;
    private javax.swing.JLabel lblBankNum;
    private javax.swing.JLabel lblBioId;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblDeviceId;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFAX;
    private javax.swing.JLabel lblGeoData;
    private javax.swing.JLabel lblHealthNum;
    private javax.swing.JLabel lblIPAddress;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblLicenseNum;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedic;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSSN;
    private javax.swing.JLabel lblTeleNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUniqueID;
    private javax.swing.JLabel lblVehicleId;
    private javax.swing.JTextField txtBankNum;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtDeviceId;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFAX;
    private javax.swing.JTextField txtGeoData;
    private javax.swing.JTextField txtHealthNum;
    private javax.swing.JTextField txtIPAddress;
    private javax.swing.JTextField txtLicenseNum;
    private javax.swing.JTextField txtLinkedIn;
    private javax.swing.JTextField txtMedic;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSSN;
    private javax.swing.JTextField txtTeleNum;
    private javax.swing.JTextField txtUniqueID;
    private javax.swing.JTextField txtVehicleId;
    // End of variables declaration//GEN-END:variables

    private void displayProfile() {
        
        txtName.setText(profile.getName());
        txtGeoData.setText(profile.getGeoData());
        txtDOB.setText(profile.getDoB());
        txtTeleNum.setText(String.valueOf(profile.getTeleNumber()));
        txtFAX.setText(profile.getFaxNumber());
        txtEmail.setText(profile.getEmailAdd());
        txtSSN.setText(profile.getSsn());
        txtMedic.setText(String.valueOf(profile.getMedicNumber()));
        txtHealthNum.setText(profile.getHealthPlanNumbr());
        txtBankNum.setText(String.valueOf(profile.getBankAccount()));
        txtLicenseNum.setText(String.valueOf(profile.getLicenseNumber()));
        txtVehicleId.setText(profile.getVehicleIdentifier());
        txtDeviceId.setText(profile.getDeviceIdentifier());
        txtLinkedIn.setText(profile.getLinkedIn());
        txtIPAddress.setText(String.valueOf(profile.getIpAddress()));
        String path1 = profile.getBioId();
        ImageIcon MyImage = new ImageIcon(path1);
        Image image = MyImage.getImage().getScaledInstance(jLabelBio.getWidth()+100, jLabelBio.getHeight()+100, Image.SCALE_SMOOTH);
        jLabelBio.setIcon(new ImageIcon(image));
        String path = profile.getFullFace();
        ImageIcon MyImage1 = new ImageIcon(path);
        Image image1 = MyImage1.getImage().getScaledInstance(jLabelFace.getWidth()+100, jLabelFace.getHeight()+100, Image.SCALE_SMOOTH);
        jLabelFace.setIcon(new ImageIcon(image1));
        txtUniqueID.setText(profile.getUniqueId().toString());

    }
}
