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
public class PersonDirectory {
     private ArrayList<Person> personDirectoryArrayList;

    public PersonDirectory() {
        personDirectoryArrayList= new ArrayList<Person>();
    }

    public ArrayList<Person> getPersonDirectoryArrayList() {
        return personDirectoryArrayList;
    }

    public void setPersonDirectoryArrayList(ArrayList<Person> personDirectoryArrayList) {
        this.personDirectoryArrayList = personDirectoryArrayList;
    }
    
    public Person addNewPersonDetails() {
        Person newPersonDetails = new Person();
        personDirectoryArrayList.add(newPersonDetails);
        return newPersonDetails;
    }
}
