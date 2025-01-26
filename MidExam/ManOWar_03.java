package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ManOWar_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] pirateShip = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] warship = Arrays.stream(scanner.nextLine().split(">"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int heathCapacity = Integer.parseInt(scanner.nextLine());

        boolean isWonPirateShip = false;
        boolean isWonWarship = false;

        String input = scanner.nextLine();

        while (!input.equals("Retire")) {

            String[] commandLine = input.split(" ");

            if (commandLine[0].equals("Fire")) {

                int index = Integer.parseInt(commandLine[1]);
                int damage = Integer.parseInt(commandLine[2]);

                boolean isValid = isValidIndexWarship(index, warship);

                if (isValid) {
                    int current = warship[index];

                    if (current - damage <= 0) {
                        isWonPirateShip = true;
                        System.out.println("You won! The enemy ship has sunken");
                        break;
                    } else {
                        warship[index] -= damage;
                    }
                }

            } else if (commandLine[0].equals("Defend")) {

                int index = Integer.parseInt(commandLine[1]);
                int endIndex = Integer.parseInt(commandLine[2]);
                int damage = Integer.parseInt(commandLine[3]);

                boolean isValid1 = isValidIndexPirateShip(index, pirateShip);
                boolean isValid2 = isValidIndexPirateShip(endIndex, pirateShip);

                if (isValid1 && isValid2) {
                    for (int i = index; i <= endIndex; i++) {
                        int current = pirateShip[i];

                        if(current - damage <= 0) {
                            isWonWarship = true;
                            System.out.println("You lost! The pirate ship has sunken.");
                            break;
                        }

                        pirateShip[i] -= damage;
                    }
                }

            } else if (commandLine[0].equals("Repair")) {

                int index = Integer.parseInt(commandLine[1]);
                int heath = Integer.parseInt(commandLine[2]);

                boolean isValid = isValidIndexPirateShip(index, pirateShip);

                if (isValid) {
                    int current = pirateShip[index];

                    if (current + heath > heathCapacity) {
                        pirateShip[index] = heathCapacity;
                    } else {
                        pirateShip[index] += heath;
                    }
                }

            } else if (commandLine[0].equals("Status")) {

                double sum = heathCapacity * 0.20;
                int counter = 0;

                for (int i = 0; i < pirateShip.length; i++) {
                    int current = pirateShip[i];

                    if (current < sum) {
                        counter++;
                    }
                }

                System.out.printf("%d sections need repair.%n", counter);
            }

            input = scanner.nextLine();
        }

        int sumPirate = Arrays.stream(pirateShip).sum();
        int sumWarship = Arrays.stream(warship).sum();

        if (!isWonPirateShip && !isWonWarship) {
            System.out.printf("Pirate ship status: %d%n", sumPirate);
            System.out.printf("Warship status: %d%n", sumWarship);
        }
    }

    public static boolean isValidIndexPirateShip(int index, int[] arr) {
        return index >= 0 && index < arr.length;
    }

    public static boolean isValidIndexWarship(int index, int[] arr) {
        return index >= 0 && index < arr.length;
    }
}
