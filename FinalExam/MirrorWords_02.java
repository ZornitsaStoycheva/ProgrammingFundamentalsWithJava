package FinalExam;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MirrorWords_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String regex = "([@#])(?<oneWord>[A-Za-z]{3,})\\1\\1(?<twoWord>[A-Za-z]{3,})";

        int counterFoundWord = 0;
        int mirrorWords = 0;
        StringBuilder sb = new StringBuilder();
        List<String[]> mirror = new ArrayList<>();

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String oneWord = matcher.group("oneWord");
            String twoWord = matcher.group("twoWord");

            counterFoundWord ++;

            sb.append(twoWord).reverse();

            if (oneWord.equals(sb.toString())) {
                mirrorWords ++;
                mirror.add(new String[]{oneWord, twoWord});
            }

            sb.delete(0, sb.length());
        }

        if (counterFoundWord != 0) {
            System.out.printf("%d word pairs found!%n", counterFoundWord);
        } else {
            System.out.println("No word pairs found!");
        }

        if (mirror.size() == 0) {
            System.out.println("No mirror words!");
        } else {
            //mirror.stream().forEach(x -> System.out.printf("%s <=> %s ", String.join(", ", x[0], x[1]) ));
            for (String[] words : mirror) {
                try (PrintStream printf = System.out.printf("%s <=> %s, ", String.join(", "), words[0], words[1])) {
                }
            }

            mirror.forEach(x -> System.out.printf("%s <=> %s ", String.join(", ", x[0], x[1])));
        }
    }
}
