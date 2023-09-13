package WorkingWithAbstractionExercise.JediGalaxy_05;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = value++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] coordinatesPeter = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] coordinatesEvil = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilRow = coordinatesEvil[0];
            int evilCol = coordinatesEvil[1];

            while (evilRow >= 0 && evilCol >= 0) {
                if (evilRow < matrix.length && evilCol < matrix[0].length) {
                    matrix[evilRow][evilCol] = 0;
                }
                evilRow--;
                evilCol--;
            }

            int peterRow = coordinatesPeter[0];
            int peterCol = coordinatesPeter[1];

            while (peterRow >= 0 && peterCol < matrix[1].length) {
                if (peterRow < matrix.length && peterCol >= 0 && peterCol < matrix[0].length) {
                    sum += matrix[peterRow][peterCol];
                }

                peterCol++;
                peterRow--;
            }

            command = scanner.nextLine();
        }

        System.out.println(sum);


    }
}
