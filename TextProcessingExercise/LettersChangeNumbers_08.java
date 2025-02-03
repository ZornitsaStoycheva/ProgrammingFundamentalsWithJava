package TextProcessingExercise;

import java.util.Scanner;

public class LettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");

        String alphabetToLowerCase = "abcdefghijklmnopqrstuvwxyz";
        String alphabetToUpperCase = "abcdefghijklmnopqrstuvwxyz".toUpperCase();

        String num = "";

        double firstSum = 0.0;
        double lastSum = 0.0;

        for (int i = 0; i < input.length; i++) {
            char a = input[i].charAt(0);
            char z = input[i].charAt(input[i].length() - 1);

            String sub = input[i].substring(1, input[i].length() - 1);

            int number = Integer.parseInt(sub);

            firstSum = number;

            boolean contains = alphabetToLowerCase.contains(String.valueOf(a));
            boolean contains1 = alphabetToLowerCase.contains(String.valueOf(z));
            boolean contains2 = alphabetToUpperCase.contains(String.valueOf(a));
            boolean contains3 = alphabetToUpperCase.contains(String.valueOf(z));

            if (contains) {
                int index = alphabetToLowerCase.indexOf(a);
                lastSum += firstSum * (index + 1);
            }

            if (contains2) {
                int index = alphabetToUpperCase.indexOf(a);
                lastSum += firstSum / (index + 1);
            }

            if (contains1) {
                int index = alphabetToLowerCase.indexOf(z);
                lastSum += (index + 1);
            }
            
            if(contains3) {
                int index = alphabetToUpperCase.indexOf(z);
                lastSum -= (index + 1);
            }
        }
        System.out.printf("%.2f", lastSum);

    }
}
