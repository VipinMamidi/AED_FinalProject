/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donor;

import Business.Requestor.Requestor;
import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class DonorDirectory {
    private ArrayList<Donor> donorList;
    
    public DonorDirectory(){
        donorList = new ArrayList();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public void setDonorList(ArrayList<Donor> donorList) {
        this.donorList = donorList;
    }
    
    public void addDonDir(Donor dd) {
        donorList.add(dd);
    }
    
    public void removeDonor(Donor d) {
        this.donorList.remove(d);
    }

    public void removeDonByIndex(int index) {
        donorList.remove(index);
    }

    public Donor getDonorDetailsByIndex(int index) {
        return donorList.get(index);
    }
    
    int donIdGeneration = 1000;

    public int generateDonOrderId() {
        donIdGeneration++;
        return donIdGeneration;
    }
    public String getdonState(String name){
        for(Donor d: donorList){
            if(d.getDonorAccount().getUsername().equals(name)){
                return d.getDonorState();
            }
        }
        return null;
    }
}
