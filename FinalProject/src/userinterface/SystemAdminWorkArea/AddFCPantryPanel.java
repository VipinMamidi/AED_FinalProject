/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.FCPantry.FCPantry;
import Business.FCPantry.FCPantryDirectory;
import Business.Role.FCPManagerRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sowmyachinimilli
 */
public class AddFCPantryPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddFCPantryPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    FCPantryDirectory fcpd;
    UserAccountDirectory uad;
    public AddFCPantryPanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        if(ecosystem.getFCPDirectory() == null){
         ecosystem.setFCPDirectory( new FCPantryDirectory());
        }
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
        lblFCPpwd1 = new javax.swing.JLabel();
        txtFCPpwd1 = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblWHfcpname = new javax.swing.JLabel();
        txtWHfcpname = new javax.swing.JTextField();
        lblFCPid = new javax.swing.JLabel();
        txtFCPid = new javax.swing.JTextField();
        lblWHfcpname1 = new javax.swing.JLabel();
        lblFCPid1 = new javax.swing.JLabel();
        lblFCPname1 = new javax.swing.JLabel();
        lblFCPPhno1 = new javax.swing.JLabel();
        lblFCPAdd1 = new javax.swing.JLabel();
        lblFCPCity1 = new javax.swing.JLabel();
        lblFCPState1 = new javax.swing.JLabel();
        lblFCPZip1 = new javax.swing.JLabel();
        lblFCPManager1 = new javax.swing.JLabel();
        lblFCAuname1 = new javax.swing.JLabel();
        lblFCApwd2 = new javax.swing.JLabel();
        lblFCApwd3 = new javax.swing.JLabel();

        lblAddFCPTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblAddFCPTitle.setText("Add Pantry");

        lblFCPname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPname.setText("Pantry Name*");

        txtFCPname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPnameFocusLost(evt);
            }
        });

        lblFCPPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPPhno.setText("Phone Number*");

        txtFCPPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPPhno.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPPhno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPPhnoFocusLost(evt);
            }
        });

        lblFCPAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPAdd.setText("Address*");

        txtFCPAdd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPAdd.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCPCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPCity.setText("City*");

        txtFCPCity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPCity.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCPState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPState.setText("State*");

        txtFCPState.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPState.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCPStateActionPerformed(evt);
            }
        });

        lblFCPZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPZip.setText("Zipcode*");

        txtFCPZip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPZip.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPZip.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPZipFocusLost(evt);
            }
        });
        txtFCPZip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFCPZipActionPerformed(evt);
            }
        });

        lblFCPManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPManager.setText("FC Pantry Manager*");

        txtFCPManager.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPManager.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPManager.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPManagerFocusLost(evt);
            }
        });

        lblFCPuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPuname.setText("FCP Manager Username*");

        txtFCPuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPuname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPuname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPunameFocusLost(evt);
            }
        });

        lblFCPpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPpwd.setText("Password*");

        txtFCPpwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPpwd.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCPpwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPpwd1.setText("Confirm Password*");

        txtFCPpwd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPpwd1.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPpwd1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPpwd1FocusLost(evt);
            }
        });

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblWHfcpname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHfcpname.setText("Warehouse Name*");

        txtWHfcpname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHfcpname.setPreferredSize(new java.awt.Dimension(150, 25));
        txtWHfcpname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtWHfcpnameFocusLost(evt);
            }
        });

        lblFCPid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCPid.setText("Pantry Id*");

        txtFCPid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCPid.setPreferredSize(new java.awt.Dimension(150, 25));
        txtFCPid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFCPidFocusLost(evt);
            }
        });

        lblWHfcpname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPid1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPPhno1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPAdd1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPCity1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPState1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPZip1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCPManager1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCAuname1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCApwd2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        lblFCApwd3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(377, 377, 377)
                        .addComponent(lblAddFCPTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(btnSubmit))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblWHfcpname)
                                    .addComponent(lblFCPname)
                                    .addComponent(lblFCPPhno)
                                    .addComponent(lblFCPAdd)
                                    .addComponent(lblFCPCity)
                                    .addComponent(lblFCPState)
                                    .addComponent(lblFCPZip)
                                    .addComponent(lblFCPManager)
                                    .addComponent(lblFCPuname)
                                    .addComponent(lblFCPpwd)
                                    .addComponent(lblFCPpwd1)
                                    .addComponent(lblFCPid))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFCPname1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPPhno, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFCPPhno1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFCPAdd1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPCity, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFCPCity1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPState, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFCPState1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPZip, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFCPZip1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPManager, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFCPManager1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPpwd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblFCApwd2))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFCApwd3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPid, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblFCPid1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtWHfcpname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblWHfcpname1))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtFCPuname, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblFCAuname1)))))))
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblAddFCPTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHfcpname)
                    .addComponent(txtWHfcpname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblWHfcpname1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblFCPid)
                        .addComponent(txtFCPid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblFCPid1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFCPname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFCPname)
                            .addComponent(lblFCPname1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPPhno)
                    .addComponent(txtFCPPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCPPhno1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPAdd)
                    .addComponent(txtFCPAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCPAdd1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPCity)
                    .addComponent(txtFCPCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCPCity1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPState)
                    .addComponent(txtFCPState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCPState1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPZip)
                    .addComponent(txtFCPZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCPZip1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPManager)
                    .addComponent(txtFCPManager, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCPManager1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPuname)
                    .addComponent(txtFCPuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCAuname1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPpwd)
                    .addComponent(txtFCPpwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCApwd2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCPpwd1)
                    .addComponent(txtFCPpwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCApwd3))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFCPnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPnameFocusLost
        // TODO add your handling code here:
        if(!(txtFCPname.getText().matches("^[a-zA-Z]*$"))){
            lblFCPname1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblFCPname1.setText("");
        }
    }//GEN-LAST:event_txtFCPnameFocusLost

    private void txtFCPPhnoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPPhnoFocusLost
        // TODO add your handling code here:
        if(!(txtFCPPhno.getText().matches("^[0-9]*$")) || !(txtFCPPhno.getText().length()==10)) {
            lblFCPPhno1.setText("Please enter a valid phone number");
        }
        else{
            lblFCPPhno1.setText("");

        }
    }//GEN-LAST:event_txtFCPPhnoFocusLost

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

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if(!nullCheck()){
            UserAccountDirectory uaList = ecosystem.getUserAccountDirectory();
            Employee employee = new Employee();
            employee.setName(txtFCPname.getText());
            String role = "FCPManager";
            FCPantry fcp=new FCPantry();
            fcp.setFcpId("fcp"+txtFCPid.getText());
            fcp.setFcpWHname(txtWHfcpname.getText());
            fcp.setFcpName(txtFCPname.getText());
            fcp.setFcpPhno(txtFCPPhno.getText());
            fcp.setFcpAddres(txtFCPAdd.getText());
            fcp.setFcpCity(txtFCPCity.getText());
            fcp.setFcpState(txtFCPState.getText());
            fcp.setFcpZipcode(txtFCPZip.getText());
            fcp.setFcpManager(txtFCPManager.getText());
            UserAccount fcpAccount=new UserAccount();
            fcpAccount.setUsername(txtFCPuname.getText());
            fcpAccount.setPassword(txtFCPpwd.getText());
            fcpAccount.setRole(new FCPManagerRole());
            fcpAccount.setEmployee(employee);
            uad=ecosystem.getUserAccountDirectory();
            uad.createUserAccount(txtFCPuname.getText(), txtFCPpwd.getText(), employee, new FCPManagerRole());
            ecosystem.setUserAccountDirectory(uad);
            fcp.setFcpAccount(fcpAccount);
            fcpd = ecosystem.getFCPDirectory();
            fcpd.addNewFCPantry(fcp);
            ecosystem.setFCPDirectory(fcpd);
            
            //  fcpAccount.setRole(new FCAdminRole());
            //fcp.setFcpAccount(fcpAccount);
           // ecosystem.getFCPDirectory().addNewFCPantry(fcp);
            JOptionPane.showMessageDialog(this, "Food Cloud Pantry added successfully!");
            clearfields();
        }
        else{
            JOptionPane.showMessageDialog(this, "Please make sure that you have filled all mandatory fields");
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtWHfcpnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtWHfcpnameFocusLost
        // TODO add your handling code here:
        if(!(txtWHfcpname.getText().matches("^[a-zA-Z]*$"))){
            lblWHfcpname1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblWHfcpname1.setText("");
        }
    }//GEN-LAST:event_txtWHfcpnameFocusLost

    private void txtFCPStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCPStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCPStateActionPerformed

    private void txtFCPZipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFCPZipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFCPZipActionPerformed

    private void txtFCPidFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPidFocusLost
        // TODO add your handling code here:
        if((txtFCPid.getText().matches("^[a-zA-Z]*$"))){
            lblFCPid1.setText("Invalid input. Please enter only numbers");
        }
        else{
            lblFCPid1.setText("");
        }
    }//GEN-LAST:event_txtFCPidFocusLost

    private void txtFCPunameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPunameFocusLost
        // TODO add your handling code here:
        if(!(txtFCPuname.getText().matches("^[a-zA-Z]*$"))){
            lblFCAuname1.setText("Invalid input. Please enter only alphabets");
        }
        else{
            lblFCAuname1.setText("");
        }
    }//GEN-LAST:event_txtFCPunameFocusLost

    
    private void txtFCPpwd1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFCPpwd1FocusLost
        // TODO add your handling code here:
        if(!(txtFCPpwd.getText().equals(txtFCPpwd1.getText()))){
            lblFCApwd2.setText("Password Mismatch. Please verify the password entered.");
        }
        else{
            lblFCApwd2.setText("");
        }
    }//GEN-LAST:event_txtFCPpwd1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel lblAddFCPTitle;
    private javax.swing.JLabel lblFCApwd2;
    private javax.swing.JLabel lblFCApwd3;
    private javax.swing.JLabel lblFCAuname1;
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
    private javax.swing.JLabel lblWHfcpname;
    private javax.swing.JLabel lblWHfcpname1;
    private javax.swing.JTextField txtFCPAdd;
    private javax.swing.JTextField txtFCPCity;
    private javax.swing.JTextField txtFCPManager;
    private javax.swing.JTextField txtFCPPhno;
    private javax.swing.JTextField txtFCPState;
    private javax.swing.JTextField txtFCPZip;
    private javax.swing.JTextField txtFCPid;
    private javax.swing.JTextField txtFCPname;
    private javax.swing.JTextField txtFCPpwd;
    private javax.swing.JTextField txtFCPpwd1;
    private javax.swing.JTextField txtFCPuname;
    private javax.swing.JTextField txtWHfcpname;
    // End of variables declaration//GEN-END:variables

    private boolean nullCheck() {
        if(txtFCPid.getText().length()!=0 && txtFCPname.getText().length()!=0 && txtWHfcpname.getText().length()!=0 && 
                txtFCPPhno.getText().length()!=0 && txtFCPAdd.getText().length()!=0 && txtFCPCity.getText().length()!=0 && 
                txtFCPState.getText().length()!=0 && txtFCPZip.getText().length()!=0 && txtFCPManager.getText().length()!=0 && 
                txtFCPuname.getText().length()!=0 && txtFCPpwd.getText().length()!=0 && txtFCPpwd1.getText().length()!=0)
            {
                return false;
            }
            else return true;
        }

    private void clearfields() {
        txtFCPid.setText("");
        txtFCPname.setText("");
        txtWHfcpname.setText("");
        txtFCPPhno.setText("");
        txtFCPAdd.setText("");
        txtFCPCity.setText("");
        txtFCPState.setText("");
        txtFCPZip.setText("");
        txtFCPManager.setText("");
        txtFCPuname.setText("");
        txtFCPpwd.setText("");
        txtFCPpwd1.setText("");
    }
}
