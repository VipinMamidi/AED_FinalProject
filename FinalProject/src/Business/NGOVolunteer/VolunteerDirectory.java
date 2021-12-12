/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.NGOVolunteer;

import java.util.ArrayList;

/**
 *
 * @author sowmyachinimilli
 */
public class VolunteerDirectory {

    
    private ArrayList<Volunteer> volunteerList;
    
    public VolunteerDirectory(){
        volunteerList = new ArrayList();
    }
    
    public ArrayList<Volunteer> getVolunteerList() {
        return volunteerList;
    }

    public void setVolunteerList(ArrayList<Volunteer> volunteerList) {
        this.volunteerList = volunteerList;
    }
    
    public void addNewVolunteer(Volunteer vol){
        volunteerList.add(vol);
    }
    
    public void deleteVolunteer(Volunteer selectedvol){
        volunteerList.remove(selectedvol);
    }
}
