package FinalExam;

import java.util.Scanner;

public class PasswordReset_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String inputLine = scanner.nextLine();

        StringBuilder sb = new StringBuilder();

        while (!inputLine.equals("Done")) {

            String[] tokens = inputLine.split("\\s+");
            String command = tokens[0];

            if (command.equals("TakeOdd")) {

                for (int i = 0; i < input.length(); i++) {
                    char symbol = input.charAt(i);

                    if (i % 2 == 1) {
                        sb.append(symbol);
                    }
                }

                System.out.println(sb);

            } else if (command.equals("Cut")) {
                int index = Integer.parseInt(tokens[1]);
                int length = Integer.parseInt(tokens[2]);

                if (index + length <= sb.length()) {

                    String substring1 = sb.substring(0, index);
                    String sub = sb.substring(index + length);
                    sb.delete(0, sb.length());
                    sb.append(substring1).append(sub);
                    System.out.println(substring1);
                }

            } else if (command.equals("Substitute")) {
                String substring = tokens[1];
                String substitute = tokens[2];

                if (sb.toString().contains(substring)) {
                    String s = sb.toString().replaceAll(substring, substitute);
                    sb.delete(0, sb.length());
                    sb.append(s);
                    System.out.println(sb);

                } else {
                    System.out.println("Nothing to replace!");
                }
            }

            inputLine = scanner.nextLine();
        }

        System.out.printf("Your password is: %s%n", sb);
    }
}
