package MethodsLab;

import java.util.Scanner;

public class RepeatString_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(repeatText(text, n));
    }
    public static String repeatText(String text, int n) {
        String output = "";
        output = text.repeat(n);

        return  output;
    }
}
