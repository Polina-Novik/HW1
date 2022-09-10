package by.teachmeskills.novik.lesson12.classwork.files.something;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObjectExample {
    public static void main(String[] args) {
        Person lastPerson=null;
        try (FileInputStream fis = new FileInputStream("objsample.txt")) {
            ObjectInputStream ois=new ObjectInputStream(fis);
            while (true) {
                lastPerson= (Person) ois.readObject();
               // Person person=(Person) ois.readObject();
                //System.out.println(ois.readObject());
                System.out.println(lastPerson); //everything good
               // System.out.println(ois.readObject()); //fignia
            }
        } catch (IOException e) {
            System.out.println("here");
          //deleted exception, will be no mistake
        } catch (ClassNotFoundException e) { //catch from ois.readObject
            System.out.println("here 2");
        }
        lastPerson.setAge(40);
        System.out.println(lastPerson);
    }
}
