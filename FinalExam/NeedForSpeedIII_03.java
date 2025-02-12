package FinalExam;

import java.util.*;

public class NeedForSpeedIII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> cars = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] tokens = scanner.nextLine().split("\\|");

            String car = tokens[0];
            int mileage = Integer.parseInt(tokens[1]);
            int fuel = Integer.parseInt(tokens[2]);

            if (!cars.containsKey(car)) {
                cars.put(car, new ArrayList<>());
                cars.get(car).add(0, mileage);
                cars.get(car).add(1, fuel);
            }
        }

        String input = scanner.nextLine();

        while (!input.equals("Stop")) {

            String[] inputLine = input.split("\\s+:\\s+");
            String command = inputLine[0];
            String car = inputLine[1];

            if (command.equals("Drive")) {
                int distance = Integer.parseInt(inputLine[2]);
                int fuel = Integer.parseInt(inputLine[3]);

                List<Integer> list = cars.get(car);
                int mileage = list.get(0);
                int fuelCar = list.get(1);

                if (fuelCar >= fuel) {
                    cars.get(car).set(1, fuelCar - fuel);
                    cars.get(car).set(0, mileage + distance);
                    System.out.printf("%s driven for %d kilometers. %d liters of fuel consumed.%n",
                            car, distance, fuel);
                } else {
                    System.out.println("Not enough fuel to make that ride");
                }

                if (cars.get(car).get(0) >= 100000) {
                    cars.remove(car);
                    System.out.printf("Time to sell the %s!%n", car);
                }

            } else if (command.equals("Refuel")) {
                int fuel = Integer.parseInt(inputLine[2]);

                String output = "";

                List<Integer> list = cars.get(car);
                int fuelCar = list.get(1);

                int tank = fuelCar + fuel;

                if (tank <= 75) {
                    System.out.printf("%s refueled with %d liters%n", car, fuel);
                    cars.get(car).set(1, tank);
                } else {
                    System.out.printf("%s refueled with %d liters%n", car, 75 - fuelCar);
                    cars.get(car).set(1, 75);
                }

                System.out.printf(output, car, tank);

            } else if (command.equals("Revert")) {
                int kilometers = Integer.parseInt(inputLine[2]);

                List<Integer> list = cars.get(car);
                int mileage = list.get(0);

                cars.get(car).set(0, mileage - kilometers);

                if (cars.get(car).get(0) < 10000) {
                    cars.get(car).set(0, 10000);
                } else {
                    System.out.printf("%s mileage decreased by %d kilometers%n", car, kilometers);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : cars.entrySet()) {
            System.out.printf("%s -> Mileage: %d kms, Fuel in the tank: %d lt.%n",
                    entry.getKey(), entry.getValue().get(0), entry.getValue().get(1));
        }

    }
}
