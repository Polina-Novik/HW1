package by.teachmeskills.novik.lesson15.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SecondStudents {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Anna", "Bogdan", "Alina", "Olga", "Polina", "Polina", "Pavel", "Anton", "Angelina"));
        System.out.println("Enter your name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("number of people with your name: " + names.stream().filter(x -> x.equals(name)).count());
        names.stream().filter(x -> x.toLowerCase().startsWith("a")).forEach(x -> System.out.print(x + " "));
        System.out.println();
        System.out.println(names.stream().sorted().findFirst());
    }
}
