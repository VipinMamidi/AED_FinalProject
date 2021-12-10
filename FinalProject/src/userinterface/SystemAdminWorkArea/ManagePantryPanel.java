/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import javax.swing.JPanel;

/**
 *
 * @author sowmyachinimilli
 */
public class ManagePantryPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManagePantryPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public ManagePantryPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SplitPaneFCP = new javax.swing.JSplitPane();
        SysAdminControlPanel = new javax.swing.JPanel();
        btnAddFCP = new javax.swing.JButton();
        btnViewFCP = new javax.swing.JButton();
        SysAdminWorkareaPanel = new javax.swing.JPanel();

        SysAdminControlPanel.setPreferredSize(new java.awt.Dimension(150, 600));

        btnAddFCP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnAddFCP.setText("Add FC Pantry");
        btnAddFCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFCPActionPerformed(evt);
            }
        });

        btnViewFCP.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnViewFCP.setText("View/Modify");
        btnViewFCP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewFCPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout SysAdminControlPanelLayout = new javax.swing.GroupLayout(SysAdminControlPanel);
        SysAdminControlPanel.setLayout(SysAdminControlPanelLayout);
        SysAdminControlPanelLayout.setHorizontalGroup(
            SysAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysAdminControlPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SysAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAddFCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewFCP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SysAdminControlPanelLayout.setVerticalGroup(
            SysAdminControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SysAdminControlPanelLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btnAddFCP)
                .addGap(26, 26, 26)
                .addComponent(btnViewFCP)
                .addContainerGap(449, Short.MAX_VALUE))
        );

        SplitPaneFCP.setLeftComponent(SysAdminControlPanel);

        SysAdminWorkareaPanel.setPreferredSize(new java.awt.Dimension(840, 600));

        javax.swing.GroupLayout SysAdminWorkareaPanelLayout = new javax.swing.GroupLayout(SysAdminWorkareaPanel);
        SysAdminWorkareaPanel.setLayout(SysAdminWorkareaPanelLayout);
        SysAdminWorkareaPanelLayout.setHorizontalGroup(
            SysAdminWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 834, Short.MAX_VALUE)
        );
        SysAdminWorkareaPanelLayout.setVerticalGroup(
            SysAdminWorkareaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        SplitPaneFCP.setRightComponent(SysAdminWorkareaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFCP, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SplitPaneFCP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddFCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFCPActionPerformed
        // TODO add your handling code here:
        AddFCPantryPanel objAddFCP = new AddFCPantryPanel(userProcessContainer,ecosystem);
        SplitPaneFCP.setRightComponent(objAddFCP);
    }//GEN-LAST:event_btnAddFCPActionPerformed

    private void btnViewFCPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewFCPActionPerformed
        // TODO add your handling code here:
        ViewModifyPantryPanel objViewFCP = new ViewModifyPantryPanel(userProcessContainer,ecosystem);
        SplitPaneFCP.setRightComponent(objViewFCP);
    }//GEN-LAST:event_btnViewFCPActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPaneFCP;
    private javax.swing.JPanel SysAdminControlPanel;
    private javax.swing.JPanel SysAdminWorkareaPanel;
    private javax.swing.JButton btnAddFCP;
    private javax.swing.JButton btnViewFCP;
    // End of variables declaration//GEN-END:variables
}
