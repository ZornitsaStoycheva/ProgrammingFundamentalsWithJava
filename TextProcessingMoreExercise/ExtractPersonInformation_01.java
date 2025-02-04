package TextProcessingMoreExercise;

import java.util.Scanner;

public class ExtractPersonInformation_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String text = scanner.nextLine();

                int index = text.indexOf("@");
                int index3 = text.indexOf("|");
                int index1 = text.indexOf("#");
                int index2 = text.indexOf("*");

                String sub = text.substring(index + 1, index3);
                String end = text.substring(index1 + 1, index2);

                System.out.printf("%s is %s years old.%n", sub, end);

        }
    }
}
