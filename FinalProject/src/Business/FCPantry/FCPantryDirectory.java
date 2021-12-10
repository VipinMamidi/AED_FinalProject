/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCPantry;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class FCPantryDirectory {
    private ArrayList<FCPantry> fcpList;
    
    public FCPantryDirectory(){
        fcpList = new ArrayList();
    }

    public ArrayList<FCPantry> getFcpList() {
        return fcpList;
    }

    public void setFcpList(ArrayList<FCPantry> fcpList) {
        this.fcpList = fcpList;
    }
     public void addNewFCPantry(FCPantry fcp){
        fcpList.add(fcp);
    }
    public void deleteFCPantry(FCPantry selectedfcp){
        fcpList.remove(selectedfcp);
    }
}
