/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.FCWarehouse.FCWarehouse;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sowmyachinimilli
 */
public class AddWarehousePanel extends javax.swing.JPanel {

    /**
     * Creates new form AddWarehousePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    public AddWarehousePanel(JPanel userProcessContainer,EcoSystem ecosystem) {
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

        lblAddWHTitle = new javax.swing.JLabel();
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
        lblFCApwd1 = new javax.swing.JLabel();
        txtFCApwd1 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblWHid = new javax.swing.JLabel();
        txtWHid = new javax.swing.JTextField();
        lblWHid1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(840, 600));

        lblAddWHTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddWHTitle.setText("Add Warehouse");

        lblWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHname.setText("Warehouse Name*");

        txtWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHname.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHPhno.setText("Phone Number*");

        txtWHPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHPhno.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHAdd.setText("Address*");

        txtWHAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHAdd.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHCity.setText("City*");

        txtWHCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHCity.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHState.setText("State*");

        txtWHState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHState.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHZip.setText("Zipcode*");

        txtWHZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHZip.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHFCAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHFCAdmin.setText("FoodCloudAdmin*");

        txtWHFCAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHFCAdmin.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCAuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCAuname.setText("FCAdmin Username*");

        txtFCAuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCAuname.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCApwd.setText("Password*");

        txtFCApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCApwd.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCApwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCApwd1.setText("Confirm Password*");

        txtFCApwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCApwd1.setPreferredSize(new java.awt.Dimension(150, 25));

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblWHid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHid.setText("Warehouse Id*");

        txtWHid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHid.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHid1.setText("fcw");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(lblAddWHTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblWHPhno)
                                    .addComponent(lblWHAdd)
                                    .addComponent(lblWHCity)
                                    .addComponent(lblWHState)
                                    .addComponent(lblWHZip)
                                    .addComponent(lblFCAuname, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblFCApwd)
                                    .addComponent(lblFCApwd1)
                                    .addComponent(lblWHFCAdmin)
                                    .addComponent(lblWHname)
                                    .addComponent(lblWHid))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblWHid1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtWHid, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtWHname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHCity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHState, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHZip, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtWHFCAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFCAuname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtFCApwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnSubmit)))))
                .addContainerGap(294, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(lblAddWHTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHid)
                    .addComponent(txtWHid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWHid1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHname)
                    .addComponent(txtWHname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHPhno)
                    .addComponent(txtWHPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHAdd)
                    .addComponent(txtWHAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWHCity))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHState)
                    .addComponent(txtWHState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHZip)
                    .addComponent(txtWHZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHFCAdmin)
                    .addComponent(txtWHFCAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCAuname)
                    .addComponent(txtFCAuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCApwd)
                    .addComponent(txtFCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCApwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCApwd1))
                .addGap(27, 27, 27)
                .addComponent(btnSubmit)
                .addGap(27, 27, 27))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
        String role = "FCAdmin";
        FCWarehouse fcw=new FCWarehouse();
       // fcw.setFcwId("fcw"+);
        fcw.setFcwName(txtWHname.getText());
        fcw.setFcwPhno(txtWHPhno.getText());
        fcw.setFcwAddres(txtWHAdd.getText());
        fcw.setFcwCity(txtWHCity.getText());
        fcw.setFcwState(txtWHState.getText());
        fcw.setFcwZipcode(txtWHZip.getText());
        fcw.setFcwAdmin(txtWHFCAdmin.getText());
        UserAccount fcwAccount=new UserAccount();
        fcwAccount.setUsername(txtFCAuname.getText());
        fcwAccount.setPassword(txtFCApwd.getText());
      //  fcwAccount.setRole(new FCAdminRole());
        fcw.setFcwAccount(fcwAccount);
       // ecosystem.getFCWDirectory().addNewFCWarehouse(fcw);
       JOptionPane.showMessageDialog(this, "Food Cloud Warehouse added successfully!");
       clearfields(); 
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddWHTitle;
    private javax.swing.JLabel lblFCApwd;
    private javax.swing.JLabel lblFCApwd1;
    private javax.swing.JLabel lblFCAuname;
    private javax.swing.JLabel lblWHAdd;
    private javax.swing.JLabel lblWHCity;
    private javax.swing.JLabel lblWHFCAdmin;
    private javax.swing.JLabel lblWHPhno;
    private javax.swing.JLabel lblWHState;
    private javax.swing.JLabel lblWHZip;
    private javax.swing.JLabel lblWHid;
    private javax.swing.JLabel lblWHid1;
    private javax.swing.JLabel lblWHname;
    private javax.swing.JTextField txtFCApwd;
    private javax.swing.JTextField txtFCApwd1;
    private javax.swing.JTextField txtFCAuname;
    private javax.swing.JTextField txtWHAdd;
    private javax.swing.JTextField txtWHCity;
    private javax.swing.JTextField txtWHFCAdmin;
    private javax.swing.JTextField txtWHPhno;
    private javax.swing.JTextField txtWHState;
    private javax.swing.JTextField txtWHZip;
    private javax.swing.JTextField txtWHid;
    private javax.swing.JTextField txtWHname;
    // End of variables declaration//GEN-END:variables

    private void clearfields() {
        txtWHid.setText("");
        txtWHname.setText("");
        txtWHPhno.setText("");
        txtWHAdd.setText("");
        txtWHCity.setText("");
        txtWHState.setText("");
        txtWHZip.setText("");
        txtWHFCAdmin.setText("");
        txtFCAuname.setText("");
        txtFCApwd.setText("");
        txtFCApwd1.setText("");
    }

    private boolean nullCheck() {
        if(txtWHid.getText().length()!=0 && txtWHname.getText().length()!=0 && txtWHPhno.getText().length()!=0 
                && txtWHAdd.getText().length()!=0 && txtWHCity.getText().length()!=0 && txtWHState.getText().length()!=0
                && txtWHZip.getText().length()!=0 && txtWHFCAdmin.getText().length()!=0 && txtFCAuname.getText().length()!=0
                && txtFCApwd.getText().length()!=0 && txtFCApwd1.getText().length()!=0)
        {
            return false;
        }
        else return true;
    }
}
