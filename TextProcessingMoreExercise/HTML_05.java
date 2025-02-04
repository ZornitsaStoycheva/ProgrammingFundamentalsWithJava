package TextProcessingMoreExercise;

import javax.swing.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class HTML_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String title = scanner.nextLine();
        String content = scanner.nextLine();

        Map<String, String> html = new LinkedHashMap<>();

        html.put(title, title);
        html.put(content, content);

        String comments = scanner.nextLine();

        while (!comments.equals("end of comments")) {

            if(html.containsKey("<div>")) {
                html.put("<div>", html.get("<div>") + comments);
            } else {
                html.put("<div>", comments);
            }

            comments = scanner.nextLine();
        }

        for (Map.Entry<String, String> entry : html.entrySet()) {
//            System.out.printf("%s%n    %s%n%s%n",entry.getKey(), entry.getValue(), entry.getKey());
//
//            if (entry.getValue().length() > 1) {
//                System.out.printf("%s%n    %s%n%s%n", entry.getKey(), entry.getValue(), entry.getValue());
//            }

            System.out.printf(
                    "<h1>%n" +
                            "    %s%n" +
                            "</h1>%n" +
                            "<article>%n" +
                            "    %s%n" +
                            "</article>%n",
                    entry.getValue()

            );
        }

    }
}
