/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Reqorder;

import Business.Requestor.Requestor;
import Business.UserAccount.UserAccount;

/**
 *
 * @author sowmyachinimilli
 */
public class Reqorder {
    private String reqOrderId;
    private String reqName;
    private String reqOrderQuant;
    private String reqOrderType;
    private String reqOrderStatus;
    private String reqPantryName;
    private String reqVol;
    private String reqAdd;
    private String reqCity;
    private String reqZip;
    private UserAccount reqRequestorAcc;

    public String getReqVol() {
        return reqVol;
    }

    public void setReqVol(String reqVol) {
        this.reqVol = reqVol;
    }
    
    public String getReqOrderId() {
        return reqOrderId;
    }

    public void setReqOrderId(String reqOrderId) {
        this.reqOrderId = reqOrderId;
    }

    public String getReqName() {
        return reqName;
    }

    public void setReqName(String reqName) {
        this.reqName = reqName;
    }

    public String getReqOrderQuant() {
        return reqOrderQuant;
    }

    public void setReqOrderQuant(String reqOrderQuant) {
        this.reqOrderQuant = reqOrderQuant;
    }

    public String getReqOrderType() {
        return reqOrderType;
    }

    public void setReqOrderType(String reqOrderType) {
        this.reqOrderType = reqOrderType;
    }

    public String getReqOrderStatus() {
        return reqOrderStatus;
    }

    public void setReqOrderStatus(String reqOrderStatus) {
        this.reqOrderStatus = reqOrderStatus;
    }

    public String getReqPantryName() {
        return reqPantryName;
    }

    public void setReqPantryName(String reqPantryName) {
        this.reqPantryName = reqPantryName;
    }

    public String getReqAdd() {
        return reqAdd;
    }

    public void setReqAdd(String reqAdd) {
        this.reqAdd = reqAdd;
    }

    public String getReqCity() {
        return reqCity;
    }

    public void setReqCity(String reqCity) {
        this.reqCity = reqCity;
    }

    public String getReqZip() {
        return reqZip;
    }

    public void setReqZip(String reqZip) {
        this.reqZip = reqZip;
    }

    

    public UserAccount getReqRequestorAcc() {
        return reqRequestorAcc;
    }

    public void setReqRequestorAcc(UserAccount reqRequestorAcc) {
        this.reqRequestorAcc = reqRequestorAcc;
    }
     @Override
    public String toString(){
        return reqOrderId;
    } 
    
}
