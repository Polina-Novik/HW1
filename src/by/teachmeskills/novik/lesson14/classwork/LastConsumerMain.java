package by.teachmeskills.novik.lesson14.classwork;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class LastConsumerMain {
    public static void main(String[] args) {
       // consumeElements(list -> System.out.println(list)); replace lambda
        consumeElements(System.out::println);
        consumeElements(list -> {
            Collections.sort(list);
            System.out.println(list);
        });
        consumeElements(list -> {
            if (list.size() > 3) {
                System.out.println(list.subList(0, 2));
            }
        });
        printOneElement(() ->0);
        Random r=new Random();
        printOneElement(() -> r.nextInt(6));
        printOneElement(() -> r.nextInt(6));
        printOneElement(() -> r.nextInt(6));
        printOneElement(() -> r.nextInt(6));
    }

    private static void consumeElements(Consumer<List<String>> consumer) {
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("first", "second", "big", "good", "egegeii", "gogol"));
        consumer.accept(myElements);
    }
    private static void printOneElement(Supplier<Integer> supplier) {
        List<String> myElements = new ArrayList<>();
        myElements.addAll(Arrays.asList("first", "second", "big", "good", "egegeii", "gogol"));
        System.out.println(myElements.get(supplier.get()));
    }
}
//HW localDate =//// parse("2022-must enter") and methods for local date/2 if monday plus days +1...
