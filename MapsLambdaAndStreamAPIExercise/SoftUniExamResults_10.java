package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class SoftUniExamResults_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Integer> softUniExam = new LinkedHashMap<>();
        Map<String, Integer> counter = new LinkedHashMap<>();

        while (!input.equals("exam finished")) {
            String[] inputLine = input.split("-");
            String name = inputLine[0];

            if(!input.contains("banned")) {
                String exam = inputLine[1];
                Integer count = Integer.parseInt(inputLine[2]);

                if(!softUniExam.containsKey(name)) {
                    softUniExam.put(name, count);
                } else {

                    int currentCount = softUniExam.get(name);
                    if (count > currentCount) {
                        softUniExam.put(name, count);
                    }
                }

                if(!counter.containsKey(exam)) {
                    counter.put(exam, 1);
                } else {
                    counter.put(exam, counter.get(exam) + 1);
                }
            } else {
                softUniExam.remove(name);
            }

            input = scanner.nextLine();
        }
        System.out.println("Results:");
        for (Map.Entry<String, Integer> entry : softUniExam.entrySet()) {
            System.out.printf("%s | %s%n", entry.getKey(), entry.getValue());
        }
        System.out.println("Submissions:");

        for (Map.Entry<String, Integer> entry : counter.entrySet()) {
            System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
        }

    }
}
