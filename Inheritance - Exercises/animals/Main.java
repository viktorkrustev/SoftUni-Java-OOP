package InheritanceExercises.animals;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            String animalType = scanner.nextLine();
            if (animalType.equals("Beast!")) {
                break;
            }

            String[] animalInfo = scanner.nextLine().split("\\s+");
            String name = animalInfo[0];
            int age;
            String gender = null;

            try {
                age = Integer.parseInt(animalInfo[1]);
                if (animalInfo.length == 3) {
                    gender = animalInfo[2];
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
                continue;
            }

            try {
                Animal animal;
                switch (animalType) {
                    case "PolymorphismLab.Animals.Dog":
                        animal = new Dog(name, age, gender);
                        break;
                    case "PolymorphismLab.Animals.Cat":
                        animal = new Cat(name, age, gender);
                        break;
                    case "Frog":
                        animal = new Frog(name, age, gender);
                        break;
                    case "Kitten":
                        animal = new Kitten(name, age);
                        break;
                    case "Tomcat":
                        animal = new Tomcat(name, age);
                        break;
                    default:
                        System.out.println("Invalid input!");
                        continue;
                }
                animals.add(animal);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        for (Animal animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
