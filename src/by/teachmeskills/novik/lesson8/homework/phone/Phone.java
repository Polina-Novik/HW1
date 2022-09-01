package by.teachmeskills.novik.lesson8.homework.phone;

import by.teachmeskills.novik.lesson7.homework.register.Document;

public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this(number, model, 100);

    }

    public Phone() {
        this.number = 1111111;
        this.model = "default";
        this.weight = 100;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number=" + number +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }


    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void getNumber(int number) {
        System.out.println(number);
    }

    public void receiveCall(String name, int number) {
        System.out.println("Calling " + name + "\n" + number);
    }

    public void sendMessage(int... values) {

        System.out.println("Your message has been sent to numbers: " + values.length);

        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
    }
}
