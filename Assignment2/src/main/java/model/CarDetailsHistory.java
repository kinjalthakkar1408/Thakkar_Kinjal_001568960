/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author kinjal
 */
public class CarDetailsHistory {
    
    private ArrayList<CarDetails> carDetailsHistory;
    
    public CarDetailsHistory() {
        this.carDetailsHistory = new ArrayList<CarDetails>();
    }

    public ArrayList<CarDetails> getCarDetailsHistory() {
        return carDetailsHistory;
    }

    public void setCarDetailsHistory(ArrayList<CarDetails> carDetailsHistory) {
        this.carDetailsHistory = carDetailsHistory;
    }
    
    public CarDetails addNewCarDetails() {
        CarDetails newCarDetails = new CarDetails();
        carDetailsHistory.add(newCarDetails);
        return newCarDetails;
    }
    
    public void removeCarDetails(CarDetails selectedCarDetails){
        carDetailsHistory.remove(selectedCarDetails);
    }

    
    
}
