package PolymorphismExercises.Vehicles_01;

import java.text.DecimalFormat;

public class Vehicle implements CarProperties {

    private double fuelQuantity;
    private double fuelPerKm;

    public Vehicle(double fuelQuantity, double fuelPerKm) {
        this.fuelQuantity = fuelQuantity;
        this.fuelPerKm = fuelPerKm;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    @Override
    public void drive(double distance) {
        DecimalFormat df = new DecimalFormat("0.##");
        double fuelNeeded = distance * this.fuelPerKm;
        if (fuelNeeded > this.fuelQuantity){
            System.out.printf("%s needs refueling%n",getClass().getName());
            return;
        }
        this.fuelQuantity -= fuelNeeded;
        System.out.printf("%s travelled %s km%n",getClass().getName(), df.format(distance));
    }

    @Override
    public void refuel(double liters) {
        this.fuelQuantity += liters;
    }
}
