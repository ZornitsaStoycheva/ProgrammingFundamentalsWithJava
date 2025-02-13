package FinalExam;

import java.util.*;

public class HeroesOfCodeAndLogicVII_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, List<Integer>> heroes = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String[] tokens = input.split(" ");

            String hero = tokens[0];
            int HP = Integer.parseInt(tokens[1]);
            int MP = Integer.parseInt(tokens[2]);

            if (!heroes.containsKey(hero)) {
                heroes.put(hero, new ArrayList<>());
                heroes.get(hero).add(0, HP);
                heroes.get(hero).add(1, MP);

                if (HP > 100) {
                    heroes.get(hero).set(0, 100);
                }

                if (MP > 200) {
                    heroes.get(hero).set(1, 200);
                }
            }
        }

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {

            String[] tokens = inputLine.split("\\s+-\\s+");
            String command = tokens[0];
            String heroName = tokens[1];

            if (command.equals("CastSpell")) {

                int neededMP = Integer.parseInt(tokens[2]);
                String spellName = tokens[3];

                int MP = heroes.get(heroName).get(1);

                if (MP >= neededMP) {
                    int manaPoints = MP - neededMP;
                    heroes.get(heroName).set(1, manaPoints);
                    System.out.printf("%s has successfully cast %s and now has %d MP!%n",
                            heroName, spellName, manaPoints);
                } else {
                    System.out.printf("%s does not have enough MP to cast %s!%n",
                            heroName, spellName);
                }

            } else if (command.equals("TakeDamage")) {

                int damage = Integer.parseInt(tokens[2]);
                String attacker = tokens[3];

                int HP = heroes.get(heroName).get(0);

                if(HP - damage > 0) {
                    int hitPoints = HP - damage;
                    heroes.get(heroName).set(0, hitPoints);
                    System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n",
                            heroName, damage, attacker, hitPoints);
                } else {
                    heroes.remove(heroName);
                    System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                }

            } else if (command.equals("Recharge")) {

                int amount = Integer.parseInt(tokens[2]);

                int MP = heroes.get(heroName).get(1);

                int sum = MP + amount;

                if (sum > 200) {
                    heroes.get(heroName).set(1, 200);
                    System.out.printf("%s recharged for %d MP!%n", heroName, 200 - MP);
                } else {
                    heroes.get(heroName).set(1, sum);
                    System.out.printf("%s recharged for %d MP!%n", heroName, amount);
                }


            } else if (command.equals("Heal")) {

                int amount = Integer.parseInt(tokens[2]);

                int HP = heroes.get(heroName).get(0);

                int sum = HP + amount;

                if (sum > 100) {
                    heroes.get(heroName).set(0, 100);
                    System.out.printf("%s healed for %d HP!%n", heroName, 100 - HP);
                } else {
                    heroes.get(heroName).set(0, sum);
                    System.out.printf("%s healed for %d HP!%n", heroName, amount);
                }
            }

            inputLine = scanner.nextLine();
        }

        for (Map.Entry<String, List<Integer>> entry : heroes.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            System.out.printf("  HP: %d%n", entry.getValue().get(0));
            System.out.printf("  MP: %d%n", entry.getValue().get(1));
        }
    }
}
