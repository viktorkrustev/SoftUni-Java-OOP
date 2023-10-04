package Exceptions_And_Error_Handling;

import java.util.Scanner;

public class NumberInRange_01 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String[] nums = scanner.nextLine().split(" ");
        int num1 = Integer.parseInt(nums[0]);
        int num2 = Integer.parseInt(nums[1]);

        System.out.printf("Range: [%d...%d]%n", num1, num2);

        String input = scanner.nextLine();
        int num = -1;
        while (true) {
            try {
                num = Integer.parseInt(input);
                if (num < num1 || num > num2) {
                    throw new IllegalArgumentException("Invalid number: " + num);
                }
                System.out.println("Valid number: " + num);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number: " + input);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());

            }
            input = scanner.nextLine();
        }
    }
}
