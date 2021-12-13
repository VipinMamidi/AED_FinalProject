/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.FCPManagerRole;

import Business.EcoSystem;
import Business.NGOVolunteer.Volunteer;
import Business.Reqorder.Reqorder;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowmyachinimilli
 */
public class ViewFoodRequestsPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewFoodRequestsPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    String volname;
    public ViewFoodRequestsPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDonProfileTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFdReqs = new javax.swing.JTable();
        btnAssign = new javax.swing.JButton();
        lblRid = new javax.swing.JLabel();
        txtDRid = new javax.swing.JTextField();
        lblDRid1 = new javax.swing.JLabel();
        cbVol = new javax.swing.JComboBox<>();
        btnSend = new javax.swing.JButton();
        lblDonProfileTitle1 = new javax.swing.JLabel();

        lblDonProfileTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDonProfileTitle.setText("Food Requests");

        tblFdReqs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Requestor", "Quantity", "Order Type", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblFdReqs);

        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        lblRid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblRid.setText("Request ID");

        txtDRid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDRid.setPreferredSize(new java.awt.Dimension(150, 25));
        txtDRid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDRidFocusLost(evt);
            }
        });
        txtDRid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDRidKeyReleased(evt);
            }
        });

        lblDRid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDRid1.setText("Assign Volunteer");

        cbVol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnSend.setText("Send request to volunteer");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lblDonProfileTitle1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDonProfileTitle1.setText("Assign Volunteer");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDRid1)
                            .addComponent(lblRid))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDRid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 388, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(406, 406, 406)
                        .addComponent(btnAssign))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(lblDonProfileTitle1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(437, 437, 437)
                        .addComponent(lblDonProfileTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnSend)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblDonProfileTitle)
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSend)
                .addGap(14, 14, 14)
                .addComponent(lblDonProfileTitle1)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRid)
                    .addComponent(txtDRid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDRid1)
                    .addComponent(cbVol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(btnAssign)
                .addContainerGap(144, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDRidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDRidFocusLost
        // TODO add your handling code here:

    }//GEN-LAST:event_txtDRidFocusLost

    private void txtDRidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDRidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDRidKeyReleased

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblFdReqs.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a request");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblFdReqs.getModel();
        Reqorder selectedR = (Reqorder)model.getValueAt(selectedRowIndex, 0);
        txtDRid.setText(selectedR.getReqOrderId());
        ArrayList<String> VolunteerList = new ArrayList();
        for (Volunteer vol : ecosystem.getVolDir().getVolunteerList()){
            VolunteerList.add(vol.getVolName());
        }
        cbVol.setModel(new DefaultComboBoxModel<String>(VolunteerList.toArray(new String[0])));
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblFdReqs.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a request");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblFdReqs.getModel();
        Reqorder selectedR = (Reqorder)model.getValueAt(selectedRowIndex, 0);
        volname= cbVol.getSelectedItem().toString();
        selectedR.setReqVol(cbVol.getSelectedItem().toString());
        selectedR.setReqOrderStatus("Assigned to Volunteer");
        for(Volunteer v:ecosystem.getVolDir().getVolunteerList()){
            if(v.getVolName().equals(volname)){
                v.setVolAvail("No");
            }
        }
        JOptionPane.showMessageDialog(this, "Pickup Request Assigned to Volunteer Successfully!");
    }//GEN-LAST:event_btnAssignActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnSend;
    private javax.swing.JComboBox<String> cbVol;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDRid1;
    private javax.swing.JLabel lblDonProfileTitle;
    private javax.swing.JLabel lblDonProfileTitle1;
    private javax.swing.JLabel lblRid;
    private javax.swing.JTable tblFdReqs;
    private javax.swing.JTextField txtDRid;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblFdReqs.getModel();
        model.setRowCount(0);
        for(Reqorder rq: ecosystem.getReqorderDirectory().getReqOrderList()){
           Object[] row = new Object[5];
           row[0] =rq;
           row[1] =rq.getReqName();
           row[2] =rq.getReqOrderQuant();
           row[3] =rq.getReqOrderType();
           row[4] =rq.getReqOrderStatus();
           model.addRow(row);
        } 
    }
}
