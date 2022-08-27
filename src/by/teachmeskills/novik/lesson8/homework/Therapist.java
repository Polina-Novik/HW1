package by.teachmeskills.novik.lesson8.homework;

public class Therapist extends Doctor {
    @Override
    public void heal(Client client) {
        System.out.println("I am trying to investigate the problem of " + client.getName());
    }
}
