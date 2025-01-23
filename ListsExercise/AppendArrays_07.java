package ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppendArrays_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\|");

        List<String> arrList = new ArrayList<>();

        for (int i = input.length - 1; i >= 0 ; i--) {
            String[] currentEl = input[i].split("\\s+");

            for (int j = 0; j < currentEl.length; j++) {
                if(!currentEl[j].equals("")) {
                    arrList.add(currentEl[j]);
                }
            }
        }

        for (String element : arrList) {
            System.out.print(element + " ");
        }
    }
}
