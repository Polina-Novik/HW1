package by.teachmeskills.novik.lesson13.classwork.listMapSet;

import java.util.Objects;

public class Person {
    private String passwordID;
    private String firstName;
    private String lastName;
    //generate equals hashcode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return passwordID.equals(person.passwordID) && firstName.equals(person.firstName) && lastName.equals(person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordID, firstName, lastName);
    }
}
