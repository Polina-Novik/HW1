package by.teachmeskills.novik.lesson16.classwork;

import by.teachmeskills.novik.lesson15.classwork.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 1, 1, 3, 3, 4, 5, 6, 7, 9));
        Map <Integer,Long> results=numbers.stream()
                .collect(Collectors.groupingBy(//group the same
                        Function.identity(), //object that we had in list
                        Collectors.counting())); //how many times number repeat
        System.out.println(results);
        List<Person> people=new ArrayList<>();
        people.add(new Person(20,"Ivan"));
        people.add(new Person(20,"Pitar"));
        people.add(new Person(21,"Dzenya"));
        people.add(new Person(22,"Oleza"));
        people.add(new Person(24,"Ivan"));
        Map<Integer,List<Person>> listMap=people.stream().collect(Collectors.groupingBy(Person::getAge)); //grouping by age
        //integer age, List
        System.out.println(listMap); //without toString in Person looks bad
}
}