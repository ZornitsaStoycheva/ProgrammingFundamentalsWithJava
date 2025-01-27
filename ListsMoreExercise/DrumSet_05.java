package ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class DrumSet_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saveMoney = Double.parseDouble(scanner.nextLine());
        List<Integer> drumSet = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        String input = scanner.nextLine();

        List<Integer> initialList = new ArrayList<>();

        initialList.addAll(drumSet);


        while (!input.equals("Hit it again, Gabsy!")) {

            String[] inputLine = input.split(" ");

            int hitPower = Integer.parseInt(inputLine[0]);

            for (int i = 0; i < drumSet.size(); i++) {
                int current = drumSet.get(i);

                int needMoney = initialList.get(i) * 3;

                drumSet.set(i, current - hitPower);

                if (drumSet.get(i) <= 0) {
                    if (saveMoney - needMoney <= 0) {
                        drumSet.remove(i);
                        initialList.remove(i);
                        if (i == 0 && i < drumSet.size()) {
                            i--;
                        }
                    } else {
                        saveMoney -= needMoney;
                        drumSet.set(i, initialList.get(i));
                    }
                }
            }

            input = scanner.nextLine();
        }

        drumSet.forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.printf("Gabsy has %.2flv.", saveMoney);
    }
}
