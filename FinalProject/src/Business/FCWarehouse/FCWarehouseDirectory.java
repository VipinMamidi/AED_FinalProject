/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCWarehouse;

import java.util.ArrayList;
import Business.FCWarehouse.FCWarehouseDirectory;

/**
 *
 * @author sowmyachinimilli
 */
public class FCWarehouseDirectory {
     ArrayList<FCWarehouse> fcwList;

     public FCWarehouseDirectory(){
         fcwList = new ArrayList<FCWarehouse>();
     }
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
    public String getWHname(String FCAname){
        String WHname;
        for(FCWarehouse f: fcwList){
            if(f.getFcwAdmin().equals(FCAname)){
                return f.getFcwName();
            }
        }
        return null;
    }
}
