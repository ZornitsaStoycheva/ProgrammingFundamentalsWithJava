package ListsMoreExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class TakeSkipRope_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String arr = scanner.nextLine();

        List<Integer> nums = new ArrayList<>();
        List<String> symbols = new ArrayList<>();
        List<Integer> takeList = new ArrayList<>();
        List<Integer> skipList = new ArrayList<>();

        for (int i = 0; i < arr.length(); i++) {

            char symbol = arr.charAt(i);
            if(Character.isDigit(symbol)) {
                nums.add(Integer.parseInt(String.valueOf(symbol)));
            } else {
                symbols.add(String.valueOf(symbol));
            }
        }

        for (int i = 0; i < nums.size(); i++) {
            if (i % 2 == 0) {
                takeList.add(nums.get(i));
            } else {
                skipList.add(nums.get(i));
            }
        }

        String text = "";
        int counter = -1;

        for (int i = 0; i < takeList.size(); i++) {
            int take = takeList.get(i);
            int skip = skipList.get(i);

            for (int j = 0; j < take; j++) {
                counter++;

                if (counter == symbols.size()) {
                    break;
                }
                    String s = symbols.get(counter);
                    text = text.concat(s);

            }

            for (int j = 0; j < skip; j++) {
                counter++;
            }

        }

        System.out.println(text);
    }
}
