/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.NGORole.NGOWorkAreaPanel;

/**
 *
 * @author aravindasagiraju
 */
public class NgoRole extends Role{
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new NGOWorkAreaPanel(userProcessContainer, account);
    }
}
