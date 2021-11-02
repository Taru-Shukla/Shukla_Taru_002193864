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
public class Person extends House{
    private String personName;
    private int personAge;
    private String gender;
    private long contactNumber;
    private int count=0;
    
    @Override
    public String toString() {
        return personName;
          
    }

    public Person() {

    }

    public Person( String personName, int personAge, String gender, long contactNumber, String houseAddress, String communityName, String cityName) {
        super(houseAddress, communityName, cityName);
        this.personName = personName;
        this.personAge = personAge;
        this.gender = gender;
        this.contactNumber = contactNumber;
    }
    
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public int getPersonAge() {
        return personAge;
    }

    public void setPersonAge(int personAge) {
        this.personAge = personAge;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }        
}
