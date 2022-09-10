package by.teachmeskills.novik.lesson13.classwork.listMapSet;

import java.util.*;

public class MyMapMain {
    //Map key, value
    //like switch. 1-a,2-b. 1,2- keys, a b - values
    //key mb category, value - List<Product>
    //exist: HashMap, TreeMap
    public static void main(String[] args) {
        Map<Integer,String> doctorsMap=new HashMap<>();
        doctorsMap.put(1, "Terapevt");
        doctorsMap.put(2,"Surgeon");
        doctorsMap.put(3,"Dentist");
        System.out.println(doctorsMap);
        Map <String, List<String>> productsMap=new HashMap<>();
        productsMap.put("first category ", Arrays.asList("first prod","second prod")); //it's fixed. not more than 2 elements
        productsMap.put("second category ", new ArrayList<>()); //many elements
        System.out.println(productsMap);
        System.out.println(productsMap.get("first category "));
        System.out.println(productsMap.get("first category ").get(0));
        System.out.println(productsMap.get("second category ").add("my best product"));
        System.out.println(productsMap);
        productsMap.put("third category",productsMap.get("second category ")); //better not to do this
        productsMap.put("second category ",new ArrayList<>());
        List <String> myCurrentList=productsMap.get("second category ");
        myCurrentList.add("dsdasdsd");
        System.out.println(productsMap);
        System.out.println(productsMap.keySet());
        System.out.println(productsMap.values());
        System.out.println(productsMap.containsKey("third category"));
        Map<Integer,String> doctorMap=new HashMap<>();
        doctorMap.put(1,"Dentist");
        doctorMap.put(2,"terapevt");
        System.out.println(doctorMap.containsValue("Dentist"));
       // System.out.println(doctorMap.remove(1));
        System.out.println(doctorMap);
        System.out.println(productsMap.entrySet()); //nothing changed
        for (Map.Entry<Integer, String> element: doctorMap.entrySet()) {
            System.out.println("Key: "+element.getKey()+", value: "+element.getValue());
            //entry set: key and value in ones
        }
    }
}