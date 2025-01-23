package ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> courses = Arrays.stream(scanner.nextLine().split(", "))
                .collect(Collectors.toList());

        String commandLine = scanner.nextLine();

        while (!commandLine.equals("course start")) {

            String[] commandInput = commandLine.split(":");
            String lessonTitle = commandInput[1];

            boolean isContains = courses.contains(lessonTitle);
            String course = lessonTitle.concat("-Exercise");

            if(commandInput[0].equals("Add")) {
                if (!isContains) {
                    courses.add(courses.size(), lessonTitle);
                }

            } else if (commandInput[0].equals("Insert")) {
                int index = Integer.parseInt(commandInput[2]);
                if(!isContains) {
                    courses.add(index, lessonTitle);
                }

            } else if (commandInput[0].equals("Remove")) {

                if(isContains) {
                    int indexCourse = courses.indexOf(lessonTitle);
                    String concatString = lessonTitle.concat("-Exercise");
                    if (courses.contains(concatString)) {
                        courses.remove(indexCourse + 1);
                    }
                    courses.remove(indexCourse);

                }

            } else if (commandInput[0].equals("Swap")) {
                String secondLesson = commandInput[2];
                boolean is = courses.contains(secondLesson);

                if(isContains && is) {
                    int index = courses.indexOf(lessonTitle);
                    int index2 = courses.indexOf(secondLesson);
                    String courseSwap = courses.get(index);

                    courses.set(index, secondLesson);
                    courses.set(index2, courseSwap);

                    if(courses.contains(lessonTitle.concat("-Exercise"))) {
                        String concatString = lessonTitle.concat("-Exercise");
                        int i = courses.indexOf(concatString);
                        courses.remove(i);
                        courses.add(index2 + 1, concatString);
                    }

                    if(courses.contains(secondLesson.concat("-Exercise"))) {
                        String concatString = secondLesson.concat("-Exercise");
                        int i = courses.indexOf(concatString);
                        courses.remove(i );
                        courses.add(index + 1, concatString);
                    }
                }

            } else if (commandInput[0].equals("Exercise")) {
                String concatString = lessonTitle.concat("-Exercise");
                if(!isContains) {
                    if(!courses.contains(concatString)) {
                        courses.add(courses.size(), lessonTitle);
                        courses.add(courses.size(), concatString);
                    }
                } else {
                    int index = courses.indexOf(lessonTitle);
                    courses.add(index + 1, concatString);
                }
            }

            commandLine = scanner.nextLine();
        }

        int count = 1;

        for (String element : courses) {
            System.out.printf("%d.%s%n", count, element);
            count++;
        }

    }
}
