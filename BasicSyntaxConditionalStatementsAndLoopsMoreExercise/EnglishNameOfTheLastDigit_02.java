package BasicSyntaxConditionalStatementsAndLoopsMoreExercise;

import java.util.Scanner;

public class EnglishNameOfTheLastDigit_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int lastNum = number % 10;
        String englishNameOfDigit = "";
        if (lastNum == 0) {
            englishNameOfDigit = "zero";
        } else if (lastNum == 2) {
            englishNameOfDigit = "two";
        } else if (lastNum == 3) {
            englishNameOfDigit = "three";
        } else if (lastNum == 4) {
            englishNameOfDigit = "four";
        } else if (lastNum == 5) {
            englishNameOfDigit = "five";
        } else if (lastNum == 6) {
            englishNameOfDigit = "six";
        } else if (lastNum == 7) {
            englishNameOfDigit = "seven";
        } else if (lastNum == 8) {
            englishNameOfDigit = "eight";
        } else if (lastNum == 9) {
            englishNameOfDigit = "nine";
        }

        System.out.println(englishNameOfDigit);
    }
}
