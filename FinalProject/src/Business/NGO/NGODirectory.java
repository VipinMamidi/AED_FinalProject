/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGO;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class NGODirectory {
    private ArrayList<NGO> ngoList;
    
    public NGODirectory(){
        ngoList = new ArrayList();
    }

    public ArrayList<NGO> getNgoList() {
        return ngoList;
    }

    public void setNgoList(ArrayList<NGO> ngoList) {
        this.ngoList = ngoList;
    }
    
    public void addNewNGO(NGO ngo){
        ngoList.add(ngo);
    }
    
    public void deleteNGO(NGO selectedngo){
        ngoList.remove(selectedngo);
    }

}
