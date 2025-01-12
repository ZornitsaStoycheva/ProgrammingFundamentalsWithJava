package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class WaterOverflow_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int capacity = 255;
        int total = 0;
        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());

            if (capacity - liters >= 0) {
                total += liters;
                capacity -= liters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(total);
    }
}
