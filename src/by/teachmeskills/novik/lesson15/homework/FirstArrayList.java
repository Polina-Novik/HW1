package by.teachmeskills.novik.lesson15.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class FirstArrayList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int r = random.nextInt(20);
            numbers.add(r);
        }
        numbers.forEach(x -> System.out.print(x + " "));
        System.out.println();
        numbers.stream().distinct().forEach(x -> System.out.print(x + " "));
        System.out.println();
        numbers.stream().filter(x -> x < 17).filter(x -> x > 7)
                .filter(x -> (x % 2 == 0)).forEach(x -> System.out.print(x + " "));
        System.out.println();
        numbers.stream().map(x -> x * 2).forEach(x -> System.out.print(x + " "));
        System.out.println();
        numbers.stream().sorted().limit(4).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println((long) numbers.size());
        System.out.println(numbers.stream().mapToDouble(x -> x).average());
    }
}
