/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donor;

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
    
}
