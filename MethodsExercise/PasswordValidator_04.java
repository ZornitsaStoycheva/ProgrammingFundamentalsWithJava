package MethodsExercise;

import java.util.Scanner;

public class PasswordValidator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        boolean isValidPass = false;
        boolean isValid2 = false;
        boolean isValid3 = false;
        if(isLengthBetweenSixAndTenDigit(password)) {
            isValidPass = true;
        }

        if(isContainDigitAndLetter(password)) {
            isValid2 = true;
        }

        if(isContainsLessTwoDigits(password)) {
            isValid3 = true;
        }

        if(isValidPass && isValid2 && isValid3) {
            System.out.println("Password is valid");
        }



    }

    public static String isValid(String password) {
        String output = "";
        isLengthBetweenSixAndTenDigit(password);
        isContainDigitAndLetter(password);
        isContainsLessTwoDigits(password);

        return "Password is valid";
    }
    public static boolean isLengthBetweenSixAndTenDigit(String password) {
        if (password.length() < 6 || password.length() > 10) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        return false;
    }

    public static boolean isContainDigitAndLetter(String password) {
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (!Character.isDigit(symbol) && !Character.isLetter(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                break;
            }
        }
        return true;
    }

    public static boolean isContainsLessTwoDigits(String password) {
        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            char symbol = password.charAt(i);
            if (Character.isDigit(symbol)) {
                count ++;
            }
        }

        if(count < 2) {
            System.out.println("Password must have at least 2 digits");
            return false;
        }
        return false;
    }
}
