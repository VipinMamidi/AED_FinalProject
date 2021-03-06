/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowmyachinimilli
 */
public class ManageUsersPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageUsers
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccountDirectory uad;
    public ManageUsersPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateUserTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblMgUsersTitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsers = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        lblUAname = new javax.swing.JLabel();
        txtUAname = new javax.swing.JTextField();
        lblUApwd = new javax.swing.JLabel();
        txtUApwd = new javax.swing.JTextField();
        lblUArole = new javax.swing.JLabel();
        txtUArole = new javax.swing.JTextField();
        lblUAemp = new javax.swing.JLabel();
        txtUAemp = new javax.swing.JTextField();

        lblMgUsersTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblMgUsersTitle.setText("View Users");

        tblUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Username", "Password", "Role", "Employee"
            }
        ));
        jScrollPane1.setViewportView(tblUsers);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        lblUAname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUAname.setText("User Name");

        txtUAname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUAname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtUAname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUAnameFocusLost(evt);
            }
        });
        txtUAname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUAnameKeyReleased(evt);
            }
        });

        lblUApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUApwd.setText("Password");

        txtUApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUApwd.setPreferredSize(new java.awt.Dimension(150, 25));
        txtUApwd.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUApwdFocusLost(evt);
            }
        });
        txtUApwd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUApwdKeyReleased(evt);
            }
        });

        lblUArole.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUArole.setText("Role");

        txtUArole.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUArole.setPreferredSize(new java.awt.Dimension(150, 25));
        txtUArole.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUAroleFocusLost(evt);
            }
        });
        txtUArole.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUAroleKeyReleased(evt);
            }
        });

        lblUAemp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblUAemp.setText("Employee");

        txtUAemp.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtUAemp.setPreferredSize(new java.awt.Dimension(150, 25));
        txtUAemp.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUAempFocusLost(evt);
            }
        });
        txtUAemp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUAempKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 865, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(332, 332, 332)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblUApwd)
                            .addComponent(lblUAname)
                            .addComponent(lblUArole)
                            .addComponent(lblUAemp))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUAname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUApwd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUArole, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUAemp, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(449, 449, 449)
                        .addComponent(lblMgUsersTitle)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMgUsersTitle)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDelete)
                    .addComponent(btnView))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUAname)
                    .addComponent(txtUAname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUApwd)
                    .addComponent(txtUApwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUArole)
                    .addComponent(txtUArole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUAemp)
                    .addComponent(txtUAemp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(173, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblUsers.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to Edit");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        UserAccount selectedUA = (UserAccount)model.getValueAt(selectedRowIndex, 0);
        txtUAname.setText(selectedUA.getUsername());
        txtUApwd.setText(selectedUA.getPassword());
        txtUArole.setText(String.valueOf(selectedUA.getRole()));
        txtUAemp.setText(String.valueOf(selectedUA.getEmployee()));
      
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblUsers.getSelectedRow();
        if(selectedRowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select a record to delete");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        UserAccount selectedUA = (UserAccount)model.getValueAt(selectedRowIndex, 0);
        /* // First delete the customer from employee
        this.system.getEmployeeDirectory().deleteEmployee(selectedRest.getResManagerName());
        // And thne delete the userAccount
        this.system.getUserAccountDirectory().deleteUserAcc(
            this.system.getRestaurantDirectory().getResList().
            get(selectedRowIndex).getUserAcc()
        );
        // finally delete the user from customer directory*/
        //ecosystem.getUserAccountDirectory().deleteUserAccount(selectedUA);
        uad= ecosystem.getUserAccountDirectory();
        uad.deleteUserAccount(selectedUA);
        ecosystem.setUserAccountDirectory(uad);
        JOptionPane.showMessageDialog(this, "User Account deleted Successfully");
        populateUserTable();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtUAnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUAnameFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUAnameFocusLost

    private void txtUAnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUAnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUAnameKeyReleased

    private void txtUApwdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUApwdFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUApwdFocusLost

    private void txtUApwdKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUApwdKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUApwdKeyReleased

    private void txtUAroleFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUAroleFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUAroleFocusLost

    private void txtUAroleKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUAroleKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUAroleKeyReleased

    private void txtUAempFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUAempFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUAempFocusLost

    private void txtUAempKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUAempKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUAempKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMgUsersTitle;
    private javax.swing.JLabel lblUAemp;
    private javax.swing.JLabel lblUAname;
    private javax.swing.JLabel lblUApwd;
    private javax.swing.JLabel lblUArole;
    private javax.swing.JTable tblUsers;
    private javax.swing.JTextField txtUAemp;
    private javax.swing.JTextField txtUAname;
    private javax.swing.JTextField txtUApwd;
    private javax.swing.JTextField txtUArole;
    // End of variables declaration//GEN-END:variables

    private void populateUserTable() {
        DefaultTableModel model = (DefaultTableModel) tblUsers.getModel();
        model.setRowCount(0);
        for(UserAccount ua: ecosystem.getUserAccountDirectory().getUserAccountList()){
           Object[] row = new Object[4];
           row[0] =ua;
           row[1] =ua.getPassword();
           row[2] =ua.getRole();
           row[3] =ua.getEmployee();
           model.addRow(row);
        }  
    }

    private void clearfields() {
        txtUAname.setText("");
        txtUApwd.setText("");
        txtUArole.setText("");
        txtUAemp.setText("");
    }
}
