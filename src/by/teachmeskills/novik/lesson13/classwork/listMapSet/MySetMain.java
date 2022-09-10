package by.teachmeskills.novik.lesson13.classwork.listMapSet;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySetMain {
    //Set - collection, elements with no repeating
    //HashSet faster to find. works with hash sum.Hashcode: letters correspond to numbers
    //TreeSet increasing data
    public static void main(String[] args) {
        Set<String> mySet=new HashSet<>();
        System.out.println(mySet.size());
        mySet.add("first");
        mySet.addAll(Arrays.asList("first","second","mine")); //doesn't add similar
        System.out.println(mySet); //hash
        Set<String> mySet1=new TreeSet<>();
        mySet1.addAll(Arrays.asList("first","second","mine"));
        System.out.println(mySet1);
        System.out.println("contains mine "+mySet.contains("mine"));
        System.out.println(mySet.isEmpty());
        System.out.println(mySet.remove("second"));
        System.out.println(mySet);
    }
}
