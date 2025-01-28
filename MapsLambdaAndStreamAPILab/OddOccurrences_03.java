package MapsLambdaAndStreamAPILab;

import java.util.*;
import java.util.stream.Collectors;

public class OddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(" ");

        Map<String, Integer> counts = new LinkedHashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (!counts.containsKey(word)) {
                counts.put(word, 1);
            } else {
                counts.put(word, counts.get(word) + 1);
            }
        }

        List<String> odd = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() % 2 == 1) {
                odd.add(entry.getKey());
            }
        }

        System.out.println(String.join(", ", odd));
    }
}
