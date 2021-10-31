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
public class PatientPersonalDetails {
    
 private String date;   
 private String healthPlanId;
 private String name;
 private Integer age;
 private String gender;
 private String address;
 private String neighborhood;
 private String city;
  private String country;
  private String DOB;

private Float bodyTemp; 
private Integer pulseRate;
private Integer respirationRate;
private Integer bloodPressure;
   public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }
 public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    public String getHealthPlanId() {
        return healthPlanId;
    }

    public void setHealthPlanId(String healthPlanId) {
        this.healthPlanId = healthPlanId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    public Float getBodyTemp() {
        return bodyTemp;
    }

    public void setBodyTemp(Float bodyTemp) {
        this.bodyTemp = bodyTemp;
    }

    public Integer getPulseRate() {
        return pulseRate;
    }

    public void setPulseRate(Integer pulseRate) {
        this.pulseRate = pulseRate;
    }

    public Integer getRespirationRate() {
        return respirationRate;
    }

    public void setRespirationRate(Integer respirationRate) {
        this.respirationRate = respirationRate;
    }

    public Integer getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

      @Override
    public String toString(){
        return date;
    }
     

    
}
