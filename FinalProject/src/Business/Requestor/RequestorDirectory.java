/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Requestor;

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
    
}
