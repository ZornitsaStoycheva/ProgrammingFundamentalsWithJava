package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmojiDetector_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String digits = "(?<digits>[0-9])";
        String regex = "(?<name>([*]{2})[A-Z][a-z]{2,}([*]{2})|([:]{2})[A-Z][a-z]{2,}([:]{2}))";

        Pattern pattern1 = Pattern.compile(digits);
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern1.matcher(input);

        int sum = 1;
        int counter = 0;
        List<String> emodjiList = new ArrayList<>();

        while (matcher.find()) {
            int digit = Integer.parseInt(matcher.group("digits"));

            sum *= digit;
        }

        Matcher matcher1 = pattern.matcher(input);

        while (matcher1.find()) {
            String emodji = matcher1.group("name");

            counter ++;

            int d = 0;

            for (int i = 2; i < emodji.length() - 2; i++) {
                int symbol = emodji.charAt(i);

                d += symbol;
            }

            if (d >= sum) {
                emodjiList.add(emodji);
            }

            d = 0;
        }

        System.out.printf("Cool threshold: %d%n", sum);

        System.out.printf("%d emojis found in the text. ", counter);

        System.out.println("The cool ones are:");

        emodjiList.forEach(System.out::println);
    }
}
