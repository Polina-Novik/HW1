package by.teachmeskills.novik.lesson13.homework;

import java.util.*;

public class ThirdFruits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner console = new Scanner(System.in);
        Map<String, List<String>> foodMap = new HashMap<>();
        foodMap.put("Berries", new ArrayList<>());
        foodMap.put("Vegetables", new ArrayList<>());
        foodMap.put("Fruit", new ArrayList<>());
        for (int i = 0; i < 10; i++) {
            System.out.println("Choose category:\n1.Berries\n2.Vegetables\n3.Fruit");
            int choose = scanner.nextInt();
            while (choose < 1 || choose > 3) {
                System.out.println("Mistake");
                choose = scanner.nextInt();
            }
            System.out.println("Write subject");
            String subject = console.nextLine();
            fillFoodByCategory(foodMap, choose, subject);
        }
        System.out.println(foodMap);
    }

    private static void fillFoodByCategory(Map<String, List<String>> foodMap, int choose, String subject) {
        switch (choose) {
            case 1:
                foodMap.get("Berries").add(subject);
                break;
            case 2:
                foodMap.get("Vegetables").add(subject);
                break;
            case 3:
                foodMap.get("Fruit").add(subject);
                break;
        }
    }
}
