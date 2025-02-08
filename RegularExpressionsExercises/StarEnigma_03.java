package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StarEnigma_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        StringBuilder sb = new StringBuilder();

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

            String regex = "(@(?<namePlanet>[A-Z][a-z]+)([^@\\->!:]*):(?<peoplePlanet>[0-9]+)([^@\\->!:]*)!(?<attack>[A|D])([^@\\->!:]*)!->(?<soldierCount>[0-9]+)\\b)";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(sb.toString());

            System.out.println(sb.toString());

            int countAttacked = 0;
            int countDestroyed = 0;

            if (matcher.find()) {
                String namePlanet = matcher.group("namePlanet");
                int peoplePlanet = Integer.parseInt(matcher.group("peoplePlanet"));
                String attack = matcher.group("attack");
                int soldierCount = Integer.parseInt(matcher.group("soldierCount"));

                if (attack.equals("A")) {
                    countAttacked ++;
                } else if (attack.equals("D")) {
                    countDestroyed ++;
                }

                System.out.println(countAttacked);
                System.out.println(countDestroyed);
            }
            sb.delete(0, sb.length());
        }
    }
}
