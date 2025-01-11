package BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class Login_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();

        String password = scanner.nextLine();

        int count = 0;

        String reversePassword = "";
        for (int i = user.length() - 1; i >= 0 ; i--) {
            reversePassword += user.charAt(i);
        }

        while (true) {
                count++;

            if (count == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }

            if (password.equals(reversePassword)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else {
                System.out.println("Incorrect password. Try again.");
            }

            password = scanner.nextLine();
        }
    }
}
