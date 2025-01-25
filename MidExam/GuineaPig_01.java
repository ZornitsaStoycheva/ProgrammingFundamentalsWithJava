package MidExam;

import java.util.Scanner;

public class GuineaPig_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double food = Double.parseDouble(scanner.nextLine());
        double hay = Double.parseDouble(scanner.nextLine());
        double cover = Double.parseDouble(scanner.nextLine());
        double weight = Double.parseDouble(scanner.nextLine());

        double foodToGrams = food * 1000;
        double hayToGrams = hay * 1000;
        double coverToGrams = cover * 1000;
        double weightToGrams = weight * 1000;

        for (int i = 1; i <= 30 ; i++) {
            foodToGrams -= 300;

            if (i % 2 == 0) {
                //double five = foodToGrams * 0.5;
                hayToGrams -= foodToGrams * 0.05;
            }

            if (i % 3 == 0) {
                coverToGrams -= weightToGrams / 3;
            }

            if (foodToGrams <= 0 || hayToGrams <= 0 || coverToGrams <= 0) {
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }

        if (foodToGrams > 0 && hayToGrams > 0 && coverToGrams > 0) {
            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.",
                    foodToGrams / 1000, hayToGrams / 1000, coverToGrams / 1000);
        }
    }
}
