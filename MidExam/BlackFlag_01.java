package MidExam;

import java.util.Scanner;

public class BlackFlag_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int plunderForADay = Integer.parseInt(scanner.nextLine());
        double expectedPlunder = Double.parseDouble(scanner.nextLine());

        double sumPlunder = 0.0;

        for (int i = 1; i <= days; i++) {
            sumPlunder += plunderForADay;

            if(i % 3 == 0) {
                sumPlunder += plunderForADay * 0.50;
            }

            if (i % 5 == 0) {
                sumPlunder -= sumPlunder * 0.30;
            }
        }

        if (sumPlunder >= expectedPlunder) {
            System.out.printf("Ahoy! %.2f plunder gained.%n", sumPlunder);
        } else {
            System.out.printf("Collected only %.2f%% of the plunder.", sumPlunder / expectedPlunder * 100);
        }
    }
}
