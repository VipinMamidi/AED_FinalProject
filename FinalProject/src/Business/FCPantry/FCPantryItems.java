/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.FCPantry;

/**
 *
 * @author sowmyachinimilli
 */
public class FCPantryItems {
    private String fcpitemid;
    private String fcpWHname;
    private String pantryName;
    private String pantryManager;
    private String foodItem;
    private int foodQuan;

    public String getFcpitemid() {
        return fcpitemid;
    }

    public void setFcpitemid(String fcpitemid) {
        this.fcpitemid = fcpitemid;
    }

    public String getFcpWHname() {
        return fcpWHname;
    }

    public void setFcpWHname(String fcpWHname) {
        this.fcpWHname = fcpWHname;
    }

    public String getPantryName() {
        return pantryName;
    }

    public void setPantryName(String pantryName) {
        this.pantryName = pantryName;
    }

    public String getPantryManager() {
        return pantryManager;
    }

    public void setPantryManager(String pantryManager) {
        this.pantryManager = pantryManager;
    }

    public String getFoodItem() {
        return foodItem;
    }

    public void setFoodItem(String foodItem) {
        this.foodItem = foodItem;
    }

    public int getFoodQuan() {
        return foodQuan;
    }

    public void setFoodQuan(int foodQuan) {
        this.foodQuan = foodQuan;
    }
    @Override
    public String toString(){
        return fcpitemid;
    }
}
