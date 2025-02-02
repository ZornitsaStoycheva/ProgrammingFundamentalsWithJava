package TextProcessingExercise;

import java.util.Scanner;

public class CharacterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        long sum = 0;

        String first = input[0];
        String second = input[1];

        char[] firstChar = first.toCharArray();
        char[] secondChar = second.toCharArray();

        int minArr = Math.min(input[0].length(), input[1].length());

        for (int i = 0; i < minArr; i++) {
            long total = (long) firstChar[i] * secondChar[i];
            sum += total;

        }

        if (firstChar.length > secondChar.length) {
            for (int j = 0; j < firstChar.length - minArr; j++) {
                sum += firstChar[j + minArr];
            }
        } else {
            for (int j = 0; j < secondChar.length - minArr; j++) {
                sum += firstChar[j + minArr];
            }
        }

        System.out.println(sum);
    }
}
