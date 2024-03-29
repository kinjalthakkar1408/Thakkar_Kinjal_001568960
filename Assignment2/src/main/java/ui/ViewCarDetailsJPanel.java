/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import model.CarDetails;
import model.CarDetailsHistory;

/**
 *
 * @author kinjal
 */
public class ViewCarDetailsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewCarDetailsJPanel
     */
    
    CarDetailsHistory carDetailsHistory ;
    public ViewCarDetailsJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRadioGroup = new javax.swing.ButtonGroup();
        lblNumSeats = new javax.swing.JLabel();
        jComboLocation = new javax.swing.JComboBox<>();
        jComboNumSeats = new javax.swing.JComboBox<>();
        lblErrorCarModelName = new javax.swing.JLabel();
        lblErrorSerialNumber = new javax.swing.JLabel();
        lblErrorCarModelNum = new javax.swing.JLabel();
        jComboManufacturingYear = new javax.swing.JComboBox<>();
        lblCarModelName = new javax.swing.JLabel();
        lblCreateTitle = new javax.swing.JLabel();
        txtCarModelName = new javax.swing.JTextField();
        lblCarManufacturer = new javax.swing.JLabel();
        lblCarModelNum = new javax.swing.JLabel();
        lblYearOfManufacturing = new javax.swing.JLabel();
        txtCarModelNum = new javax.swing.JTextField();
        lblLocation = new javax.swing.JLabel();
        lblSerialNumber = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        txtSerialNumber = new javax.swing.JTextField();
        noChecked = new javax.swing.JRadioButton();
        lblMainCertiExpiry = new javax.swing.JLabel();
        yesChecked = new javax.swing.JRadioButton();
        yesMainCertiExpiryChecked = new javax.swing.JCheckBox();
        lblCarAvailability = new javax.swing.JLabel();
        jComboCarManufacturer = new javax.swing.JComboBox<>();

        lblNumSeats.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumSeats.setText("Number of Seats :");

        jComboLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please Select--", "Boston", "Texas", "Arizona", "New York", "New Jersey", "California", "Seatle" }));

        jComboNumSeats.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please Select--", "4", "6" }));

        jComboManufacturingYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboManufacturingYearActionPerformed(evt);
            }
        });

        lblCarModelName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarModelName.setText("Car Model Name :");

        lblCreateTitle.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblCreateTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCreateTitle.setText("View/Update Car Details");

        txtCarModelName.setEditable(false);
        txtCarModelName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarModelNameActionPerformed(evt);
            }
        });
        txtCarModelName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCarModelNameKeyPressed(evt);
            }
        });

        lblCarManufacturer.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarManufacturer.setText("Car Manufacturer :");

        lblCarModelNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarModelNum.setText("Car Model Number :");

        lblYearOfManufacturing.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblYearOfManufacturing.setText("Car Manufacturing Year:");

        txtCarModelNum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCarModelNumActionPerformed(evt);
            }
        });
        txtCarModelNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCarModelNumKeyPressed(evt);
            }
        });

        lblLocation.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLocation.setText("Location :");

        lblSerialNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSerialNumber.setText("Serial  Number :");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        txtSerialNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSerialNumberKeyPressed(evt);
            }
        });

        btnRadioGroup.add(noChecked);
        noChecked.setText("No");

        lblMainCertiExpiry.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMainCertiExpiry.setText("Expired Maintenance  Certificate ? :");

        btnRadioGroup.add(yesChecked);
        yesChecked.setSelected(true);
        yesChecked.setText("Yes");

        yesMainCertiExpiryChecked.setText("Yes");

        lblCarAvailability.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblCarAvailability.setText("Availability :");

        jComboCarManufacturer.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Please Select--", "Toyota", "GM", "BMW", "Audi" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblCreateTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblCarModelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCarAvailability, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblMainCertiExpiry, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblNumSeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblSerialNumber, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblYearOfManufacturing, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCarModelNum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCarManufacturer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yesChecked)
                                .addGap(29, 29, 29)
                                .addComponent(noChecked))
                            .addComponent(yesMainCertiExpiryChecked)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtCarModelName)
                                .addComponent(txtCarModelNum)
                                .addComponent(txtSerialNumber)
                                .addComponent(jComboNumSeats, 0, 229, Short.MAX_VALUE)
                                .addComponent(jComboCarManufacturer, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboLocation, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblErrorCarModelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrorCarModelNum, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                    .addComponent(jComboManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(lblCreateTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboCarManufacturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCarModelName)
                        .addComponent(txtCarModelName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrorCarModelName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCarModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCarModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrorCarModelNum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblYearOfManufacturing, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboManufacturingYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblErrorSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lblSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboNumSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yesChecked)
                    .addComponent(noChecked)
                    .addComponent(lblCarAvailability, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMainCertiExpiry, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yesMainCertiExpiryChecked))
                .addGap(30, 30, 30)
                .addComponent(btnSave)
                .addGap(55, 55, 55))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboManufacturingYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboManufacturingYearActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_jComboManufacturingYearActionPerformed

    private void txtCarModelNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarModelNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarModelNameActionPerformed

    private void txtCarModelNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarModelNameKeyPressed
        // TODO add your handling code here:

        char c =evt.getKeyChar();

        if(Character.isLetter(c) || Character.isWhitespace(c)|| Character.isISOControl(c)){
            lblErrorCarModelName.setText(" ");
            txtCarModelName.setEditable(true);

        }else {
            if(!Character.isLetter(c)){
                // txtName.setEditable(false);
                lblErrorCarModelName.setText("Enter a valid name");
            }
        }
    }//GEN-LAST:event_txtCarModelNameKeyPressed

    private void txtCarModelNumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCarModelNumActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCarModelNumActionPerformed

    private void txtCarModelNumKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCarModelNumKeyPressed
        // TODO add your handling code here:

        String carModelNum = txtCarModelNum.getText();
        String PATTERN = "^[a-zA-Z0-9]+";
        Pattern exp = Pattern.compile(PATTERN);
        Matcher match = exp.matcher(carModelNum);
        if(!match.matches()){
            lblErrorCarModelNum.setText("Enter a valid Car Model Number!!");
        }else{
            lblErrorCarModelNum.setText(" ");
        }
    }//GEN-LAST:event_txtCarModelNumKeyPressed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String carManufacturer = jComboCarManufacturer.getSelectedItem().toString();
        String carModelName = txtCarModelName.getText();
        String carModelNum = txtCarModelNum.getText();
        String yearOfManufacturing = jComboManufacturingYear.getSelectedItem().toString();
        String serialNumber = txtSerialNumber.getText();
        String location = jComboLocation.getSelectedItem().toString();
        String selectedValue = jComboNumSeats.getSelectedItem().toString();

        String carModelNamePattern = "^[a-zA-z]+";
        Pattern expCarModelName = Pattern.compile(carModelNamePattern);

        String serialNumberPattern = "^[0-9]{6}+";
        Pattern expSerialNumber = Pattern.compile(serialNumberPattern);

        String carModelNumPattern = "^[a-zA-Z0-9]+";
        Pattern expCarModelNum = Pattern.compile(carModelNumPattern);

        if(txtCarModelName.getText().isEmpty()|| txtCarModelNum.getText().isEmpty() || txtSerialNumber.getText().isEmpty() ){
            JOptionPane.showMessageDialog(this, "Fields are mandatory !!");
        }else {
            if(carManufacturer == "--Please Select--" || location == "--Please Select--" || selectedValue == "--Please Select--" || yearOfManufacturing == "--Please Select--"){
                JOptionPane.showMessageDialog(this, "Please check the fields !!");
            }else{
                Matcher matchCarModelName = expCarModelName.matcher(txtCarModelName.getText());
                if(!matchCarModelName.matches()){
                    lblErrorCarModelName.setText("Enter a valid car model name!!");
                }else{
                    lblErrorCarModelName.setText(" ");
                    Matcher matchSerialNumber = expSerialNumber.matcher(txtSerialNumber.getText());
                    if(!matchSerialNumber.matches()){
                        lblErrorSerialNumber.setText("Enter a valid Serial Number!!");
                    }else{
                        Matcher matchCarModelNum = expCarModelNum.matcher(txtCarModelNum.getText());
                        lblErrorSerialNumber.setText(" ");
                        if(!matchCarModelNum.matches()){
                            lblErrorCarModelNum.setText("Enter a valid Car Model Number!!");
                        }else{
                            lblErrorCarModelNum.setText(" ");
                            CarDetails carDetails = carDetailsHistory.addNewCarDetails();
                            carDetails.setCarModelName(carModelName);
                            carDetails.setCarModelNum(carModelNum);
                            carDetails.setYearOfManufacturing(yearOfManufacturing);
                            carDetails.setLocation(location);

                            try{
                                carDetails.setNumSeats(Integer.parseInt(selectedValue));
                                carDetails.setSerialNumber(Integer.parseInt(serialNumber));
                            }catch(NumberFormatException e){// handle your exception
                                e.printStackTrace();
                            }

                            if(yesChecked.isSelected()){
                                carDetails.setCarAvailability(yesChecked.getText());
                            }else {
                                carDetails.setCarAvailability(noChecked.getText());
                            }

                            if(yesMainCertiExpiryChecked.isSelected()){
                                carDetails.setMainCertiExpiry(yesMainCertiExpiryChecked.getText());
                            }else {
                                JOptionPane.showMessageDialog(this, "For Maintenance Certificate as nothing is selected its considered to be 'NO' ");
                            }

                            JOptionPane.showMessageDialog(this, "New Car Details Added!!");

                            //clearing the text after the car details are saved
                            jComboCarManufacturer.setSelectedItem("--Please Select--");
                            txtCarModelName.setText("");
                            txtCarModelNum.setText("");
                            jComboManufacturingYear.setSelectedItem("--Please Select--");
                            txtSerialNumber.setText("");
                            jComboLocation.setSelectedItem("--Please Select--");
                            jComboNumSeats.setSelectedItem("--Please Select--");
                            btnRadioGroup.clearSelection();
                            yesMainCertiExpiryChecked.setSelected(false);
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtSerialNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerialNumberKeyPressed
        // TODO add your handling code here:

        String serialNumber = txtSerialNumber.getText();
        int length = serialNumber.length();

        char c = evt.getKeyChar();

        if(evt.getKeyChar()>='0' && evt.getKeyChar()<='9'){
            if(length<6){
                txtSerialNumber.setEditable(true);
                lblErrorSerialNumber.setText("Serial Numner should be 6 digits!!");
            }else{
                txtSerialNumber.setEditable(false);
                lblErrorSerialNumber.setText(" ");
            }
        }else{
            if(evt.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE || evt.getExtendedKeyCode()==KeyEvent.VK_DELETE){
                txtSerialNumber.setEditable(true);

            }else{
                txtSerialNumber.setEditable(false);

            }
        }
    }//GEN-LAST:event_txtSerialNumberKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnRadioGroup;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> jComboCarManufacturer;
    private javax.swing.JComboBox<String> jComboLocation;
    private javax.swing.JComboBox<String> jComboManufacturingYear;
    private javax.swing.JComboBox<String> jComboNumSeats;
    private javax.swing.JLabel lblCarAvailability;
    private javax.swing.JLabel lblCarManufacturer;
    private javax.swing.JLabel lblCarModelName;
    private javax.swing.JLabel lblCarModelNum;
    private javax.swing.JLabel lblCreateTitle;
    private javax.swing.JLabel lblErrorCarModelName;
    private javax.swing.JLabel lblErrorCarModelNum;
    private javax.swing.JLabel lblErrorSerialNumber;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMainCertiExpiry;
    private javax.swing.JLabel lblNumSeats;
    private javax.swing.JLabel lblSerialNumber;
    private javax.swing.JLabel lblYearOfManufacturing;
    private javax.swing.JRadioButton noChecked;
    private javax.swing.JTextField txtCarModelName;
    private javax.swing.JTextField txtCarModelNum;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JRadioButton yesChecked;
    private javax.swing.JCheckBox yesMainCertiExpiryChecked;
    // End of variables declaration//GEN-END:variables
}
