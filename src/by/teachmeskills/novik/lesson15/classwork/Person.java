package by.teachmeskills.novik.lesson15.classwork;

import java.util.Optional;

public class Person {
    private int age;
    private String name;
    private String nickname;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public Optional<String> getOptionalNickname() { //this statement may be or not be
        return Optional.ofNullable(nickname); //or just of if ""
    }
}
