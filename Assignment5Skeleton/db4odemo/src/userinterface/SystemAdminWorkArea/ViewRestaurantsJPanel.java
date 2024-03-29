/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
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
    private final EcoSystem system;

    public ViewRestaurantsJPanel(JPanel container, Restaurant restaurant,EcoSystem system) {
        initComponents();
        this.system = system;
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
        lblRestroNameError = new javax.swing.JLabel();
        lblManagerNameError = new javax.swing.JLabel();
        lblZipcodeError = new javax.swing.JLabel();
        lblPhoneNumberError = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setBackground(new java.awt.Color(255, 204, 102));

        lblUpdateResDetails.setBackground(new java.awt.Color(255, 153, 0));
        lblUpdateResDetails.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUpdateResDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUpdateResDetails.setText("Update Restaurant Details");
        lblUpdateResDetails.setOpaque(true);

        lblResName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblResName.setText(" Name:");

        lblManagerName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblManagerName.setText("Manager Name:");

        txtRestaurantName.setBackground(new java.awt.Color(255, 255, 204));
        txtRestaurantName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtRestaurantNameKeyPressed(evt);
            }
        });

        txtManagerName.setBackground(new java.awt.Color(255, 255, 204));
        txtManagerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtManagerNameKeyPressed(evt);
            }
        });

        lblAddressStreet.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblAddressStreet.setText("Address Street:");

        txtAddressStreet.setBackground(new java.awt.Color(255, 255, 204));

        lblPhoneNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPhoneNo.setText("Phone No:");

        txtPhoneNo.setBackground(new java.awt.Color(255, 255, 204));
        txtPhoneNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPhoneNoKeyPressed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(255, 153, 0));
        btnEdit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(255, 153, 0));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSave.setText("Update");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(255, 153, 0));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblZipcode.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblZipcode.setText("Zipcode:");

        txtZipcode.setBackground(new java.awt.Color(255, 255, 204));
        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyPressed(evt);
            }
        });

        lblResNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblResNo.setText("Restaurant No:");

        txtRestaurantID.setBackground(new java.awt.Color(255, 255, 204));

        lblZipcode1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblZipcode1.setText("Email:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblResNo)
                        .addGap(330, 330, 330))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblResName)
                                        .addGap(103, 103, 103)
                                        .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtRestaurantID, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblUpdateResDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblManagerName)
                                    .addComponent(lblAddressStreet))
                                .addGap(63, 63, 63)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtManagerName)
                                    .addComponent(txtAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblZipcode)
                                    .addComponent(lblPhoneNo))
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtZipcode)
                                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblManagerNameError, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(lblRestroNameError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPhoneNumberError, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                            .addComponent(lblZipcodeError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblZipcode1)
                                .addGap(105, 105, 105)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(256, 256, 256)))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblUpdateResDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResNo)
                    .addComponent(txtRestaurantID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblResName))
                            .addComponent(lblRestroNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblManagerName)))
                    .addComponent(lblManagerNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddressStreet))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblZipcode))
                    .addComponent(lblZipcodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblPhoneNo)
                        .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblPhoneNumberError, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode1))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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
        } else if (!system.checkValidNameFormat(txtRestaurantName.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Name");
        } else if (!system.checkValidNameFormat(txtManagerName.getText())) {
            JOptionPane.showMessageDialog(null, "Please Enter Valid Manager Name");
        } else if (!system.checkValidZipcodeFormat(txtZipcode.getText())) {
            JOptionPane.showMessageDialog(null, "Zipcode format incorrect! Zipcode should be 5 digits");
        } else if (!system.checkValidEmailFormat(txtEmail.getText())) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
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
            clearAllFields();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    public void clearAllFields() {
        txtRestaurantID.setText("");
        txtRestaurantName.setText("");
        txtManagerName.setText("");
        txtAddressStreet.setText("");
        txtPhoneNo.setText("");
        txtManagerName.setText("");
        txtZipcode.setText("");
        txtEmail.setText("");
    }
    
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

    private void txtRestaurantNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRestaurantNameKeyPressed
        // TODO add your handling code here:
        
        char c =evt.getKeyChar();
           
           if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
               lblRestroNameError.setText(" ");
               txtRestaurantName.setEditable(true);
               
           }else {
               if(!Character.isLetter(c)){
              // txtName.setEditable(false);
                lblRestroNameError.setText("Enter a restaurant valid name");
               }
           }
    }//GEN-LAST:event_txtRestaurantNameKeyPressed

    private void txtManagerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtManagerNameKeyPressed
        // TODO add your handling code here:
        
        char c =evt.getKeyChar();
           
           if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
               lblManagerNameError.setText(" ");
               txtManagerName.setEditable(true);
               
           }else {
               if(!Character.isLetter(c)){
              // txtName.setEditable(false);
                lblManagerNameError.setText("Enter a restaurant valid name");
               }
           }
    }//GEN-LAST:event_txtManagerNameKeyPressed

    private void txtZipcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyPressed
        // TODO add your handling code here:
        
         String zipcode = txtZipcode.getText();
        int length = zipcode.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<5){
                txtZipcode.setEditable(true);
                lblZipcodeError.setText("zipcode Number should be 5 digits!!");
            }else{
                txtZipcode.setEditable(false);
                lblZipcodeError.setText(" ");
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                txtZipcode.setEditable(true);
               
            }else{
                txtZipcode.setEditable(false);  
            }
        }
    }//GEN-LAST:event_txtZipcodeKeyPressed

    private void txtPhoneNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneNoKeyPressed
        // TODO add your handling code here:
        
        String phoneNo = txtPhoneNo.getText();
        int length = phoneNo.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10){
                txtPhoneNo.setEditable(true);
                lblPhoneNumberError.setText("Phone Number should be 10 digits!!");
            }else{
                txtPhoneNo.setEditable(false);
                lblPhoneNumberError.setText(" ");
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                txtPhoneNo.setEditable(true);
               
            }else{
                txtPhoneNo.setEditable(false);  
            }
        }
    }//GEN-LAST:event_txtPhoneNoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel lblAddressStreet;
    private javax.swing.JLabel lblManagerName;
    private javax.swing.JLabel lblManagerNameError;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoneNumberError;
    private javax.swing.JLabel lblResName;
    private javax.swing.JLabel lblResNo;
    private javax.swing.JLabel lblRestroNameError;
    private javax.swing.JLabel lblUpdateResDetails;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JLabel lblZipcode1;
    private javax.swing.JLabel lblZipcodeError;
    private javax.swing.JTextField txtAddressStreet;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtRestaurantID;
    private javax.swing.JTextField txtRestaurantName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
