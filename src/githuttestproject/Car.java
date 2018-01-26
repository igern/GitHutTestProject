/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package githuttestproject;


public class Car {
    
    private String nameOfCar;
    private int wheelLength;
    private int rps;
    private int metersDrivenTotal;
    
    
    public Car(String nameOfCar) {
        this.nameOfCar = nameOfCar;
        this.wheelLength = 2;
        this.rps = 1;
    }
    
    public void drive(int secondsToDrive) {
        this.metersDrivenTotal += calculateDriven(secondsToDrive);
    }
    
    private int calculateDriven(int secondsToDrive) {
        return rps * wheelLength * secondsToDrive;
    }

    public void printMetersDriven() {
        System.out.println(nameOfCar + ": has driven " + metersDrivenTotal);
    }
    
    public int getMetersDrivenTotal() {
        return this.metersDrivenTotal;
    }
}
