/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGOVolunteer;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class VolRequestsDirectory {
    private ArrayList<VolRequests> vrList= new ArrayList<VolRequests>();
    public VolRequestsDirectory(){
        vrList = new ArrayList();
    }

    public ArrayList<VolRequests> getVrList() {
        return vrList;
    }

    public void setVrList(ArrayList<VolRequests> vrList) {
        this.vrList = vrList;
    }
     public void addVR(VolRequests vr) {
        vrList.add(vr);
    }
}
