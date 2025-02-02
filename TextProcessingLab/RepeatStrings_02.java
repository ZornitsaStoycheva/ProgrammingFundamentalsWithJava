package TextProcessingLab;

import java.util.Scanner;

public class RepeatStrings_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");

        String words = "";

        for (int i = 0; i < input.length; i++) {
            words += input[i].repeat(input[i].length());
        }

        System.out.println(words);
    }
}
