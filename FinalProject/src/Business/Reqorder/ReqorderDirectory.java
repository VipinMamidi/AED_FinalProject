/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Reqorder;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class ReqorderDirectory {
    private ArrayList<Reqorder> reqOrderList;
    
    public ReqorderDirectory(){
        reqOrderList = new ArrayList();
    }

    public ArrayList<Reqorder> getReqOrderList() {
        return reqOrderList;
    }

    public void setReqOrderList(ArrayList<Reqorder> reqOrderList) {
        this.reqOrderList = reqOrderList;
    }
     public void addNewReqorder(Reqorder rq){
        reqOrderList.add(rq);
    }
    public void deleteReqorder(Reqorder selectedD){
        reqOrderList.remove(selectedD);
    }
}
