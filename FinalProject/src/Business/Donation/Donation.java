/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donation;

import Business.Donor.Donor;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sowmyachinimilli
 */
public class Donation {
    private String donatId;
    private String donatDname;
    private String donatFooditem;
    private String donatFoodQuant;
    private String donatPickuptype;
    private String donatStatus;
    private String donatWHname;
    private Donor donatDonor;
    private UserAccount donatDonorAcc;
    
    public String getDonatFooditem() {
        return donatFooditem;
    }

    public void setDonatFooditem(String donatFooditem) {
        this.donatFooditem = donatFooditem;
    }

    public String getDonatFoodQuant() {
        return donatFoodQuant;
    }

    public void setDonatFoodQuant(String donatFoodQuant) {
        this.donatFoodQuant = donatFoodQuant;
    }

    public Donor getDonatDonor() {
        return donatDonor;
    }

    public void setDonatDonor(Donor donatDonor) {
        this.donatDonor = donatDonor;
    }

    public UserAccount getDonatDonorAcc() {
        return donatDonorAcc;
    }

    public void setDonatDonorAcc(UserAccount donatDonorAcc) {
        this.donatDonorAcc = donatDonorAcc;
    }
    
    public String getDonatStatus() {
        return donatStatus;
    }

    public void setDonatStatus(String donatStatus) {
        this.donatStatus = donatStatus;
    }

    public String getDonatId() {
        return donatId;
    }

    public void setDonatId(String donatId) {
        this.donatId = donatId;
    }

    public String getDonatDname() {
        return donatDname;
    }

    public void setDonatDname(String donatDname) {
        this.donatDname = donatDname;
    }

    public String getDonatPickuptype() {
        return donatPickuptype;
    }

    public void setDonatPickuptype(String donatPickuptype) {
        this.donatPickuptype = donatPickuptype;
    }

    public String getDonatWHname() {
        return donatWHname;
    }

    public void setDonatWHname(String donatWHname) {
        this.donatWHname = donatWHname;
    }
    @Override
    public String toString(){
        return donatId;
    }
}
