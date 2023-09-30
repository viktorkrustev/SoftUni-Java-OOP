package PolymorphismExercises.VehiclesExtension_02;

public class Bus extends Vehicle{
    public static final double AC_BUS_CONSUMPTION = 1.4;

    public Bus(double fuelQuantity, double fuelPerKm, double tankCapacity) {
        super(fuelQuantity, fuelPerKm, tankCapacity);
    }

    public void driveWithPeople(double distance){
        super.setFuelPerKm(super.getFuelPerKm() + AC_BUS_CONSUMPTION);
        super.drive(distance);
    }
}
