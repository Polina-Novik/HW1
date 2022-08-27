package by.teachmeskills.novik.lesson8.homework;

public class Dantist extends Doctor {
    @Override
    public void heal(Client client) {
        System.out.println("I am removing tooth of " + client.getName());
    }
}
