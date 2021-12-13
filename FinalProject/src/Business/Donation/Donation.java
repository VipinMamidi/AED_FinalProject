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
    private String donatVol;
    private String donatWHname;
    private String donatAdd;
    private String donatCity;
    private String donatZip;
    private UserAccount donatDonorAcc;

    public String getDonatAdd() {
        return donatAdd;
    }

    public void setDonatAdd(String donatAdd) {
        this.donatAdd = donatAdd;
    }

    public String getDonatCity() {
        return donatCity;
    }

    public void setDonatCity(String donatCity) {
        this.donatCity = donatCity;
    }

    public String getDonatZip() {
        return donatZip;
    }

    public void setDonatZip(String donatZip) {
        this.donatZip = donatZip;
    }

    public String getDonatVol() {
        return donatVol;
    }

    public void setDonatVol(String donatVol) {
        this.donatVol = donatVol;
    }
    
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
