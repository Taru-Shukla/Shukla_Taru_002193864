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
public class PatientDirectory {
    Patient patient;
    private ArrayList<Patient> patientDirectoryArrayList;
    
    public PatientDirectory() {
        
        patientDirectoryArrayList= new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatientDirectoryArrayList() {
        return patientDirectoryArrayList;
    }

    public void setPatientDirectoryArrayList(ArrayList<Patient> patientDirectoryArrayList) {
        this.patientDirectoryArrayList = patientDirectoryArrayList;
    }
     
    public Patient addNewPatientDetails() {
        
        Patient newPatientDirectory = new Patient();
        patientDirectoryArrayList.add(newPatientDirectory);
        return newPatientDirectory;
       
    }
    
    public void deletePatientDetails(Patient p){
patientDirectoryArrayList.remove(p);
}
}
