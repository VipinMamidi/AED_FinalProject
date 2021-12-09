/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donor.DonorDirectory;
import Business.Requestor.RequestorDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    //private RestaurantDirectory restaurantDirectory;
    //private CustomerDirectory customerDirectory;
    //private DeliveryManDirectory deliveryManDirectory;
    
    private RequestorDirectory reqDir;
    private DonorDirectory donDir;

    public EcoSystem(RequestorDirectory reqDir, DonorDirectory donDir) {

        this.reqDir = reqDir;
        this.donDir = donDir;
       
    }

    public RequestorDirectory getReqDir() {
        return reqDir;
    }

    public void setReqDir(RequestorDirectory reqDir) {
        this.reqDir = reqDir;
    }

    public DonorDirectory getDonDir() {
        return donDir;
    }

    public void setDonDir(DonorDirectory donDir) {
        this.donDir = donDir;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super("Food Cloud");
         this.reqDir =  new RequestorDirectory();
        this.donDir = new DonorDirectory();
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
}
