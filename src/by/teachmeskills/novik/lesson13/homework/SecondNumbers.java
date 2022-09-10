package by.teachmeskills.novik.lesson13.homework;

import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SecondNumbers {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        try (FileReader fileReader = new FileReader("numbers.txt")) {
            Scanner scanner = new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                String numbers = scanner.nextLine();
                String[] numbersArray = numbers.split(" ");
                mySet.addAll(Arrays.asList(numbersArray));
            }
            System.out.println(mySet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
