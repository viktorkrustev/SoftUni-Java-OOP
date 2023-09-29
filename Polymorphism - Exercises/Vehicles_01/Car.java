package PolymorphismExercises.Vehicles_01;

public class Car extends Vehicle {
    public static final double CAR_FUEL_CONSUMPTION_PER_KM_SUMMER = 0.9;

    public Car(double fuelQuantity, double fuelPerKm) {
        super(fuelQuantity, fuelPerKm + CAR_FUEL_CONSUMPTION_PER_KM_SUMMER);
    }

    public void carInfo(){
        System.out.printf("PolymorphismExercises.Vehicles_01.PolymorphismExercises.VehiclesExtension_02.Car: %.2f", getFuelQuantity());
    }
}
