/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kinjal
 */
public class ResturantInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ResturantInfoJPanel
     */
    private final JPanel container;
    private Restaurant restaurant;
    private final EcoSystem system;

    public ResturantInfoJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory) {
        initComponents();
        this.container = userProcessContainer;
        this.restaurant = restaurant;
        this.system = system;
        disableAllFields();

        for (Restaurant rest : restaurantDirectory.getRestaurantDirectory()) {
            if (rest.getRestaurantNo().equalsIgnoreCase(account.getEmployee().getName())) {
                this.restaurant = rest;
            }
        }
        txtResNo.setText(restaurant.getRestaurantNo());
        txtResName.setText(restaurant.getRestaurantName());
        txtManagerName.setText(restaurant.getOperatorName());
        txtStreetAdd.setText(restaurant.getStreetAddress());
        txtPhoneNo.setText(restaurant.getMobileNo());
        txtEmail.setText(restaurant.getEmail());
        txtZipcode.setText(restaurant.getZipcode());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblResInfo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtResNo = new javax.swing.JTextField();
        txtResName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        lblOperatorName = new javax.swing.JLabel();
        txtPhoneNo = new javax.swing.JTextField();
        txtManagerName = new javax.swing.JTextField();
        lblStreetAddress = new javax.swing.JLabel();
        txtStreetAdd = new javax.swing.JTextField();
        txtZipcode = new javax.swing.JTextField();
        lblZipcode = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        lblPhoneNo1 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 102));

        lblResInfo.setBackground(new java.awt.Color(255, 153, 0));
        lblResInfo.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblResInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResInfo.setText("Restaurant Info");
        lblResInfo.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel2.setText("Restaurant No:");

        txtResNo.setBackground(new java.awt.Color(255, 255, 204));

        txtResName.setBackground(new java.awt.Color(255, 255, 204));

        lblName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblName.setText("Name:");

        lblPhoneNo.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPhoneNo.setText("Phone No:");

        lblOperatorName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblOperatorName.setText("Manager Name:");

        txtPhoneNo.setBackground(new java.awt.Color(255, 255, 204));

        txtManagerName.setBackground(new java.awt.Color(255, 255, 204));

        lblStreetAddress.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblStreetAddress.setText("Street Address:");

        txtStreetAdd.setBackground(new java.awt.Color(255, 255, 204));

        txtZipcode.setBackground(new java.awt.Color(255, 255, 204));

        lblZipcode.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblZipcode.setText("Zipcode:");

        saveBtn.setBackground(new java.awt.Color(255, 153, 0));
        saveBtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 153, 0));
        editBtn.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        editBtn.setText("Edit");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 153, 0));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblPhoneNo1.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPhoneNo1.setText("Phone No:");

        txtEmail.setBackground(new java.awt.Color(255, 255, 204));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblName)
                            .addComponent(lblOperatorName)
                            .addComponent(lblStreetAddress)
                            .addComponent(lblPhoneNo1)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtManagerName, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                                .addComponent(txtResName))
                                            .addComponent(txtStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPhoneNo)
                                            .addComponent(jLabel2)
                                            .addComponent(lblZipcode))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtResNo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(saveBtn))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblResInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(editBtn)
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblResInfo)
                    .addComponent(editBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtResName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtResNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNo)
                    .addComponent(txtManagerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOperatorName))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblZipcode)
                    .addComponent(lblStreetAddress)
                    .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPhoneNo1)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(jButton1))
                .addContainerGap(241, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        txtResName.setEditable(true);
        txtManagerName.setEditable(true);
        txtStreetAdd.setEditable(true);
        txtPhoneNo.setEditable(true);
        txtEmail.setEditable(true);
        txtZipcode.setEditable(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String id = txtResNo.getText();
        String name = txtResName.getText();
        String manager = txtManagerName.getText();
        String address = txtStreetAdd.getText();
        String mobileNo = txtPhoneNo.getText();
        String zipcode = txtZipcode.getText();
        String email = txtEmail.getText();

        if (id.isEmpty() || name.isEmpty() || manager.isEmpty() || address.isEmpty() || mobileNo.isEmpty() || email.isEmpty()| zipcode.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter all fields!");
        } else if (!system.checkValidPhoneFormat(mobileNo)) {
            JOptionPane.showMessageDialog(null, "Please enter correct phone format!");
        }else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "please enter correct email format!");
        } else {
            restaurant.setOperatorName(manager);
            restaurant.setStreetAddress(address);
            restaurant.setMobileNo(mobileNo);
            restaurant.setEmail(email);
            restaurant.setRestaurantName(name);
            restaurant.setZipcode(zipcode);
            JOptionPane.showMessageDialog(null, "Restaurant info updated successfulyy!");
            disableAllFields();
        }
    }//GEN-LAST:event_saveBtnActionPerformed
    public void disableAllFields() {
        txtResNo.setEditable(false);
        txtResName.setEditable(false);
        txtManagerName.setEditable(false);
        txtStreetAdd.setEditable(false);
        txtPhoneNo.setEditable(false);
        txtZipcode.setEditable(false);
        txtEmail.setEditable(false);
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton editBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOperatorName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblPhoneNo1;
    private javax.swing.JLabel lblResInfo;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtManagerName;
    private javax.swing.JTextField txtPhoneNo;
    private javax.swing.JTextField txtResName;
    private javax.swing.JTextField txtResNo;
    private javax.swing.JTextField txtStreetAdd;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
