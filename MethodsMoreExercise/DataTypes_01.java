package MethodsMoreExercise;

import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine();

        if (data.equals("int")) {
            int num = Integer.parseInt(scanner.nextLine());
            System.out.println(methodInt(num));

        } else if (data.equals("real")) {
            double num = Double.parseDouble(scanner.nextLine());
            double print = methodDouble(num);
            System.out.printf("%.2f", print);

        } else if (data.equals("string")) {
            String text = scanner.nextLine();
            System.out.println(methodString(text));
        }
    }

    public static int methodInt(int n) {
        return n * 2;
    }

    public static  double methodDouble(double n) {
        return n * 1.5;
    }

    public static String methodString(String text) {
        String output = "$".concat(text).concat("$");
        return output;
    }
}
