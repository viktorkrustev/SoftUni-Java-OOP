package PolymorphismExercises.Vehicles_01;

public class Truck extends Vehicle {
    private static final double TRUCK_FUEL_CONSUMPTION_PER_KM_SUMMER = 1.6;

    public Truck(double fuelQuantity, double fuelPerKm) {
        super(fuelQuantity, fuelPerKm + TRUCK_FUEL_CONSUMPTION_PER_KM_SUMMER);
    }

    @Override
    public void refuel(double liters) {
        liters = liters * ((double) 95/100);
        double fuelAmount = getFuelQuantity() + liters;
        setFuelQuantity(fuelAmount);
    }
    public void truckInfo(){
        System.out.printf("PolymorphismExercises.Vehicles_01.PolymorphismExercises.VehiclesExtension_02.Truck: %.2f", getFuelQuantity());
    }
}
