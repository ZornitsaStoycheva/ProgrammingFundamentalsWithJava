package MidExam;

import java.util.Scanner;

public class BonusScoringSystem_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        int countTotalLectures = Integer.parseInt(scanner.nextLine());
        int bonus = Integer.parseInt(scanner.nextLine());

        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})
        double totalBonus = 0.0;
        double max = Double.MIN_VALUE;
        int lectures = 0;

        for (int i = 0; i < countStudents; i++) {
            int studentAttendances = Integer.parseInt(scanner.nextLine());

            totalBonus = (studentAttendances * 1.0 / countTotalLectures) * (5 + bonus);

            if(totalBonus > max) {
                max = totalBonus;
                lectures = studentAttendances;
            }
        }

        System.out.printf("Max Bonus: %d.%n", Math.round(max));
        System.out.printf("The student has attended %d lectures.", lectures);
    }
}
