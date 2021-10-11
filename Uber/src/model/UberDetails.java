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
public class UberDetails {
     private String carbrand;
     private String manufacture;
     private Integer seatCount;

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }
     private String serialNumber;
     private String modelNumber;
     private String city;
     private String maintenanceCertificate;
     private String fleetCatalogEntryDate;
      private String fleetCatalogUpdateDate;
     private Long vehicleInsurance;
     private String uberType;
     private String available;
  
     

    public String getFleetCatalogEntryDate() {
        return fleetCatalogEntryDate;
    }

    public void setFleetCatalogEntryDate(String fleetCatalogEntryDate) {
        this.fleetCatalogEntryDate = fleetCatalogEntryDate;
    }
    

    public String getCarbrand() {
        return carbrand;
    }

    public void setCarbrand(String carbrand) {
        this.carbrand = carbrand;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public Integer getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(Integer seatCount) {
        this.seatCount = seatCount;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getMaintenanceCertificate() {
        return maintenanceCertificate;
    }

    public void setMaintenanceCertificate(String maintenanceCertificate) {
        this.maintenanceCertificate = maintenanceCertificate;
    }

    public String getFleetCatalogUpdateDate() {
        return fleetCatalogUpdateDate;
    }

    public void setFleetCatalogUpdateDate(String fleetCatalogUpdateDate) {
        this.fleetCatalogUpdateDate = fleetCatalogUpdateDate;
    }

    public Long getVehicleInsurance() {
        return vehicleInsurance;
    }

    public void setVehicleInsurance(Long vehicleInsurance) {
        this.vehicleInsurance = vehicleInsurance;
    }

    public String getUberType() {
        return uberType;
    }

    public void setUberType(String uberType) {
        this.uberType = uberType;
    }
    @Override
    public String toString(){
        return carbrand;
    }
}
