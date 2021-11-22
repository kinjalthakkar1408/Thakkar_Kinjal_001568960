/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kinjal
 */
public class ViewDeliveryManJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewDeliveryManJPanel
     */
    public JPanel container;
    public DeliveryMan deliveryMan;
    public DeliveryManDirectory deliveryManDirectory;
    private final EcoSystem system;

    public ViewDeliveryManJPanel(EcoSystem system, JPanel container, DeliveryMan deliveryMan, DeliveryManDirectory deliveryManDirectory) {
        initComponents();
        this.container = container;
        this.deliveryMan = deliveryMan;
        this.deliveryManDirectory = deliveryManDirectory;
        this.system = system;
        txtDeliveryNo.setText(deliveryMan.getDeliveryId());
        txtFullName.setText(deliveryMan.getName());
        txtPhone.setText(deliveryMan.getPhoneNo());
        txtEmail.setText(deliveryMan.getEmail());
        setEditableFalse();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backBtn = new javax.swing.JButton();
        lblUpdateDeliveryMan = new javax.swing.JLabel();
        lblDeliveryManNo = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblPhoneNo = new javax.swing.JLabel();
        txtDeliveryNo = new javax.swing.JTextField();
        txtFullName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        editBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 204, 204));

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblUpdateDeliveryMan.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblUpdateDeliveryMan.setText("Update Delivery Man");

        lblDeliveryManNo.setText("DeliveryMan No:");

        lblFullName.setText("Full Name:");

        lblPhoneNo.setText("Phone No:");

        txtDeliveryNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDeliveryNoActionPerformed(evt);
            }
        });

        editBtn.setText("Edit Delivery Man");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        saveBtn.setText("Update Delivery Man");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        lblEmail.setText("Email:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(185, 185, 185)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(editBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(saveBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblDeliveryManNo, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                                    .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDeliveryNo, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                                    .addComponent(txtFullName))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(186, 186, 186))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(lblUpdateDeliveryMan)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblUpdateDeliveryMan)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDeliveryManNo)
                    .addComponent(txtDeliveryNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFullName)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhoneNo))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(saveBtn)
                .addGap(18, 18, 18)
                .addComponent(editBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 220, Short.MAX_VALUE)
                .addComponent(backBtn)
                .addGap(24, 24, 24))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        // TODO add your handling code here:
        txtFullName.setEditable(true);
        txtPhone.setEditable(true);
        txtEmail.setEditable(true);
    }//GEN-LAST:event_editBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String id = txtDeliveryNo.getText();
        String name = txtFullName.getText();
        String phone = txtPhone.getText();
        String email = txtEmail.getText();

        if (name.isEmpty() || phone.isEmpty() || email.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter all fields!");
        } else if (!system.checkValidPhoneFormat(phone)) {
            JOptionPane.showMessageDialog(null, "Phone format incorrect!");
        } else if (!system.checkValidEmailFormat(email)) {
            JOptionPane.showMessageDialog(null, "Email format incorrect!");
        } else {
            deliveryManDirectory.updateDeliveryMan(id, name, phone, email);
            JOptionPane.showMessageDialog(null, "Delivery man details updated!");
            setEditableFalse();
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        Component[] componentArray = container.getComponents();
        Component component = componentArray[componentArray.length - 1];
        UpdateDeliveryManJPanel manageDeliveryJPanel = (UpdateDeliveryManJPanel) component;
        manageDeliveryJPanel.populateDeliveryManList();

        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backBtnActionPerformed

    private void txtDeliveryNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDeliveryNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDeliveryNoActionPerformed
    public void setEditableFalse() {
        txtDeliveryNo.setEditable(false);
        txtFullName.setEditable(false);
        txtPhone.setEditable(false);
        txtEmail.setEditable(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton editBtn;
    private javax.swing.JLabel lblDeliveryManNo;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPhoneNo;
    private javax.swing.JLabel lblUpdateDeliveryMan;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField txtDeliveryNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}
