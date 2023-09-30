package PolymorphismExercises.VehiclesExtension_02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] carInfo = scanner.nextLine().split(" ");
        String[] truckInfo = scanner.nextLine().split(" ");
        String[] busInfo = scanner.nextLine().split(" ");

        double carFuelAmount = Double.parseDouble(carInfo[1]);
        double carPerKm = Double.parseDouble(carInfo[2]);
        double carTankCapacity = Double.parseDouble(carInfo[3]);

        double truckFuelAmount = Double.parseDouble(truckInfo[1]);
        double truckPerKm = Double.parseDouble(truckInfo[2]);
        double truckTankCapacity = Double.parseDouble(truckInfo[3]);

        double busFuelAmount = Double.parseDouble(busInfo[1]);
        double busPerKm = Double.parseDouble(busInfo[2]);
        double busTankCapacity = Double.parseDouble(busInfo[3]);

        Car car = new Car(carFuelAmount, carPerKm, carTankCapacity);
        Truck truck = new Truck(truckFuelAmount, truckPerKm, truckTankCapacity);
        Bus bus = new Bus(busFuelAmount, busPerKm, busTankCapacity);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String[] commandParts = scanner.nextLine().split(" ");
            String command = commandParts[0];
            String vehicle = commandParts[1];
            double amount = Double.parseDouble(commandParts[2]);

            if (command.equals("Drive") && vehicle.equals("PolymorphismExercises.VehiclesExtension_02.Truck")){
                truck.drive(amount);
            } else if (command.equals("Refuel") && vehicle.equals("PolymorphismExercises.VehiclesExtension_02.Truck")) {
                truck.refuel(amount);
            } else if (command.equals("Drive") && vehicle.equals("PolymorphismExercises.VehiclesExtension_02.Car")) {
                car.drive(amount);
            } else if (command.equals("Refuel") && vehicle.equals("PolymorphismExercises.VehiclesExtension_02.Car")) {
                car.refuel(amount);
            } else if (command.equals("Refuel") && vehicle.equals("PolymorphismExercises.VehiclesExtension_02.Bus")) {
                bus.refuel(amount);
            } else if (command.equals("DriveEmpty") && vehicle.equals("PolymorphismExercises.VehiclesExtension_02.Bus")) {
                bus.drive(amount);
            } else if (command.equals("Drive") && vehicle.equals("PolymorphismExercises.VehiclesExtension_02.Bus")) {
                bus.driveWithPeople(amount);
            }
        }

        car.info();
        System.out.println();
        truck.info();
        System.out.println();
        bus.info();

    }
}
