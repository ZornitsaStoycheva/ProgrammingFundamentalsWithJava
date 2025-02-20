package RegularExpressionsLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "\\+359([- ])2\\1[0-9]{3}\\1[0-9]{4}\\b";

        List<String> list = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            list.add(matcher.group());
        }

        System.out.println(String.join(", ", list));
    }
}
