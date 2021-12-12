/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NGORole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.NGOVolunteer.Volunteer;
import Business.NGOVolunteer.VolunteerDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aravindasagiraju
 */
public class ViewModifyVolunteerPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyVolunteerPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    VolunteerDirectory vold;
    public ViewModifyVolunteerPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if(ecosystem.getVolDir() == null){
              ecosystem.setVolDir(new VolunteerDirectory());
          }
        populatevoltable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddVolTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVolunteer = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblWHname1 = new javax.swing.JLabel();
        lblvolid = new javax.swing.JLabel();
        lblvolid1 = new javax.swing.JLabel();
        lblVolname = new javax.swing.JLabel();
        txtVolname = new javax.swing.JTextField();
        lblVolPhno = new javax.swing.JLabel();
        txtVolPhno = new javax.swing.JTextField();
        lblVolAdd = new javax.swing.JLabel();
        txtVolAdd = new javax.swing.JTextField();
        lblVolCity = new javax.swing.JLabel();
        txtVolCity = new javax.swing.JTextField();
        lblVolState = new javax.swing.JLabel();
        lblVolage = new javax.swing.JLabel();
        txtVolage = new javax.swing.JTextField();
        txtVolState = new javax.swing.JTextField();
        lblVolZip = new javax.swing.JLabel();
        txtVolZip = new javax.swing.JTextField();
        lblVolExp = new javax.swing.JLabel();
        txtVolExp = new javax.swing.JTextField();
        lblVoluname = new javax.swing.JLabel();
        txtVoluname = new javax.swing.JTextField();
        lblVolpwd = new javax.swing.JLabel();
        txtVolpwd = new javax.swing.JTextField();
        lblVolid2 = new javax.swing.JLabel();
        lblVolname1 = new javax.swing.JLabel();
        lblVolZip1 = new javax.swing.JLabel();
        lblVolPhno1 = new javax.swing.JLabel();
        lblVolpwd2 = new javax.swing.JLabel();
        lblVolAdmin1 = new javax.swing.JLabel();

        lblAddVolTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddVolTitle.setText("View/Modify Volunteer");

        tblVolunteer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Volunteer Id", "Name", "Age", "Phone Number", "Address", "City", "State", "Zipcode", "Experience"
            }
        ));
        jScrollPane1.setViewportView(tblVolunteer);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblWHname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblvolid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblvolid.setText("Volunteer Id:");

        lblvolid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblVolname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolname.setText("Volunteer Name*");

        txtVolname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolnameFocusLost(evt);
            }
        });
        txtVolname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolnameActionPerformed(evt);
            }
        });

        lblVolPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolPhno.setText("Phone Number*");

        txtVolPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolPhno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolPhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolPhnoFocusLost(evt);
            }
        });

        lblVolAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolAdd.setText("Address*");

        txtVolAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolAdd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolAddActionPerformed(evt);
            }
        });

        lblVolCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolCity.setText("City*");

        txtVolCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolCity.setPreferredSize(new java.awt.Dimension(150, 25));

        lblVolState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolState.setText("State*");

        lblVolage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolage.setText("Volunteer Age*");

        txtVolage.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolage.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolage.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolageFocusLost(evt);
            }
        });

        txtVolState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolStateActionPerformed(evt);
            }
        });

        lblVolZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolZip.setText("Zipcode*");

        txtVolZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolZipFocusLost(evt);
            }
        });

        lblVolExp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolExp.setText("Volunteer Experience*");

        txtVolExp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolExp.setPreferredSize(new java.awt.Dimension(150, 25));
        txtVolExp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtVolExpFocusLost(evt);
            }
        });
        txtVolExp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolExpActionPerformed(evt);
            }
        });

        lblVoluname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVoluname.setText("Volunteer Username*");

        txtVoluname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVoluname.setPreferredSize(new java.awt.Dimension(150, 25));

        lblVolpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblVolpwd.setText("Password*");

        txtVolpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtVolpwd.setPreferredSize(new java.awt.Dimension(150, 25));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWHname1)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblvolid)
                .addGap(24, 24, 24)
                .addComponent(lblvolid1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lblAddVolTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblVolPhno)
                                    .addComponent(lblVolAdd)
                                    .addComponent(lblVolCity)
                                    .addComponent(lblVolState)
                                    .addComponent(lblVolZip)
                                    .addComponent(lblVoluname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblVolpwd)
                                    .addComponent(lblVolExp))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtVolPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVolAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVolCity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVolState, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVolZip, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVolExp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVoluname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVolpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVolage)
                                .addGap(40, 40, 40)
                                .addComponent(txtVolage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVolname)
                                .addGap(40, 40, 40)
                                .addComponent(txtVolname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVolid2)
                            .addComponent(lblVolname1)
                            .addComponent(lblVolPhno1)
                            .addComponent(lblVolZip1)
                            .addComponent(lblVolpwd2)
                            .addComponent(lblVolAdmin1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(375, 375, 375)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAddVolTitle)
                .addGap(33, 33, 33)
                .addComponent(lblWHname1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(btnEdit))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblVolid2)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolname)
                                    .addComponent(txtVolname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVolname1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolage)
                                    .addComponent(txtVolage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolPhno)
                                    .addComponent(txtVolPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVolPhno1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolAdd)
                                    .addComponent(txtVolAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtVolCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVolCity))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolState)
                                    .addComponent(txtVolState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolZip)
                                    .addComponent(txtVolZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVolZip1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolExp)
                                    .addComponent(txtVolExp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblVolAdmin1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVoluname)
                                    .addComponent(txtVoluname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblVolpwd)
                                    .addComponent(txtVolpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(lblVolpwd2)
                                .addGap(11, 11, 11)
                                .addComponent(btnUpdate))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblvolid)
                                .addComponent(lblvolid1)))))
                .addContainerGap(155, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVolunteer.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        Volunteer selectedvol = (Volunteer)model.getValueAt(selectedRowIndex, 0);
        /* // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedRest.getResManagerName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAcc(
            this.system.getRestaurantDirectory().getResList().
            get(selectedRowIndex).getUserAcc()
        );
        // finally delete the user from customer directory*/
        vold= ecosystem.getVolDir();
        vold.deleteVolunteer(selectedvol);
        ecosystem.setVolDir(vold);
        JOptionPane.showMessageDialog(this, "Volunteer deleted Successfully");
        populatevoltable();
        clearfields();
        lblvolid1.setText("");
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVolunteer.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        Volunteer selectedvol = (Volunteer)model.getValueAt(selectedRowIndex, 0);
        lblvolid1.setText(selectedvol.getVolId());
        txtVolname.setText(selectedvol.getVolName());
        txtVolage.setText(selectedvol.getVolAge());
        txtVolPhno.setText(selectedvol.getVolPhno());
        txtVolAdd.setText(selectedvol.getVolAddress());
        txtVolCity.setText(selectedvol.getVolCity());
        txtVolState.setText(selectedvol.getVolState());
        txtVolZip.setText(selectedvol.getVolZipcode());
        txtVolExp.setText(selectedvol.getVolExp());
        txtVoluname.setText(selectedvol.getVolAccount().getUsername());
        txtVolpwd.setText(selectedvol.getVolAccount().getPassword());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblVolunteer.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        String volid = lblvolid1.getText();

        ArrayList<Volunteer> volList = ecosystem.getVolDir().getVolunteerList();
        for(Volunteer vol: volList)
        {
            if(vol.getVolId().equals(volid))
            {
                vol.setVolName(txtVolname.getText());
                vol.setVolAge(txtVolage.getText());
                vol.setVolPhno(txtVolPhno.getText());
                vol.setVolAddress(txtVolAdd.getText());
                vol.setVolCity(txtVolCity.getText());
                vol.setVolState(txtVolState.getText());
                vol.setVolZipcode(txtVolZip.getText());
                vol.setVolExp(txtVolExp.getText());
                UserAccount volua=new UserAccount();
                volua.setUsername(txtVoluname.getText());
                volua.setPassword(txtVolpwd.getText());
//                if(vol.getVolAccount().getUsername().equals(txtVoluname.getText())){
//                    Employee emp=new Employee();
//                    emp.setName(txtvolAdmin.getText());
//                    vol.getVolAccount().setPassword(txtVolpwd.getText());
//                    vol.getVolAccount().setEmployee(emp);
//                }
                vol.setVolAccount(volua);
                break;
            }

        }
        // ecosystem.setFCWDirectory(fcwList);
        vold = ecosystem.getVolDir();
        ecosystem.setVolDir(vold);
        JOptionPane.showMessageDialog(this, "Volunteer details updated successfully");
        clearfields();
        populatevoltable();
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtVolnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolnameFocusLost
        // TODO add your handling code here:
        if(!(txtVolname.getText().matches("^[a-zA-Z]*$"))){
            lblVolname1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblVolname1.setText("");
        }
    }//GEN-LAST:event_txtVolnameFocusLost

    private void txtVolnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolnameActionPerformed

    private void txtVolPhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolPhnoFocusLost
        // TODO add your handling code here:
        if(!(txtVolPhno.getText().matches("^[0-9]*$")) || !(txtVolPhno.getText().length()==10)) {
            lblVolPhno1.setText("Please enter a valid phone number");
        }
        else{
            lblVolPhno1.setText("");

        }
    }//GEN-LAST:event_txtVolPhnoFocusLost

    private void txtVolAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolAddActionPerformed

    private void txtVolageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolageFocusLost

    private void txtVolZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolZipFocusLost
        // TODO add your handling code here:
        if((txtVolZip.getText().matches("^[a-zA-Z]*$"))){
            lblVolZip1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblVolZip1.setText("");
        }
    }//GEN-LAST:event_txtVolZipFocusLost

    private void txtVolExpFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtVolExpFocusLost
        // TODO add your handling code here:
        //        if(!(txtVolExp.getText().matches("^[a-zA-Z]*$"))){
            //            lblVolAdmin1.setText("Invalid input. Please enter only alphabets.");
            //        }
        //        else{
            //            lblVolAdmin1.setText("");
            //        }
    }//GEN-LAST:event_txtVolExpFocusLost

    private void txtVolExpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolExpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolExpActionPerformed

    private void txtVolStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVolStateActionPerformed

    private void clearfields() {
        txtVolname.setText("");
        txtVolPhno.setText("");
        txtVolAdd.setText("");
        txtVolCity.setText("");
        txtVolState.setText("");
        txtVolZip.setText("");
        txtVolExp.setText("");
        txtVoluname.setText("");
        txtVolpwd.setText("");
        txtVolage.setText("");
    }
    
    private void populatevoltable() {
        DefaultTableModel model = (DefaultTableModel) tblVolunteer.getModel();
        model.setRowCount(0);
        for(Volunteer vol: ecosystem.getVolDir().getVolunteerList()){
           Object[] row = new Object[9];
           row[0] =vol;
           row[1] =vol.getVolName();
           row[2] =vol.getVolAge();
           row[3] =vol.getVolPhno();
           row[4] =vol.getVolAddress();
           row[5] =vol.getVolCity();
           row[6] =vol.getVolState();
           row[7] =vol.getVolZipcode();
           row[8] =vol.getVolExp();
           model.addRow(row);
        } 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddVolTitle;
    private javax.swing.JLabel lblVolAdd;
    private javax.swing.JLabel lblVolAdmin1;
    private javax.swing.JLabel lblVolCity;
    private javax.swing.JLabel lblVolExp;
    private javax.swing.JLabel lblVolPhno;
    private javax.swing.JLabel lblVolPhno1;
    private javax.swing.JLabel lblVolState;
    private javax.swing.JLabel lblVolZip;
    private javax.swing.JLabel lblVolZip1;
    private javax.swing.JLabel lblVolage;
    private javax.swing.JLabel lblVolid2;
    private javax.swing.JLabel lblVolname;
    private javax.swing.JLabel lblVolname1;
    private javax.swing.JLabel lblVolpwd;
    private javax.swing.JLabel lblVolpwd2;
    private javax.swing.JLabel lblVoluname;
    private javax.swing.JLabel lblWHname1;
    private javax.swing.JLabel lblvolid;
    private javax.swing.JLabel lblvolid1;
    private javax.swing.JTable tblVolunteer;
    private javax.swing.JTextField txtVolAdd;
    private javax.swing.JTextField txtVolCity;
    private javax.swing.JTextField txtVolExp;
    private javax.swing.JTextField txtVolPhno;
    private javax.swing.JTextField txtVolState;
    private javax.swing.JTextField txtVolZip;
    private javax.swing.JTextField txtVolage;
    private javax.swing.JTextField txtVolname;
    private javax.swing.JTextField txtVolpwd;
    private javax.swing.JTextField txtVoluname;
    // End of variables declaration//GEN-END:variables
}
