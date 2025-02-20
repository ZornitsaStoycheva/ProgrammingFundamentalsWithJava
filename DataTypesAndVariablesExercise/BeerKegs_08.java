package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double max = Double.MIN_VALUE;
        String modelKeg = "";

        for (int i = 0; i < n; i++) {
            String model = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double sum = Math.PI * Math.pow(radius, 2) * height;

            if (max <= sum) {
                max = sum;
                modelKeg = model;
            }
        }
        System.out.println(modelKeg);
    }
}
