package by.teachmeskills.novik.lesson19.classwork.thread;

import by.teachmeskills.novik.lesson8.homework.Client;
import by.teachmeskills.novik.lesson8.homework.Doctor;

import java.util.concurrent.Callable;

public class MyRunnableClass implements Runnable, Callable<String> { //extends Class problems...no more than two extends, but many implements

    @Override
    public void run() {
        System.out.println("this is also MY");
    }



    @Override
    public String call() throws Exception {
        return "a";
    }
}
