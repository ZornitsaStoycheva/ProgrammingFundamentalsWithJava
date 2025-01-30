package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class ForceBook_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> force = new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")) {

            String[] inputLine = input.split(" ");

            if (input.contains("|")) {
                String forceSide = input.split(" \\| ")[0];
                String forceUser = input.split(" \\| ")[1];

                List<String> currentUsers = force.get(forceSide);

                if (force.containsKey(forceSide)) {
                    if(!currentUsers.contains(forceUser)) {
                        force.get(forceSide).add(forceUser);
                    }
                } else {
                    force.put(forceSide, new ArrayList<>());
                    force.get(forceSide).add(forceUser);
                }

            } else if (input.contains("->")) {
                String forceUser = input.split(" -> ")[0];
                String forceSide = input.split(" -> ")[1];

                force.entrySet().forEach(entry -> entry.getValue().remove(forceUser));

                if (force.containsKey(forceSide)) {
                    List<String> currentUsers = force.get(forceSide);
                    if (!currentUsers.contains(forceUser)) {
                        currentUsers.add(forceUser);
                    }
                } else {
                    force.put(forceSide, new ArrayList<>());
                    force.get(forceSide).add(forceUser);
                }
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : force.entrySet()) {
            if (entry.getValue().size() > 0) {
                System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                entry.getValue().forEach(x -> System.out.printf("! %s%n", x, String.join(System.lineSeparator())));
            }
        }
    }
}
