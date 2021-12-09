/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.FCWarehouse.FCWarehouse;
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
    public ViewModifyWarehousePanel(JPanel userProcessContainer,EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        populateWHtable();
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

        btnEdit.setText("Edit");

        lblWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHname.setText("Warehouse Name");

        txtWHname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHname.setPreferredSize(new java.awt.Dimension(150, 25));

        lblWHPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHPhno.setText("Phone Number");

        txtWHPhno.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHPhno.setPreferredSize(new java.awt.Dimension(150, 25));

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

        lblWHFCAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblWHFCAdmin.setText("FoodCloudAdmin");

        txtWHFCAdmin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtWHFCAdmin.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCAuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCAuname.setText("FCAdmin Username");

        txtFCAuname.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCAuname.setPreferredSize(new java.awt.Dimension(150, 25));

        lblFCApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblFCApwd.setText("Password");

        txtFCApwd.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtFCApwd.setPreferredSize(new java.awt.Dimension(150, 25));

        btnUpdate.setText("Update");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(237, Short.MAX_VALUE)
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
                    .addComponent(txtWHAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111)
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
                        .addGap(330, 330, 330)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblAddWHTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDelete)
                            .addComponent(btnEdit)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWHname)
                            .addComponent(txtWHname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHPhno)
                    .addComponent(txtWHPhno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHAdd)
                    .addComponent(txtWHAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHCity)
                    .addComponent(txtWHCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHState)
                    .addComponent(txtWHState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHZip)
                    .addComponent(txtWHZip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWHFCAdmin)
                    .addComponent(txtWHFCAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFCAuname)
                    .addComponent(txtFCAuname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFCApwd, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpdate)
                .addContainerGap(26, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddWHTitle;
    private javax.swing.JLabel lblFCApwd;
    private javax.swing.JLabel lblFCAuname;
    private javax.swing.JLabel lblWHAdd;
    private javax.swing.JLabel lblWHCity;
    private javax.swing.JLabel lblWHFCAdmin;
    private javax.swing.JLabel lblWHPhno;
    private javax.swing.JLabel lblWHState;
    private javax.swing.JLabel lblWHZip;
    private javax.swing.JLabel lblWHname;
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
      /*  for(FCWarehouse fcwh: ecosystem.getFCWDirectory().getFcwList()){
           Object[] row = new Object[8];
           row[0] =fcwh;
           row[1] =fcwh.getFcwName();
           row[2] =fcwh.getFcwPhno();
           row[3] =fcwh.getFcwAddres();
           row[4] =fcwh.getFcwCity();
           row[5] =fcwh.getFcwState();
           row[6] =fcwh.getFcwZipcode();
           row[7] =fcwh.getFcwAdmin();
        } */
    }
}
