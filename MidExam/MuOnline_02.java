package MidExam;

import java.util.Scanner;

public class MuOnline_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        int initialHeath = 100;
        int bitcoins = 0;

        for (int i = 0; i < input.length; i++) {
            String[] rooms = input[i].split(" ");

            String command = rooms[0];
            int number = Integer.parseInt(rooms[1]);

            if (command.equals("potion")) {

                if(initialHeath + number > 100) {
                    int diff = Math.abs((initialHeath + number) - 100 - number);
                    initialHeath = 100;
                    System.out.printf("You healed for %d hp.%n", diff);
                } else {
                    initialHeath += number;
                    System.out.printf("You healed for %d hp.%n", number);
                }

                System.out.printf("Current health: %d hp.%n", initialHeath);

            } else if (command.equals("chest")) {
                bitcoins += number;
                System.out.printf("You found %d bitcoins.%n", number);
            } else {
                if(initialHeath - number > 0) {
                    initialHeath -= number;
                    System.out.printf("You slayed %s.%n", command);
                } else {
                    initialHeath = 0;
                    System.out.printf("You died! Killed by %s.%n", command);
                    System.out.printf("Best room: %d%n", i + 1);
                    break;
                }
            }
        }

        if(initialHeath > 0) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", initialHeath);
        }
    }
}
