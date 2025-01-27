package ListsMoreExercise;

import java.util.*;
import java.util.stream.Collectors;

public class MixedUpLists_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> numbers2 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        List<Integer> nums = new ArrayList<>();
        List<Integer> sortNum = new ArrayList<>();

        int size = 0;

        if (numbers1.size() > numbers2.size()) {
            size = numbers1.size();
        } else {
            size = numbers2.size();
        }

        Collections.reverse(numbers2);

        for (int i = 0; i < size - 2; i++) {
            if (numbers1.size() > numbers2.size()) {
                nums.add(numbers1.get(i));
                nums.add(numbers2.get(i));
            } else {
                nums.add(numbers2.get(i));
                nums.add(numbers1.get(i));
            }
        }

        int lastIndex = 0;
        int lastExIndex = 0;

        if (size == numbers1.size()) {
            lastExIndex = numbers1.get(numbers1.size() - 1 - 1);
            lastIndex = numbers1.get(numbers1.size() - 1);
        } else {
            lastExIndex = numbers2.get(numbers2.size() - 1 - 1);
            lastIndex = numbers2.get(numbers2.size() - 1);
        }

        for (int i = 0; i < nums.size(); i++) {
            if (lastExIndex < lastIndex) {
                if (nums.get(i) > lastExIndex && nums.get(i) < lastIndex) {
                    sortNum.add(nums.get(i));
                }
            } else {
                if (nums.get(i) > lastIndex && nums.get(i) < lastExIndex) {
                    sortNum.add(nums.get(i));
                }
            }
        }

        Collections.sort(sortNum);

        for (int element : sortNum) {
            System.out.print(element + " ");
        }
    }
}
