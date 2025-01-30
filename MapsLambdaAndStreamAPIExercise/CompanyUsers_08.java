package MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class CompanyUsers_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, Set<String>> companyUsers = new LinkedHashMap<>();

        while (!input.equals("End")) {

            String[] inputLine = input.split(" -> ");

            String company = inputLine[0];
            String employeeId = inputLine[1];


            if(!companyUsers.containsKey(company)) {
                companyUsers.put(company, new LinkedHashSet<>());
                companyUsers.get(company).add(employeeId);
            } else {
                companyUsers.get(company).add(employeeId);
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, Set<String>> entry : companyUsers.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String employee : entry.getValue()) {
                System.out.printf("-- %s%n", employee);
            }
        }

    }
}
