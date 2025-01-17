package MethodsLab;

import java.util.Scanner;

public class GreaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.equals("int")) {
            int n1 = Integer.parseInt(scanner.nextLine());
            int n2 = Integer.parseInt(scanner.nextLine());

            System.out.println(getMax(n1, n2));
        } else if (input.equals("char")) {
            char a = scanner.nextLine().charAt(0);
            char b = scanner.nextLine().charAt(0);

            System.out.println(getMax(a, b));
        } else if (input.equals("string")) {
            String text = scanner.nextLine();
            String other = scanner.nextLine();

            System.out.println(getMax(text, other));
        }

    }
    public static int getMax(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        }
        return n2;
    }

    public static char getMax(char a, char b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    public static String getMax(String text, String other) {
        if (text.compareTo(other) >= 0) {
            return text;
        }
        return other;
    }
}
