/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;


import model.UserProfile;

/**
 *
 * @author adity
 */
public class ViewJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJPanel
     */
    
    UserProfile userProfile;
    public ViewJPanel(UserProfile userProfile) {
        initComponents();
        this.userProfile = userProfile;
        displayCandidate();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtName = new javax.swing.JTextField();
        lblGeoData = new javax.swing.JLabel();
        txtGeoData = new javax.swing.JTextField();
        lblDOb = new javax.swing.JLabel();
        txtDOb = new javax.swing.JTextField();
        lblTelephnNum = new javax.swing.JLabel();
        txtTelephnNum = new javax.swing.JTextField();
        lblFaxNum = new javax.swing.JLabel();
        txtFaxNum = new javax.swing.JTextField();
        lblEmailID = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        txtEmailID = new javax.swing.JTextField();
        txtSsn = new javax.swing.JTextField();
        lblMedRecordNum = new javax.swing.JLabel();
        txtMedRecordNum = new javax.swing.JTextField();
        lblHealthPlanBeneNum = new javax.swing.JLabel();
        txtHealthPlanBeneNum = new javax.swing.JTextField();
        lblBankACNum = new javax.swing.JLabel();
        txtBankACNum = new javax.swing.JTextField();
        lblCertLicenNum = new javax.swing.JLabel();
        txtCertLicenNum = new javax.swing.JTextField();
        txtVehIdentifier = new javax.swing.JTextField();
        txtDevIdentifier = new javax.swing.JTextField();
        lblVehIdentifier = new javax.swing.JLabel();
        txtLinkdIn = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblDevIdentifier = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblLinkedIn = new javax.swing.JLabel();
        txtIpAdress = new javax.swing.JTextField();
        lblIpAdress = new javax.swing.JLabel();
        lblProfilePicture = new javax.swing.JLabel();

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblGeoData.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblGeoData.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblGeoData.setText("Geographical Data:");

        txtGeoData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGeoDataActionPerformed(evt);
            }
        });

        lblDOb.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblDOb.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDOb.setText("Date of Birth :");

        lblTelephnNum.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblTelephnNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTelephnNum.setText("Telephone Number :");

        lblFaxNum.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblFaxNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFaxNum.setText("FAX Number :");

        lblEmailID.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblEmailID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblEmailID.setText("Email ID :");

        lblSsn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblSsn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSsn.setText("SSN :");

        lblMedRecordNum.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblMedRecordNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedRecordNum.setText("Medical Record Number :");

        lblHealthPlanBeneNum.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblHealthPlanBeneNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHealthPlanBeneNum.setText("Health Plan Beneficiary Number :");

        lblBankACNum.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblBankACNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblBankACNum.setText("Bank Account Number :");

        lblCertLicenNum.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblCertLicenNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCertLicenNum.setText("Certificate/License Number :");

        txtCertLicenNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCertLicenNumActionPerformed(evt);
            }
        });

        txtDevIdentifier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDevIdentifierActionPerformed(evt);
            }
        });

        lblVehIdentifier.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblVehIdentifier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblVehIdentifier.setText("License Plate :");

        lblTitle.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View User Details");

        lblDevIdentifier.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblDevIdentifier.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDevIdentifier.setText("Device Identifier No. :");

        lblName.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name :");

        lblLinkedIn.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblLinkedIn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLinkedIn.setText("LinkedIn ID :");

        txtIpAdress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIpAdressActionPerformed(evt);
            }
        });

        lblIpAdress.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        lblIpAdress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIpAdress.setText("IP Address :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblIpAdress, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblLinkedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDevIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblVehIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCertLicenNum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBankACNum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHealthPlanBeneNum, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedRecordNum)
                            .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelephnNum)
                            .addComponent(lblDOb)
                            .addComponent(lblGeoData)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtLinkdIn)
                            .addComponent(txtIpAdress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDevIdentifier, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVehIdentifier, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBankACNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtHealthPlanBeneNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMedRecordNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSsn, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFaxNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDOb, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtGeoData, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelephnNum, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCertLicenNum, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(lblProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(172, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtGeoData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblGeoData))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDOb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDOb))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTelephnNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTelephnNum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFaxNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFaxNum))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEmailID)
                            .addComponent(txtEmailID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblSsn))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMedRecordNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMedRecordNum))))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHealthPlanBeneNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHealthPlanBeneNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBankACNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBankACNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCertLicenNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCertLicenNum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVehIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblVehIdentifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDevIdentifier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDevIdentifier))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIpAdress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLinkedIn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIpAdress)
                    .addComponent(txtLinkdIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtGeoDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGeoDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGeoDataActionPerformed

    private void txtCertLicenNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCertLicenNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCertLicenNumActionPerformed

    private void txtIpAdressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIpAdressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIpAdressActionPerformed

    private void txtDevIdentifierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDevIdentifierActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDevIdentifierActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBankACNum;
    private javax.swing.JLabel lblCertLicenNum;
    private javax.swing.JLabel lblDOb;
    private javax.swing.JLabel lblDevIdentifier;
    private javax.swing.JLabel lblEmailID;
    private javax.swing.JLabel lblFaxNum;
    private javax.swing.JLabel lblGeoData;
    private javax.swing.JLabel lblHealthPlanBeneNum;
    private javax.swing.JLabel lblIpAdress;
    private javax.swing.JLabel lblLinkedIn;
    private javax.swing.JLabel lblMedRecordNum;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblTelephnNum;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblVehIdentifier;
    private javax.swing.JTextField txtBankACNum;
    private javax.swing.JTextField txtCertLicenNum;
    private javax.swing.JTextField txtDOb;
    private javax.swing.JTextField txtDevIdentifier;
    private javax.swing.JTextField txtEmailID;
    private javax.swing.JTextField txtFaxNum;
    private javax.swing.JTextField txtGeoData;
    private javax.swing.JTextField txtHealthPlanBeneNum;
    private javax.swing.JTextField txtIpAdress;
    private javax.swing.JTextField txtLinkdIn;
    private javax.swing.JTextField txtMedRecordNum;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtTelephnNum;
    private javax.swing.JTextField txtVehIdentifier;
    // End of variables declaration//GEN-END:variables

    private void displayCandidate() {
        
        txtName.setText(userProfile.getName());
        txtGeoData.setText(userProfile.getGeographicalData());
        txtDOb.setText(userProfile.getDateOfBirth());
        txtTelephnNum.setText(Long.toString(userProfile.getTeleNumber()));  
        txtFaxNum.setText(Long.toString(userProfile.getFaxNum()));
        txtEmailID.setText(userProfile.getEmailID());
        txtSsn.setText(Long.toString(userProfile.getSsn()));
        txtMedRecordNum.setText(Long.toString(userProfile.getMedRecordNum()));
        txtHealthPlanBeneNum.setText(Long.toString(userProfile.getHealthPlanBeneficiaryNum()));
        txtBankACNum.setText(Long.toString(userProfile.getBankAccountNum()));
        txtCertLicenNum.setText(Long.toString(userProfile.getCertLicenseNum()));
        txtVehIdentifier.setText(userProfile.getLicensePlate());
        txtDevIdentifier.setText(userProfile.getDevIdentifier());
        txtLinkdIn.setText(userProfile.getLinkedIn());
        txtIpAdress.setText(userProfile.getIpAdress());
        lblProfilePicture.setIcon(userProfile.getImage());

    }
}
