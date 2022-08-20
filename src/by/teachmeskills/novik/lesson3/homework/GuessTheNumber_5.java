package by.teachmeskills.novik.lesson3.homework;

import java.util.Random;

public class GuessTheNumber_5 {
    public static void main(String[] args) {
        System.out.println("Угадайте число от 1 до 15, у вас 3 попытки");
        Random r = new Random();
        int a = 1 + r.nextInt(15);

        for (int i = 1; i <= 3; i = i + 1) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            int b = scanner.nextInt();

            if (b != a) {
                System.out.println("Неверно");
            if (i==3) {
                    System.out.println("Вы проиграли, но не расстраивайтесь!!!");
                }}
           else{
                {
                    System.out.println("Поздравляю,вы угадали");
                    break;
                }
            }

        }
    }
}

