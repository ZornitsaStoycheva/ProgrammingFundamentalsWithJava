package MethodsExercise;

import java.util.Scanner;

public class VowelsCount_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        vowelsCount(text);
    }
    public static void vowelsCount(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char symbol = text.charAt(i);
            if(symbol == 'a' || symbol == 'e' || symbol == 'i' || symbol == 'u' || symbol == 'o'
            || symbol == 'A' || symbol == 'E' || symbol == 'I' || symbol == 'U' || symbol == 'O') {
                count ++;
            }
        }
        System.out.println(count);
    }
}
