package RegularExpressionsExercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

        List<String> attackedPlanet = new ArrayList<>();
        List<String> destroyedPlanet = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            int count = 0;

            String message = scanner.nextLine();
            for (int j = 0; j < message.length(); j++) {
                char symbol = message.charAt(j);
                if (symbol == 's' || symbol == 'a' || symbol == 't' || symbol == 'r'
                || symbol == 'S' || symbol == 'A' || symbol == 'T' || symbol == 'R') {
                    count++;
                }
            }

            for (int j = 0; j < message.length(); j++) {
                int digit = message.charAt(j);
                int decryptDigit = digit - count;
                sb.append((char) decryptDigit);
            }

            String regex = "@(?<namePlanet>[A-Za-z]+)[^@!:>-]*:(?<peoplePlanet>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldiersCount>[0-9]+)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb.toString());

            if (matcher.find()) {
                String namePlanet = matcher.group("namePlanet");
                int peoplePlanet = Integer.parseInt(matcher.group("peoplePlanet"));
                String attack = matcher.group("attack");
                int soldierCount = Integer.parseInt(matcher.group("soldiersCount"));

                if (attack.equals("A")) {
                    attackedPlanet.add(namePlanet);
                } else if (attack.equals("D")) {
                    destroyedPlanet.add(namePlanet);
                }
            }
            sb.delete(0, sb.length());
        }

        System.out.printf("Attacked planets: %d%n", attackedPlanet.size());
        Collections.sort(attackedPlanet);
        attackedPlanet.forEach(x -> System.out.printf("-> %s%n", x));

        System.out.printf("Destroyed planets: %d%n", destroyedPlanet.size());
        Collections.sort(destroyedPlanet);
        destroyedPlanet.forEach(x -> System.out.printf("-> %s%n", x));
    }
}
