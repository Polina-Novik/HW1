package by.teachmeskills.novik.lesson14.classwork;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterfaceMain {
    public static void main(String[] args) {
        Predicate<Integer> myPredicate = value -> value > 3; //this interface has only 1 method, shows true/false
        //if number>3 true
        //like get Value; return true/false
        System.out.println(myPredicate.test(5));
        System.out.println(myPredicate.test(2));
        Consumer<String> myConsumer = str -> {
            System.out.println(str) /*here can be if else etc  */;
        }; //get something,return nothing
        myConsumer.accept("my first phrase");
        myConsumer.accept("my second phrase");
        Supplier<Integer> mySupplier = () -> 5; //nothing get, something return. for example return something according to the date
       Function<String,Integer> myFunction=str -> str.length(); //get String, return Integer. get one type, return another
      myFunction.apply("d");
    }

    private static void print(String str) { //we must write String etc., in functional interface can add methods

    }
}
