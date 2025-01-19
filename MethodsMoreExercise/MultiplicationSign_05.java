package MethodsMoreExercise;

import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());

        if (n1 < 0 || n2 < 0 || n3 < 0) {
            System.out.println("negative");
        } else if (n1 == 0 || n2 == 0 || n3 == 0) {
            System.out.println("zero");
        } else {
            System.out.println("positive");
        }

    }
}
