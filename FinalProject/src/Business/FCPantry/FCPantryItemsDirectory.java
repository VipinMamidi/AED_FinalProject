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
public class FCPantryItemsDirectory {
    private ArrayList<FCPantryItems> fcpiList;

    public FCPantryItemsDirectory(){
        fcpiList = new ArrayList<FCPantryItems>();
    }
    public ArrayList<FCPantryItems> getFcpiList() {
        return fcpiList;
    }

    public void setFcpiList(ArrayList<FCPantryItems> fcpiList) {
        this.fcpiList = fcpiList;
    }
    public void addFCPItems(FCPantryItems fcpi){
        fcpiList.add(fcpi);
    }
    public void deleteFCPItems(FCPantryItems selectedfcpi){
        fcpiList.remove(selectedfcpi);
    }
}
