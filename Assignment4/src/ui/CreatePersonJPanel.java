/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Person;
import model.PersonDirectory;

/**
 *
 * @author tarushukla
 */
public class CreatePersonJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreatePersonJPanel
     */
    
    PersonDirectory personDirectory;
    int row, column;
    DefaultTableModel defaultTableModel;
    
    
    public CreatePersonJPanel(PersonDirectory personDirectory) {
        initComponents();
        this.personDirectory = personDirectory;
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

        btnGroupGender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        lblPersonName = new javax.swing.JLabel();
        txtPersonName = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        txtPersonAge = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        comboBoxCity = new javax.swing.JComboBox<>();
        jRadioButtonMale = new javax.swing.JRadioButton();
        jRadioButtonFemale = new javax.swing.JRadioButton();
        jRadioButtonOthers = new javax.swing.JRadioButton();
        lblCommunity = new javax.swing.JLabel();
        comboBoxCommunity = new javax.swing.JComboBox<>();
        lblResidence = new javax.swing.JLabel();
        txtResidence = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        lblContactNumber = new javax.swing.JLabel();
        txtContactNumber = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablePersonDirectory = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        lblCity.setBackground(new java.awt.Color(0, 0, 0));
        lblCity.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblCity.setText("Select City");

        lblPersonName.setBackground(new java.awt.Color(255, 255, 255));
        lblPersonName.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblPersonName.setText("Name");
        lblPersonName.setPreferredSize(new java.awt.Dimension(60, 15));

        txtPersonName.setBorder(null);

        lblAge.setBackground(new java.awt.Color(153, 153, 255));
        lblAge.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblAge.setText("Age");

        txtPersonAge.setBorder(null);

        lblGender.setBackground(new java.awt.Color(255, 255, 255));
        lblGender.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lblGender.setText("Gender");
        lblGender.setPreferredSize(new java.awt.Dimension(60, 15));

        comboBoxCity.setMaximumRowCount(4);
        comboBoxCity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boston", "NewYork", "Worcester", "Springfield", "Cambridge", "Lowell", " " }));
        comboBoxCity.setSelectedIndex(-1);
        comboBoxCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCityActionPerformed(evt);
            }
        });

        jRadioButtonMale.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupGender.add(jRadioButtonMale);
        jRadioButtonMale.setText("Male");
        jRadioButtonMale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMaleActionPerformed(evt);
            }
        });

        jRadioButtonFemale.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupGender.add(jRadioButtonFemale);
        jRadioButtonFemale.setText("Female");

        jRadioButtonOthers.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupGender.add(jRadioButtonOthers);
        jRadioButtonOthers.setText("Others");

        lblCommunity.setBackground(new java.awt.Color(0, 255, 255));
        lblCommunity.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblCommunity.setText("Select Community");

        comboBoxCommunity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Allston", "Back Bay", "Mission Hill", "Roxbury" }));
        comboBoxCommunity.setSelectedIndex(-1);
        comboBoxCommunity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCommunityActionPerformed(evt);
            }
        });

        lblResidence.setBackground(new java.awt.Color(0, 0, 0));
        lblResidence.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblResidence.setText("Residence");

        txtResidence.setBorder(null);

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAdd.setSize(new java.awt.Dimension(20, 10));
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblContactNumber.setBackground(new java.awt.Color(0, 255, 255));
        lblContactNumber.setFont(new java.awt.Font("Georgia", 1, 12)); // NOI18N
        lblContactNumber.setText("Contact Number");

        txtContactNumber.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonFemale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButtonOthers))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAge, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPersonAge, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(66, 66, 66)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(276, 276, 276)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCity))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAge)
                        .addComponent(txtPersonAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBoxCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunity))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblResidence)
                            .addComponent(txtResidence, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblContactNumber)
                            .addComponent(txtContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGender, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonMale)
                    .addComponent(jRadioButtonFemale)
                    .addComponent(jRadioButtonOthers))
                .addGap(32, 32, 32)
                .addComponent(btnAdd)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Create Person Profile");

        jTablePersonDirectory.setModel(new javax.swing.table.DefaultTableModel(
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
        jTablePersonDirectory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTablePersonDirectoryMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTablePersonDirectory);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/download2.jpeg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(346, 346, 346)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCityActionPerformed

    private void jRadioButtonMaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonMaleActionPerformed

    private void comboBoxCommunityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCommunityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCommunityActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:

        //        Person p = new Person();
        //        int serialNumber= p.getSerialNumber();

        String personName =txtPersonName.getText();
        int age = Integer.parseInt(txtPersonAge.getText());

        String gender="";
        if((jRadioButtonMale.isSelected()==false)&&(jRadioButtonFemale.isSelected()==false)&&(jRadioButtonOthers.isSelected()==false)){
            JOptionPane.showMessageDialog(null,"Please select radio button");

        }else{
            if (jRadioButtonMale.isSelected()) {
                gender="Male";
            }else if(jRadioButtonFemale.isSelected()){
                gender="Female";
            }else{
                gender="Other";
            }}
            long contactNumber= Long.parseLong(txtContactNumber.getText());

            String cityName= comboBoxCity.getSelectedItem().toString();
            String CommunityName = comboBoxCommunity.getSelectedItem().toString();
            String residence = txtResidence.getText();

            Person person = personDirectory.addNewPersonDetails();
            person.setPersonName(personName);
            person.setPersonAge(age);
            person.setGender(gender);
            person.setContactNumber(contactNumber);
            person.setHouseAddress(residence);
            person.setCommunityName(CommunityName);
            person.setCityName(cityName);

            JOptionPane.showMessageDialog(this, "New Person Details Added");
            populateTable();
            clearField();

    }//GEN-LAST:event_btnAddActionPerformed

    private void jTablePersonDirectoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTablePersonDirectoryMouseClicked
        // TODO add your handling code here:

        row= jTablePersonDirectory.getSelectedRow();
        column=jTablePersonDirectory.getSelectedColumn();
        System.out.println(row+","+column);

        txtPersonName.setText(defaultTableModel.getValueAt(row, 0).toString());
        txtPersonAge.setText(defaultTableModel.getValueAt(row, 1).toString());

        String gender= defaultTableModel.getValueAt(row, 2).toString();
        if (gender.equals("Male")) {
            jRadioButtonMale.setSelected(true);

        } else if(gender.equals("Female")){
            jRadioButtonFemale.setSelected(true);
        }else if(gender.equals("Others")){
            jRadioButtonOthers.setSelected(true);
        }

        txtContactNumber.setText(defaultTableModel.getValueAt(row, 3).toString());
        txtResidence.setText(defaultTableModel.getValueAt(row, 4).toString());

        String communityName = defaultTableModel.getValueAt(row, 5).toString();
        for (int i = 0; i < (comboBoxCommunity.getItemCount()); i++) {
            if (comboBoxCommunity.getItemAt(i).equalsIgnoreCase(communityName)) {
                comboBoxCommunity.setSelectedIndex(i);
            }
        }
        String cityName = defaultTableModel.getValueAt(row, 6).toString();
        for (int i = 0; i < (comboBoxCity.getItemCount()); i++) {
            if (comboBoxCity.getItemAt(i).equalsIgnoreCase(cityName)) {
                comboBoxCity.setSelectedIndex(i);
            }
        }
        //txtSerialNumber.setText(defaultTableModel.getValueAt(row, 1).toString());
        //txtCarModel.setText(defaultTableModel.getValueAt(row, 2).toString());

    }//GEN-LAST:event_jTablePersonDirectoryMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.ButtonGroup btnGroupGender;
    private javax.swing.JComboBox<String> comboBoxCity;
    private javax.swing.JComboBox<String> comboBoxCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButtonFemale;
    private javax.swing.JRadioButton jRadioButtonMale;
    private javax.swing.JRadioButton jRadioButtonOthers;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablePersonDirectory;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblContactNumber;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblPersonName;
    private javax.swing.JLabel lblResidence;
    private javax.swing.JTextField txtContactNumber;
    private javax.swing.JTextField txtPersonAge;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtResidence;
    // End of variables declaration//GEN-END:variables

    private void clearField() {
        
        txtPersonName.setText("");
        txtPersonAge.setText("");
        txtResidence.setText("");
        txtContactNumber.setText("");
        comboBoxCity.setSelectedIndex(-1);
        comboBoxCommunity.setSelectedIndex(-1);        
    }

    public void populateTable() {
        defaultTableModel = (DefaultTableModel)jTablePersonDirectory.getModel();
        defaultTableModel.setRowCount(0);
        
        for(Person person : personDirectory.getPersonDirectoryArrayList()){
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
