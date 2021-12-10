/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCWarehouse;

import Business.UserAccount.UserAccount;

/**
 *
 * @author sowmyachinimilli
 */
public class FCWarehouse {
    private String fcwId;
    private String fcwName;
    private String fcwPhno;
    private String fcwAddres;
    private String fcwCity;
    private String fcwState;
    private String fcwZipcode;
    private String fcwAdmin;
    private UserAccount fcwAccount;

    public String getFcwId() {
        return fcwId;
    }

    public void setFcwId(String fcwId) {
        this.fcwId = fcwId;
    }

    

    public String getFcwName() {
        return fcwName;
    }

    public void setFcwName(String fcwName) {
        this.fcwName = fcwName;
    }

    public String getFcwPhno() {
        return fcwPhno;
    }

    public void setFcwPhno(String fcwPhno) {
        this.fcwPhno = fcwPhno;
    }

    public String getFcwAddres() {
        return fcwAddres;
    }

    public void setFcwAddres(String fcwAddres) {
        this.fcwAddres = fcwAddres;
    }

    public String getFcwCity() {
        return fcwCity;
    }

    public void setFcwCity(String fcwCity) {
        this.fcwCity = fcwCity;
    }

    public String getFcwState() {
        return fcwState;
    }

    public void setFcwState(String fcwState) {
        this.fcwState = fcwState;
    }

    public String getFcwZipcode() {
        return fcwZipcode;
    }

    public void setFcwZipcode(String fcwZipcode) {
        this.fcwZipcode = fcwZipcode;
    }

    public String getFcwAdmin() {
        return fcwAdmin;
    }

    public void setFcwAdmin(String fcwAdmin) {
        this.fcwAdmin = fcwAdmin;
    }

    public UserAccount getFcwAccount() {
        return fcwAccount;
    }

    public void setFcwAccount(UserAccount fcwAccount) {
        this.fcwAccount = fcwAccount;
    }
   @Override
    public String toString(){
        return fcwId;
    }
}
