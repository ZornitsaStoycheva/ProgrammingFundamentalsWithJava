package FinalExam;

import java.util.Scanner;

public class ActivationKeys_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String input = scanner.nextLine();

        while (!input.equals("Generate")) {

            String[] tokens = input.split(">>>");
            String command = tokens[0];

            if (command.equals("Contains")) {

                String substring = tokens[1];

                if (text.contains(substring)) {
                    System.out.printf("%s contains %s%n", text, substring);
                } else {
                    System.out.println("Substring not found!");
                }

            } else if (command.equals("Flip")) {

                String test = tokens[1];
                int startIndex = Integer.parseInt(tokens[2]);
                int endIndex = Integer.parseInt(tokens[3]);

                String substring = text.substring(0, startIndex);
                String substring1 = text.substring(startIndex, endIndex);
                String substring2 = text.substring(endIndex);

                if(test.equals("Upper")) {

                    String s = substring1.toUpperCase();

                    text = substring.concat(s.concat(substring2));

                } else if (test.equals("Lower")) {

                    String s = substring1.toLowerCase();

                    text = substring.concat(s.concat(substring2));
                }

                System.out.println(text);

            } else if (command.equals("Slice")) {

                int startIndex = Integer.parseInt(tokens[1]);
                int endIndex = Integer.parseInt(tokens[2]);

                String substring = text.substring(0, startIndex);
                String substring1 = text.substring(endIndex);

                text = substring.concat(substring1);

                System.out.println(text);

            }

            input = scanner.nextLine();
        }

        System.out.printf("Your activation key is: %s%n", text);
    }
}
