package MapsLambdaAndStreamAPIExercise;

import java.io.PrintStream;
import java.util.*;

public class StudentAcademy_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentsAcademy = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String student = scanner.nextLine();
            double grade = Double.parseDouble(scanner.nextLine());

            if(!studentsAcademy.containsKey(student)) {
                studentsAcademy.put(student, new ArrayList<>());
                studentsAcademy.get(student).add(grade);
            } else {
                studentsAcademy.get(student).add(grade);
            }
        }

        for (Map.Entry<String, List<Double>> entry : studentsAcademy.entrySet()) {

            double average = entry.getValue().stream().mapToDouble(a -> a).average().orElse(0.0);

            if(average >= 4.50) {
                System.out.printf("%s -> %.2f%n", entry.getKey(), average);
            }
        }

    }
}
