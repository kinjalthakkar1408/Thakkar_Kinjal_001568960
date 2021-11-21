/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.EcoSystem;
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
public class ViewCustomersJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustomersJPanel
     */
    public CustomerDirectory customerDirectory;
    public JPanel container;
    public Customer customer;
    private final EcoSystem system;

    public ViewCustomersJPanel(EcoSystem system, JPanel container, Customer customer, CustomerDirectory customerDirectory) {
        initComponents();
        this.customerDirectory = customerDirectory;
        this.container = container;
        this.customer = customer;
        this.system = system;

        txtCustomerNo.setText(customer.getCustomerNo());
        txtFullName.setText(customer.getCustomerName());
        txtMobileNo.setText(customer.getCustomerPhone());
        txtStreetAddress.setText(customer.getCustomerStreet());
        txtZipcode.setText(customer.getCustomerZipcode());
        txtEmail.setText(customer.getCustomerEmail());
        setEdititableFalse();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUpdateCustomer = new javax.swing.JLabel();
        lblCustomerNo = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblMobileNo = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtMobileNo = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        btnEditCustomer = new javax.swing.JButton();
        btnSaveChanges = new javax.swing.JButton();
        lblZipcode = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtCustomerNo = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        lblNameError = new javax.swing.JLabel();
        lblEmailError = new javax.swing.JLabel();
        lblZipcodeError = new javax.swing.JLabel();
        lblNumberError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblUpdateCustomer.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUpdateCustomer.setText("Update Customer");

        lblCustomerNo.setText("Customer No:");

        lblFullName.setText("Full Name:");

        lblMobileNo.setText("Mobile No:");

        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtEmailKeyPressed(evt);
            }
        });

        txtFullName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtFullNameKeyPressed(evt);
            }
        });

        txtMobileNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMobileNoKeyPressed(evt);
            }
        });

        txtZipcode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtZipcodeActionPerformed(evt);
            }
        });
        txtZipcode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtZipcodeKeyPressed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnEditCustomer.setText("Update Customer");
        btnEditCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditCustomerActionPerformed(evt);
            }
        });

        btnSaveChanges.setText("Save Changes");
        btnSaveChanges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveChangesActionPerformed(evt);
            }
        });

        lblZipcode.setText("Zipcode:");

        lblEmail.setText("Email:");

        txtCustomerNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustomerNoKeyPressed(evt);
            }
        });

        lblStreetAddress.setText("Street Address:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(263, 263, 263)
                        .addComponent(lblUpdateCustomer))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(159, 159, 159)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNumberError, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblCustomerNo)
                                                .addGap(32, 32, 32)
                                                .addComponent(txtCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblFullName)
                                                    .addComponent(lblMobileNo)
                                                    .addComponent(lblEmail))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtEmail)
                                                    .addComponent(txtMobileNo)
                                                    .addComponent(txtFullName, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(lblStreetAddress)
                                                        .addGap(25, 25, 25))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(lblZipcode)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(txtStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                                        .addComponent(txtZipcode))
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnSaveChanges, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnEditCustomer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(45, 45, 45)
                                                .addComponent(lblZipcodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))))))))
                .addGap(248, 248, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblUpdateCustomer)
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCustomerNo)
                    .addComponent(txtCustomerNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblFullName)
                                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblNameError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMobileNo)
                            .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblNumberError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmail)
                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblEmailError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblStreetAddress)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblZipcode)
                        .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblZipcodeError, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnEditCustomer)
                .addGap(26, 26, 26)
                .addComponent(btnSaveChanges)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(73, 73, 73))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditCustomerActionPerformed
        // TODO add your handling code here:
        txtEmail.setEditable(true);
        txtFullName.setEditable(true);
        txtMobileNo.setEditable(true);
        txtStreetAddress.setEditable(true);
        txtZipcode.setEditable(true);
    }//GEN-LAST:event_btnEditCustomerActionPerformed

    private void btnSaveChangesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveChangesActionPerformed
        // TODO add your handling code here:
        String id = txtCustomerNo.getText();
        String name = txtFullName.getText();
        String phone = txtMobileNo.getText();
        String street = txtStreetAddress.getText();
        String zipcode = txtZipcode.getText();
        String email = txtEmail.getText();
        
        if (name.isEmpty() || phone.isEmpty() || street.isEmpty() | zipcode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        } else if (!system.checkValidPhoneFormat(phone)) {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        } else if (!system.checkValidZipcodeFormat(zipcode)) {
            JOptionPane.showMessageDialog(null, "Zipcode format incorrect! Zipcode should be 5 digits");
        } else if (!system.checkValidNameFormat(name)) {
            JOptionPane.showMessageDialog(null, "Name format incorrect!");
        } else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        }  else {
            customerDirectory.updateCustomer(id, name, phone, street, zipcode,email);
            JOptionPane.showMessageDialog(null, "Customer details updated!");
            setEdititableFalse();
            emptyAllFields();
        }
        
    }//GEN-LAST:event_btnSaveChangesActionPerformed
    public void setEdititableFalse(){
        txtCustomerNo.setEditable(false);
        txtEmail.setEditable(false);
        txtFullName.setEditable(false);
        txtMobileNo.setEditable(false);
        txtStreetAddress.setEditable(false);
        txtZipcode.setEditable(false);
    }
    
    public void emptyAllFields() {
        txtCustomerNo.setText("");
        txtFullName.setText("");
        txtMobileNo.setText("");
        txtStreetAddress.setText("");
        txtZipcode.setText("");
        txtEmail.setText("");
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UpdateCustomersJPanel manageCustomersJPanel = (UpdateCustomersJPanel) component;
        manageCustomersJPanel.populateCustomerList();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtZipcodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtZipcodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtZipcodeActionPerformed

    private void txtZipcodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtZipcodeKeyPressed
        // TODO add your handling code here:
        String zipcode = txtZipcode.getText();
        int length = zipcode.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<5){
                txtZipcode.setEditable(true);
              //  lblZipcodeError.setText("zipcode Number should be 5 digits!!");
            }else{
                txtZipcode.setEditable(false);
              //  lblZipcodeError.setText(" ");
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                txtZipcode.setEditable(true);
               
            }else{
                txtZipcode.setEditable(false);  
            }
        }
        
    }//GEN-LAST:event_txtZipcodeKeyPressed

    private void txtCustomerNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNoKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNoKeyPressed

    private void txtFullNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullNameKeyPressed
        // TODO add your handling code here:
        char c =evt.getKeyChar();
           
           if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
               lblNameError.setText(" ");
               txtFullName.setEditable(true);
               
           }else {
               if(!Character.isLetter(c)){
              // txtName.setEditable(false);
                lblNameError.setText("Enter a valid name");
               }
           }
        
    }//GEN-LAST:event_txtFullNameKeyPressed

    private void txtMobileNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMobileNoKeyPressed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_txtMobileNoKeyPressed

    private void txtEmailKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyPressed
        // TODO add your handling code here:
        String emailRegex = "^[a-zA-Z0-9]+@[a-zA-Z]+\\.[a-zA-Z]+";
        Pattern ep = Pattern.compile(emailRegex);
        Matcher matcher = ep.matcher(txtEmail.getText());
        if(!matcher.matches())
        {
        lblEmailError.setText("Email ID is not valid");
        }
        else
        {
            lblEmailError.setText(null);
        }
    }//GEN-LAST:event_txtEmailKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnEditCustomer;
    private javax.swing.JButton btnSaveChanges;
    private javax.swing.JLabel lblCustomerNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblEmailError;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblNameError;
    private javax.swing.JLabel lblNumberError;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblUpdateCustomer;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JLabel lblZipcodeError;
    private javax.swing.JTextField txtCustomerNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtMobileNo;
    private javax.swing.JTextField txtStreetAddress;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
