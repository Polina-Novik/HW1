package by.teachmeskills.novik.lesson16.classwork;

import by.teachmeskills.novik.lesson15.classwork.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tasks {
    public static void main(String[] args) {
        List<Employee> employees=new ArrayList<>();
        employees.add(new Employee(22,"Worker"));
        employees.add(new Employee(23,"Worker"));
        employees.add(new Employee(28,"Worker"));
        employees.add(new Employee(30,"Worker"));
        employees.add(new Employee(25,"Manager"));
        employees.add(new Employee(27,"Manager"));
        employees.add(new Employee(28,"Manager"));
        employees.add(new Employee(30,"Manager"));
      //  System.out.println(employees.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
        System.out.println(  employees.stream().mapToDouble(employee-> employee.getSalary()).average().getAsDouble());
//        Map<String,List<Employee>> listMap=employees.stream().collect(Collectors.groupingBy(Employee::getCategory));
//        System.out.println(listMap);
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getCategory)));
        System.out.println( employees.stream().collect(Collectors.groupingBy(Employee::getCategory,
                Collectors.averagingDouble(Employee::getSalary)))); //average salary for managers and workers separatly
    employees.stream().collect(Collectors.toMap(Function.identity(), Employee::getCategory));

    List<Product> products1= Arrays.asList(new Product("milk", 11),new Product("human", 100));
        List<Product> products2= Arrays.asList(new Product("women", 100),new Product("human", 100));
        List<Order> orders=Arrays.asList(new Order(1,products1),new Order(2,products2));
        System.out.println( products1.stream().anyMatch(product -> product.getName().equals("human")));
        System.out.println(orders.stream()  //if there are any human
                .filter(order -> order.getProducts() //product1 and 2 in stream
                        .stream() //doesnt work.......
                        .anyMatch(product -> product.getName().equals("human")))
                       // .findAny().isPresent()    can use this
                .collect(Collectors.toList()));
        System.out.println(  employees.stream().collect(Collectors
                .groupingBy(Employee::getCategory,
                        Collectors.minBy(Comparator.comparing(Employee::getSalary))))); //finds min in every category. the poorest people
        System.out.println("delete repeating: " +orders.stream()
                .flatMap(order -> order.getProducts().stream()) //order 1 and order 2 in one. flatMap put all order's lists in one
                .distinct()
                .collect(Collectors.toList())); //works only with equals and hashcode in order
    }
}
