/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface;

import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author vipinmamidi
 */
public class HomeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomeJPanel
     */
    JPanel userProcessContainer;
    public HomeJPanel(JPanel userProcessContainer) throws IOException {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        
        imageLbl.setMinimumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
        imageLbl.setPreferredSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
        imageLbl.setMaximumSize(new Dimension(userProcessContainer.getWidth(), userProcessContainer.getHeight()));
        
        Image img = ImageIO.read(getClass().getResource("/Images/background.png"));
        
        Image newimg = img.getScaledInstance( userProcessContainer.getWidth(), userProcessContainer.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
        imageLbl.setIcon(new ImageIcon(newimg));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLbl = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1100, 900));
        setLayout(new java.awt.CardLayout());

        imageLbl.setPreferredSize(new java.awt.Dimension(333, 400));
        add(imageLbl, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLbl;
    // End of variables declaration//GEN-END:variables
}
