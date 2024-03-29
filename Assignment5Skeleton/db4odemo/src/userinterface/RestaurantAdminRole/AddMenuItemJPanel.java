/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.RestaurantAdminRole;

import Business.EcoSystem;
import Business.Menu.MenuDirectory;
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
public class AddMenuItemJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddMenuItemJPanel
     */
    private final JPanel userProcessContainer;
    private final EcoSystem system;
    private final MenuDirectory menuDirectory;
    private final UserAccount account;

    public AddMenuItemJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory, MenuDirectory menuDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.system = system;
        this.menuDirectory = menuDirectory;
        this.account = account;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddItem = new javax.swing.JLabel();
        txtIngrediantsDetails = new javax.swing.JTextField();
        txtItemName = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        lblIngrediantDetails = new javax.swing.JLabel();
        lblItemName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 102));

        lblAddItem.setBackground(new java.awt.Color(255, 153, 0));
        lblAddItem.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lblAddItem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddItem.setText("Add Item");
        lblAddItem.setOpaque(true);

        txtIngrediantsDetails.setBackground(new java.awt.Color(255, 255, 204));

        txtItemName.setBackground(new java.awt.Color(255, 255, 204));

        txtPrice.setBackground(new java.awt.Color(255, 255, 204));

        lblIngrediantDetails.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblIngrediantDetails.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIngrediantDetails.setText("Ingrediants Detail:");

        lblItemName.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblItemName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblItemName.setText("Item Name:");

        lblPrice.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        lblPrice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrice.setText("Price:");

        btnSave.setBackground(new java.awt.Color(255, 153, 0));
        btnSave.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSave.setText("Save");
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAddItem, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPrice, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblIngrediantDetails, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblItemName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtIngrediantsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(129, 129, 129)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblAddItem)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(txtItemName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblIngrediantDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtIngrediantsDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String itemName = txtItemName.getText();
        String ingrediants = txtIngrediantsDetails.getText();
        double price = 0;
        try {
            price = Double.parseDouble(txtPrice.getText());
        } catch (NumberFormatException exception) {
            System.out.println(exception);
            JOptionPane.showMessageDialog(null, "Please enter valid price!");
        }
        if (itemName.isEmpty() || ingrediants.isEmpty() || price == 0) {
            JOptionPane.showMessageDialog(null, "Please fill all the fields.");
        } else {
            String restaurantNo = account.getEmployee().getName();
            menuDirectory.add(restaurantNo, itemName, price, ingrediants);
            system.setMenuDirectory(menuDirectory);
            JOptionPane.showMessageDialog(null, "Item added sucessfully!");
            clearAllFields();
        }

    }//GEN-LAST:event_btnSaveActionPerformed

    public void clearAllFields() {
        txtIngrediantsDetails.setText("");
        txtItemName.setText("");
        txtPrice.setText("");
    }
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        RestaurantMenuJPanel manageMenuJPanel = (RestaurantMenuJPanel) component;
        manageMenuJPanel.populateMenu();

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lblAddItem;
    private javax.swing.JLabel lblIngrediantDetails;
    private javax.swing.JLabel lblItemName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JTextField txtIngrediantsDetails;
    private javax.swing.JTextField txtItemName;
    private javax.swing.JTextField txtPrice;
    // End of variables declaration//GEN-END:variables
}
