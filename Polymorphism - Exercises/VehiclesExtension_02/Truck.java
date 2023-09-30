package PolymorphismExercises.VehiclesExtension_02;

public class Truck extends Vehicle {
    private static final double TRUCK_FUEL_CONSUMPTION_PER_KM_SUMMER = 1.6;

    public Truck(double fuelQuantity, double fuelPerKm, double tankCapacity) {
        super(fuelQuantity, fuelPerKm + TRUCK_FUEL_CONSUMPTION_PER_KM_SUMMER, tankCapacity);
    }

    @Override
    public void refuel(double liters) {
        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
        } else if (liters + getFuelQuantity() > super.getTankCapacity()) {
            System.out.println("Cannot fit fuel in tank");
        } else {
            liters = liters * ((double) 95/100);
            double fuelAmount = getFuelQuantity() + liters;
            setFuelQuantity(fuelAmount);
        }
    }

}
