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
public class Community extends City {
    String communityName;

    public  Community(){
    
    }
    
    public Community(String communityName, String cityName) {
        super(cityName);
        this.communityName = communityName;
    }
    
    public String getCommunityName() {
        return communityName;
    }

    public void setCommunityName(String communityName) {
        this.communityName = communityName;
    }
@Override
    public String toString() {
        return this.communityName + super.toString();
          
    }
}
