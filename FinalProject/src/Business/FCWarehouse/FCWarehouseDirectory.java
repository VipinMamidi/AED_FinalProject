/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCWarehouse;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class FCWarehouseDirectory {
     ArrayList<FCWarehouse> fcwList = new ArrayList<FCWarehouse>();

    public ArrayList<FCWarehouse> getFcwList() {
        return fcwList;
    }

    public void setFcwList(ArrayList<FCWarehouse> fcwList) {
        this.fcwList = fcwList;
    }
    public void addNewFCWarehouse(FCWarehouse fcw){
        fcwList.add(fcw);
    }
    public void deleteFCWarehouse(FCWarehouse selectedfcw){
        fcwList.remove(selectedfcw);
    }
}
