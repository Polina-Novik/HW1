package by.teachmeskills.novik.lesson14.classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class IntMain {
    public static void main(String[] args) {
        printValues(str -> str.length() < 5);
        System.out.println("------------------------------------------------------------");
        printValues(str -> str.length() > 6);
        System.out.println("------------------------------------------------------------");
        printValues(str -> str.startsWith("go"));
        System.out.println("------------------------------------------------------------");
        convertValues(str -> str);
        System.out.println("------------------------------------------------------------");
        convertValues(str -> str + str);
        System.out.println("------------------------------------------------------------");
        convertValues(str -> str.substring(0, 2)); //return only first two symbols
        System.out.println("------------------------------------------------------------");
        filterAndConvertValues(str -> str.length() < 5, str -> str.substring(0, 2));
        System.out.println("------------------------------------------------------------");
        filterAndConvertValues(str -> str.startsWith("go"), str -> str + str);
    }

    private static void printValues(Predicate<String> predicate) {
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("first", "second", "big", "good", "egegeii", "gogol"));
        for (String current : myElements) {
            if (predicate.test(current)) { //like if true
                System.out.println(current);
            }
        }
    }

    private static void convertValues(Function<String, String> function) {
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("first", "second", "big", "good", "egegeii", "gogol"));
        for (String element : myElements) {
            System.out.println(function.apply(element));
        }
    }

    private static void filterAndConvertValues(Predicate<String> predicate, Function<String, String> function) {
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("first", "second", "big", "good", "egegeii", "gogol"));
        for (String current : myElements) {
            if (predicate.test(current)) {
                System.out.println(function.apply(current));
            }
        }
    }

}
