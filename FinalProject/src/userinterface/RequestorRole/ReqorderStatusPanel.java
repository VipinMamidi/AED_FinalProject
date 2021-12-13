/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.RequestorRole;

import Business.EcoSystem;
import Business.Reqorder.Reqorder;
import Business.UserAccount.UserAccount;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sowmyachinimilli
 */
public class ReqorderStatusPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReqorderStatusPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAcc;
    public ReqorderStatusPanel(JPanel userProcessContainer,EcoSystem ecosystem,UserAccount userAcc) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAcc = userAcc;
        populateTable();
        setBG();
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
        tblReq = new javax.swing.JTable();
        LabelImg = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDonProfileTitle.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        lblDonProfileTitle.setText("My Food Cloud Requests");
        add(lblDonProfileTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(402, 14, -1, -1));

        tblReq.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Request Id", "Pantry", "Quantity", "Order Type", "Status"
            }
        ));
        jScrollPane1.setViewportView(tblReq);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 53, 1600, 153));
        add(LabelImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 1600, 840));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelImg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDonProfileTitle;
    private javax.swing.JTable tblReq;
    // End of variables declaration//GEN-END:variables

    public void setBG() {
        try {
            LabelImg.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
            LabelImg.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));

            Image img = ImageIO.read(getClass().getResource("/Images/blurbg.jpeg"));

            Image newimg = img.getScaledInstance(1650, userProcessContainer.getHeight(), java.awt.Image.SCALE_SMOOTH);
            LabelImg.setIcon(new ImageIcon(newimg));
        } catch (IOException ex) {
            Logger.getLogger(ReqorderStatusPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void populateTable() {
         DefaultTableModel model = (DefaultTableModel) tblReq.getModel();
        model.setRowCount(0);
        for(Reqorder rq: ecosystem.getReqorderDirectory().getReqOrderList()){
           Object[] row = new Object[5];
           row[0] =rq;
           row[1] =rq.getReqPantryName();
           row[2] =rq.getReqOrderQuant();
           row[3] =rq.getReqOrderType();
           row[4] =rq.getReqOrderStatus();
           model.addRow(row);
        } 
    }
}
