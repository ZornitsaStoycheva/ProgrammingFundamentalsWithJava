package DataTypesAndVariablesExercise;

import java.util.Scanner;

public class SpiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yield = Integer.parseInt(scanner.nextLine());

        int days = 0;
        int works = 0;

        while (yield > 0) {

            if (works <= 0 && yield < 100) {
                break;
            }

            if (yield < 100) {
                works -= 26;
                break;
            }

            works += yield - 26;
            yield -= 10;
            days ++;
        }
        System.out.println(days);
        System.out.println(works);

    }
}
