/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Donation.DonationDirectory;
import Business.Donor.DonorDirectory;
import Business.FCPantry.FCPantryDirectory;
import Business.FCPantry.FCPantryItemsDirectory;
import Business.FCWarehouse.FCWarehouse;
import Business.FCWarehouse.FCWarehouseDirectory;
import Business.NGO.NGODirectory;
import Business.Reqorder.ReqorderDirectory;
import Business.Requestor.RequestorDirectory;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.DonorRole;
import Business.Role.NgoRole;
import Business.Role.RequestorRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
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
    private FCWarehouseDirectory fcwDir;
    private NGODirectory ngoDir;
    private FCPantryDirectory fcpDir;
    private UserAccountDirectory uaDir;
    private FCPantryItemsDirectory fcpiDir;
    private DonationDirectory donatDir;
    private ReqorderDirectory reqorderDir;
    
    public static EcoSystem getBusiness() {
        return business;
    }

    public static void setBusiness(EcoSystem business) {
        EcoSystem.business = business;
    }
    


    public EcoSystem(RequestorDirectory reqDir, DonorDirectory donDir, FCWarehouseDirectory fcwDir, NGODirectory ngoDir) { // to add ngo directory


        this.reqDir = reqDir;
        this.donDir = donDir;
        this.fcwDir = fcwDir;
        this.ngoDir = ngoDir;
       
       // this.fcpDir = fcpDir;
       // this.uaDir = uaDir;
       //this.fcpiDir = fcpiDir;
       //this.donatDit = doantDir;
       //this.reqorderDir = reqorderDir;
    }

    public NGODirectory getNgoDir() {
        return ngoDir;
    }

    public void setNgoDir(NGODirectory ngoDir) {
        this.ngoDir = ngoDir;
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
        roleList.add(new RequestorRole());
        roleList.add(new DonorRole());
        roleList.add(new NgoRole());
        
        return roleList;
    }
    private EcoSystem(){
        super("Food Cloud");
         this.reqDir =  new RequestorDirectory();
        this.donDir = new DonorDirectory();
        this.fcwDir = new FCWarehouseDirectory();
        this.ngoDir = new NGODirectory();
        this.fcpDir = new FCPantryDirectory();
        this.uaDir = new UserAccountDirectory();
        this.fcpiDir = new FCPantryItemsDirectory();
        this.donatDir = new DonationDirectory();
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
      UserAccountDirectory usersList = business.getUserAccountDirectory();
        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();
        
        for(UserAccount ua : userAccounts)
        {
            if(ua.getUsername().equals(userName))
                return false;
        }
        
       return true;
    }
    public FCWarehouseDirectory getFCWDirectory(){
        return fcwDir;
    }
    public void setFCWDirectory(FCWarehouseDirectory fcd){
        this.fcwDir = fcd;
    }
    public FCPantryDirectory getFCPDirectory(){
        return fcpDir;
    }
    public void setFCPDirectory(FCPantryDirectory fcp){
        this.fcpDir = fcp;
    }
    public void setUserAccountDirectory(UserAccountDirectory uad){
        this.uaDir=uad;
    }
    public FCPantryItemsDirectory getFCPIDirectory(){
        return fcpiDir;
    }
    public void setFCPIDirectory(FCPantryItemsDirectory fcpid){
        this.fcpiDir = fcpid;
    }
    public DonationDirectory getDonatDirectory(){
        return donatDir;
    }
    public void setDonatDirectory(DonationDirectory donatDir){
        this.donatDir = donatDir;
    }
    public ReqorderDirectory getReqorderDirectory(){
        return reqorderDir;
    }
    public void setReqorderDirectory(ReqorderDirectory reqorderDir){
        this.reqorderDir = reqorderDir;
    }
}
