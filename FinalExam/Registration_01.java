package FinalExam;

import java.util.Scanner;

public class Registration_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();

        String commandLine = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        while (!commandLine.equals("Registration")) {

            String[] input = commandLine.split(" ");
            String command = input[0];

            if (command.equals("Letters")) {
                String def = input[1];

                if(def.equals("Lower")) {
                    username = username.toLowerCase();
                } else if (def.equals("Upper")) {
                    username = username.toUpperCase();
                }
                System.out.println(username);


            } else if (command.equals("Reverse")) {

                int startIndex = Integer.parseInt(input[1]);
                int endIndex = Integer.parseInt(input[2]);

                boolean isValidStartIndex = isValid(username, startIndex);
                boolean isValidEndIndex = isValid(username, endIndex);

                if(isValidStartIndex && isValidEndIndex) {
                    String startText = username.substring(0, startIndex);
                    String middleText = username.substring(startIndex, endIndex + 1);
                    StringBuilder reverseSB = new StringBuilder();

                    reverseSB.append(middleText);
                    reverseSB.reverse();
                    System.out.println(reverseSB);

                }

            } else if (command.equals("Substring")) {
                String sub = input[1];

                if(username.contains(sub)) {

                        String replace = username.replace(sub, "");

                        username = replace;
                        System.out.println(username);

                } else {
                    System.out.printf("The username %s doesn't contain %s.%n", username, sub);
                }

            } else if (command.equals("Replace")) {
                String replace = input[1];

                if(username.contains(replace)) {
                    String s = username.replaceAll(replace, "-");
                    username = s;
                    System.out.println(username);
                }
            } else if (command.equals("IsValid")) {
                char symbol = input[1].charAt(0);

                int i = username.indexOf(symbol);

                if (i != -1) {
                    System.out.println("Valid username.");
                } else {
                    System.out.printf("%c must be contained in your username.%n", symbol);
                }

            }

            commandLine = scanner.nextLine();
        }
    }

    public static boolean isValid(String text, int index) {
        return index >= 0 && index < text.length();
    }
}
