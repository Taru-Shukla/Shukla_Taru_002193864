/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author tarushukla
 */
public class VitalSignHistory extends VitalSigns{
     ArrayList<VitalSigns> vitalSignArrayList;
    
    public VitalSignHistory() {
        this.vitalSignArrayList = new ArrayList<VitalSigns>();
    }
   
    public VitalSigns addNewPatient(){
    VitalSigns vitalSigns = new VitalSigns();
    vitalSignArrayList.add(vitalSigns);
    return vitalSigns;
    }
    
    
    

    public ArrayList<VitalSigns> getVitalSignArrayList() {
        return vitalSignArrayList;
    }

    public void setVitalSignArrayList(ArrayList<VitalSigns> vitalSignArrayList) {
        this.vitalSignArrayList = vitalSignArrayList;
    }
   
}
