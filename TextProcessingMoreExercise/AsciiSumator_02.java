package TextProcessingMoreExercise;

import java.util.Scanner;

public class AsciiSumator_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();
        String second = scanner.nextLine();

        int x = first.charAt(0);
        int y = second.charAt(0);

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        int sum = 0;

        String text = scanner.nextLine();

        for (int i = 0; i < text.length(); i++) {
            int z = text.charAt(i);

            if (z > min && z < max) {
                sum += z;
            }
        }

        System.out.println(sum);
    }
}
