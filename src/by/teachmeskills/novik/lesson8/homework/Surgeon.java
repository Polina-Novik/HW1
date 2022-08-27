package by.teachmeskills.novik.lesson8.homework;

public class Surgeon extends Doctor {
    @Override
    public void heal(Client client) {
        System.out.println("I am cutting a part of " + client.getName());
    }
}
