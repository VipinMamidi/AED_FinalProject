/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requestor;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class RequestorDirectory {
    private ArrayList<Requestor> reqAccList;
    
    public RequestorDirectory(){
        reqAccList = new ArrayList();
    }

    public ArrayList<Requestor> getReqAccList() {
        return reqAccList;
    }

    public void setReqAccList(ArrayList<Requestor> reqAccList) {
        this.reqAccList = reqAccList;
    }
    
    public void addReqDir(Requestor ro) {
        reqAccList.add(ro);
    }
    
    public void removeRequestor(Requestor r) {
        this.reqAccList.remove(r);
    }

    public void removeReqByIndex(int index) {
        reqAccList.remove(index);
    }

    public Requestor getRestDetailsByIndex(int index) {
        return reqAccList.get(index);
    }
    
    int reqIdGeneration = 1000;

    public int generateOrderId() {
        reqIdGeneration++;
        return reqIdGeneration;
    }
    
}
