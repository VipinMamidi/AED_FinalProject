/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGOVolunteer;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class Volunteer {
    private String volId;
    private String volName;
    private String volAge;
    private String volPhno;
    private String volAddress;
    private String volCity;
    private String volState;
    private String volZipcode;
    private String volExp;
    //private ArrayList<String> volAvaildays;
    private UserAccount volAccount;
    private String volUserName;
    private String volPwd;

    public String getVolId() {
        return volId;
    }

    public void setVolId(String volId) {
        this.volId = volId;
    }

    public String getVolName() {
        return volName;
    }

    public void setVolName(String volName) {
        this.volName = volName;
    }

    public String getVolAge() {
        return volAge;
    }

    public void setVolAge(String volAge) {
        this.volAge = volAge;
    }

    public String getVolPhno() {
        return volPhno;
    }

    public void setVolPhno(String volPhno) {
        this.volPhno = volPhno;
    }

    public String getVolAddress() {
        return volAddress;
    }

    public void setVolAddress(String volAddress) {
        this.volAddress = volAddress;
    }

    public String getVolCity() {
        return volCity;
    }

    public void setVolCity(String volCity) {
        this.volCity = volCity;
    }

    public String getVolZipcode() {
        return volZipcode;
    }

    public void setVolZipcode(String volZipcode) {
        this.volZipcode = volZipcode;
    }

    public String getVolExp() {
        return volExp;
    }

    public void setVolExp(String volExp) {
        this.volExp = volExp;
    }

//    public ArrayList<String> getVolAvaildays() {
//        return volAvaildays;
//    }
//
//    public void setVolAvaildays(ArrayList<String> volAvaildays) {
//        this.volAvaildays = volAvaildays;
//    }
    
    
    public UserAccount getVolAccount() {
        return volAccount;
    }

    public void setVolAccount(UserAccount volAccount) {
        this.volAccount = volAccount;
    }

    public String getVolUserName() {
        return volUserName;
    }

    public void setVolUserName(String volUserName) {
        this.volUserName = volUserName;
    }

    public String getVolPwd() {
        return volPwd;
    }

    public void setVolPwd(String volPwd) {
        this.volPwd = volPwd;
    }
    
    
    public String getVolState() {
        return volState;
    }

    public void setVolState(String volState) {
        this.volState = volState;
    }
    
    @Override
    public String toString(){
        return volId;
    }
    
    
}
