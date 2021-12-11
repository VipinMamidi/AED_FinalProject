/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FCAdminRole;

import Business.EcoSystem;
import Business.FCPantry.FCPantry;
import Business.FCPantry.FCPantryDirectory;
import Business.FCPantry.FCPantryItems;
import Business.FCPantry.FCPantryItemsDirectory;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sowmyachinimilli
 */
public class AddPantryItemsPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddPantryItemsPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    FCPantryItemsDirectory fcpid;
    String WHname;
    public AddPantryItemsPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        if(ecosystem.getFCPIDirectory()== null){
         ecosystem.setFCPIDirectory(new FCPantryItemsDirectory());
        }
        String FCAname=userAcc.getEmployee().getName();
        System.out.println(FCAname);
        WHname= ecosystem.getFCWDirectory().getWHname(FCAname);
        System.out.println(WHname);
        lblWHval.setText(WHname);
        ArrayList<String> PantryList = new ArrayList<String>();
        for (FCPantry fcp : ecosystem.getFCPDirectory().getFcpList()){
            if(fcp.getFcpWHname().equals(WHname)){
                PantryList.add(fcp.getFcpName());
            }
            
        }
        cbPantry.setModel(new DefaultComboBoxModel<String>(PantryList.toArray(new String[0])));
        txtPM.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAddFCPTitle = new javax.swing.JLabel();
        lblWHname = new javax.swing.JLabel();
        txtPM = new javax.swing.JTextField();
        lblPantryMg = new javax.swing.JLabel();
        txtFDitem = new javax.swing.JTextField();
        lblFDitem = new javax.swing.JLabel();
        txtFDq = new javax.swing.JTextField();
        lblWHval = new javax.swing.JLabel();
        lblPantry = new javax.swing.JLabel();
        cbPantry = new javax.swing.JComboBox<>();
        lblFDq = new javax.swing.JLabel();
        btnSubmit = new javax.swing.JButton();
        lblitemID = new javax.swing.JLabel();
        txtitemId = new javax.swing.JTextField();

        lblAddFCPTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddFCPTitle.setText("Add Pantry Items");

        lblWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHname.setText("Warehouse Name");

        txtPM.setEditable(false);
        txtPM.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtPM.setPreferredSize(new java.awt.Dimension(150, 25));
        txtPM.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPMFocusLost(evt);
            }
        });

        lblPantryMg.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPantryMg.setText("Pantry Manager");

        txtFDitem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFDitem.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFDitem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFDitemFocusLost(evt);
            }
        });

        lblFDitem.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFDitem.setText("Food Item");

        txtFDq.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFDq.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHval.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblPantry.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblPantry.setText("Select Pantry");

        cbPantry.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbPantry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPantryActionPerformed(evt);
            }
        });

        lblFDq.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFDq.setText("Item Quantity");

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblitemID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblitemID.setText("Item Id");

        txtitemId.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtitemId.setPreferredSize(new java.awt.Dimension(150, 25));
        txtitemId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtitemIdFocusLost(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(lblAddFCPTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblPantryMg)
                                    .addComponent(lblFDitem)
                                    .addComponent(lblWHname)
                                    .addComponent(lblPantry)
                                    .addComponent(lblFDq)
                                    .addComponent(lblitemID))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFDitem, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFDq, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbPantry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPM, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblWHval)
                                    .addComponent(txtitemId, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(73, 73, 73)
                                .addComponent(btnSubmit)))))
                .addContainerGap(297, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAddFCPTitle)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHname)
                    .addComponent(lblWHval))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPantry)
                    .addComponent(cbPantry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPantryMg)
                    .addComponent(txtPM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblitemID)
                    .addComponent(txtitemId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFDitem)
                    .addComponent(txtFDitem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFDq)
                    .addComponent(txtFDq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(btnSubmit)
                .addContainerGap(192, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPMFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPMFocusLost
        // TODO add your handling code here:
     
    }//GEN-LAST:event_txtPMFocusLost

    private void txtFDitemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFDitemFocusLost
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtFDitemFocusLost

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            FCPantryItems fcpi=new FCPantryItems();
            fcpi.setFcpitemid(txtitemId.getText());
            fcpi.setFcpWHname(WHname);
            fcpi.setPantryName(String.valueOf(cbPantry.getSelectedItem()));
            fcpi.setPantryManager(txtPM.getText());
            fcpi.setFoodItem(txtFDitem.getText());
            fcpi.setFoodQuan(Integer.parseInt(txtFDq.getText()));           
            fcpid = ecosystem.getFCPIDirectory();
            fcpid.addFCPItems(fcpi);
            ecosystem.setFCPIDirectory(fcpid);
            JOptionPane.showMessageDialog(this, "Items added to Pantry successfully!");
            clearfields(); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }

    private void clearfields() {
        txtitemId.setText("");
        txtPM.setText("");
        txtFDitem.setText("");
        txtFDq.setText("");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cbPantryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPantryActionPerformed
        // TODO add your handling code here:
        for(FCPantry fp: ecosystem.getFCPDirectory().getFcpList()){
            if(fp.getFcpWHname().equals(WHname)){
                txtPM.setText(fp.getFcpManager());
            }
        //txtPM.setText(ecosystem.getFCPDirectory());
        }
    }//GEN-LAST:event_cbPantryActionPerformed

    private void txtitemIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtitemIdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtitemIdFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cbPantry;
    private javax.swing.JLabel lblAddFCPTitle;
    private javax.swing.JLabel lblFDitem;
    private javax.swing.JLabel lblFDq;
    private javax.swing.JLabel lblPantry;
    private javax.swing.JLabel lblPantryMg;
    private javax.swing.JLabel lblWHname;
    private javax.swing.JLabel lblWHval;
    private javax.swing.JLabel lblitemID;
    private javax.swing.JTextField txtFDitem;
    private javax.swing.JTextField txtFDq;
    private javax.swing.JTextField txtPM;
    private javax.swing.JTextField txtitemId;
    // End of variables declaration//GEN-END:variables

    private boolean nullCheck() {
        if(txtPM.getText().length()!=0 && txtFDitem.getText().length()!=0 && txtFDq.getText().length()!=0)
        {
            return false;
        }
        else return true;
    }
}