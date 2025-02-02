package TextProcessingLab;

import java.util.Scanner;

public class DigitsLettersAndOther_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String digit = "";
        String letters = "";
        String other = "";

        for (int i = 0; i < text.length(); i++) {
             if(Character.isDigit(text.charAt(i))) {
                 digit += text.charAt(i);
             } else if (Character.isLetter(text.charAt(i))) {
                 letters += text.charAt(i);
             } else {
                 other += text.charAt(i);
             }
        }
        System.out.println(digit);
        System.out.println(letters);
        System.out.println(other);
    }
}
