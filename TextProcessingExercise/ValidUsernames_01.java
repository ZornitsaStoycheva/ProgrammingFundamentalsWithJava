package TextProcessingExercise;

import java.util.Scanner;

public class ValidUsernames_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] password = scanner.nextLine().split(", ");

        boolean isValid = true;

        for (int i = 0; i < password.length; i++) {
            if (password[i].length() >= 3 && password[i].length() <= 16) {
                for (int j = 0; j < password[i].length(); j++) {
                    if (!Character.isLetterOrDigit(password[i].charAt(j))
                            && password[i].charAt(j) != '-'
                            && password[i].charAt(j) != '_') {

                        break;
                    }
                    System.out.println(password[i]);
                }
            }
        }
    }
}
