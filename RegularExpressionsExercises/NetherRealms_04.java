package RegularExpressionsExercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NetherRealms_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] demons = scanner.nextLine()
                .replace(" ", "")
                .split(",");

        int heath = 0;
        double damage = 0.0;

        for (int i = 0; i < demons.length; i++) {
            char[] symbols = demons[i].toCharArray();

            for (int j = 0; j < symbols.length; j++) {
                char symbol = symbols[j];

                if(symbol != '+' && symbol != '-' && symbol != '*'
                && symbol != '/' && symbol != '.' && !Character.isDigit(symbol)) {
                    heath += symbol;
                }
            }

            String regex = "[-]?[0-9]+\\.?[0-9]*";

            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(demons[i]);

            while (matcher.find()) {
                double currentDamage = Double.parseDouble(matcher.group());
                damage += currentDamage;
            }

            for (int j = 0; j < symbols.length; j++) {
                char currentSymbol = symbols[j];

                if(currentSymbol == '*') {
                    damage *= 2;
                } else if (currentSymbol == '/') {
                    damage /= 2;
                }
            }

            System.out.printf("%s - %d health, %.2f damage\n", demons[i], heath, damage);
            heath = 0;
            damage = 0.0;
        }
    }
}
