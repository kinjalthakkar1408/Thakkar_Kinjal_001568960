package userinterface.RestaurantAdminRole;

import Business.DeliveryMan.DeliveryManDirectory;
import Business.EcoSystem;
import Business.Menu.MenuDirectory;
import Business.Order.OrderDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author raunak
 */
public class RestaurantWorkAreaJPanel extends javax.swing.JPanel {

    private final JPanel userProcessContainer;
    private final RestaurantDirectory restaurantDirectory;
    private final EcoSystem system;
    private final MenuDirectory menuDirectory;
    private final OrderDirectory orderDirectory;
    private final UserAccount account;
    private final DeliveryManDirectory deliveryManDirectory;

    /**
     * Creates new form AdminWorkAreaJPanel
     */
    public RestaurantWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, EcoSystem system, RestaurantDirectory restaurantDirectory, DeliveryManDirectory deliveryManDirectory, MenuDirectory menuDirectory, OrderDirectory orderDirectory) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.restaurantDirectory = restaurantDirectory;
        this.system = system;
        this.menuDirectory = menuDirectory;
        this.orderDirectory = orderDirectory;
        this.account = account;
        this.deliveryManDirectory = deliveryManDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userJButton = new javax.swing.JButton();
        manageEmployeeJButton = new javax.swing.JButton();
        manageOrganizationJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 204, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        userJButton.setText("Restaurant Info");
        userJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userJButtonActionPerformed(evt);
            }
        });
        add(userJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 140, -1));

        manageEmployeeJButton.setText("Menu");
        manageEmployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeJButtonActionPerformed(evt);
            }
        });
        add(manageEmployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 140, -1));

        manageOrganizationJButton.setText("Orders");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });
        add(manageOrganizationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 130, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Restaurant :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 120, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void userJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userJButtonActionPerformed
        // TODO add your handling code here:       
        ResturantInfoJPanel manageResturantInfoJPanel = new ResturantInfoJPanel(userProcessContainer, account, system, restaurantDirectory, menuDirectory);
        userProcessContainer.add("manageResturantInfoJPanel", manageResturantInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userJButtonActionPerformed

    private void manageEmployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeJButtonActionPerformed
        RestaurantMenuJPanel manageMenuJPanel = new RestaurantMenuJPanel(userProcessContainer, account, system, restaurantDirectory, menuDirectory);
        userProcessContainer.add("manageMenuJPanel", manageMenuJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeJButtonActionPerformed

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed
        RestaurantOrderJPanel manageResturantInfoJPanel = new RestaurantOrderJPanel(userProcessContainer, account, system, restaurantDirectory, deliveryManDirectory, menuDirectory, orderDirectory);
        userProcessContainer.add("manageResturantInfoJPanel", manageResturantInfoJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton manageEmployeeJButton;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JButton userJButton;
    // End of variables declaration//GEN-END:variables

}
