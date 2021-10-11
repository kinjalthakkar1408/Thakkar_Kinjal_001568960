/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kinjal
 */
public class CarDetails {
    
    private String carManufacturer;
    private String carModelName;
    private String carModelNum;
    private String yearOfManufacturing;
    private int serialNumber;
    private String location;
    private int numSeats;
    private String carAvailability;
    private String mainCertiExpiry;

    public String getCarManufacturer() {
        return carManufacturer;
    }

    public void setCarManufacturer(String carManufacturer) {
        this.carManufacturer = carManufacturer;
    }

    public String getCarModelName() {
        return carModelName;
    }

    public void setCarModelName(String carModelName) {
        this.carModelName = carModelName;
    }

    public String getCarModelNum() {
        return carModelNum;
    }

    public void setCarModelNum(String carModelNum) {
        this.carModelNum = carModelNum;
    }

    public String getYearOfManufacturing() {
        return yearOfManufacturing;
    }

    public void setYearOfManufacturing(String yearOfManufacturing) {
        this.yearOfManufacturing = yearOfManufacturing;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getNumSeats() {
        return numSeats;
    }

    public void setNumSeats(int numSeats) {
        this.numSeats = numSeats;
    }

    public String getCarAvailability() {
        return carAvailability;
    }

    public void setCarAvailability(String carAvailability) {
        this.carAvailability = carAvailability;
    }

    public String getMainCertiExpiry() {
        return mainCertiExpiry;
    }

    public void setMainCertiExpiry(String mainCertiExpiry) {
        this.mainCertiExpiry = mainCertiExpiry;
    }
 
    @Override
    public String toString(){
        return carManufacturer;
    }
     
}
