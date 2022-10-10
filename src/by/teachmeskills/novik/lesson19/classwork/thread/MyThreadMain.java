package by.teachmeskills.novik.lesson19.classwork.thread;

public class MyThreadMain {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("first string");
       // Thread.currentThread().setName("Ahahahaha"); //we rename main
        Thread.sleep(1000); //two strings, between them 5 seconds
        System.out.println("second string");
        MyTestThread testThread=new MyTestThread();
        MyTestThread testThread2=new MyTestThread();
        MyTestThread testThread3=new MyTestThread();
        testThread.setDaemon(true);
        testThread2.setDaemon(true);
        testThread3.setDaemon(true);
        testThread.setPriority(Thread.MAX_PRIORITY);
        testThread.start();
         //we want it the first. but it doesn't work...
        testThread2.start();
        //testThread2.stop(); stop is bad
//        testThread2.join(); //third will not start without second
//        testThread2.join(5000);
        testThread3.setPriority(Thread.MIN_PRIORITY);
        testThread3.start();
        System.out.println(Thread.currentThread().getName()); //our thread is main
    }
}
