package TextProcessingLab;

import java.util.Scanner;

public class Substring_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstText = scanner.nextLine();
        String secondText = scanner.nextLine();

        while (secondText.contains(firstText)) {
            int i = secondText.indexOf(firstText);
            String substring = secondText.substring(i, i + firstText.length());
            String rep = secondText.replace(substring, "");

            secondText = rep;
        }
        System.out.println(secondText);
    }
}
