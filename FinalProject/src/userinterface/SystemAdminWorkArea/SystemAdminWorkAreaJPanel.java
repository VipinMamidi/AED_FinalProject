/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;

import Business.Organization;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author MyPC1
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.ecosystem=ecosystem;
       
    }
    
  
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        MenubarPanel = new javax.swing.JPanel();
        btnMgWH = new javax.swing.JButton();
        btnMgPT = new javax.swing.JButton();
        btnMgUsers = new javax.swing.JButton();
        lblwelusername = new javax.swing.JLabel();
        lblWelcomemsg = new javax.swing.JLabel();
        btnMgNGO = new javax.swing.JButton();
        WorkAreaPanel = new javax.swing.JPanel();

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        btnMgWH.setBackground(new java.awt.Color(225, 144, 108));
        btnMgWH.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgWH.setText("Manage Warehouse");
        btnMgWH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgWHActionPerformed(evt);
            }
        });

        btnMgPT.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgPT.setText("Manage Pantry");
        btnMgPT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgPTActionPerformed(evt);
            }
        });

        btnMgUsers.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgUsers.setText("Manage Users");

        lblwelusername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblwelusername.setText("System Admin !");

        lblWelcomemsg.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblWelcomemsg.setText("Welcome,");

        btnMgNGO.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnMgNGO.setText("Manage NGO");
        btnMgNGO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMgNGOActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenubarPanelLayout = new javax.swing.GroupLayout(MenubarPanel);
        MenubarPanel.setLayout(MenubarPanelLayout);
        MenubarPanelLayout.setHorizontalGroup(
            MenubarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenubarPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(btnMgWH)
                .addGap(98, 98, 98)
                .addComponent(btnMgPT)
                .addGap(121, 121, 121)
                .addComponent(btnMgNGO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(btnMgUsers)
                .addGap(55, 55, 55))
            .addGroup(MenubarPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblWelcomemsg)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblwelusername)
                .addGap(382, 382, 382))
        );
        MenubarPanelLayout.setVerticalGroup(
            MenubarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenubarPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenubarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblwelusername)
                    .addComponent(lblWelcomemsg))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenubarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMgUsers)
                    .addComponent(btnMgWH)
                    .addComponent(btnMgPT)
                    .addComponent(btnMgNGO))
                .addGap(15, 15, 15))
        );

        jSplitPane1.setLeftComponent(MenubarPanel);

        WorkAreaPanel.setPreferredSize(new java.awt.Dimension(1000, 700));

        javax.swing.GroupLayout WorkAreaPanelLayout = new javax.swing.GroupLayout(WorkAreaPanel);
        WorkAreaPanel.setLayout(WorkAreaPanelLayout);
        WorkAreaPanelLayout.setHorizontalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 998, Short.MAX_VALUE)
        );
        WorkAreaPanelLayout.setVerticalGroup(
            WorkAreaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        jSplitPane1.setRightComponent(WorkAreaPanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1002, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 44, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnMgWHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgWHActionPerformed
        // TODO add your handling code here:
        ManageWarehousePanel objWH = new ManageWarehousePanel(userProcessContainer,ecosystem);
        userProcessContainer.add("Manage Warehouse",objWH);
        CardLayout crdlyt = (CardLayout) userProcessContainer.getLayout();
        crdlyt.next(userProcessContainer);
    }//GEN-LAST:event_btnMgWHActionPerformed

    private void btnMgPTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgPTActionPerformed
        // TODO add your handling code here:
        ManagePantryPanel objFCP = new ManagePantryPanel(userProcessContainer,ecosystem);
        userProcessContainer.add("Manage Pantry",objFCP);
        CardLayout crdlyt = (CardLayout) userProcessContainer.getLayout();
        crdlyt.next(userProcessContainer);
    }//GEN-LAST:event_btnMgPTActionPerformed

    private void btnMgNGOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMgNGOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMgNGOActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MenubarPanel;
    private javax.swing.JPanel WorkAreaPanel;
    private javax.swing.JButton btnMgNGO;
    private javax.swing.JButton btnMgPT;
    private javax.swing.JButton btnMgUsers;
    private javax.swing.JButton btnMgWH;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblWelcomemsg;
    private javax.swing.JLabel lblwelusername;
    // End of variables declaration//GEN-END:variables
}
