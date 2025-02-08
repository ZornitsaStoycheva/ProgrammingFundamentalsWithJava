package FinalExam;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Decode")) {

            String[] inputLine = input.split("\\|");

            String command = inputLine[0];

            if (command.equals("Move")) {

                int numberOfLetters = Integer.parseInt(inputLine[1]);

                boolean isValid = isValid(message, numberOfLetters);

                String startText = message.substring(0, numberOfLetters);
                String endText = message.substring(numberOfLetters);
                String newText = endText.concat(startText);
                message = newText;


            } else if (command.equals("Insert")) {

                int index = Integer.parseInt(inputLine[1]);
                String value = inputLine[2];

                boolean isValid = isValid(message, index);

                if (isValid) {
                    String startText = message.substring(0, index);
                    String endText = message.substring(index);
                    String newText = startText.concat(value).concat(endText);
                    message = newText;
                }

            } else if (command.equals("ChangeAll")) {

                String substring = inputLine[1];
                String replacement = inputLine[2];

                if (message.contains(substring)) {
                    String sub = message.replaceAll(substring, replacement);
                    message = sub;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("The decrypted message is: %s", message);
    }
    public static boolean isValid(String text, int index) {
        return index >= 0 && index <= text.length();
    }
}
