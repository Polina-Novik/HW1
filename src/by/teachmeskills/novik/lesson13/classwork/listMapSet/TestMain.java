package by.teachmeskills.novik.lesson13.classwork.listMapSet;

import by.teachmeskills.novik.lesson8.homework.Dantist;
import by.teachmeskills.novik.lesson8.homework.Doctor;

public class TestMain {
    public static void main(String[] args) {
        KeyHolder<String> keyHolder=new KeyHolder<>(); //can be written in ()
        keyHolder.setValue("myKey");
        System.out.println(keyHolder.getValue());
        KeyHolder<Integer> keyHolder1=new KeyHolder<>();
        keyHolder1.setValue(11);
        System.out.println(keyHolder1.getValue());
        KeyHolder<Doctor> keyHolder2=new KeyHolder<>();
        keyHolder2.setValue(new Dantist());
        DoctorHolder<Dantist> dantistDoctorHolder=new DoctorHolder<>(new Dantist());
        //DoctorHolder <String mistake
        // primitives
        int a; //Integer
        double b;
        boolean c;
        float d;
        long f;
        char e;
        byte g;
        Integer aInt;
        Double bDouble;
        Character eChar;
        Boolean bool;
        Float fl;
        Byte bVal;
        Long lVal;
    }
}
