package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdAstra_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([#|])(?<itemName>[A-Za-z ]+)\\1(?<expirationDate>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})\\1(?<calories>[0-9]+)\\1";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int allCalories = 0;
        List<String[]> list = new ArrayList<>();

        while (matcher.find()) {
            String itemName = matcher.group("itemName");
            String expirationDate = matcher.group("expirationDate");
            int calories = Integer.parseInt(matcher.group("calories"));

            allCalories += calories;
            list.add(new String[]{itemName, expirationDate, String.valueOf(calories)});
        }

        int days = (int) Math.floor(allCalories * 1.0 / 2000);

        System.out.printf("You have food to last you for: %d days!%n", days);

        list.forEach(x -> System.out.printf("Item: %s, Best before: %s, Nutrition: %s%n",
                x[0], x[1], x[2]));
    }
}
