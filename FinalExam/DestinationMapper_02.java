package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DestinationMapper_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([=|\\/])(?<name>[A-Z][A-Za-z]{2,})(\\1)";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        List<String> destinations = new ArrayList<>();
        int travelPoints = 0;

        while (matcher.find()) {
            String name = matcher.group("name");
            destinations.add(name);
            travelPoints += name.length();
        }

        System.out.print("Destinations: ");
        System.out.println(String.join(", ", destinations));
        System.out.printf("Travel Points: %d", travelPoints);
    }
}
