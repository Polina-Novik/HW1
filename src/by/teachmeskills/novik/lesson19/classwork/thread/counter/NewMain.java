package by.teachmeskills.novik.lesson19.classwork.thread.counter;

import java.util.Arrays;
import java.util.List;

public class NewMain {
    public static void main(String[] args) throws InterruptedException {
        Counter.sayHello();
        Counter counter=new Counter();
        List<Integer> values= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        var sum=values.parallelStream() //here is parallel, java builds it by itself, 10 streams
                .mapToInt(value -> value)
                .max();
        Runnable runnable= ()-> {
            for (int i=0;i<10000;i++) {
              //  counter.setCount(counter.getCount()+1); //set and get - different threads. get can use only one, set - many at the moment
            counter.increment(); //here 30000
            }
        };
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        Thread t3=new Thread(runnable);
        t1.start();
        t2.start();
        t3.start();
        Thread.sleep(10000); //we want to see 30000 but i see 12103
        System.out.println(counter.getCount());

    }
}
