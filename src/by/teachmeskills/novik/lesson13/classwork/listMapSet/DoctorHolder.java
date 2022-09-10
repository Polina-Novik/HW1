package by.teachmeskills.novik.lesson13.classwork.listMapSet;

import by.teachmeskills.novik.lesson8.homework.Client;
import by.teachmeskills.novik.lesson8.homework.Doctor;

public class DoctorHolder <T> extends Doctor {
    @Override
    public void heal(Client client) {

    }
    T value;
    public DoctorHolder(T value) {
        this.value=value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
