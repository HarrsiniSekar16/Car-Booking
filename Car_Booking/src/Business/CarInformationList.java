/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Harrsini Sekar
 */
public class CarInformationList {
    
    public List<Car> carInformationList;
    public LocalDateTime lastupdated;

    public LocalDateTime getLastupdated() {
        return lastupdated;
    }

    public void setLastupdated(LocalDateTime lastupdated) {
        this.lastupdated = lastupdated;
    }
    
    public CarInformationList(){
        
        carInformationList = new ArrayList<Car>();
        
        Car car1 = new Car(true, "Ferrari", 2019, 1, 2, 1,"Red One", "Boston", true);
        Car car2 = new Car(true, "BMW", 2019, 1, 4, 2, "X1", "New York", true);
        Car car3 = new Car(true, "Toyota", 2018, 1, 4, 3, "T1", "Boston", true);
        Car car4 = new Car(true, "GM", 2018, 1, 4, 4, "G1", "New York", true);
        Car car5 = new Car(true, "Toyota", 2017, 1, 4, 5, "T2", "Chicago", true);
        Car car6 = new Car(true, "GM", 2017, 1, 4, 6, "G2", "Chicago", true);
        Car car7 = new Car(true, "Ferrari", 2016, 2, 4, 7, "", "Seattle", true);
        Car car8 = new Car(false, "BMW", 2016, 1, 4, 8, "X2", "Seattle", true);
        Car car9 = new Car(true, "Toyota", 2019, 1, 2, 9, "T3", "Austin", true);
        Car car10 = new Car(true, "GM", 2019, 3, 7, 10, "G3", "Austin", false);
        
        carInformationList.add(car1);
        carInformationList.add(car2);
        carInformationList.add(car3);
        carInformationList.add(car4);
        carInformationList.add(car5);
        carInformationList.add(car6);
        carInformationList.add(car7);
        carInformationList.add(car8);
        carInformationList.add(car9);
        carInformationList.add(car10);
        
    }

    public void setCarList(List<Car> carInformationList) {
        this.carInformationList = carInformationList;
    }

    public ArrayList<Car> getCarInformationList() {
       return (ArrayList<Car>) carInformationList;
    }

    
    public Car addcar(Car car)
    {
        carInformationList.add(car);
        return car;
    }
    
    public void deleteCar(Car car){
        carInformationList.remove(car);
    }  
       
    
}
