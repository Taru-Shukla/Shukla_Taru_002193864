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
         System.out.println("line 26 ");
        this.patientMedicalDetails = patientMedicalDetails;
          System.out.println("line 28 "+patientMedicalDetails);
    }
     public PatientPersonalDetails addNewDetails(){
         System.out.println("line 29 ");
        PatientPersonalDetails details = new PatientPersonalDetails();
         System.out.println("line 30: "+details);
        patientMedicalDetails.add(details);
        System.out.println("line 32: "+details);
        return details;
    } 
             
}
