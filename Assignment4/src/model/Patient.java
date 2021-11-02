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
public class Patient extends Person {
    
    VitalSignHistory vitalSignHistory;
    ArrayList<VitalSignHistory> vitalSignHistoryArrayList;

    public Patient() {
        this.vitalSignHistoryArrayList = new ArrayList<VitalSignHistory>();
    } 
    public Patient(VitalSignHistory vitalSignHistory, String personName, int personAge, String gender, long contactNumber, String houseAddress, String communityName, String cityName) {
        super(personName,personAge,gender,contactNumber,houseAddress, communityName, cityName);
        this.vitalSignHistory=vitalSignHistory;
    }
    
    public ArrayList<VitalSignHistory> getVitalSignHistory() {
        return vitalSignHistoryArrayList;
    }

    public void setVitalSignHistory(ArrayList<VitalSignHistory> vitalSignHistory) {
        this.vitalSignHistoryArrayList = vitalSignHistory;
    }
    
    public VitalSignHistory addVitalSignHistory(){
        VitalSignHistory vitalSignHistory =  new VitalSignHistory();
        vitalSignHistoryArrayList.add(vitalSignHistory);
        return vitalSignHistory;
    }
}
