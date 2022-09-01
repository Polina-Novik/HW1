package by.teachmeskills.novik.lesson11.homework.second;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Sorry, this login does not meet the requirements");
    }
}
