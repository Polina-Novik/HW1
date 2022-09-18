package by.teachmeskills.novik.lesson15.classwork;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) throws IOException {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 1, 1, 3, 3, 4, 5, 6, 7, 9));
        Stream<Integer> intStream = numbers.parallelStream(); //if there is posibility it will do operations at the moment
        Stream<Integer> myNextStream = Stream.of(1, 2, 3, 4, 5);
        Stream<String> linesStream = Files.lines(new File("file.txt").toPath());
        Stream<List<Integer>> listStream = Stream.of(numbers, numbers);
        Stream<Integer> values = Stream.generate(() -> new Random().nextInt()); //operation^ two types intermediate and final
        final int[] sum = new int[1];
        sum[0] = 0;

        intStream.sorted((a, b) -> b.compareTo(a)) //sort all stream //compare b to a - reverse. or(a,b) -> b-a,or b-5*a
                .distinct() //delete repeating elements

                .skip(2) //skip first 2, starts from 3
                .limit(3)
                .peek(x -> {
                    /*sum[0]+=x;*/
                    System.out.print(x + " ");//in peek we can put only int that can be written with final
                }) //write all at that moment
                .map(x -> x * x) //math in map
                .filter(x -> x < 30)
                .forEach(x -> System.out.println(x)); //works for stream,limit - first 3. if write 100 - no exception//intStream use only one type like a river
        System.out.println("Sum " + sum[0]); //better not to add sum

        numbers.forEach(x -> System.out.println(x)); //for list
        Map<String, String> myMap = new HashMap<>();
        myMap.forEach((key, value) -> System.out.println(key + " " + value)); //for map
        System.out.println("-------------");
        System.out.println(LocalDateTime.now()); //foreach final operation, the end, before it intermediats
        // List<Integer> myResultList=
        Set<Integer> myResultList =
                listStream.flatMap(Collection::stream)
                        .collect(Collectors.toSet()); //collect all that came to String and put in Set
        //.collect(Collectors.toList()); //collects in myResultList
        //.forEach(x -> System.out.print(x + " "));;
        System.out.println(myResultList);
        System.out.println(LocalDateTime.now());
        myNextStream.filter(x -> x > 3)
                //.findFirst(); //find first element that >3
                //.findAny(); //faster but any
                //.anyMatch(x->x>4); //finds >4, true or false
                //.noneMatch(x->x>4); //finds any false
                //.allMatch(x->x>4);
               // .count(); //how many elements came to the end, for hw
                .mapToDouble(x->x) //mapToInteger, mapToLong. thanks to that we can do math operation
        .average();
        myNextStream.filter(x -> x > 3)
                .mapToDouble(x->x)
                .sum();
        myNextStream.filter(x -> x > 3)
                .mapToDouble(x->x)
                .max();
        myNextStream.filter(x -> x > 3)
                .mapToDouble(x->x)
                .min();
        myNextStream.filter(x -> x > 3).mapToDouble(x->x).summaryStatistics(); //counts all
    }
} //hw for each task in 1 new stream new method
