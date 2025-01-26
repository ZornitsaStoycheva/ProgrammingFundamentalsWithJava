package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class HeartDelivery_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] cupid = Arrays.stream(scanner.nextLine().split("@"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int position = 0;

        int counter = 0;

        String input = scanner.nextLine();

        while (!input.equals("Love!")) {

            String[] inputLne = input.split(" ");
            String command = inputLne[0];
            int num = Integer.parseInt(inputLne[1]);

            if (command.equals("Jump")) {

                position = num + position;

                if(position > cupid.length - 1) {
                    position = 0;
                }

                if(cupid[position] == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", position);
                }

                if(cupid[position] > 0) {
                    if (cupid[position] - 2 == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", position);
                    }
                    cupid[position] -= 2;
                }
            }

            input = scanner.nextLine();
        }

        for (int i = 0; i < cupid.length; i++) {
            if (cupid[i] != 0) {
                counter ++;
            }
        }

        System.out.printf("Cupid's last position was %d.%n", position);

        if (counter ==  0) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", counter);
        }
    }
}
