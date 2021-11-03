/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Person;

import business.Person;
import business.PersonDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author kinjal
 */
public class ViewUpdatePersonDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewUpdatePersonDetailsJPanel
     */
    private Person person;
    private JPanel userContainer;
    private Boolean isEdit = Boolean.FALSE;
    private ManagePersonJPanel managePersonJPanel;
    
    private PersonDirectory personDirectory;
    
    public ViewUpdatePersonDetailsJPanel(JPanel userContainer, Person person, Boolean isEdit) {
        initComponents();
        this.userContainer = userContainer;
        this.person = person;
        this.isEdit = isEdit;
        populatePersonDetails();
        modifyTextFields(this.isEdit);
        
        if(isEdit){
            btnUpdatePerson.setEnabled(true);
        }else
            btnUpdatePerson.setEnabled(false);
    }

    private void populatePersonDetails() {
        //JOptionPane.showMessageDialog(this, person.toString());
        txtPersonId.setText(String.valueOf(person.getPersonId()));
        txtPersonName.setText(person.getPersonName());
        txtAge.setText(String.valueOf(person.getAge()));
        txtCommunity.setText(person.getCommunity());
        txtHouseAddress.setText(person.getHouseAddress());
        txtCity.setText(person.getCity());
        txtZipcode.setText(String.valueOf(person.getZipcode()));
        if(person.getGender() == "Male" ){
           radioBtnMale.setSelected(false);
           radioBtnFemale.setSelected(true);
       }else {
           radioBtnFemale.setSelected(false);
           radioBtnMale.setSelected(true);
       }
    }
    
    
     private void modifyTextFields(Boolean isEdit) {
      
        if (isEdit) {
            txtPersonName.setEnabled(true);
            txtAge.setEnabled(true);
            txtHouseAddress.setEnabled(true);
            txtCommunity.setEnabled(true);
            txtCity.setEnabled(true);
            txtZipcode.setEnabled(true);
            radioBtnFemale.setEnabled(true);
            radioBtnMale.setEnabled(true);
        } else {
            txtPersonName.setEnabled(false);
            txtAge.setEnabled(false);
            txtHouseAddress.setEnabled(false);
            txtCommunity.setEnabled(false);
            txtCity.setEnabled(false);
            txtZipcode.setEnabled(false);
            radioBtnFemale.setEnabled(false);
            radioBtnMale.setEnabled(false);
            
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

        buttonGroup = new javax.swing.ButtonGroup();
        radioBtnFemale = new javax.swing.JRadioButton();
        lblCity = new javax.swing.JLabel();
        radioBtnMale = new javax.swing.JRadioButton();
        txtPersonName = new javax.swing.JTextField();
        txtHouseAddress = new javax.swing.JTextField();
        txtCommunity = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblAge = new javax.swing.JLabel();
        lblCity1 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JTextField();
        lblHouseAddress = new javax.swing.JLabel();
        lblAge1 = new javax.swing.JLabel();
        lblCommunity = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JButton();
        btnUpdatePerson = new javax.swing.JButton();
        lblPersonId = new javax.swing.JLabel();
        txtPersonId = new javax.swing.JTextField();

        buttonGroup.add(radioBtnFemale);
        radioBtnFemale.setText("Male");
        radioBtnFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnFemaleActionPerformed(evt);
            }
        });

        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity.setText("Zip Code:");

        buttonGroup.add(radioBtnMale);
        radioBtnMale.setText("Female");

        lblTitle.setFont(new java.awt.Font("Sitka Text", 1, 18)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("View/Update Person Details");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age:");

        lblCity1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCity1.setText("City:");

        lblName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblName.setText("Name:");

        lblHouseAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHouseAddress.setText("House Address:");

        lblAge1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge1.setText("Gender:");

        lblCommunity.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCommunity.setText("Community:");

        btnGoBack.setText("<< Go Back");
        btnGoBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoBackActionPerformed(evt);
            }
        });

        btnUpdatePerson.setText("Update");
        btnUpdatePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdatePersonActionPerformed(evt);
            }
        });

        lblPersonId.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPersonId.setText("Person Id:");

        txtPersonId.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPersonName)
                            .addComponent(txtHouseAddress)
                            .addComponent(txtCommunity)
                            .addComponent(txtAge)
                            .addComponent(txtCity)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBtnFemale)
                                .addGap(18, 18, 18)
                                .addComponent(radioBtnMale))
                            .addComponent(txtZipcode)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnUpdatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(474, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPersonId, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPersonName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(radioBtnFemale)
                        .addComponent(radioBtnMale)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHouseAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCity1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGoBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdatePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void clearFields()
    {
        txtPersonName.setText("");
        txtAge.setText("");
        buttonGroup.clearSelection();
        txtHouseAddress.setText("");
        txtCommunity.setText("");
        txtCity.setText("");
        txtZipcode.setText("");
    }
    
    private Boolean checkBlankInput()
    {
        if(txtPersonName.getText().isEmpty() || txtAge.getText().isEmpty() || txtHouseAddress.getText().isEmpty() || txtCommunity.getText().isEmpty() || txtCity.getText().isEmpty() 
                || txtZipcode.getText().isEmpty())
        {
            return false;
        }
        else{
            return true;
        }
    }
    
    private void radioBtnFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioBtnFemaleActionPerformed

    private void btnUpdatePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdatePersonActionPerformed
        // TODO add your handling code here:
        
    if (checkBlankInput()==Boolean.TRUE)
        {
            txtPersonId.setText(String.valueOf(person.getPersonId()));
            person.setPersonName(txtPersonName.getText());
            person.setAge(Integer.parseInt(txtAge.getText()));
            person.setHouseAddress(txtHouseAddress.getText());
            person.setCommunity(txtCommunity.getText());
            person.setCity(txtCity.getText());
            person.setZipcode(Integer.parseInt(txtZipcode.getText()));
            
           if(radioBtnFemale.isSelected()){
                person.setGender(radioBtnFemale.getText());
            }else {
                person.setGender(radioBtnMale.getText());
            }
            JOptionPane.showMessageDialog(this, "Person added!!", "Update",
                    JOptionPane.INFORMATION_MESSAGE);
            clearFields();
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Please enter all values",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnUpdatePersonActionPerformed

    private void btnGoBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoBackActionPerformed
        // TODO add your handling code here:
        
        
        userContainer.remove(this);
        CardLayout layout = (CardLayout) userContainer.getLayout();
        layout.previous(userContainer);
    }//GEN-LAST:event_btnGoBackActionPerformed
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGoBack;
    private javax.swing.JButton btnUpdatePerson;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCity1;
    private javax.swing.JLabel lblCommunity;
    private javax.swing.JLabel lblHouseAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPersonId;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JRadioButton radioBtnFemale;
    private javax.swing.JRadioButton radioBtnMale;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCommunity;
    private javax.swing.JTextField txtHouseAddress;
    private javax.swing.JTextField txtPersonId;
    private javax.swing.JTextField txtPersonName;
    private javax.swing.JTextField txtZipcode;
    // End of variables declaration//GEN-END:variables
}
