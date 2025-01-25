package MidExam;

import java.util.Scanner;

public class CounterStrike_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int initialEnergy = Integer.parseInt(scanner.nextLine());

        int won = 0;

        String input = scanner.nextLine();

        while (!input.equals("End of battle")) {

            int distance = Integer.parseInt(input);

            if (initialEnergy >= distance) {
                initialEnergy -= distance;
                won ++;
            } else {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy", won, initialEnergy);
                break;
            }

            if (won % 3 == 0) {
                initialEnergy += won;
            }

            input = scanner.nextLine();
        }

        if (input.equals("End of battle")) {
            System.out.printf("Won battles: %d. Energy left: %d", won, initialEnergy);
        }
    }
}
