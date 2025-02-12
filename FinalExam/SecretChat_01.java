package FinalExam;

import java.util.Scanner;

public class SecretChat_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(input);

        String token = scanner.nextLine();

        while (!token.equals("Reveal")) {

            String[] commandLine = token.split(":\\|:");
            String command = commandLine[0];

            if (command.equals("InsertSpace")) {

                int index = Integer.parseInt(commandLine[1]);
                sb.insert(index, " ");

                System.out.println(sb);

            } else if (command.equals("Reverse")) {

                String substring = commandLine[1];

                int index = sb.indexOf(substring);

                if (index != -1) {
                    String substring1 = sb.substring(index, index + substring.length());
                    sb.delete(index, index + substring.length());
                    StringBuilder newSb = new StringBuilder();
                    newSb.append(substring1);
                    newSb.reverse();
                    sb.append(newSb);
                    System.out.println(sb);
                } else {
                    System.out.println("error");
                }

            } else if (command.equals("ChangeAll")) {

                String substring = commandLine[1];
                String replacement = commandLine[2];

                int index = sb.indexOf(substring);

                String s = sb.toString().replaceAll(substring, replacement);
                sb = new StringBuilder();
                sb.append(s);


                System.out.println(sb);
            }

            token = scanner.nextLine();
        }

        System.out.printf("You have a new text message: %s%n", sb);
    }
}
