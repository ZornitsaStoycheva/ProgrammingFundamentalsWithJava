package MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n =Integer.parseInt(scanner.nextLine());

        Map<String, String> parkingSystem = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] inputLine = scanner.nextLine().split(" ");

            String command = inputLine[0];
            String name = inputLine[1];

            if (command.equals("register")) {
                String registerNumber = inputLine[2];

                if (!parkingSystem.containsKey(name)) {
                    parkingSystem.put(name, registerNumber);
                    System.out.printf("%s registered %s successfully%n", name, registerNumber);
                } else {
                    System.out.printf("ERROR: already registered with plate number %s%n", registerNumber);
                }

            } else if (command.equals("unregister")) {
                if (!parkingSystem.containsKey(name)) {
                    System.out.printf("ERROR: user %s not found%n", name);
                } else {
                    parkingSystem.remove(name);
                    System.out.printf("%s unregistered successfully%n", name);
                }
            }
        }

        for (Map.Entry<String, String> entry : parkingSystem.entrySet()) {
            System.out.printf("%s => %s%n", entry.getKey(), entry.getValue());
        }

    }
}
