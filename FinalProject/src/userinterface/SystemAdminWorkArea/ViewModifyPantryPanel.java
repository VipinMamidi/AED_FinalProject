/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.FCPantry.FCPantry;
import Business.FCPantry.FCPantryDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowmyachinimilli
 */
public class ViewModifyPantryPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewModifyPantryPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FCPantryDirectory fcpd;
    public ViewModifyPantryPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populatePantryTable();
        txtFCPuname.setEnabled(false);
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
        tblPantry = new javax.swing.JTable();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblFCPname = new javax.swing.JLabel();
        txtFCPname = new javax.swing.JTextField();
        lblFCPPhno = new javax.swing.JLabel();
        txtFCPPhno = new javax.swing.JTextField();
        lblFCPAdd = new javax.swing.JLabel();
        txtFCPAdd = new javax.swing.JTextField();
        lblFCPCity = new javax.swing.JLabel();
        txtFCPCity = new javax.swing.JTextField();
        lblFCPState = new javax.swing.JLabel();
        txtFCPState = new javax.swing.JTextField();
        lblFCPZip = new javax.swing.JLabel();
        txtFCPZip = new javax.swing.JTextField();
        lblFCPManager = new javax.swing.JLabel();
        txtFCPManager = new javax.swing.JTextField();
        lblFCPuname = new javax.swing.JLabel();
        txtFCPuname = new javax.swing.JTextField();
        lblFCPpwd = new javax.swing.JLabel();
        txtFCPpwd = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        lblFCPid = new javax.swing.JLabel();
        lblFCPid1 = new javax.swing.JLabel();
        lblFCPname1 = new javax.swing.JLabel();
        lblFCPPhno1 = new javax.swing.JLabel();
        lblFCPAdd1 = new javax.swing.JLabel();
        lblFCPCity1 = new javax.swing.JLabel();
        lblFCPState1 = new javax.swing.JLabel();
        lblFCPZip1 = new javax.swing.JLabel();
        lblFCPManager1 = new javax.swing.JLabel();
        lblFCPuname1 = new javax.swing.JLabel();
        lblFCPpwd1 = new javax.swing.JLabel();

        lblAddWHTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddWHTitle.setText("View/Modify Pantry");

        tblPantry.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Pantry Id", "Pantry Name", "Warehouse Name", "Pantry Manager", "Phone Number", "Address", "City", "State", "Zipcode"
            }
        ));
        jScrollPane1.setViewportView(tblPantry);

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

        lblFCPname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPname.setText("Pantry Name");

        txtFCPname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPnameFocusLost(evt);
            }
        });
        txtFCPname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFCPnameKeyReleased(evt);
            }
        });

        lblFCPPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtFCPPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPPhno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPPhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPPhnoFocusLost(evt);
            }
        });
        txtFCPPhno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtFCPPhnoKeyReleased(evt);
            }
        });

        lblFCPAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPAdd.setText("Address");

        txtFCPAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPAdd.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCPCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPCity.setText("City");

        txtFCPCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPCity.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCPState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPState.setText("State");

        txtFCPState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPState.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCPZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPZip.setText("Zipcode");

        txtFCPZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPZipFocusLost(evt);
            }
        });

        lblFCPManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPManager.setText("FC Pantry Manager");

        txtFCPManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPManager.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPManager.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPManagerFocusLost(evt);
            }
        });

        lblFCPuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPuname.setText("FCP Manager Username");

        txtFCPuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPuname.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCPpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPpwd.setText("Password");

        txtFCPpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPpwd.setPreferredSize(new java.awt.Dimension(150, 25));

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblFCPid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPid.setText("Pantry Id:");

        lblFCPid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPPhno1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPPhno1.setText("Phone Number");

        lblFCPAdd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPCity1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPState1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPZip1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPManager1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPuname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPpwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFCPname1)
                        .addGap(262, 262, 262))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFCPPhno)
                        .addGap(254, 254, 254))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFCPState1)
                            .addComponent(lblFCPCity1))
                        .addGap(308, 308, 308))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFCPZip1)
                            .addComponent(lblFCPAdd1))
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFCPManager1)
                        .addGap(223, 223, 223))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(lblFCPid1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(185, 185, 185)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblFCPPhno1)
                            .addComponent(lblFCPuname))
                        .addGap(177, 177, 177)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFCPpwd1)
                            .addComponent(lblFCPuname1)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblFCPid)))
                .addContainerGap(340, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(319, 319, 319)
                            .addComponent(lblAddWHTitle))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(212, 212, 212)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblFCPname)
                                        .addComponent(lblFCPAdd)
                                        .addComponent(lblFCPCity)
                                        .addComponent(lblFCPState)
                                        .addComponent(lblFCPZip)
                                        .addComponent(lblFCPManager)
                                        .addComponent(lblFCPpwd))
                                    .addGap(33, 33, 33)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtFCPname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPCity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPState, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPZip, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPManager, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPuname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtFCPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addContainerGap(347, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(22, 22, 22))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(lblFCPid1)
                .addGap(3, 3, 3)
                .addComponent(lblFCPid)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFCPname1)
                .addGap(38, 38, 38)
                .addComponent(lblFCPPhno1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblFCPPhno)
                .addGap(35, 35, 35)
                .addComponent(lblFCPAdd1)
                .addGap(38, 38, 38)
                .addComponent(lblFCPCity1)
                .addGap(38, 38, 38)
                .addComponent(lblFCPState1)
                .addGap(38, 38, 38)
                .addComponent(lblFCPZip1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(lblFCPManager1)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPuname)
                    .addComponent(lblFCPuname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFCPpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(14, 14, 14)
                    .addComponent(lblAddWHTitle)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnDelete)
                        .addComponent(btnEdit))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFCPname)
                        .addComponent(txtFCPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtFCPPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(11, 11, 11)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFCPAdd)
                        .addComponent(txtFCPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFCPCity)
                        .addComponent(txtFCPCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFCPState)
                        .addComponent(txtFCPState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFCPZip)
                        .addComponent(txtFCPZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFCPManager)
                        .addComponent(txtFCPManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(txtFCPuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFCPpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFCPpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(btnUpdate)
                    .addGap(14, 14, 14)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPantry.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPantry.getModel();
        FCPantry selectedFCP = (FCPantry)model.getValueAt(selectedRowIndex, 0);
        /* // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedRest.getResManagerName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAcc(
            this.system.getRestaurantDirectory().getResList().
            get(selectedRowIndex).getUserAcc()
        );
        // finally delete the user from customer directory*/
        //  ecosystem.getFCPDirectory().deleteFCPantry(selectedFCP);
        fcpd= ecosystem.getFCPDirectory();
        fcpd.deleteFCPantry(selectedFCP);
        ecosystem.setFCPDirectory(fcpd);
        JOptionPane.showMessageDialog(this, "Food Cloud Pantry deleted Successfully");
        populatePantryTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPantry.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPantry.getModel();
        FCPantry selectedFCP = (FCPantry)model.getValueAt(selectedRowIndex, 0);
        lblFCPid1.setText(selectedFCP.getFcpId());
        txtFCPname.setText(selectedFCP.getFcpName());
        txtFCPPhno.setText(selectedFCP.getFcpPhno());
        txtFCPAdd.setText(selectedFCP.getFcpAddres());
        txtFCPCity.setText(selectedFCP.getFcpCity());
        txtFCPState.setText(selectedFCP.getFcpState());
        txtFCPZip.setText(selectedFCP.getFcpZipcode());
        txtFCPManager.setText(selectedFCP.getFcpManager());
        txtFCPuname.setText(selectedFCP.getFcpAccount().getUsername());
        txtFCPpwd.setText(selectedFCP.getFcpAccount().getPassword());
    }//GEN-LAST:event_btnEditActionPerformed

    private void txtFCPnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPnameFocusLost
        // TODO add your handling code here:
        if(!(txtFCPname.getText().matches("^[a-zA-Z]*$"))){
            lblFCPname1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblFCPname1.setText("");
        }
    }//GEN-LAST:event_txtFCPnameFocusLost

    private void txtFCPnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFCPnameKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFCPnameKeyReleased

    private void txtFCPPhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPPhnoFocusLost
        // TODO add your handling code here:
        if(!(txtFCPPhno.getText().matches("^[0-9]*$")) || !(txtFCPPhno.getText().length()==10)) {
            lblFCPPhno1.setText("Please enter a valid phone number");
        }
        else{
            lblFCPPhno1.setText("");

        }
    }//GEN-LAST:event_txtFCPPhnoFocusLost

    private void txtFCPPhnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFCPPhnoKeyReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtFCPPhnoKeyReleased

    private void txtFCPZipFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPZipFocusLost
        // TODO add your handling code here:
        if((txtFCPZip.getText().matches("^[a-zA-Z]*$"))){
            lblFCPZip1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblFCPZip1.setText("");
        }
    }//GEN-LAST:event_txtFCPZipFocusLost

    private void txtFCPManagerFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPManagerFocusLost
        // TODO add your handling code here:
        if(!(txtFCPManager.getText().matches("^[a-zA-Z]*$"))){
            lblFCPManager1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblFCPManager1.setText("");
        }
    }//GEN-LAST:event_txtFCPManagerFocusLost

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblPantry.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to update");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblPantry.getModel();
        String FCPid = lblFCPid1.getText();

        ArrayList<FCPantry> fcpList = ecosystem.getFCPDirectory().getFcpList();
        for(FCPantry f: fcpList)
        {
            if(f.getFcpId().equals(FCPid))
            {
                f.setFcpName(txtFCPname.getText());
                f.setFcpPhno(txtFCPPhno.getText());
                f.setFcpAddres(txtFCPAdd.getText());
                f.setFcpCity(txtFCPCity.getText());
                f.setFcpState(txtFCPState.getText());
                f.setFcpZipcode(txtFCPZip.getText());
                f.setFcpManager(txtFCPManager.getText());
                //UserAccount FCPua=new UserAccount();
                //FCPua.setUsername(txtFCPuname.getText());
                //FCPua.setPassword(txtFCPpwd.getText());
                //f.setFcpAccount(FCPua);
                if(f.getFcpAccount().getUsername().equals(txtFCPuname.getText())){
                    Employee emp=new Employee();
                    emp.setName(txtFCPManager.getText());
                    f.getFcpAccount().setPassword(txtFCPpwd.getText());
                    f.getFcpAccount().setEmployee(emp);
                }
                break;
            }

        } 
        // ecosystem.setFCWDirectory(fcwList);
        JOptionPane.showMessageDialog(this, "Food Cloud Pantry details updated successfully");
        clearfields();
        populatePantryTable();
    }//GEN-LAST:event_btnUpdateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddWHTitle;
    private javax.swing.JLabel lblFCPAdd;
    private javax.swing.JLabel lblFCPAdd1;
    private javax.swing.JLabel lblFCPCity;
    private javax.swing.JLabel lblFCPCity1;
    private javax.swing.JLabel lblFCPManager;
    private javax.swing.JLabel lblFCPManager1;
    private javax.swing.JLabel lblFCPPhno;
    private javax.swing.JLabel lblFCPPhno1;
    private javax.swing.JLabel lblFCPState;
    private javax.swing.JLabel lblFCPState1;
    private javax.swing.JLabel lblFCPZip;
    private javax.swing.JLabel lblFCPZip1;
    private javax.swing.JLabel lblFCPid;
    private javax.swing.JLabel lblFCPid1;
    private javax.swing.JLabel lblFCPname;
    private javax.swing.JLabel lblFCPname1;
    private javax.swing.JLabel lblFCPpwd;
    private javax.swing.JLabel lblFCPpwd1;
    private javax.swing.JLabel lblFCPuname;
    private javax.swing.JLabel lblFCPuname1;
    private javax.swing.JTable tblPantry;
    private javax.swing.JTextField txtFCPAdd;
    private javax.swing.JTextField txtFCPCity;
    private javax.swing.JTextField txtFCPManager;
    private javax.swing.JTextField txtFCPPhno;
    private javax.swing.JTextField txtFCPState;
    private javax.swing.JTextField txtFCPZip;
    private javax.swing.JTextField txtFCPname;
    private javax.swing.JTextField txtFCPpwd;
    private javax.swing.JTextField txtFCPuname;
    // End of variables declaration//GEN-END:variables

    private void populatePantryTable() {
        DefaultTableModel model = (DefaultTableModel) tblPantry.getModel();
        model.setRowCount(0);
        for(FCPantry fcp: ecosystem.getFCPDirectory().getFcpList()){
           Object[] row = new Object[9];
           row[0] =fcp;
           row[1] =fcp.getFcpName();
           row[2] =fcp.getFcpWHname();
           row[3] =fcp.getFcpManager();
           row[4] =fcp.getFcpPhno();
           row[5] =fcp.getFcpAddres();
           row[6] =fcp.getFcpCity();
           row[7] =fcp.getFcpState();
           row[8] =fcp.getFcpZipcode();
           model.addRow(row);
        }  
    } 

    private void clearfields() {
        txtFCPname.setText("");
        txtFCPPhno.setText("");
        txtFCPAdd.setText("");
        txtFCPCity.setText("");
        txtFCPState.setText("");
        txtFCPZip.setText("");
        txtFCPManager.setText("");
        txtFCPuname.setText("");
        txtFCPpwd.setText("");
    }
}
