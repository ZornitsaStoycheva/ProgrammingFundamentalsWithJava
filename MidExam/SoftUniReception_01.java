package MidExam;

import java.util.Scanner;

public class SoftUniReception_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstEmployee = Integer.parseInt(scanner.nextLine());
        int secondEmployee = Integer.parseInt(scanner.nextLine());
        int threeEmployee = Integer.parseInt(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());

        int total = firstEmployee + secondEmployee + threeEmployee;
        int hours = 0;
        int students = countStudents;
        int counter = 0;

        while (students > 0) {

            counter++;
            hours++;
            if(counter % 4 != 0) {
                students -= total;
            }

            if (students <= 0 && counter % 3 == 0) {
                hours++;
            }
        }

        System.out.printf("Time needed: %dh.", hours);
    }
}
