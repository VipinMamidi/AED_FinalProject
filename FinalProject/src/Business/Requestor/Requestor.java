/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requestor;

import Business.UserAccount.UserAccount;

/**
 *
 * @author sowmyachinimilli
 */
public class Requestor {
    private int reqId;
    private String reqName;
    private String reqType;
    private long reqPhno;
    private String reqAddres;
    private String reqCity;
    private String reqState;
    private String reqZipcode;
    private String reqEmail;
    private UserAccount reqAccount;

    public int getReqId() {
        return reqId;
    }

    public void setReqId(int reqId) {
        this.reqId = reqId;
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public String getReqType() {
        return reqType;
    }

    public void setReqType(String reqType) {
        this.reqType = reqType;
    }

    public long getReqPhno() {
        return reqPhno;
    }

    public void setReqPhno(long reqPhno) {
        this.reqPhno = reqPhno;
    }

    public String getReqAddres() {
        return reqAddres;
    }

    public void setReqAddres(String reqAddres) {
        this.reqAddres = reqAddres;
    }

    public String getReqCity() {
        return reqCity;
    }

    public void setReqCity(String reqCity) {
        this.reqCity = reqCity;
    }

    public String getReqState() {
        return reqState;
    }

    public void setReqState(String reqState) {
        this.reqState = reqState;
    }

    public String getReqZipcode() {
        return reqZipcode;
    }

    public void setReqZipcode(String reqZipcode) {
        this.reqZipcode = reqZipcode;
    }

    public String getReqEmail() {
        return reqEmail;
    }

    public void setReqEmail(String reqEmail) {
        this.reqEmail = reqEmail;
    }

    public UserAccount getReqAccount() {
        return reqAccount;
    }

    public void setReqAccount(UserAccount reqAccount) {
        this.reqAccount = reqAccount;
    }
    
}