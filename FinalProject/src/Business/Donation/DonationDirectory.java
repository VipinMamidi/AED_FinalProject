/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Donation;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class DonationDirectory {
    private ArrayList<Donation> donatList;
    
    public DonationDirectory(){
        donatList = new ArrayList();
    }

    public ArrayList<Donation> getDonatList() {
        return donatList;
    }

    public void setDonatList(ArrayList<Donation> donatList) {
        this.donatList = donatList;
    }
     public void addNewDonation(Donation dt){
        donatList.add(dt);
    }
    public void deleteDonation(Donation selectedD){
        donatList.remove(selectedD);
    }
}
