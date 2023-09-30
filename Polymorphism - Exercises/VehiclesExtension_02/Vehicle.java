package PolymorphismExercises.VehiclesExtension_02;

import java.text.DecimalFormat;

public class Vehicle implements CarProperties {

    private double fuelQuantity;
    private double fuelPerKm;
    private double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelPerKm, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelPerKm = fuelPerKm;
        this.tankCapacity = tankCapacity;
    }

    public double getFuelQuantity() {
        return fuelQuantity;
    }

    public void setFuelQuantity(double fuelQuantity) {
        this.fuelQuantity = fuelQuantity;
    }

    public double getFuelPerKm() {
        return fuelPerKm;
    }

    public void setFuelPerKm(double fuelPerKm) {
        this.fuelPerKm = fuelPerKm;
    }

    public double getTankCapacity() {
        return tankCapacity;
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
        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        } else if (liters + this.fuelQuantity > this.tankCapacity) {
            System.out.println("Cannot fit fuel in tank");
            return;
        }
        this.fuelQuantity += liters;
    }

    @Override
    public void info() {
        System.out.printf("%s: %.2f", getClass().getName(), getFuelQuantity());
    }

}
