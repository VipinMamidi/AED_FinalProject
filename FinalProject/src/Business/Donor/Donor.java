/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author sowmyachinimilli
 */
public class Donor {
    private int donorId;
    private String donorName;
    private String donorType;
    private String donorPhno;
    private String donorAddres;
    private String donorCity;
    private String donorState;
    private String donorZipcode;
    private String donorEmail;
    private UserAccount donorAccount;
    private String donUserName;
     private String donPwd;

    public String getDonUserName() {
        return donUserName;
    }

    public void setDonUserName(String donUserName) {
        this.donUserName = donUserName;
    }

    public String getDonPwd() {
        return donPwd;
    }

    public void setDonPwd(String donPwd) {
        this.donPwd = donPwd;
    }

    
    
    
    public Donor(UserAccount ua)
    {
        this.donorAccount = ua;
        this.donUserName = ua.getUsername();
        this.donPwd = ua.getPassword();
                
    }

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
    }

    public String getDonorName() {
        return donorName;
    }

    public void setDonorName(String donorName) {
        this.donorName = donorName;
    }

    public String getDonorType() {
        return donorType;
    }

    public void setDonorType(String donorType) {
        this.donorType = donorType;
    }

    public String getDonorPhno() {
        return donorPhno;
    }

    public void setDonorPhno(String donorPhno) {
        this.donorPhno = donorPhno;
    }

    public String getDonorAddres() {
        return donorAddres;
    }

    public void setDonorAddres(String donorAddres) {
        this.donorAddres = donorAddres;
    }

    public String getDonorCity() {
        return donorCity;
    }

    public void setDonorCity(String donorCity) {
        this.donorCity = donorCity;
    }

    public String getDonorState() {
        return donorState;
    }

    public void setDonorState(String donorState) {
        this.donorState = donorState;
    }

    public String getDonorZipcode() {
        return donorZipcode;
    }

    public void setDonorZipcode(String donorZipcode) {
        this.donorZipcode = donorZipcode;
    }

    public String getDonorEmail() {
        return donorEmail;
    }

    public void setDonorEmail(String donorEmail) {
        this.donorEmail = donorEmail;
    }

    public UserAccount getDonorAccount() {
        return donorAccount;
    }

    public void setDonorAccount(UserAccount donorAccount) {
        this.donorAccount = donorAccount;
    }
    
}
