package MethodsLab;

import java.util.Scanner;

public class Grades_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double grade = Double.parseDouble(scanner.nextLine());

        grade(grade);
    }
    public static double grade(double grade) {
        String output = "";

        if (grade >= 2.00 && grade <= 2.99) {
            output = "Fail";
        } else if (grade >= 3.00 && grade <= 3.49) {
            output = "Poor";
        } else if (grade >= 3.50 && grade <= 4.49) {
            output = "Good";
        } else if (grade >= 4.50 && grade <= 5.49) {
            output = "Very good";
        } else if (grade >= 5.50 && grade <= 6.00) {
            output = "Excellent";
        }
        System.out.println(output);
        return grade;
    }
}
