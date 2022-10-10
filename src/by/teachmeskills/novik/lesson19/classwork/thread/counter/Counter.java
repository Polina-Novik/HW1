package by.teachmeskills.novik.lesson19.classwork.thread.counter;

public class Counter {
    private Object lock=new Object();
    static void sayHello() { //can use synchronized but will be very slow, for all static
        System.out.println("Hello"); //synchronizer - only one thread can use it, other waiting
    }
    private int count=0;

    public /*synchronized*/ int getCount() { //first synchronizer
        return count;
    }

    public /*synchronized*/ void setCount(int count) { //second synchronizer.first in get, second in set, then they are waiting and break. deadblock
        this.count = count;
    }
    public synchronized void increment() {
        synchronized (lock) {
            setCount(getCount() + 1);
        }
        System.out.println("from there");//סולמפמנû ט עה ך סמבוסף mb
        System.out.println("and there");
    }
}
