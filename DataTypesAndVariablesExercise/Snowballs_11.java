package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class Snowballs_11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double snowballSnowCount = 0;
        double snowballTimeCount = 0;
        double snowballQualityCount = 0;

        double all = 0;
        long snowValue = 0;
        long max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scanner.nextLine());
            int snowballTime = Integer.parseInt(scanner.nextLine());
            int snowballQuality = Integer.parseInt(scanner.nextLine());

            snowValue = (long) Math.pow((snowballSnow / snowballTime),  snowballQuality);

            if (snowValue > max) {
                max = snowValue;
                snowballSnowCount = snowballSnow;
                snowballTimeCount = snowballTime;
                snowballQualityCount = snowballQuality;
            }
        }

        System.out.printf("%.0f : %.0f = %d (%.0f)",
                snowballSnowCount, snowballTimeCount,
                max, snowballQualityCount);
    }
}
