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
public class Encounter extends VitalSigns {
     private String date;
    VitalSigns vitalSigns;
    private ArrayList<VitalSigns> historyArrayList;

    public Encounter() {
        this.historyArrayList = new ArrayList<VitalSigns>();
    }

    public Encounter(String date, VitalSigns vitalSigns) {
        this.date = date;
        this.vitalSigns = vitalSigns;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public VitalSigns getVitalSigns() {
        return vitalSigns;
    }

    public void setVitalSigns(VitalSigns vitalSigns) {
        this.vitalSigns = vitalSigns;
    }
    
    
   
    public ArrayList<VitalSigns> getHistoryArrayList() {
        return historyArrayList;
    }

    public void setHistoryArrayList(ArrayList<VitalSigns> historyArrayList) {
        this.historyArrayList = historyArrayList;
    }
    
    public VitalSigns addNewVitalSigns(){
    
        VitalSigns newVitalSigns= new VitalSigns();
        historyArrayList.add(newVitalSigns);
        return newVitalSigns;
    }
    @Override
    public String toString(){
    return date;
    }

}
