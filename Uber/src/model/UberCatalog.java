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
public class UberCatalog {
    private ArrayList<UberDetails> catalog;
    
    public UberCatalog(){
        this.catalog = new ArrayList<UberDetails>();
    }

    public ArrayList<UberDetails> getCatalog() {
        return catalog;
    }

    public void setCatalog(ArrayList<UberDetails> catalog) {
        this.catalog = catalog;
    }
    
    public UberDetails addNewDetails(){
        UberDetails uberDetails = new UberDetails();
        catalog.add(uberDetails);
        return uberDetails;
    }

    public void updateDetails(UberDetails uds) {
        catalog.add(uds);
    }
    
}
