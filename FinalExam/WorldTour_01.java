package FinalExam;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String travel = scanner.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(travel);

        String input = scanner.nextLine();

        while (!input.equals("Travel")) {

            String[] inputLine = input.split(":");

            if (inputLine[0].equals("Add Stop")) {

                int index = Integer.parseInt(inputLine[1]);
                String  stop = inputLine[2];

                boolean isValid = isValidIndex(index, sb.toString());
                if (isValid) {
                    sb.insert(index, stop);
                }

                System.out.println(sb);

            } else if (inputLine[0].equals("Remove Stop")) {

                int startIndex = Integer.parseInt(inputLine[1]);
                int endIndex = Integer.parseInt(inputLine[2]);

                boolean isValidStartIndex = isValidIndex(startIndex, sb.toString());
                boolean isValidEndIndex = isValidIndex(endIndex, sb.toString());

                if (isValidStartIndex && isValidEndIndex) {
                    sb.delete(startIndex, endIndex + 1);
                }

                System.out.println(sb);

            } else if (inputLine[0].equals("Switch")) {

                String oldItem = inputLine[1];
                String newItem = inputLine[2];

                String replace = sb.toString().replaceAll(oldItem, newItem);
                sb = new StringBuilder(replace);

                System.out.println(sb);

            }

            input = scanner.nextLine();
        }

        System.out.print("Ready for world tour! Planned stops: ");
        System.out.println(sb);
    }

    public static boolean isValidIndex(int index, String text) {
        return  index >= 0 && index <= text.length() - 1;
    }
}
