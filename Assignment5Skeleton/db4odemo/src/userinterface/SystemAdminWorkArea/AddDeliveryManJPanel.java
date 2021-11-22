/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.DeliverManRole;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kinjal
 */
public class AddDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddDeliveryManJPanel
     */
    private final DeliveryManDirectory deliveryManDirectory;
    private final EcoSystem system;
    private final JPanel container;
    public AddDeliveryManJPanel(JPanel container, EcoSystem system, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.deliveryManDirectory = deliveryManDirectory;
        this.system = system;
        this.container = container;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCreateDeliveryMan = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblDeliveryName = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtDeliveryName = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        lblContactNo1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblPhoneNoError = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));

        lblCreateDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblCreateDeliveryMan.setText("Create Delivery Man");

        lblUsername.setText("Username:");

        lblPassword.setText("Password:");

        lblDeliveryName.setText("Full Name:");

        lblContactNo.setText("Contact No:");

        txtContactNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtContactNoKeyPressed(evt);
            }
        });

        btnCreate.setText("Create Delivery Man");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblContactNo1.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblContactNo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblContactNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                            .addComponent(lblDeliveryName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDeliveryName)
                            .addComponent(txtContactNo)
                            .addComponent(txtEmail)
                            .addComponent(txtPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(lblPhoneNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(224, 224, 224)
                        .addComponent(btnCreate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(lblCreateDeliveryMan)))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(lblCreateDeliveryMan)
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDeliveryName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDeliveryName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNo)
                    .addComponent(lblPhoneNoError, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContactNo1))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUsername))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword))
                .addGap(18, 18, 18)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 194, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addGap(42, 42, 42))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {lblContactNo, lblContactNo1, lblDeliveryName, lblPassword, lblUsername});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        String name = txtDeliveryName.getText();
        String phone = txtContactNo.getText();
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        String email = txtEmail.getText();
        
        if(name.isEmpty() || phone.isEmpty() || username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        }
        else if(!system.checkValidPhoneFormat(phone))
        {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        }else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        } 
        else if(!deliveryManDirectory.isPhoneUnique(phone)){
            JOptionPane.showMessageDialog(null, "Sorry! Delivery man with this phone already exists!");
        }else if (!system.checkValidNameFormat(name)) {
            JOptionPane.showMessageDialog(null, "Name format incorrect!");
        }
        else if(!deliveryManDirectory.isEmailUnique(email)){
            JOptionPane.showMessageDialog(null, "Sorry! Delivery man with this email already exists!");
        }
        else if(!system.getUserAccountDirectory().checkIfUsernameIsUnique(username)){
            JOptionPane.showMessageDialog(null, "Username already exists!");
        }
        else{
            DeliveryMan deliveryMan = new DeliveryMan();
            deliveryMan.setName(name);
            deliveryMan.setPhoneNo(phone);
            deliveryMan.setEmail(email);
            deliveryManDirectory.add(deliveryMan);
            system.setDeliveryManDirectory(deliveryManDirectory);
            Employee employee = system.getEmployeeDirectory().createEmployee(deliveryMan.getDeliveryId());
            
            UserAccount account = system.getUserAccountDirectory().createUserAccount(username, password, employee, new DeliverManRole());
            JOptionPane.showMessageDialog(null, "Delivery Man added!");
            clearAllFields();
        }
    }//GEN-LAST:event_btnCreateActionPerformed
    public void clearAllFields(){
        txtDeliveryName.setText("");
            txtContactNo.setText("");
            txtUsername.setText("");
            txtPassword.setText("");
            txtEmail.setText("");
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UpdateDeliveryManJPanel manageDeliveryJPanel = (UpdateDeliveryManJPanel) component;
        manageDeliveryJPanel.populateDeliveryManList();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtContactNoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContactNoKeyPressed
        // TODO add your handling code here:
        
        String phoneNo = txtContactNo.getText();
        int length = phoneNo.length();
        
        char c = evt.getKeyChar();
        
        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<10){
                txtContactNo.setEditable(true);
                lblPhoneNoError.setText("Phone Number should be 10 digits!!");
            }else{
                txtContactNo.setEditable(false);
                lblPhoneNoError.setText(" ");
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                txtContactNo.setEditable(true);
               
            }else{
                txtContactNo.setEditable(false);  
            }
        }
        
    }//GEN-LAST:event_txtContactNoKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblContactNo1;
    private javax.swing.JLabel lblCreateDeliveryMan;
    private javax.swing.JLabel lblDeliveryName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNoError;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDeliveryName;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
