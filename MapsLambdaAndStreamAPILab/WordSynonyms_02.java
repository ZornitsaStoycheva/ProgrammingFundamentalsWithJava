package MapsLambdaAndStreamAPILab;

import java.util.*;
import java.util.stream.Collectors;

public class WordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<String>> words = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();
            String synonym = scanner.nextLine();

            if (!words.containsKey(word)) {
                words.put(word, new ArrayList<>());
                words.get(word).add(synonym);
            } else {
                words.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : words.entrySet()) {
            String separator = ", ";
            String output = entry.getValue().stream().map(String::valueOf)
                    .collect(Collectors.joining(separator));
            System.out.printf("%s - %s%n", entry.getKey(), output);
        }

    }
}
