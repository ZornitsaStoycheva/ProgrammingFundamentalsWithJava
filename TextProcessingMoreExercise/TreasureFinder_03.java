package TextProcessingMoreExercise;

import java.util.Arrays;
import java.util.Scanner;

public class TreasureFinder_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] keys = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        String input = scanner.nextLine();

        while (!input.equals("find")) {
            int max = Math.max(keys.length, input.length());
            int min = Math.min(keys.length, input.length());
            int counter = 0;
            String text = "";

            for (int i = 0; i < max; i++) {

                int x = input.charAt(i) - keys[counter];
                char value = (char) x;
                text += String.valueOf(value);
                counter++;
                if (counter == min) {
                    counter = 0;
                }
            }

            int index = text.indexOf("&");
            int index1 = text.lastIndexOf("&");
            int index2 = text.indexOf("<");
            int index3 = text.indexOf(">");

            String material = text.substring(index + 1, index1);
            String coordinate = text.substring(index2 + 1, index3);

            System.out.printf("Found %s at %s%n", material, coordinate);

            input = scanner.nextLine();
        }
    }
}
