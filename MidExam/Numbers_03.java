package MidExam;

import java.util.*;
import java.util.stream.Collectors;

public class Numbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int averageSum = (int) numbers.stream().mapToInt(x -> x).average().orElse(0);

        List<Integer> nums = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) > averageSum) {
                nums.add(numbers.get(i));
            }
        }

        if (nums.isEmpty()) {
            System.out.println("No");
        } else {

            Collections.sort(nums, Collections.reverseOrder());

            for (int i = 0; i < nums.size(); i++) {

                if (i != 5) {
                    System.out.print(nums.get(i) + " ");
                } else {
                    break;
                }
            }
        }
    }
}
