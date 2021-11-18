/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kinjal
 */
public class ViewRestaurantsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewRestaurantsJPanel
     */
    private final JPanel container;
    private final Restaurant restaurant;

    public ViewRestaurantsJPanel(JPanel container, Restaurant restaurant) {
        initComponents();
        this.container = container;
        this.restaurant = restaurant;
        txtRestaurantID.setText(restaurant.getRestaurantNo());
        txtManagerName.setText(restaurant.getOperatorName());
        txtAddressStreet.setText(restaurant.getStreetAddress());
        txtPhoneNo.setText(restaurant.getMobileNo());
        txtEmail.setText(restaurant.getEmail());
        txtRestaurantName.setText(restaurant.getRestaurantName());
        txtZipcode.setText(restaurant.getZipcode());
        disableEditing();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPasswordField1 = new javax.swing.JPasswordField();
        lblUpdateResDetails = new javax.swing.JLabel();
        lblResName = new javax.swing.JLabel();
        lblManagerName = new javax.swing.JLabel();
        txtRestaurantName = new javax.swing.JTextField();
        txtManagerName = new javax.swing.JTextField();
        lblAddressStreet = new javax.swing.JLabel();
        txtAddressStreet = new javax.swing.JTextField();
        lblPhoneNo = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        lblZipcode = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblResNo = new javax.swing.JLabel();
        txtRestaurantID = new javax.swing.JTextField();
        lblZipcode1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(255, 204, 204));

        lblUpdateResDetails.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUpdateResDetails.setText("Update Restaurant Details");

        lblResName.setText(" Name:");

        lblManagerName.setText("Manager Name:");

        lblAddressStreet.setText("Address Street:");

        lblPhoneNo.setText("Phone No:");

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setText("Update");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblZipcode.setText("Zipcode:");

        lblResNo.setText("Restaurant No:");

        lblZipcode1.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 107, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUpdateResDetails)
                        .addGap(346, 346, 346))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblManagerName)
                                    .addComponent(lblZipcode)
                                    .addComponent(lblZipcode1))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblResNo)
                                .addGap(67, 67, 67)
                                .addComponent(txtRestaurantID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblResName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblPhoneNo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblAddressStreet)
                                .addGap(18, 18, 18)
                                .addComponent(txtAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(133, 133, 133))))
            .addGroup(layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addComponent(btnEdit)
                .addGap(62, 62, 62)
                .addComponent(btnSave)
                .addGap(40, 40, 40)
                .addComponent(btnBack)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblUpdateResDetails)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblResName)
                    .addComponent(lblResNo)
                    .addComponent(txtRestaurantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressStreet)
                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblManagerName))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit)
                    .addComponent(btnSave)
                    .addComponent(btnBack))
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        txtRestaurantName.setEditable(true);
        txtManagerName.setEditable(true);
        txtPhoneNo.setEditable(true);
        txtAddressStreet.setEditable(true);
        txtZipcode.setEditable(true);
        txtEmail.setEditable(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (txtRestaurantName.getText().isEmpty() || txtAddressStreet.getText().isEmpty() || txtPhoneNo.getText().isEmpty() || txtManagerName.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please Fill All Fields!");
        } else if (!checkPhoneNoValidation(txtPhoneNo.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Phone No!");
        } else {
            restaurant.setRestaurantName(txtRestaurantName.getText());
            restaurant.setOperatorName(txtManagerName.getText());
            restaurant.setStreetAddress(txtAddressStreet.getText());
            restaurant.setMobileNo(txtPhoneNo.getText());
            restaurant.setEmail(txtEmail.getText());
            restaurant.setZipcode(txtZipcode.getText());
            JOptionPane.showMessageDialog(null, "Changes Saved Sucessfully!");
            disableEditing();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public void disableEditing() {
        txtRestaurantID.setEditable(false);
        txtManagerName.setEditable(false);
        txtPhoneNo.setEditable(false);
        txtRestaurantName.setEditable(false);
        txtAddressStreet.setEditable(false);
        txtZipcode.setEditable(false);
        txtEmail.setEditable(false);
    }

    public boolean checkPhoneNoValidation(String phoneNo) {
        String regex = "^\\(?([0-9]{3})\\)?[-.\\s]?([0-9]{3})[-.\\s]?([0-9]{4})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNo);
        if (matcher.matches()) {
            return true;
        }
        return false;
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UpdateRestaurantJPanel manageRestaurantJPanel = (UpdateRestaurantJPanel) component;
        manageRestaurantJPanel.populateRestaurants();
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblAddressStreet;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblResNo;
    private javax.swing.JLabel lblUpdateResDetails;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JLabel lblZipcode1;
    private javax.swing.JTextField txtAddressStreet;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtRestaurantID;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
