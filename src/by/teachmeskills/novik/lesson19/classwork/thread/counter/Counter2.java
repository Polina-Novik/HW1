package by.teachmeskills.novik.lesson19.classwork.thread.counter;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter2 {
    private AtomicInteger value=new AtomicInteger(0); //like synchronizer
    public void increment() {
        value.getAndIncrement();
        value.getAndDecrement();
        value.getAndSet(3);
    }
}
