package FinalExam;

import java.util.Scanner;

public class TheImitationGame_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String message = scanner.nextLine();

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(message);

        while (!input.equals("Decode")) {

            String[] inputLine = input.split("\\|");

            String command = inputLine[0];

            if (command.equals("Move")) {

                int numberOfLetters = Integer.parseInt(inputLine[1]);

                String startText = sb.substring(0, numberOfLetters);
                sb.delete(0, numberOfLetters);
                sb.append(startText);


            } else if (command.equals("Insert")) {

                int index = Integer.parseInt(inputLine[1]);
                String value = inputLine[2];

                sb.insert(index, value);


            } else if (command.equals("ChangeAll")) {

                String substring = inputLine[1];
                String replacement = inputLine[2];

                String s = sb.toString();
                String s1 = s.replaceAll(substring, replacement);
                sb = new StringBuilder(s1);


            }
            input = scanner.nextLine();
        }
            System.out.printf("The decrypted message is: %s", sb.toString());

    }
//    public static boolean isValid(String text, int index) {
//        return index >= 0 && index < text.length();
//    }
}
