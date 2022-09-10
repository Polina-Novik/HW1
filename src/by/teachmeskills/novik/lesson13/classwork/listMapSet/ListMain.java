package by.teachmeskills.novik.lesson13.classwork.listMapSet;

import java.util.*;

public class ListMain {
    //List - collection
    //ArrayList (like in Array) [1,2,3,4,5] they are putted like we wanted. easier to find
    //LinkedList 1->2->3 objects are connected like a chain. 2 knows there are 1 and 3 near. easier to enter
    public static void main(String[] args) {
        //ArrayList <Integer> arrayList=new ArrayList<>(); //old version
        List<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.addAll(Arrays.asList(3,4,5,6,7,8,9,10));
        System.out.println(arrayList);
        arrayList.add(2,5);
        System.out.println(arrayList);
        //to change
        arrayList.set(2, 8);
        System.out.println(arrayList);
        System.out.println(arrayList.get(2));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        System.out.println(arrayList.contains(7));
        System.out.println(arrayList.subList(2,5)); //new arrayList 2,3,4 element
        System.out.println(arrayList.indexOf(7)); //find index
        System.out.println(arrayList.lastIndexOf(7)); //checks from the end
        System.out.println(arrayList.indexOf(8));
        System.out.println(arrayList.lastIndexOf(8));
       // System.out.println(arrayList.remove(3));
        System.out.println(arrayList.remove(Integer.valueOf(8)));
        System.out.println(arrayList);
        int sum=0;
        for (int value: arrayList){
            sum+=value; //cannot delete here
        }
        Iterator<Integer> iterator = arrayList.iterator();
        int counter=0;
        while (iterator.hasNext()) {
            int current=iterator.next();
            if (current>7) { //current==0
                //int current=iterator.next();
               // iterator.next(); //can delete here
               // iterator.remove();
               // counter++;
                iterator.remove();
            }
        }
        Collections.sort(arrayList); //for String alph
        Collections.reverse(arrayList);
        System.out.println(arrayList);
        Collections.shuffle(arrayList); //random changing place may be added new Random
        System.out.println(arrayList);
    }
}
