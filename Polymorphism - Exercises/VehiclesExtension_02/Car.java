package PolymorphismExercises.VehiclesExtension_02;

public class Car extends Vehicle {
    public static final double CAR_FUEL_CONSUMPTION_PER_KM_SUMMER = 0.9;

    public Car(double fuelQuantity, double fuelPerKm, double tankCapacity) {
        super(fuelQuantity, fuelPerKm + CAR_FUEL_CONSUMPTION_PER_KM_SUMMER, tankCapacity);
    }


}
