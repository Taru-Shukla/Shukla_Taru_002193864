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
public class Profile {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGeoData() {
        return geoData;
    }

    public void setGeoData(String geoData) {
        this.geoData = geoData;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public Integer getTeleNumber() {
        return teleNumber;
    }

    public void setTeleNumber(Integer teleNumber) {
        this.teleNumber = teleNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public void setEmailAdd(String emailAdd) {
        this.emailAdd = emailAdd;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public Integer getMedicNumber() {
        return medicNumber;
    }

    public void setMedicNumber(Integer medicNumber) {
        this.medicNumber = medicNumber;
    }

    public String getHealthPlanNumbr() {
        return healthPlanNumbr;
    }

    public void setHealthPlanNumbr(String healthPlanNumbr) {
        this.healthPlanNumbr = healthPlanNumbr;
    }

    public Integer getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(Integer bankAccount) {
        this.bankAccount = bankAccount;
    }

    public Integer getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Integer licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public String getVehicleIdentifier() {
        return vehicleIdentifier;
    }

    public void setVehicleIdentifier(String vehicleIdentifier) {
        this.vehicleIdentifier = vehicleIdentifier;
    }

    public String getDeviceIdentifier() {
        return deviceIdentifier;
    }

    public void setDeviceIdentifier(String deviceIdentifier) {
        this.deviceIdentifier = deviceIdentifier;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public Integer getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(Integer ipAddress) {
        this.ipAddress = ipAddress;
    }
    private String name;
    private String geoData;
    private String doB;
    private Integer teleNumber;
    private String faxNumber;
    private String emailAdd;
    private String ssn;
    private Integer medicNumber;
    private String healthPlanNumbr;
    private Integer bankAccount;
    private Integer licenseNumber;
    private String vehicleIdentifier;
    private String deviceIdentifier;
    private String linkedIn;
    private Integer ipAddress;
    private String bioId;
    private String fullFace;
    private Integer uniqueId;

    public String getBioId() {
        return bioId;
    }

    public void setBioId(String bioId) {
        this.bioId = bioId;
    }

    public String getFullFace() {
        return fullFace;
    }

    public void setFullFace(String fullFace) {
        this.fullFace = fullFace;
    }

    public Integer getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(Integer uniqueId) {
        this.uniqueId = uniqueId;
    }

}
