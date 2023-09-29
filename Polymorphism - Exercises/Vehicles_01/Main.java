package PolymorphismExercises.Vehicles_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split(" ");
        String[] truckInfo = scanner.nextLine().split(" ");

        double carFuelAmount = Double.parseDouble(carInfo[1]);
        double carPerKm = Double.parseDouble(carInfo[2]);

        double truckFuelAmount = Double.parseDouble(truckInfo[1]);
        double truckPerKm = Double.parseDouble(truckInfo[2]);

        Car car = new Car(carFuelAmount, carPerKm);
        Truck truck = new Truck(truckFuelAmount, truckPerKm);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(" ");
            String command = commandParts[0];
            String vehicle = commandParts[1];
            double amount = Double.parseDouble(commandParts[2]);

            if (command.equals("Drive") && vehicle.equals("PolymorphismExercises.Vehicles_01.PolymorphismExercises.VehiclesExtension_02.Truck")){
                truck.drive(amount);
            } else if (command.equals("Refuel") && vehicle.equals("PolymorphismExercises.Vehicles_01.PolymorphismExercises.VehiclesExtension_02.Truck")) {
                truck.refuel(amount);
            } else if (command.equals("Drive") && vehicle.equals("PolymorphismExercises.Vehicles_01.PolymorphismExercises.VehiclesExtension_02.Car")) {
                car.drive(amount);
            } else if (command.equals("Refuel") && vehicle.equals("PolymorphismExercises.Vehicles_01.PolymorphismExercises.VehiclesExtension_02.Car")) {
                car.refuel(amount);
            }
        }

        car.carInfo();
        System.out.println();
        truck.truckInfo();

    }
}
