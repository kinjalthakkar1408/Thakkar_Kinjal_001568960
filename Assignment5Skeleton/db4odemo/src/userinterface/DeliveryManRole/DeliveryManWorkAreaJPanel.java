/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Order.Order;
import Business.Order.OrderDirectory;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author raunak
 */
public class DeliveryManWorkAreaJPanel extends javax.swing.JPanel {

    private final UserAccount account;
    private final EcoSystem business;

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public DeliveryManWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem business, DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory) {
        initComponents();
        
        this.account = account;
        this.business = business;
        populateTable();
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        model.setRowCount(0);
        for (Order order : business.getOrderDirectory().getOrderDirectory()) {
            if (order.getDeliveryMan() != null) {
                if (order.getDeliveryMan().getDeliveryId().equalsIgnoreCase(account.getEmployee().getName())) {
                    Object[] row = new Object[7];
                    row[0] = order.getMessage();
                    row[1] = order.getSender();
                    row[2] = order.getStatus();
                    row[3] = order.getOrderNo();
                    row[4] = order.getCustomer().getCustomerStreet();
                    row[5] = order.getRestaurant().getStreetAddress();
                    row[6] = order.getRestaurant().getZipcode();
                    model.addRow(row);
                }
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        processJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        resultJTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Customer Feedback", "Ordered By", "Order Status", "Order No", "Customer Address", "Restaurant Address", "Zipcode"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 790, 190));

        processJButton.setText("Confirm");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setText("Update Delivery Details");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, 20));

        jLabel2.setText("Mark Delivery Complete:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, -1, -1));
        add(resultJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 390, 150, -1));

        jButton1.setText("Confirm Order Pickup");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 3);
        Order order = business.getOrderDirectory().fetchOrder(selectedOrderId);

        if (order.getStatus().trim().equalsIgnoreCase("Out For Delivery")) {
            order.setOrderConfimation(resultJTextField.getText());
            order.setStatus("Completed");
            resultJTextField.setText("");
            JOptionPane.showMessageDialog(null, "Order updated!");
            populateTable();
        } else {
            JOptionPane.showMessageDialog(null, "Please confirm order pick up before confirming delivery!");
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }

        String selectedOrderId = (String) workRequestJTable.getValueAt(selectedRow, 3);
        Order order = business.getOrderDirectory().fetchOrder(selectedOrderId);

        order.setStatus("Out For Delivery");
        JOptionPane.showMessageDialog(null, "Order updated successfully!");
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton processJButton;
    private javax.swing.JTextField resultJTextField;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables
}
