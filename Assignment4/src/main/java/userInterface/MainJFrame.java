/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package userInterface;

import business.PersonDirectory;
import java.awt.CardLayout;
import userInterface.Person.CreatePersonJPanel;
import userInterface.PatientVitalSign.ManagePatientJPanel;
import userInterface.PatientVitalSign.ManagePatientVitalSignJPanel;
import userInterface.Person.ManagePersonJPanel;

/**
 *
 * @author kinjal
 */
public class MainJFrame extends javax.swing.JFrame {

    /** Creates new form MainJFrame */
    
    private PersonDirectory personDirectory;
    public MainJFrame() {
        initComponents();
        personDirectory= new PersonDirectory();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane2 = new javax.swing.JSplitPane();
        leftPane = new javax.swing.JPanel();
        btnMngPerson = new javax.swing.JButton();
        btnMngPatient = new javax.swing.JButton();
        userContainer = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnMngPerson.setText("Manage Person");
        btnMngPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngPersonActionPerformed(evt);
            }
        });

        btnMngPatient.setText("Manage Patients");
        btnMngPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMngPatientActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout leftPaneLayout = new javax.swing.GroupLayout(leftPane);
        leftPane.setLayout(leftPaneLayout);
        leftPaneLayout.setHorizontalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnMngPerson, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnMngPatient, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        leftPaneLayout.setVerticalGroup(
            leftPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPaneLayout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(btnMngPerson)
                .addGap(45, 45, 45)
                .addComponent(btnMngPatient)
                .addContainerGap(310, Short.MAX_VALUE))
        );

        jSplitPane2.setLeftComponent(leftPane);

        userContainer.setLayout(new java.awt.CardLayout());
        jSplitPane2.setRightComponent(userContainer);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 916, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMngPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngPersonActionPerformed
        // TODO add your handling code here:
        
        ManagePersonJPanel managePersonJPanel = new ManagePersonJPanel(userContainer, personDirectory);
        userContainer.add("managePersonJPanel", managePersonJPanel);
        CardLayout layout=(CardLayout) userContainer.getLayout();
        layout.next(userContainer);
        
       
    }//GEN-LAST:event_btnMngPersonActionPerformed

    private void btnMngPatientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMngPatientActionPerformed
        // TODO add your handling code here:
        
//        ManageVitalSignsJPanel manageVitalSignsJPanel = new ManageVitalSignsJPanel(userContainer, personDirectory);
//        userContainer.add("managePersonJPanel", manageVitalSignsJPanel);
//        CardLayout layout=(CardLayout) userContainer.getLayout();
//        layout.next(userContainer);

        ManagePatientVitalSignJPanel managePatientVitalSignJPanel = new ManagePatientVitalSignJPanel(userContainer, personDirectory);
        userContainer.add("managePatientVitalSignJPanel", managePatientVitalSignJPanel);
        CardLayout layout=(CardLayout) userContainer.getLayout();
        layout.next(userContainer);
    }//GEN-LAST:event_btnMngPatientActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMngPatient;
    private javax.swing.JButton btnMngPerson;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JPanel leftPane;
    private javax.swing.JPanel userContainer;
    // End of variables declaration//GEN-END:variables

}