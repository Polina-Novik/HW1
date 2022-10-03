package by.teachmeskills.novik.lesson16.classwork;

import by.teachmeskills.novik.lesson15.classwork.Person;

import java.util.*;


public class StreamMainFrom15 {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 1, 1, 3, 3, 4, 5, 6, 7, 9));
       // numbers.stream().mapToDouble(x->x).average().getAsDouble(); when we know there are numbersd
      double average=  numbers.stream().mapToDouble(x->x).average().orElse(0); //if there is no numbers average =0
   //without map no average, map strings->double
        //DoubleSummaryStatistics statistics=numbers.stream().mapToDouble(x->x).summaryStatistics(); //max min averae summ allll statistics
        IntSummaryStatistics statistics=numbers.stream().mapToInt(x->x).summaryStatistics();
        System.out.println(statistics.getMax()+" "+statistics.getAverage()+" "+ statistics.getMin()+" "+ statistics.getCount()+" "+statistics.getSum());
        List < Person> people = new ArrayList<>();
        people.stream().max(Comparator.comparing(Person::getAge)); //compare int age from  lesson 15
    }
}
