/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;
import Business.EcoSystem;

import Business.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.RequestorRole.RequestorAreaJPanel;

/**
 *
 * @author vipinmamidi
 */
public class RequestorRole extends Role{
    
     public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business, JPanel jp, JSplitPane jsp) {
        return new RequestorAreaJPanel(userProcessContainer,business, account, jp, jsp);
    }
    
}
