package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class Courses_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> courses = new LinkedHashMap<>();

        while (!input.equals("end")) {

            String[] inputLine = input.split("\\s+:\\s+");
            String course = inputLine[0];
            String student = inputLine[1];

            if(!courses.containsKey(course)) {
                courses.put(course, new ArrayList<>());
                courses.get(course).add(student);
            } else {
                courses.get(course).add(student);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : courses.entrySet()) {
            int size = entry.getValue().size();
            System.out.printf("%s: %d%n", entry.getKey(), size);
            entry.getValue().forEach(x -> System.out.printf("-- %s%n", x, String.join(System.lineSeparator())));
        }

    }
}
