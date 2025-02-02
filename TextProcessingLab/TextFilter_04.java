package TextProcessingLab;

import java.util.Scanner;

public class TextFilter_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            while (text.contains(word)) {

                int i1 = text.indexOf(word);
                String replace = text.replace(word, "*".repeat(word.length()));

                text = replace;
            }
        }
        System.out.println(text);
    }
}
