package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if(!isLengthBetweenSixAndTenDigit(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        if(!isContainDigitAndLetter(password)) {
            System.out.println("Password must consist only of letters and digits");
        }

        if(!isContainsLessTwoDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }

        if(isLengthBetweenSixAndTenDigit(password) && isContainDigitAndLetter(password) && isContainsLessTwoDigits(password)) {
            System.out.println("Password is valid");
        }
    }
    public static boolean isLengthBetweenSixAndTenDigit(String password) {
        if (password.length() >= 6 && password.length() <= 10) {
            return true;
        }
        return false;
    }

    public static boolean isContainDigitAndLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isLetterOrDigit(symbol)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isContainsLessTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                count ++;
            }
        }

        if(count >= 2) {
            return true;
        }
        return false;
    }
}
