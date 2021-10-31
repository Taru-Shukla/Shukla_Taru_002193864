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
public class PatientMedicalDetails {
    private ArrayList<PatientPersonalDetails>  patientMedicalDetails = new ArrayList<PatientPersonalDetails>() ;

   public PatientMedicalDetails(){
        this.patientMedicalDetails = new ArrayList<PatientPersonalDetails>();
    }

    public ArrayList<PatientPersonalDetails> getPatientMedicalDetails() {
        return patientMedicalDetails;
    }

    public void setPatientMedicalDetails(ArrayList<PatientPersonalDetails> patientMedicalDetails) {
        this.patientMedicalDetails = patientMedicalDetails;
    }
     public PatientPersonalDetails addNewDetails(){
        PatientPersonalDetails details = new PatientPersonalDetails();
        patientMedicalDetails.add(details);
        return details;
    } 
     public void deleteDetails(PatientPersonalDetails details){
         patientMedicalDetails.remove(details);
        }
             
}
