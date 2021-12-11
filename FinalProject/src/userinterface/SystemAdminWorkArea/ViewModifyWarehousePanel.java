/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.FCWarehouse.FCWarehouse;
import Business.FCWarehouse.FCWarehouseDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowmyachinimilli
 */
public class ViewModifyWarehousePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyWarehousePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FCWarehouseDirectory fcd;
    public ViewModifyWarehousePanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateWHtable();
        txtFCAuname.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddWHTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblWarehouse = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblWHname = new javax.swing.JLabel();
        txtWHname = new javax.swing.JTextField();
        lblWHPhno = new javax.swing.JLabel();
        txtWHPhno = new javax.swing.JTextField();
        lblWHAdd = new javax.swing.JLabel();
        txtWHAdd = new javax.swing.JTextField();
        lblWHCity = new javax.swing.JLabel();
        txtWHCity = new javax.swing.JTextField();
        lblWHState = new javax.swing.JLabel();
        txtWHState = new javax.swing.JTextField();
        lblWHZip = new javax.swing.JLabel();
        txtWHZip = new javax.swing.JTextField();
        lblWHFCAdmin = new javax.swing.JLabel();
        txtWHFCAdmin = new javax.swing.JTextField();
        lblFCAuname = new javax.swing.JLabel();
        txtFCAuname = new javax.swing.JTextField();
        lblFCApwd = new javax.swing.JLabel();
        txtFCApwd = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblWHname1 = new javax.swing.JLabel();
        lblWHPhno1 = new javax.swing.JLabel();
        lblWHAdd1 = new javax.swing.JLabel();
        lblWHCity1 = new javax.swing.JLabel();
        lblWHState1 = new javax.swing.JLabel();
        lblWHZip1 = new javax.swing.JLabel();
        lblWHFCAdmin1 = new javax.swing.JLabel();
        lblFCAuname1 = new javax.swing.JLabel();
        lblFCApwd1 = new javax.swing.JLabel();
        lblWHid = new javax.swing.JLabel();
        lblWHid1 = new javax.swing.JLabel();

        lblAddWHTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddWHTitle.setText("View/Modify Warehouse");

        tblWarehouse.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Warehouse ID", "Name", "FC Admin", "Phone Number", "Address", "City", "State", "Zipcode"
            }
        ));
        jScrollPane1.setViewportView(tblWarehouse);

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

        lblWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHname.setText("Warehouse Name");

        txtWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHnameFocusLost(evt);
            }
        });
        txtWHname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWHnameKeyReleased(evt);
            }
        });

        lblWHPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHPhno.setText("Phone Number");

        txtWHPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHPhno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHPhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHPhnoFocusLost(evt);
            }
        });
        txtWHPhno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtWHPhnoKeyReleased(evt);
            }
        });

        lblWHAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHAdd.setText("Address");

        txtWHAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHAdd.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHCity.setText("City");

        txtWHCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHCity.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHState.setText("State");

        txtWHState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHState.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHZip.setText("Zipcode");

        txtWHZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHZipFocusLost(evt);
            }
        });

        lblWHFCAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHFCAdmin.setText("FoodCloudAdmin");

        txtWHFCAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHFCAdmin.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHFCAdmin.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHFCAdminFocusLost(evt);
            }
        });

        lblFCAuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCAuname.setText("FCAdmin Username");

        txtFCAuname.setEditable(false);
        txtFCAuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCAuname.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCApwd.setText("Password");

        txtFCApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCApwd.setPreferredSize(new java.awt.Dimension(150, 25));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblWHname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblWHPhno1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblWHAdd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblWHCity1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblWHState1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblWHZip1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblWHFCAdmin1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCAuname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCApwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblWHid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHid.setText("Warehouse Id:");

        lblWHid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(lblAddWHTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblWHid)
                        .addGap(24, 24, 24)
                        .addComponent(lblWHid1)
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblWHname)
                                    .addComponent(lblWHPhno)
                                    .addComponent(lblWHAdd)
                                    .addComponent(lblWHCity)
                                    .addComponent(lblWHState)
                                    .addComponent(lblWHZip)
                                    .addComponent(lblWHFCAdmin)
                                    .addComponent(lblFCAuname)
                                    .addComponent(lblFCApwd))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWHname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHCity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHState, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHZip, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHFCAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFCAuname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblWHname1)
                            .addComponent(lblWHZip1)
                            .addComponent(lblWHPhno1)
                            .addComponent(lblWHAdd1)
                            .addComponent(lblWHCity1)
                            .addComponent(lblWHState1)
                            .addComponent(lblWHFCAdmin1)
                            .addComponent(lblFCAuname1)
                            .addComponent(lblFCApwd1))))
                .addContainerGap(322, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAddWHTitle)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnEdit))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHname)
                            .addComponent(txtWHname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWHname1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHPhno)
                            .addComponent(txtWHPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWHPhno1))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHAdd)
                            .addComponent(txtWHAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWHAdd1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHCity)
                            .addComponent(txtWHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWHCity1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHState)
                            .addComponent(txtWHState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWHState1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHZip)
                            .addComponent(txtWHZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWHZip1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHFCAdmin)
                            .addComponent(txtWHFCAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblWHFCAdmin1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblFCAuname)
                            .addComponent(txtFCAuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFCAuname1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFCApwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate)
                        .addGap(339, 339, 339))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(190, 190, 190)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHid)
                            .addComponent(lblWHid1))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtWHnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWHnameKeyReleased
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtWHnameKeyReleased

    private void txtWHPhnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtWHPhnoKeyReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtWHPhnoKeyReleased

    private void txtWHnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHnameFocusLost
        // TODO add your handling code here:
         if(!(txtWHname.getText().matches("^[a-zA-Z]*$"))){
            lblWHname1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblWHname1.setText("");
        }
    }//GEN-LAST:event_txtWHnameFocusLost

    private void txtWHPhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHPhnoFocusLost
        // TODO add your handling code here:
        if(!(txtWHPhno.getText().matches("^[0-9]*$")) || !(txtWHPhno.getText().length()==10)) {
                lblWHPhno1.setText("Please enter a valid phone number");
        }
        else{
             lblWHPhno1.setText("");
            
        }
    }//GEN-LAST:event_txtWHPhnoFocusLost

    private void txtWHZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHZipFocusLost
        // TODO add your handling code here:
        if((txtWHZip.getText().matches("^[a-zA-Z]*$"))){
            lblWHZip1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblWHZip1.setText("");
        }
    }//GEN-LAST:event_txtWHZipFocusLost

    private void txtWHFCAdminFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHFCAdminFocusLost
        // TODO add your handling code here:
        if(!(txtWHFCAdmin.getText().matches("^[a-zA-Z]*$"))){
            lblWHFCAdmin1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblWHFCAdmin1.setText("");
        }
    }//GEN-LAST:event_txtWHFCAdminFocusLost

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouse.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        FCWarehouse selectedFCW = (FCWarehouse)model.getValueAt(selectedRowIndex, 0);
        lblWHid1.setText(selectedFCW.getFcwId());
        txtWHname.setText(selectedFCW.getFcwName());
        txtWHPhno.setText(selectedFCW.getFcwPhno());
        txtWHAdd.setText(selectedFCW.getFcwAddres());
        txtWHCity.setText(selectedFCW.getFcwCity());
        txtWHState.setText(selectedFCW.getFcwState());
        txtWHZip.setText(selectedFCW.getFcwZipcode());
        txtWHFCAdmin.setText(selectedFCW.getFcwAdmin());
        txtFCAuname.setText(selectedFCW.getFcwAccount().getUsername());
        txtFCApwd.setText(selectedFCW.getFcwAccount().getPassword());
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouse.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        FCWarehouse selectedFCW = (FCWarehouse)model.getValueAt(selectedRowIndex, 0);
       /* // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedRest.getResManagerName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAcc(
                this.system.getRestaurantDirectory().getResList().
                        get(selectedRowIndex).getUserAcc()
        );
        // finally delete the user from customer directory*/
        fcd= ecosystem.getFCWDirectory();
        fcd.deleteFCWarehouse(selectedFCW);
        ecosystem.setFCWDirectory(fcd);
        JOptionPane.showMessageDialog(this, "Food Cloud Warehouse deleted Successfully");
        populateWHtable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblWarehouse.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        String WHid = lblWHid1.getText();
        
        ArrayList<FCWarehouse> fcwList = ecosystem.getFCWDirectory().getFcwList();
        for(FCWarehouse f: fcwList)
        {
            if(f.getFcwId().equals(WHid))
            {
                f.setFcwName(txtWHname.getText());
                f.setFcwPhno(txtWHPhno.getText());
                f.setFcwAddres(txtWHAdd.getText());
                f.setFcwCity(txtWHCity.getText());
                f.setFcwState(txtWHState.getText());
                f.setFcwZipcode(txtWHZip.getText());
                f.setFcwAdmin(txtWHFCAdmin.getText());
                //UserAccount WHua=new UserAccount();
                //WHua.setUsername(txtFCAuname.getText());
                //WHua.setPassword(txtFCApwd.getText());
                if(f.getFcwAccount().getUsername().equals(txtFCAuname.getText())){
                    Employee emp=new Employee();
                    emp.setName(txtWHFCAdmin.getText());
                    f.getFcwAccount().setPassword(txtFCApwd.getText());
                    f.getFcwAccount().setEmployee(emp);
                }
                //f.setFcwAccount(WHua);
               break;
            }
            
        }
       // ecosystem.setFCWDirectory(fcwList);
        fcd = ecosystem.getFCWDirectory();
        ecosystem.setFCWDirectory(fcd);
        JOptionPane.showMessageDialog(this, "Food CLoud Warehouse details updated successfully");
        clearfields();
        populateWHtable();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddWHTitle;
    private javax.swing.JLabel lblFCApwd;
    private javax.swing.JLabel lblFCApwd1;
    private javax.swing.JLabel lblFCAuname;
    private javax.swing.JLabel lblFCAuname1;
    private javax.swing.JLabel lblWHAdd;
    private javax.swing.JLabel lblWHAdd1;
    private javax.swing.JLabel lblWHCity;
    private javax.swing.JLabel lblWHCity1;
    private javax.swing.JLabel lblWHFCAdmin;
    private javax.swing.JLabel lblWHFCAdmin1;
    private javax.swing.JLabel lblWHPhno;
    private javax.swing.JLabel lblWHPhno1;
    private javax.swing.JLabel lblWHState;
    private javax.swing.JLabel lblWHState1;
    private javax.swing.JLabel lblWHZip;
    private javax.swing.JLabel lblWHZip1;
    private javax.swing.JLabel lblWHid;
    private javax.swing.JLabel lblWHid1;
    private javax.swing.JLabel lblWHname;
    private javax.swing.JLabel lblWHname1;
    private javax.swing.JTable tblWarehouse;
    private javax.swing.JTextField txtFCApwd;
    private javax.swing.JTextField txtFCAuname;
    private javax.swing.JTextField txtWHAdd;
    private javax.swing.JTextField txtWHCity;
    private javax.swing.JTextField txtWHFCAdmin;
    private javax.swing.JTextField txtWHPhno;
    private javax.swing.JTextField txtWHState;
    private javax.swing.JTextField txtWHZip;
    private javax.swing.JTextField txtWHname;
    // End of variables declaration//GEN-END:variables

    private void populateWHtable() {
        DefaultTableModel model = (DefaultTableModel) tblWarehouse.getModel();
        model.setRowCount(0);
        for(FCWarehouse fcwh: ecosystem.getFCWDirectory().getFcwList()){
           Object[] row = new Object[8];
           row[0] =fcwh;
           row[1] =fcwh.getFcwName();
           row[2] =fcwh.getFcwAdmin();
           row[3] =fcwh.getFcwPhno();
           row[4] =fcwh.getFcwAddres();
           row[5] =fcwh.getFcwCity();
           row[6] =fcwh.getFcwState();
           row[7] =fcwh.getFcwZipcode();
           model.addRow(row);
        } 
    }
    private void clearfields() {
        txtWHname.setText("");
        txtWHPhno.setText("");
        txtWHAdd.setText("");
        txtWHCity.setText("");
        txtWHState.setText("");
        txtWHZip.setText("");
        txtWHFCAdmin.setText("");
        txtFCAuname.setText("");
        txtFCApwd.setText("");
    }
}
