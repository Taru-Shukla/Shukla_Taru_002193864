/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author tarushukla
 */
public class House extends Community {
     private String houseAddress;
    
    public House(){
    
    }

    public House(String houseAddress, String communityName, String cityName) {
        super(communityName,cityName);
        this.communityName = communityName;
    }
    
    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }
    @Override
    public String toString() {
        return this.houseAddress + super.toString();
          
    }
}
