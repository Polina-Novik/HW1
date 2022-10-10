package by.teachmeskills.novik.lesson19.classwork.thread;

import java.util.concurrent.*;

public class MyRunnableMain {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyRunnableClass myRunnableClass=new MyRunnableClass();
        Thread thread=new Thread(myRunnableClass); //thread is standard we didn't make it
        thread.start();
Future<String> myFuture; //here i will wait until
        ExecutorService executorService= Executors.newFixedThreadPool(10); //10 thread
                myFuture=executorService.submit((Callable<String>) myRunnableClass);
      myFuture.get(); //this string. for thread
        Thread thread1=new Thread(()->{
            System.out.println("aaaaaaaaa"); //java 8 we can use runnable and don't make class
        });
        thread1.start();
        Runnable r=() -> System.out.println("ooooooooo"); //another method
        Thread thread2=new Thread(r);
        thread2.start();
    }
}
