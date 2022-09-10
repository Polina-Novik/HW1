package by.teachmeskills.novik.lesson12.classwork.files.something;


import by.teachmeskills.novik.lesson12.classwork.files.something.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjectsExample {
    public static void main(String[] args) {
        Person firstPerson=new Person("first",20);
        Person secondPerson=new Person("second", 30);
        //streams: to output
        try (FileOutputStream fos = new FileOutputStream("objsample.txt")) { //from file to object
            ObjectOutputStream outputStream=new ObjectOutputStream(fos); //writing object or anything in file
            outputStream.writeObject(firstPerson);
            outputStream.writeObject(secondPerson);
        }  catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
